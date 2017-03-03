package com.migeran.speakhere;

import static apple.audiotoolbox.c.AudioToolbox.AudioFileClose;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileGetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileGetPropertyInfo;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileOpenURL;
import static apple.audiotoolbox.c.AudioToolbox.AudioFileReadPackets;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueAddPropertyListener;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueAllocateBufferWithPacketDescriptions;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueDispose;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueEnqueueBuffer;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueGetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueNewOutput;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueuePause;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueSetParameter;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueSetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueStart;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueStop;
import static apple.corefoundation.c.CoreFoundation.CFRelease;
import static apple.corefoundation.c.CoreFoundation.CFRunLoopGetCurrent;
import static apple.corefoundation.c.CoreFoundation.CFStringCreateWithCString;
import static apple.corefoundation.c.CoreFoundation.CFURLCreateWithFileSystemPath;
import static apple.corefoundation.c.CoreFoundation.kCFAllocatorDefault;
import static apple.corefoundation.c.CoreFoundation.kCFRunLoopCommonModes;
import apple.audiotoolbox.c.AudioToolbox.Function_AudioQueueAddPropertyListener;
import apple.audiotoolbox.c.AudioToolbox.Function_AudioQueueNewOutput;
import apple.audiotoolbox.enums.AudioFilePermissions;
import apple.audiotoolbox.enums.Enums;
import apple.audiotoolbox.opaque.AudioFileID;
import apple.audiotoolbox.opaque.AudioQueueRef;
import apple.audiotoolbox.struct.AudioQueueBuffer;
import apple.coreaudio.struct.AudioChannelLayout;
import apple.coreaudio.struct.AudioStreamBasicDescription;
import apple.coreaudio.struct.AudioStreamPacketDescription;
import apple.corefoundation.enums.CFStringBuiltInEncodings;
import apple.corefoundation.enums.CFURLPathStyle;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.foundation.NSNotificationCenter;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.ann.Keep;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.general.ptr.impl.PtrUtils;

@Keep
public class AQPlayer implements Function_AudioQueueNewOutput, Function_AudioQueueAddPropertyListener {

	private static final byte FALSE = 0;
	private static final byte TRUE = 1;
	private static final int noErr = 0;

	private static final int kNumberBuffers = 3;
	private static final float kBufferDurationSeconds = 0.5f;

	private AudioQueueRef mQueue = null;
	private Ptr<Ptr<AudioQueueBuffer>> mBuffers;
	private AudioFileID mAudioFile = null;
	private String mFilePath = null;
	private AudioStreamBasicDescription mDataFormat = new AudioStreamBasicDescription();
	private boolean mIsInitialized = false;
	private int mNumPacketsToRead = 0;
	private long mCurrentPacket = 0;
	private int mIsRunning = 0;
	private boolean mIsDone = false;
	private boolean mIsLooping = false;

	@SuppressWarnings("unchecked")
	public AQPlayer() {
		mBuffers = (Ptr<Ptr<AudioQueueBuffer>>) PtrFactory.newPointerPtr(AudioQueueBuffer.class, 2, kNumberBuffers, true, false);
	}

	public void dispose() {
		DisposeQueue(true);
	}

	public int StartQueue(boolean inResume) {
		// if we have a file but no queue, create one now
		if ((mQueue == null) && (mFilePath != null))
			CreateQueueForFile(mFilePath);

		mIsDone = false;

		// if we are not resuming, we also should restart the file read index
		if (!inResume) {
			mCurrentPacket = 0;

			// prime the queue with some data before starting
			for (int i = 0; i < kNumberBuffers; ++i) {
				call_AudioQueueNewOutput(null, null, PtrUtils.getElemRef(mBuffers.get(i), 0));
			}
		}
		return AudioQueueStart(mQueue, null);
	}

	public int StopQueue() {
		mIsDone = true;

		int result = AudioQueueStop(mQueue, TRUE);
		if (result > 0)
			System.out.print("ERROR STOPPING QUEUE!\n");

		return result;
	}

	public int PauseQueue() {
		int result = AudioQueuePause(mQueue);

		return result;
	}

	public AudioQueueRef Queue() {
		return mQueue;
	}

	private Ptr<Ptr<AudioQueueBuffer>> getQueueBuffer(int i) {
		return (Ptr<Ptr<AudioQueueBuffer>>) mBuffers.ofs(i);
	}

	public AudioStreamBasicDescription DataFormat() {
		return mDataFormat;
	}

	private Ptr<AudioStreamBasicDescription> getDataFormatRef() {
		return PtrFactory.newStructReference(mDataFormat);
	}

	public boolean IsRunning() {
		return mIsRunning > 0;
	}

	public boolean IsInitialized() {
		return mIsInitialized;
	}

	public String GetFilePath() {
		return mFilePath;
	}

	public boolean IsLooping() {
		return mIsLooping;
	}

	public void SetLooping(boolean inIsLooping) {
		mIsLooping = inIsLooping;
	}

