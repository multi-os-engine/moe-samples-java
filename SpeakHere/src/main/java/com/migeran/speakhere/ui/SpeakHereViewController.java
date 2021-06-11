package com.migeran.speakhere.ui;

import apple.avfoundation.AVAudioSession;
import apple.avfoundation.c.AVFoundation;
import apple.avfoundation.enums.AVAudioSessionRouteChangeReason;
import apple.avfoundation.protocol.AVAudioSessionDelegate;
import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
import apple.foundation.NSBundle;
import apple.foundation.NSDictionary;
import apple.foundation.NSNotification;
import apple.foundation.NSNotificationCenter;
import apple.foundation.NSNumber;
import apple.foundation.c.Foundation;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UIColor;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;
import apple.uikit.c.UIKit;
import apple.uikit.enums.UIBarPosition;
import apple.uikit.enums.UIStatusBarStyle;
import apple.uikit.protocol.UIBarPositioning;
import apple.uikit.protocol.UINavigationBarDelegate;

import java.io.File;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.NotImplemented;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import com.migeran.speakhere.AQPlayer;
import com.migeran.speakhere.AQRecorder;
import com.migeran.speakhere.CAXException;
import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;

@Runtime(ObjCRuntime.class)
@ObjCClassName("SpeakHereViewController")
@RegisterOnStartup
public class SpeakHereViewController extends UIViewController implements AVAudioSessionDelegate,
		UINavigationBarDelegate {

	private static final boolean YES = true;
	private static final boolean NO = false;
	private static final byte FALSE = 0;
	private static final byte TRUE = 1;
	private static final int noErr = 0;

	static {
		NatJ.register();
	}

	@Generated
	protected SpeakHereViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SpeakHereViewController alloc();

	@Selector("btn_play")
	@Property
	public native UIBarButtonItem btn_play();

	@Selector("btn_record")
	@Property
	public native UIBarButtonItem btn_record();

	@Selector("fileDescription")
	@Property
	public native UILabel fileDescription();

	@Generated
	@Selector("init")
	public native SpeakHereViewController init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native SpeakHereViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

	@Selector("lvlMeter_in")
	@Property
	public native AQLevelMeter lvlMeter_in();

	@Generated
	@Selector("setBtn_play:")
	public native void setBtn_play_unsafe(UIBarButtonItem value);

	@Generated
	public void setBtn_play(UIBarButtonItem value) {
		Object __old = btn_play();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setBtn_play_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setBtn_record:")
	public native void setBtn_record_unsafe(UIBarButtonItem value);

	@Generated
	public void setBtn_record(UIBarButtonItem value) {
		Object __old = btn_record();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setBtn_record_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setFileDescription:")
	public native void setFileDescription_unsafe(UILabel value);

	@Generated
	public void setFileDescription(UILabel value) {
		Object __old = fileDescription();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setFileDescription_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setLvlMeter_in:")
	public native void setLvlMeter_in_unsafe(AQLevelMeter value);

	@Generated
	public void setLvlMeter_in(AQLevelMeter value) {
		Object __old = lvlMeter_in();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setLvlMeter_in_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	private static String OSTypeToStr(int t) {
		byte[] str = new byte[4];
		PtrFactory.newIntReference(t).getBytePtr().copyTo(str);

		StringBuilder builder = new StringBuilder(16);
		for (int i = 0; i < 4; ++i) {
			char c = (char) str[3 - i];
			if (!Character.isISOControl(c) && c != '\\') {
				builder.append(c);
			} else {
				builder.append(String.format("\\x%02x", (int) c));
			}
		}
		return builder.toString();
	}

	private void setFileDescriptionForFormat(AudioStreamBasicDescription format) {
		String dataFormat = OSTypeToStr(format.mFormatID());
		String text = "(" + format.mChannelsPerFrame() + " ch. " + dataFormat + " @ " + format.mSampleRate() + " Hz)";
		fileDescription().setText(text);
	}

	private AQPlayer player;
	private AQRecorder recorder;
	private boolean playbackWasInterrupted;
	private boolean playbackWasPaused;
	private boolean inBackground;

	private void stopPlayQueue() {
		player.StopQueue();
		lvlMeter_in().setAq(null);
		btn_record().setEnabled(YES);
	}

	private void pausePlayQueue() {
		player.PauseQueue();
		playbackWasPaused = YES;
	}

	private void stopRecord() throws CAXException {
		// Disconnect our level meter from the audio queue
		lvlMeter_in().setAq(null);

		recorder.StopRecord();

		// dispose the previous playback queue
		player.DisposeQueue(true);

		// now create a new queue for the recorded file
		File recordFilePath = new File(Foundation.NSTemporaryDirectory(), "recordedFile.caf");
		player.CreateQueueForFile(recordFilePath.getAbsolutePath());

		// Set the button's state back to "record"
		btn_record().setTitle("Record");
		btn_play().setEnabled(YES);
	}

	@Selector("play:")
	public void play(UIBarButtonItem sender) {
		if (player.IsRunning()) {
			if (playbackWasPaused) {
				int result = player.StartQueue(true);
				playbackWasPaused = false;
				if (result == noErr) {
					NSNotificationCenter.defaultCenter().postNotificationNameObject("playbackQueueResumed", this);
				}
			} else {
				stopPlayQueue();
			}
		} else {
			int result = player.StartQueue(false);
			if (result == noErr) {
				NSNotificationCenter.defaultCenter().postNotificationNameObject("playbackQueueResumed", this);
			}
		}
	}

	@Selector("record:")
	public void record(UIBarButtonItem sender) throws CAXException {
		if (recorder.IsRunning()) {
			// If we are currently recording, stop and save the file.
			stopRecord();
		} else {
			// If we're not recording, start.
			btn_play().setEnabled(NO);

			// Set the button's state to "stop"
			btn_record().setTitle("Stop");

			// Start the recorder
			recorder.StartRecord("recordedFile.caf");

			setFileDescriptionForFormat(recorder.DataFormat());

			// Hook the level meter up to the Audio Queue for the recorder
			lvlMeter_in().setAq(recorder.Queue());
		}
	}

	@Selector("awakeFromNib")
	public void awakeFromNib() {
		super.awakeFromNib();

		NSNotificationCenter center = NSNotificationCenter.defaultCenter();

		// Allocate our singleton instance for the recorder & player object
		recorder = new AQRecorder();
		player = new AQPlayer();

		AVAudioSession session = AVAudioSession.sharedInstance();
		session.setDelegate(this);
		if (!session.setCategoryError(AVFoundation.AVAudioSessionCategoryPlayAndRecord(), null)) {
			System.out.format("couldn't set audio category!");
		}
		center.addObserverSelectorNameObject(this, new SEL("propListener:"), AVFoundation.AVAudioSessionRouteChangeNotification(), null);

		if (!session.setActiveError(YES, null)) {
			System.out.println("AudioSessionSetActive (true) failed");
		}

		center.addObserverSelectorNameObject(this, new SEL("playbackQueueStopped:"), "playbackQueueStopped", null);
		center.addObserverSelectorNameObject(this, new SEL("playbackQueueResumed:"), "playbackQueueResumed", null);

		// disable the play button since we have no recording to play yet
		playbackWasInterrupted = NO;
		playbackWasPaused = NO;

		registerForBackgroundNotifications();
	}

	@Selector("propListener:")
	private void propListener(NSNotification notif) {
		if (notif.name().equals(AVFoundation.AVAudioSessionRouteChangeNotification())) {
			Object value = ((NSDictionary<Object, Object>)notif.userInfo()).objectForKey(AVFoundation.AVAudioSessionRouteChangeReasonKey());
			int reason = ((NSNumber) value).intValue();
			if (reason == AVAudioSessionRouteChangeReason.CategoryChange) {
				return;
			}
			if (reason == AVAudioSessionRouteChangeReason.OldDeviceUnavailable) {
				if (player.IsRunning()) {
					pausePlayQueue();
					NSNotificationCenter.defaultCenter().postNotificationNameObject("playbackQueueStopped", this);
				}
			}
			if (recorder.IsRunning()) {
				try {
					stopRecord();
				} catch (CAXException e) {
					System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
				}
			}
		}
	}

	@Selector("viewDidLoad")
	@Override
	public void viewDidLoad() {
		super.viewDidLoad();

		AVAudioSession session = AVAudioSession.sharedInstance();
		btn_record().setEnabled(session.isInputAvailable());

		btn_play().setEnabled(NO);

		UIColor bgColor = UIColor.alloc().initWithRedGreenBlueAlpha(0.39f, 0.44f, 0.57f, 0.5f);
		lvlMeter_in().setBackgroundColor(bgColor);
		lvlMeter_in().setBorderColor(bgColor);

		fileDescription().setText("");
	}

	@Selector("playbackQueueStopped:")
	public void playbackQueueStopped(NSNotification note) {
		btn_play().setTitle("Play");
		lvlMeter_in().setAq(null);
		btn_record().setEnabled(YES);
	}

	@Selector("playbackQueueResumed:")
	public void playbackQueueResumed(NSNotification note) {
		btn_play().setTitle("Stop");
		btn_record().setEnabled(NO);
		lvlMeter_in().setAq(player.Queue());
	}

	private void registerForBackgroundNotifications() {
		NSNotificationCenter center = NSNotificationCenter.defaultCenter();
		center.addObserverSelectorNameObject(this, new SEL("resignActive"), UIKit.UIApplicationWillResignActiveNotification(), null);
		center.addObserverSelectorNameObject(this, new SEL("enterForeground"), UIKit.UIApplicationWillEnterForegroundNotification(), null);
	}

	@Selector("resignActive")
	public void resignActive() {
		if (recorder.IsRunning()) {
			try {
				stopRecord();
			} catch (CAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (player.IsRunning())
			stopPlayQueue();
		inBackground = true;
	}

	@Selector("enterForeground")
	public void enterForeground() {
		AVAudioSession session = AVAudioSession.sharedInstance();
		if (!session.setActiveError(true, null)) {
			System.out.println("AudioSessionSetActive (true) failed");
		}
		inBackground = false;
	}

	@NotImplemented
	@Override
	@Selector("beginInterruption")
	@IsOptional
	public native void beginInterruption();

	@NotImplemented
	@Override
	@Selector("endInterruption")
	@IsOptional
	public native void endInterruption();

	@NotImplemented
	@Override
	@Selector("endInterruptionWithFlags:")
	@IsOptional
	public native void endInterruptionWithFlags(@NUInt long flags);

	@Override
	@Selector("inputIsAvailableChanged:")
	public void inputIsAvailableChanged(boolean isInputAvailable) {
		btn_record().setEnabled(isInputAvailable);
	}

	@Override
	public long positionForBar(UIBarPositioning bar) {
		return UIBarPosition.TopAttached;
	}

	@Override
	public long preferredStatusBarStyle() {
		return UIStatusBarStyle.LightContent;
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initWithCoder:")
	public native SpeakHereViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}