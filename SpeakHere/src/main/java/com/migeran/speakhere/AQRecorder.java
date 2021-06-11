package com.migeran.speakhere;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.ann.Keep;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.general.ptr.impl.PtrUtils;

import java.io.File;

import apple.audiotoolbox.c.AudioToolbox.Function_AudioQueueNewInput;
import apple.audiotoolbox.enums.AudioFileFlags;
import apple.audiotoolbox.enums.Enums;
import apple.audiotoolbox.opaque.AudioFileID;
import apple.audiotoolbox.opaque.AudioQueueRef;
import apple.audiotoolbox.struct.AudioQueueBuffer;
import apple.avfoundation.AVAudioSession;
import apple.coreaudiotypes.struct.AudioStreamPacketDescription;
import apple.coreaudiotypes.struct.AudioTimeStamp;
import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
import apple.corefoundation.enums.CFStringBuiltInEncodings;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.foundation.c.Foundation;

import static apple.audiotoolbox.c.AudioToolbox.AudioFileClose;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileCreateWithURL;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileGetPropertyInfo;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileSetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileWritePackets;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueAllocateBuffer;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueDispose;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueEnqueueBuffer;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueGetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueGetPropertySize;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueNewInput;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueStart;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueStop;
import static apple.corefoundation.c.CoreFoundation.CFRelease;
import static apple.corefoundation.c.CoreFoundation.CFStringCreateWithCString;
import static apple.corefoundation.c.CoreFoundation.CFURLCreateWithString;
import static apple.corefoundation.c.CoreFoundation.kCFAllocatorDefault;

@Keep
public class AQRecorder implements Function_AudioQueueNewInput {

	private static final byte FALSE = 0;
	private static final byte TRUE = 1;
	private static final int noErr = 0;

	private static final int kNumberRecordBuffers = 3;
	private static final float kBufferDurationSeconds = 0.5f;

	public long startTime;

	private CFStringRef mFileName = null;
	private AudioQueueRef mQueue = null;
	private Ptr<Ptr<AudioQueueBuffer>> mBuffers;
	private AudioFileID mRecordFile = null;
	private long mRecordPacket; // current packet number in record file
	private AudioStreamBasicDescription mRecordFormat = new AudioStreamBasicDescription();
	private boolean mIsRunning = false;

	public int GetNumberChannels() {
		return mRecordFormat.mChannelsPerFrame();
	}

	public CFStringRef GetFileName() {
		return mFileName;
	}

	public AudioQueueRef Queue() {
		return mQueue;
	}

	private Ptr<Ptr<AudioQueueBuffer>> getQueueBuffer(int i) {
		return (Ptr<Ptr<AudioQueueBuffer>>) mBuffers.ofs(i);
	}

	public AudioStreamBasicDescription DataFormat() {
		return mRecordFormat;
	}

	private Ptr<AudioStreamBasicDescription> getDataFormatRef() {
		return PtrFactory.newStructReference(mRecordFormat);
	}

	public boolean IsRunning() {
		return mIsRunning;
	}

	// ____________________________________________________________________________________
	// Determine the size, in bytes, of a buffer necessary to represent the
	// supplied number
	// of seconds of audio data.
	int ComputeRecordBufferSize(AudioStreamBasicDescription format, float seconds) {
		int packets, frames, bytes = 0;
		try {
			frames = (int) Math.ceil(seconds * format.mSampleRate());

			if (format.mBytesPerFrame() > 0)
				bytes = frames * format.mBytesPerFrame();
			else {
				int maxPacketSize;
				if (format.mBytesPerPacket() > 0)
					maxPacketSize = format.mBytesPerPacket(); // constant packet
																// size
				else {
					IntPtr maxPacketSizeRef = PtrFactory.newIntReference();
					IntPtr propertySizeRef = PtrFactory.newIntReference(4);
					XThrowIfError(AudioQueueGetProperty(mQueue, Enums.kAudioQueueProperty_MaximumOutputPacketSize, maxPacketSizeRef, propertySizeRef), "couldn't get queue's maximum output packet size");
					maxPacketSize = maxPacketSizeRef.get();
				}
				if (format.mFramesPerPacket() > 0)
					packets = frames / format.mFramesPerPacket();
				else
					packets = frames; // worst-case scenario: 1 frame in a
										// packet
				if (packets == 0) // sanity check
					packets = 1;
				bytes = packets * maxPacketSize;
			}
		} catch (CAXException e) {
			System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
			return 0;
		}
		return bytes;
	}