	public void CreateQueueForFile(String inPath) {
		CFURLRef sndFile = null;

		try {
			if (mFilePath == null) {
				mIsLooping = false;

				CFStringRef inFilePath = CFStringCreateWithCString(kCFAllocatorDefault(), inPath, CFStringBuiltInEncodings.UTF8);
				sndFile = CFURLCreateWithFileSystemPath(kCFAllocatorDefault(), inFilePath, CFURLPathStyle.CFURLPOSIXPathStyle, (byte) 0);
				CFRelease(inFilePath);

				if (sndFile == null) {
					System.out.print("can't parse file path\n");
					return;
				}

				Ptr<AudioFileID> audioFileRef = PtrFactory.newOpaquePtrReference(AudioFileID.class);
				audioFileRef.set(mAudioFile);
				int rc = AudioFileOpenURL(sndFile, (byte) AudioFilePermissions.ReadPermission, 0/* inFileTypeHint */, audioFileRef);
				mAudioFile = audioFileRef.get();
				CFRelease(sndFile); // release sndFile here to quiet analyzer
				XThrowIfError(rc, "can't open file");

				IntPtr size = PtrFactory.newIntReference((int) CRuntime.sizeOfNativeObject(mDataFormat.getClass()));
				Ptr<AudioStreamBasicDescription> dataFormatRef = getDataFormatRef();
				XThrowIfError(AudioFileGetProperty(mAudioFile, Enums.kAudioFilePropertyDataFormat, size, dataFormatRef), "couldn't get file's data format");
				mDataFormat = dataFormatRef.get();
				mFilePath = inPath;
			}
			SetupNewQueue();
		} catch (CAXException e) {
			System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
		}
	}

	public void DisposeQueue(boolean inDisposeFile) {
		if (mQueue != null) {
			AudioQueueDispose(mQueue, TRUE);
			mQueue = null;
		}
		if (inDisposeFile) {
			if (mAudioFile != null) {
				AudioFileClose(mAudioFile);
				mAudioFile = null;
			}
			if (mFilePath != null) {
				mFilePath = null;
			}
		}
		mIsInitialized = false;
	}

	private void SetupNewQueue() throws CAXException {
		Ptr<AudioQueueRef> newQueueRef = PtrFactory.newOpaquePtrReference(AudioQueueRef.class);
		XThrowIfError(AudioQueueNewOutput(mDataFormat, this, null, CFRunLoopGetCurrent(), kCFRunLoopCommonModes(), 0, newQueueRef), "AudioQueueNew failed");
		mQueue = newQueueRef.get();
		// we need to calculate how many packets we read at a time, and how big
		// a buffer we need
		// we base this on the size of the packets in the file and an
		// approximate duration for each buffer
		// first check to see what the max size of a packet is - if it is bigger
		// than our allocation default size, that needs to become larger
		IntPtr maxPacketSizeRef = PtrFactory.newIntReference();
		IntPtr size = PtrFactory.newIntReference(4);
		XThrowIfError(AudioFileGetProperty(mAudioFile, Enums.kAudioFilePropertyPacketSizeUpperBound, size, maxPacketSizeRef), "couldn't get file's max packet size");
		int maxPacketSize = maxPacketSizeRef.get();

		// adjust buffer size to represent about a half second of audio based on
		// this format
		IntPtr bufferByteSizeRef = PtrFactory.newIntReference();
		IntPtr numPacketsToReadRef = PtrFactory.newIntReference(mNumPacketsToRead);
		CalculateBytesForTime(mDataFormat, maxPacketSize, kBufferDurationSeconds, bufferByteSizeRef, numPacketsToReadRef);
		int bufferByteSize = bufferByteSizeRef.get();
		mNumPacketsToRead = numPacketsToReadRef.get();

		// printf ("Buffer Byte Size: %d, Num Packets to Read: %d\n",
		// (int)bufferByteSize, (int)mNumPacketsToRead);

		// (2) If the file has a cookie, we should get it and set it on the AQ
		size.set(4);
		int result = AudioFileGetPropertyInfo(mAudioFile, Enums.kAudioFilePropertyMagicCookieData, size, null);

		if (result == 0 && size.get() > 0) {
			BytePtr cookie = PtrFactory.newByteArray(size.get());
			XThrowIfError(AudioFileGetProperty(mAudioFile, Enums.kAudioFilePropertyMagicCookieData, size, cookie), "get cookie from file");
			XThrowIfError(AudioQueueSetProperty(mQueue, Enums.kAudioQueueProperty_MagicCookie, cookie, size.get()), "set cookie on queue");
		}

		// channel layout?
		result = AudioFileGetPropertyInfo(mAudioFile, Enums.kAudioFilePropertyChannelLayout, size, null);
		if (result == noErr && size.get() > 0) {
			AudioChannelLayout acl = new AudioChannelLayout();
			Ptr<AudioChannelLayout> aclRef = PtrFactory.newStructReference(acl);
			result = AudioFileGetProperty(mAudioFile, Enums.kAudioFilePropertyChannelLayout, size, aclRef);
			if (result != 0) {
				XThrowIfError(result, "get audio file's channel layout");
			}

			result = AudioQueueSetProperty(mQueue, Enums.kAudioQueueProperty_ChannelLayout, aclRef, size.get());
			if (result != 0) {
				XThrowIfError(result, "set channel layout on queue");
			}
		}

		XThrowIfError(AudioQueueAddPropertyListener(mQueue, Enums.kAudioQueueProperty_IsRunning, this, null), "adding property listener");

		boolean isFormatVBR = (mDataFormat.mBytesPerPacket() == 0 || mDataFormat.mFramesPerPacket() == 0);
		for (int i = 0; i < kNumberBuffers; ++i) {
			XThrowIfError(AudioQueueAllocateBufferWithPacketDescriptions(mQueue, bufferByteSize, (isFormatVBR ? mNumPacketsToRead : 0), getQueueBuffer(i)), "AudioQueueAllocateBuffer failed");
		}

		// set the volume of the queue
		XThrowIfError(AudioQueueSetParameter(mQueue, Enums.kAudioQueueParam_Volume, 1.0f), "set queue volume");

		mIsInitialized = true;
	}

