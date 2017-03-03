package com.migeran.speakhere.ui;

import static apple.audiotoolbox.c.AudioToolbox.AudioQueueGetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueSetProperty;
import static apple.corefoundation.c.CoreFoundation.CFAbsoluteTimeGetCurrent;
import apple.audiotoolbox.enums.Enums;
import apple.audiotoolbox.opaque.AudioQueueRef;
import apple.audiotoolbox.struct.AudioQueueLevelMeterState;
import apple.coreaudio.struct.AudioStreamBasicDescription;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMutableArray;
import apple.foundation.NSNumber;
import apple.foundation.NSTimer;
import apple.uikit.UIColor;
import apple.uikit.UIView;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import com.migeran.speakhere.CAXException;
import com.migeran.speakhere.MeterTable;
import com.migeran.speakhere.view.LevelMeter;
import apple.NSObject;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UITraitCollection;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Runtime(ObjCRuntime.class)
@ObjCClassName("AQLevelMeter")
@RegisterOnStartup
public class AQLevelMeter extends UIView {
	private static final boolean YES = true;
	private static final boolean NO = false;
	private static final int noErr = 0;

	private static final float kPeakFalloffPerSec = .7f;
	private static final float kLevelFalloffPerSec = .8f;
	private static final float kMinDBvalue = -80.0f;

	static {
		NatJ.register();
	}

	@Generated
	protected AQLevelMeter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AQLevelMeter alloc();

	@Generated
	@Selector("init")
	public native AQLevelMeter init();

	private AudioQueueRef _aq;
	private AudioQueueLevelMeterState[] _chan_lvls;
	private NSArray _channelNumbers;
	private NSArray _subLevelMeters;
	private MeterTable _meterTable;
	private NSTimer _updateTimer;
	private float _refreshHz;
	private boolean _showsPeaks;
	private boolean _vertical;

	private UIColor _bgColor, _borderColor;
	private double _peakFalloffLastFire;

	private void _performInit() {
		_refreshHz = 1.f / 30.f;
		_showsPeaks = YES;
		NSMutableArray channelNumbers = NSMutableArray.alloc().init();
		channelNumbers.add(NSNumber.numberWithInt(0));
		_channelNumbers = channelNumbers;
		_vertical = NO;
		_chan_lvls = new AudioQueueLevelMeterState[(int)_channelNumbers.count()];
		for (int i = 0; i < _chan_lvls.length; ++i) {
			_chan_lvls[i] = new AudioQueueLevelMeterState();
		}
		_meterTable = new MeterTable(kMinDBvalue);
		_bgColor = null;
		_borderColor = null;
		layoutSubLevelMeters();
	}

	@Override
	@Selector("initWithFrame:")
	public AQLevelMeter initWithFrame(CGRect frame) {
		super.initWithFrame(frame);
		_performInit();
		return this;
	}

	@Override
	@Selector("initWithCoder:")
	public AQLevelMeter initWithCoder(NSCoder aDecoder) {
		AQLevelMeter self = (AQLevelMeter) super.initWithCoder(aDecoder);
		self._performInit();
		return self;
	}

	public void setBorderColor(UIColor borderColor) {
		_borderColor = borderColor;

		if (_subLevelMeters == null) {
			return;
		}
		for (int i = 0; i < _subLevelMeters.count(); i++) {
			Object meter = _subLevelMeters.objectAtIndex(i);
			((LevelMeter) meter).setBorderColor(borderColor);
		}
	}

	@Selector("setBackgroundColor:")
	public void setBackgroundColor(UIColor bgColor) {
		_bgColor = bgColor;

		if (_subLevelMeters == null) {
			return;
		}
		for (int i = 0; i < _subLevelMeters.count(); i++) {
			Object meter = _subLevelMeters.objectAtIndex(i);
			((LevelMeter) meter).setBgColor(bgColor);
		}
	}