	// ____________________________________________________________________________________
	// AudioQueue callback function, called when an input buffers has been
	// filled.
	@Override
	public void call_AudioQueueNewInput(VoidPtr inUserData, AudioQueueRef inAQ, AudioQueueBuffer inBuffer, AudioTimeStamp inStartTime, int inNumPackets, @ReferenceInfo(type = AudioStreamPacketDescription.class) ConstPtr<AudioStreamPacketDescription> inPacketDesc) {
		try {
			if (inNumPackets > 0) {
				// write packets to file
				IntPtr inNumPacketsRef = PtrFactory.newIntReference(inNumPackets);
				XThrowIfError(AudioFileWritePackets(mRecordFile, FALSE, inBuffer.mAudioDataByteSize(), inPacketDesc, mRecordPacket, inNumPacketsRef, inBuffer.mAudioData()), "AudioFileWritePackets failed");
				mRecordPacket += inNumPackets;
			}

			// if we're not stopping, re-enqueue the buffe so that it gets
			// filled again
			if (mIsRunning)
				XThrowIfError(AudioQueueEnqueueBuffer(mQueue, inBuffer, 0, null), "AudioQueueEnqueueBuffer failed");
		} catch (CAXException e) {
			System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
		}
	}

	@SuppressWarnings("unchecked")
	public AQRecorder() {
		mBuffers = (Ptr<Ptr<AudioQueueBuffer>>) PtrFactory.newPointerPtr(AudioQueueBuffer.class, 2, kNumberRecordBuffers, true, false);
		mIsRunning = false;
		mRecordPacket = 0;
	}

	public void dispose() {
		AudioQueueDispose(mQueue, TRUE);
		AudioFileClose(mRecordFile);
		if (mFileName != null)
			CFRelease(mFileName);
	}

	// ____________________________________________________________________________________
	// Copy a queue's encoder's magic cookie to an audio file.
	void CopyEncoderCookieToFile() throws CAXException {
		IntPtr propertySizeRef = PtrFactory.newIntReference();
		// get the magic cookie, if any, from the converter
		int err = AudioQueueGetPropertySize(mQueue, Enums.kAudioQueueProperty_MagicCookie, propertySizeRef);

		// we can get a noErr result and also a propertySize == 0
		// -- if the file format does support magic cookies, but this file
		// doesn't have one.
		if (err == noErr && propertySizeRef.get() > 0) {
			BytePtr magicCookie = PtrFactory.newByteArray(propertySizeRef.get());
			XThrowIfError(AudioQueueGetProperty(mQueue, Enums.kAudioQueueProperty_MagicCookie, magicCookie, propertySizeRef), "get audio converter's magic cookie");
			int magicCookieSize = propertySizeRef.get(); // the converter lies
															// and tell us the
															// wrong size

			// now set the magic cookie on the output file
			IntPtr willEatTheCookieRef = PtrFactory.newIntReference();
			// the converter wants to give us one; will the file take it?
			err = AudioFileGetPropertyInfo(mRecordFile, Enums.kAudioFilePropertyMagicCookieData, null, willEatTheCookieRef);
			if (err == noErr && willEatTheCookieRef.get() != 0) {
				err = AudioFileSetProperty(mRecordFile, Enums.kAudioFilePropertyMagicCookieData, magicCookieSize, magicCookie);
				XThrowIfError(err, "set audio file's magic cookie");
			}
		}
	}

	void SetupAudioFormat(int inFormatID) throws CAXException {
		AVAudioSession session = AVAudioSession.sharedInstance();
		CRuntime.memset(mRecordFormat.getPeerPointer(), 0, (int) CRuntime.sizeOfNativeObject(mRecordFormat.getClass()), (byte) 0);

		double preferredSampleRate = session.preferredSampleRate();
		if (preferredSampleRate == 0.0) {
			preferredSampleRate = session.sampleRate();
		}
		mRecordFormat.setMSampleRate(preferredSampleRate);
		mRecordFormat.setMChannelsPerFrame((int)session.inputNumberOfChannels());
		mRecordFormat.setMFormatID(inFormatID);
		if (inFormatID == apple.coreaudiotypes.enums.Enums.kAudioFormatLinearPCM) {
			// if we want pcm, default to signed 16-bit little-endian
			mRecordFormat.setMFormatFlags(apple.coreaudiotypes.enums.Enums.kLinearPCMFormatFlagIsSignedInteger | apple.coreaudiotypes.enums.Enums.kLinearPCMFormatFlagIsPacked);
			mRecordFormat.setMBitsPerChannel(16);
			mRecordFormat.setMBytesPerFrame((mRecordFormat.mBitsPerChannel() / 8) * mRecordFormat.mChannelsPerFrame());
			mRecordFormat.setMFramesPerPacket(1);
			mRecordFormat.setMBytesPerPacket(mRecordFormat.mFramesPerPacket() * mRecordFormat.mBytesPerFrame());
		}
	}