	private void CalculateBytesForTime(AudioStreamBasicDescription inDesc, int inMaxPacketSize, float inSeconds, IntPtr outBufferSize, IntPtr outNumPackets) {
		// we only use time here as a guideline
		// we're really trying to get somewhere between 16K and 64K buffers, but
		// not allocate too much if we don't need it
		final int maxBufferSize = 0x10000; // limit size to 64K
		final int minBufferSize = 0x4000; // limit size to 16K

		if (inDesc.mFramesPerPacket() > 0) {
			double numPacketsForTime = inDesc.mSampleRate() / inDesc.mFramesPerPacket() * inSeconds;
			outBufferSize.set((int) (numPacketsForTime * inMaxPacketSize));
		} else {
			// if frames per packet is zero, then the codec has no predictable
			// packet == time
			// so we can't tailor this (we don't know how many Packets represent
			// a time period
			// we'll just return a default buffer size
			outBufferSize.set(maxBufferSize > inMaxPacketSize ? maxBufferSize : inMaxPacketSize);
		}

		// we're going to limit our size to our default
		if (outBufferSize.get() > maxBufferSize && outBufferSize.get() > inMaxPacketSize)
			outBufferSize.set(maxBufferSize);
		else {
			// also make sure we're not too small - we don't want to go the disk
			// for too small chunks
			if (outBufferSize.get() < minBufferSize)
				outBufferSize.set(minBufferSize);
		}
		outNumPackets.set(outBufferSize.get() / inMaxPacketSize);
	}

	private int getNumPacketsToRead() {
		return mNumPacketsToRead;
	}

	private long getCurrentPacket() {
		return mCurrentPacket;
	}

	private AudioFileID getAudioFileID() {
		return mAudioFile;
	}

	void setCurrentPacket(long inPacket) {
		mCurrentPacket = inPacket;
	}

	private void XThrowIfError(int error, String string) throws CAXException {
		if (error != 0) {
			throw new CAXException(string, error);
		}
	}

	@Override
	public void call_AudioQueueAddPropertyListener(VoidPtr inUserData, AudioQueueRef inAQ, int inID) {
		IntPtr size = PtrFactory.newIntReference(4);
		IntPtr isRunningRef = PtrFactory.newIntReference(mIsRunning);

		int result = AudioQueueGetProperty(mQueue, Enums.kAudioQueueProperty_IsRunning, isRunningRef, size);
		mIsRunning = isRunningRef.get();

		if ((result == noErr) && (mIsRunning == 0))
			NSNotificationCenter.defaultCenter().postNotificationNameObject("playbackQueueStopped", null);
	}

	@Override
	public void call_AudioQueueNewOutput(VoidPtr inUserData, AudioQueueRef inAQ, AudioQueueBuffer inCompleteAQBuffer) {
		if (mIsDone)
			return;

		IntPtr numBytesRef = PtrFactory.newIntReference();
		IntPtr nPacketsRef = PtrFactory.newIntReference(getNumPacketsToRead());
		Ptr<AudioStreamPacketDescription> audioStreamPacketDescriptionPtr = inCompleteAQBuffer.mPacketDescriptions();
		int result = AudioFileReadPackets(getAudioFileID(), FALSE, numBytesRef, null, getCurrentPacket(), nPacketsRef, inCompleteAQBuffer.mAudioData());
		if (result != 0)
			System.out.println("AudioFileReadPackets failed: " + result);
		if (nPacketsRef.get() > 0) {
			inCompleteAQBuffer.setMAudioDataByteSize(numBytesRef.get());
			inCompleteAQBuffer.setMPacketDescriptionCount(nPacketsRef.get());
			AudioQueueEnqueueBuffer(mQueue, inCompleteAQBuffer, 0, null);
			mCurrentPacket = (getCurrentPacket() + nPacketsRef.get());
		}

		else {
			if (IsLooping()) {
				mCurrentPacket = 0;
				call_AudioQueueNewOutput(inUserData, inAQ, inCompleteAQBuffer);
			} else {
				// stop
				mIsDone = true;
				AudioQueueStop(mQueue, FALSE);
			}
		}
	}
}