	private void layoutSubLevelMeters() {
		if (_subLevelMeters != null) {
			for (int i = 0; i < _subLevelMeters.count(); i++) {
				UIView thisMeter = (UIView) _subLevelMeters.objectAtIndex(i);
				thisMeter.removeFromSuperview();
			}
		}
		_subLevelMeters = null;

		NSMutableArray meters_build = NSMutableArray.alloc().initWithCapacity(_channelNumbers.count());
		CGRect totalRect = new CGRect();

		if (_vertical) {
			totalRect = new CGRect(new CGPoint(), new CGSize(frame().size().width() + 2.0f, frame().size().height()));
		} else {
			totalRect = new CGRect(new CGPoint(), new CGSize(frame().size().width(), frame().size().height() + 2.0f));
		}

		for (int i = 0; i < _channelNumbers.count(); ++i) {
			CGRect fr;

			if (_vertical) {
				fr = CoreGraphics.CGRectMake(totalRect.origin().x() + (((float) i / (float) _channelNumbers.count()) * totalRect.size().width()), totalRect.origin().y(), (1.f / (float) _channelNumbers.count()) * totalRect.size().width() - 2.f, totalRect.size().height());
			} else {
				fr = CoreGraphics.CGRectMake(totalRect.origin().x(), totalRect.origin().y() + (((float) i / (float) _channelNumbers.count()) * totalRect.size().height()), totalRect.size().width(), (1.f / (float) _channelNumbers.count()) * totalRect.size().height() - 2.f);
			}

			LevelMeter newMeter;

			// if (_useGL) newMeter = [[GLLevelMeter alloc] initWithFrame:fr];
			/* else */newMeter = LevelMeter.alloc().initWithFrame(fr);

			newMeter.setNumLights(30);
			newMeter.setVertical(_vertical);
			newMeter.setBgColor(_bgColor);
			newMeter.setBorderColor(_borderColor);

			meters_build.add(newMeter);
			addSubview(newMeter);
		}

		_subLevelMeters = meters_build;
	}

	@Selector("_refresh")
	private void _refresh() {
		boolean success = NO;

		// if we have no queue, but still have levels, gradually bring them down
		if (_aq == null) {
			float maxLvl = -1.f;
			double thisFire = CFAbsoluteTimeGetCurrent();
			// calculate how much time passed since the last draw
			double timePassed = thisFire - _peakFalloffLastFire;
			for (Object thisMeterObject : _subLevelMeters) {
				LevelMeter thisMeter = (LevelMeter) thisMeterObject;
				float newPeak, newLevel;
				newLevel = (float) (thisMeter.level() - timePassed * kLevelFalloffPerSec);
				if (newLevel < 0.f)
					newLevel = 0.f;
				thisMeter.setLevel(newLevel);
				if (_showsPeaks) {
					newPeak = (float) (thisMeter.peakLevel() - timePassed * kPeakFalloffPerSec);
					if (newPeak < 0.f)
						newPeak = 0.f;
					thisMeter.setPeakLevel(newPeak);
					if (newPeak > maxLvl)
						maxLvl = newPeak;
				} else if (newLevel > maxLvl)
					maxLvl = newLevel;

				thisMeter.setNeedsDisplay();
			}
			// stop the timer when the last level has hit 0
			if (maxLvl <= 0.) {
				_updateTimer.invalidate();
				_updateTimer = null;
			}

			_peakFalloffLastFire = thisFire;
			success = YES;
		} else {
			try {
				int data_sz = (int) (CRuntime.sizeOfNativeObject(AudioQueueLevelMeterState.class) * _channelNumbers.count());
				IntPtr data_szRef = PtrFactory.newIntReference(data_sz);
				Ptr<AudioQueueLevelMeterState> chan_lvlsRef = PtrFactory.newStructArray(AudioQueueLevelMeterState.class, (int)_channelNumbers.count());
				int status = AudioQueueGetProperty(_aq, Enums.kAudioQueueProperty_CurrentLevelMeterDB, chan_lvlsRef, data_szRef);
				for (int i = 0; i < _channelNumbers.count(); ++i) {
					_chan_lvls[i] = chan_lvlsRef.get(i);
				}
				if (status != noErr)
					throw new Exception();

				for (int i = 0; i < _channelNumbers.count(); i++) {
					int channelIdx = ((NSNumber) _channelNumbers.objectAtIndex(i)).intValue();
					LevelMeter channelView = (LevelMeter) _subLevelMeters.objectAtIndex(channelIdx);

					if (channelIdx >= _channelNumbers.count())
						throw new Exception();
					if (channelIdx > 127)
						throw new Exception();

					if (_chan_lvls != null) {
						channelView.setLevel(_meterTable.ValueAt(_chan_lvls[channelIdx].mAveragePower()));
						if (_showsPeaks)
							channelView.setPeakLevel(_meterTable.ValueAt(_chan_lvls[channelIdx].mPeakPower()));
						else
							channelView.setPeakLevel(0.f);
						channelView.setNeedsDisplay();
						success = YES;
					}
				}
			} catch (Exception e) {
				// Ignore
			}
		}

		if (!success) {
			for (Object object : _subLevelMeters) {
				LevelMeter thisMeter = (LevelMeter) object;
				thisMeter.setLevel(0.f);
				thisMeter.setNeedsDisplay();
			}
			System.out.print("ERROR: metering failed\n");
		}
	}