	public void StartRecord(String inRecordFile) {
		try {
			mFileName = CFStringCreateWithCString(kCFAllocatorDefault(), inRecordFile, CFStringBuiltInEncodings.UTF8);

			// specify the recording format
			SetupAudioFormat(apple.coreaudiotypes.enums.Enums.kAudioFormatLinearPCM);

			// create the queue
			Ptr<AudioQueueRef> queueRef = PtrFactory.newOpaquePtrReference(AudioQueueRef.class);
			XThrowIfError(AudioQueueNewInput(mRecordFormat, this, null /* userData */,
					null /* run loop */, null /* run loop mode */, 0 /* flags */, queueRef), "AudioQueueNewInput failed");
			mQueue = queueRef.get();

			// get the record format back from the queue's audio converter --
			// the file may require a more specific stream description than was
			// necessary to create the encoder.
			mRecordPacket = 0;

			IntPtr size = PtrFactory.newIntReference((int) CRuntime.sizeOfNativeObject(AudioStreamBasicDescription.class));
			XThrowIfError(AudioQueueGetProperty(mQueue, Enums.kAudioQueueProperty_StreamDescription, getDataFormatRef(), size), "couldn't get queue's format");

			File recordFile = new File(Foundation.NSTemporaryDirectory(), inRecordFile);

			CFStringRef recordFileStr = CFStringCreateWithCString(kCFAllocatorDefault(), recordFile.getAbsolutePath(), CFStringBuiltInEncodings.UTF8);
			CFURLRef url = CFURLCreateWithString(kCFAllocatorDefault(), recordFileStr, null);
			CFRelease(recordFileStr);

			// create the audio file
			Ptr<AudioFileID> recordFileRef = PtrFactory.newOpaquePtrReference(AudioFileID.class);
			int status = AudioFileCreateWithURL(url, Enums.kAudioFileCAFType, mRecordFormat, AudioFileFlags.EraseFile, recordFileRef);
			mRecordFile = recordFileRef.get();
			CFRelease(url);

			XThrowIfError(status, "AudioFileCreateWithURL failed");

			// copy the cookie first to give the file object as much info as we
			// can about the data going in
			// not necessary for pcm, but required for some compressed audio
			CopyEncoderCookieToFile();

			// allocate and enqueue buffers
			// enough bytes for half a second
			int bufferByteSize = ComputeRecordBufferSize(mRecordFormat, kBufferDurationSeconds);
			for (int i = 0; i < kNumberRecordBuffers; ++i) {
				XThrowIfError(AudioQueueAllocateBuffer(mQueue, bufferByteSize, getQueueBuffer(i)), "AudioQueueAllocateBuffer failed");
				AudioQueueBuffer audioQueueBuffer = PtrUtils.getElemRef(mBuffers.get(i), 0);
				XThrowIfError(AudioQueueEnqueueBuffer(mQueue, audioQueueBuffer, 0, null), "AudioQueueEnqueueBuffer failed");
			}
			// start the queue
			mIsRunning = true;
			XThrowIfError(AudioQueueStart(mQueue, null), "AudioQueueStart failed");
		} catch (CAXException e) {
			System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void StopRecord() throws CAXException {
		// end recording
		mIsRunning = false;
		XThrowIfError(AudioQueueStop(mQueue, TRUE), "AudioQueueStop failed");
		// a codec may update its cookie at the end of an encoding session, so
		// reapply it to the file now
		CopyEncoderCookieToFile();
		if (mFileName != null) {
			CFRelease(mFileName);
			mFileName = null;
		}
		AudioQueueDispose(mQueue, TRUE);
		AudioFileClose(mRecordFile);
	}

	private void XThrowIfError(int error, String string) throws CAXException {
		if (error != 0) {
			throw new CAXException(string, error);
		}
	}

}