	public AudioQueueRef aq() {
		return _aq;
	}

	public void setAq(AudioQueueRef v) {
		if ((_aq == null) && (v != null)) {
			if (_updateTimer != null)
				_updateTimer.invalidate();

			_updateTimer = NSTimer.scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(_refreshHz, this, new SEL("_refresh"), null, YES);
		} else if ((_aq != null) && (v == null)) {
			_peakFalloffLastFire = CFAbsoluteTimeGetCurrent();
		}

		_aq = v;

		if (_aq != null) {
			try {
				IntPtr valRef = PtrFactory.newIntReference(1);
				XThrowIfError(AudioQueueSetProperty(_aq, Enums.kAudioQueueProperty_EnableLevelMetering, valRef, Integer.SIZE / 8), "couldn't enable metering");

				// now check the number of channels in the new queue, we will
				// need to reallocate if this has changed
				AudioStreamBasicDescription queueFormat = new AudioStreamBasicDescription();
				Ptr<AudioStreamBasicDescription> queueFormatRef = PtrFactory.newStructReference(queueFormat);
				IntPtr data_szRef = PtrFactory.newIntReference((int) CRuntime.sizeOfNativeObject(AudioStreamBasicDescription.class));
				XThrowIfError(AudioQueueGetProperty(_aq, Enums.kAudioQueueProperty_StreamDescription, queueFormatRef, data_szRef), "couldn't get stream description");

				if (queueFormat.mChannelsPerFrame() != _channelNumbers.count()) {
					NSMutableArray chan_array = NSMutableArray.alloc().initWithCapacity(2);
					if (queueFormat.mChannelsPerFrame() < 2)
						chan_array.add(NSNumber.numberWithInt(0));
					else {
						chan_array.add(NSNumber.numberWithInt(0));
						chan_array.add(NSNumber.numberWithInt(1));
					}

					setChannelNumbers(chan_array);

					_chan_lvls = new AudioQueueLevelMeterState[(int)chan_array.count()];
					for (int i = 0; i < _chan_lvls.length; ++i) {
						_chan_lvls[i] = new AudioQueueLevelMeterState();
					}
				}
			} catch (CAXException e) {
				System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
			}
		} else {
			for (Object object : _subLevelMeters) {
				LevelMeter thisMeter = (LevelMeter) object;
				thisMeter.setNeedsDisplay();
			}
		}
	}

	public float refreshHz() {
		return _refreshHz;
	}

	public void setRefreshHz(float v) {
		_refreshHz = v;
		if (_updateTimer != null) {
			_updateTimer.invalidate();
			_updateTimer = NSTimer.scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(_refreshHz, this, new SEL("_refresh"), null, YES);
		}
	}

	public NSArray channelNumbers() {
		return _channelNumbers;
	}

	public void setChannelNumbers(NSArray v) {
		_channelNumbers = v;
		layoutSubLevelMeters();
	}

	private void XThrowIfError(int error, String string) throws CAXException {
		if (error != 0) {
			throw new CAXException(string, error);
		}
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
	public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(
			double frameStartTime,
			double frameDuration,
			@ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
	public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:animations:")
	public static native void animateWithDurationAnimations(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

	@Generated
	@Selector("animateWithDuration:animations:completion:")
	public static native void animateWithDurationAnimationsCompletion(
			double duration,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
			@ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

	@Generated
	@Selector("animateWithDuration:delay:options:animations:completion:")
	public static native void animateWithDurationDelayOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
	public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
			double duration,
			double delay,
			@NFloat double dampingRatio,
			@NFloat double velocity,
			@NUInt long options,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
			@ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

	@Generated
	@Selector("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearance();

	@Generated
	@ProtocolClassMethod("appearance")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearance() {
		return appearance();
	}

	@Generated
	@Selector("appearanceForTraitCollection:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollection(
			UITraitCollection trait);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollection")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollection(UITraitCollection trait) {
		return appearanceForTraitCollection(trait);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceForTraitCollection:whenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedIn(
			UITraitCollection trait,
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceForTraitCollectionWhenContainedIn(trait,
				ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
			UITraitCollection trait, NSArray<?> containerTypes) {
		return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
				trait, containerTypes);
	}

	@Generated
	@Variadic()
	@Deprecated
	@Selector("appearanceWhenContainedIn:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs);

	@Generated
	@Deprecated
	@ProtocolClassMethod("appearanceWhenContainedIn")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedIn(
			@Mapped(ObjCObjectMapper.class) Object ContainerClass,
			Object... varargs) {
		return appearanceWhenContainedIn(ContainerClass, varargs);
	}

	@Generated
	@Selector("appearanceWhenContainedInInstancesOfClasses:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes);

	@Generated
	@ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _appearanceWhenContainedInInstancesOfClasses(
			NSArray<?> containerTypes) {
		return appearanceWhenContainedInInstancesOfClasses(containerTypes);
	}

	@Generated
	@Selector("areAnimationsEnabled")
	public static native boolean areAnimationsEnabled();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginAnimations:context:")
	public static native void beginAnimationsContext(String animationID,
			VoidPtr context);

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
	@Selector("commitAnimations")
	public static native void commitAnimations();

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
	@Selector("inheritedAnimationDuration")
	public static native double inheritedAnimationDuration();

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
	@Selector("layerClass")
	public static native Class layerClass();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("performSystemAnimation:onViews:options:animations:completion:")
	public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(
			@NUInt long animation,
			NSArray<? extends UIView> views,
			@NUInt long options,
			@ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
			@ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("performWithoutAnimation:")
	public static native void performWithoutAnimation(
			@ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

	@Generated
	@Selector("requiresConstraintBasedLayout")
	public static native boolean requiresConstraintBasedLayout();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAnimationBeginsFromCurrentState:")
	public static native void setAnimationBeginsFromCurrentState(
			boolean fromCurrentState);

	@Generated
	@Selector("setAnimationCurve:")
	public static native void setAnimationCurve(@NInt long curve);

	@Generated
	@Selector("setAnimationDelay:")
	public static native void setAnimationDelay(double delay);

	@Generated
	@Selector("setAnimationDelegate:")
	public static native void setAnimationDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setAnimationDidStopSelector:")
	public static native void setAnimationDidStopSelector(SEL selector);

	@Generated
	@Selector("setAnimationDuration:")
	public static native void setAnimationDuration_static(double duration);

	@Generated
	@Selector("setAnimationRepeatAutoreverses:")
	public static native void setAnimationRepeatAutoreverses(
			boolean repeatAutoreverses);

	@Generated
	@Selector("setAnimationRepeatCount:")
	public static native void setAnimationRepeatCount_static(float repeatCount);

	@Generated
	@Selector("setAnimationStartDate:")
	public static native void setAnimationStartDate(NSDate startDate);

	@Generated
	@Selector("setAnimationTransition:forView:cache:")
	public static native void setAnimationTransitionForViewCache(
			@NInt long transition, UIView view, boolean cache);

	@Generated
	@Selector("setAnimationWillStartSelector:")
	public static native void setAnimationWillStartSelector(SEL selector);

	@Generated
	@Selector("setAnimationsEnabled:")
	public static native void setAnimationsEnabled(boolean enabled);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("transitionFromView:toView:duration:options:completion:")
	public static native void transitionFromViewToViewDurationOptionsCompletion(
			UIView fromView,
			UIView toView,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

	@Generated
	@Selector("transitionWithView:duration:options:animations:completion:")
	public static native void transitionWithViewDurationOptionsAnimationsCompletion(
			UIView view,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
			@ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(
			@NInt long attribute);

	@Generated
	@Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
	@NInt
	public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
			@NInt long semanticContentAttribute, @NInt long layoutDirection);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}