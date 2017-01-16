package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIGestureRecognizer;
import apple.uikit.UIPress;
import apple.uikit.UITouch;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIGestureRecognizerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.BarLineScatterCandleBubbleChartDataProvider;
import org.moe.samples.simplechart.charts.protocol.IBarLineScatterCandleBubbleChartDataSet;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts20BarLineChartViewBase")
@ObjCClassBinding
public class BarLineChartViewBase extends ChartViewBase implements
		BarLineScatterCandleBubbleChartDataProvider,
		UIGestureRecognizerDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected BarLineChartViewBase(Pointer peer) {
		super(peer);
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
	@Owned
	@Selector("alloc")
	public static native BarLineChartViewBase alloc();

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
	@Selector("autoScaleMinMaxEnabled")
	public native boolean autoScaleMinMaxEnabled();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("beginAnimations:context:")
	public static native void beginAnimationsContext(String animationID,
			VoidPtr context);

	@Generated
	@Selector("borderColor")
	public native UIColor borderColor();

	@Generated
	@Selector("borderLineWidth")
	@NFloat
	public native double borderLineWidth();

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
	@Selector("centerOffsets")
	@ByValue
	public native CGPoint centerOffsets();

	@Generated
	@Selector("centerViewToAnimatedWithXValue:yValue:axis:duration:")
	public native void centerViewToAnimatedWithXValueYValueAxisDuration(
			double xValue, double yValue, @NInt long axis, double duration);

	@Generated
	@Selector("centerViewToAnimatedWithXValue:yValue:axis:duration:easing:")
	public native void centerViewToAnimatedWithXValueYValueAxisDurationEasing(
			double xValue,
			double yValue,
			@NInt long axis,
			double duration,
			@ObjCBlock(name = "call_centerViewToAnimatedWithXValueYValueAxisDurationEasing") Block_centerViewToAnimatedWithXValueYValueAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_centerViewToAnimatedWithXValueYValueAxisDurationEasing {
		@Generated
		double call_centerViewToAnimatedWithXValueYValueAxisDurationEasing(
				double arg0, double arg1);
	}

	@Generated
	@Selector("centerViewToAnimatedWithXValue:yValue:axis:duration:easingOption:")
	public native void centerViewToAnimatedWithXValueYValueAxisDurationEasingOption(
			double xValue, double yValue, @NInt long axis, double duration,
			@NInt long easingOption);

	@Generated
	@Selector("centerViewToXValue:yValue:axis:")
	public native void centerViewToXValueYValueAxis(double xValue,
			double yValue, @NInt long axis);

	@Generated
	@Selector("chartXMax")
	public native double chartXMax();

	@Generated
	@Selector("chartXMin")
	public native double chartXMin();

	@Generated
	@Selector("chartYMax")
	public native double chartYMax();

	@Generated
	@Selector("chartYMin")
	public native double chartYMin();

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
	@Selector("clipValuesToContentEnabled")
	public native boolean clipValuesToContentEnabled();

	@Generated
	@Selector("commitAnimations")
	public static native void commitAnimations();

	@Generated
	@Selector("data")
	public native ChartData data();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("doubleTapToZoomEnabled")
	public native boolean doubleTapToZoomEnabled();

	@Generated
	@Selector("dragEnabled")
	public native boolean dragEnabled();

	@Generated
	@Selector("drawBordersEnabled")
	public native boolean drawBordersEnabled();

	@Generated
	@Selector("drawGridBackgroundEnabled")
	public native boolean drawGridBackgroundEnabled();

	@Generated
	@Selector("drawRect:")
	public native void drawRect(@ByValue CGRect rect);

	@Generated
	@Selector("fitScreen")
	public native void fitScreen();

	@Generated
	@IsOptional
	@Selector("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
	public native boolean gestureRecognizerShouldBeRequiredToFailByGestureRecognizer(
			UIGestureRecognizer gestureRecognizer,
			UIGestureRecognizer otherGestureRecognizer);

	@Generated
	@IsOptional
	@Selector("gestureRecognizer:shouldReceivePress:")
	public native boolean gestureRecognizerShouldReceivePress(
			UIGestureRecognizer gestureRecognizer, UIPress press);

	@Generated
	@IsOptional
	@Selector("gestureRecognizer:shouldReceiveTouch:")
	public native boolean gestureRecognizerShouldReceiveTouch(
			UIGestureRecognizer gestureRecognizer, UITouch touch);

	@Generated
	@Selector("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
	public native boolean gestureRecognizerShouldRecognizeSimultaneouslyWithGestureRecognizer(
			UIGestureRecognizer gestureRecognizer,
			UIGestureRecognizer otherGestureRecognizer);

	@Generated
	@IsOptional
	@Selector("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
	public native boolean gestureRecognizerShouldRequireFailureOfGestureRecognizer(
			UIGestureRecognizer gestureRecognizer,
			UIGestureRecognizer otherGestureRecognizer);

	@Generated
	@Selector("gestureRecognizerShouldBegin:")
	public native boolean gestureRecognizerShouldBegin(
			UIGestureRecognizer gestureRecognizer);

	@Generated
	@Selector("getAxis:")
	public native ChartYAxis getAxis(@NInt long axis);

	@Generated
	@Selector("getAxisRangeWithAxis:")
	public native double getAxisRangeWithAxis(@NInt long axis);

	@Generated
	@Selector("getDataSetByTouchPointWithPoint:")
	@MappedReturn(ObjCObjectMapper.class)
	public native IBarLineScatterCandleBubbleChartDataSet getDataSetByTouchPointWithPoint(
			@ByValue CGPoint pt);

	@Generated
	@Selector("getEntryByTouchPointWithPoint:")
	public native ChartDataEntry getEntryByTouchPointWithPoint(
			@ByValue CGPoint pt);

	@Generated
	@Selector("getPositionWithEntry:axis:")
	@ByValue
	public native CGPoint getPositionWithEntryAxis(ChartDataEntry e,
			@NInt long axis);

	@Generated
	@Selector("getTransformerForAxis:")
	public native ChartTransformer getTransformerForAxis(@NInt long axis);

	@Generated
	@Selector("getYAxisMaxWidth:")
	@NFloat
	public native double getYAxisMaxWidth(@NInt long axis);

	@Generated
	@Selector("getYAxisMinWidth:")
	@NFloat
	public native double getYAxisMinWidth(@NInt long axis);

	@Generated
	@Selector("getYAxisWidth:")
	@NFloat
	public native double getYAxisWidth(@NInt long axis);

	@Generated
	@Selector("gridBackgroundColor")
	public native UIColor gridBackgroundColor();

	@Generated
	@Selector("hasNoDragOffset")
	public native boolean hasNoDragOffset();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("highestVisibleX")
	public native double highestVisibleX();

	@Generated
	@Selector("highlightPerDragEnabled")
	public native boolean highlightPerDragEnabled();

	@Generated
	@Selector("inheritedAnimationDuration")
	public static native double inheritedAnimationDuration();

	@Generated
	@Selector("init")
	public native BarLineChartViewBase init();

	@Generated
	@Selector("initWithCoder:")
	public native BarLineChartViewBase initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native BarLineChartViewBase initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("initialize")
	public static native void initialize_static();

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
	@Selector("isAnyAxisInverted")
	public native boolean isAnyAxisInverted();

	@Generated
	@Selector("isAutoScaleMinMaxEnabled")
	public native boolean isAutoScaleMinMaxEnabled();

	@Generated
	@Selector("isDoubleTapToZoomEnabled")
	public native boolean isDoubleTapToZoomEnabled();

	@Generated
	@Selector("isDragEnabled")
	public native boolean isDragEnabled();

	@Generated
	@Selector("isDrawBordersEnabled")
	public native boolean isDrawBordersEnabled();

	@Generated
	@Selector("isDrawGridBackgroundEnabled")
	public native boolean isDrawGridBackgroundEnabled();

	@Generated
	@Selector("isFullyZoomedOut")
	public native boolean isFullyZoomedOut();

	@Generated
	@Selector("isHighlightPerDragEnabled")
	public native boolean isHighlightPerDragEnabled();

	@Generated
	@Selector("isInvertedWithAxis:")
	public native boolean isInvertedWithAxis(@NInt long axis);

	@Generated
	@Selector("isPinchZoomEnabled")
	public native boolean isPinchZoomEnabled();

	@Generated
	@Selector("isScaleXEnabled")
	public native boolean isScaleXEnabled();

	@Generated
	@Selector("isScaleYEnabled")
	public native boolean isScaleYEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keepPositionOnRotation")
	public native boolean keepPositionOnRotation();

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("layerClass")
	public static native Class layerClass();

	@Generated
	@Selector("leftAxis")
	public native ChartYAxis leftAxis();

	@Generated
	@Selector("leftYAxisRenderer")
	public native ChartYAxisRenderer leftYAxisRenderer();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("lowestVisibleX")
	public native double lowestVisibleX();

	@Generated
	@Selector("maxHighlightDistance")
	@NFloat
	public native double maxHighlightDistance();

	@Generated
	@Selector("maxVisibleCount")
	@NInt
	public native long maxVisibleCount();

	@Generated
	@Selector("minOffset")
	@NFloat
	public native double minOffset();

	@Generated
	@Selector("moveViewToAnimatedWithXValue:yValue:axis:duration:")
	public native void moveViewToAnimatedWithXValueYValueAxisDuration(
			double xValue, double yValue, @NInt long axis, double duration);

	@Generated
	@Selector("moveViewToAnimatedWithXValue:yValue:axis:duration:easing:")
	public native void moveViewToAnimatedWithXValueYValueAxisDurationEasing(
			double xValue,
			double yValue,
			@NInt long axis,
			double duration,
			@ObjCBlock(name = "call_moveViewToAnimatedWithXValueYValueAxisDurationEasing") Block_moveViewToAnimatedWithXValueYValueAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_moveViewToAnimatedWithXValueYValueAxisDurationEasing {
		@Generated
		double call_moveViewToAnimatedWithXValueYValueAxisDurationEasing(
				double arg0, double arg1);
	}

	@Generated
	@Selector("moveViewToAnimatedWithXValue:yValue:axis:duration:easingOption:")
	public native void moveViewToAnimatedWithXValueYValueAxisDurationEasingOption(
			double xValue, double yValue, @NInt long axis, double duration,
			@NInt long easingOption);

	@Generated
	@Selector("moveViewToX:")
	public native void moveViewToX(double xValue);

	@Generated
	@Selector("moveViewToXValue:yValue:axis:")
	public native void moveViewToXValueYValueAxis(double xValue, double yValue,
			@NInt long axis);

	@Generated
	@Selector("moveViewToY:axis:")
	public native void moveViewToYAxis(double yValue, @NInt long axis);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("notifyDataSetChanged")
	public native void notifyDataSetChanged();

	@Generated
	@Selector("observeValueForKeyPath:ofObject:change:context:")
	public native void observeValueForKeyPathOfObjectChangeContext(
			String keyPath, @Mapped(ObjCObjectMapper.class) Object object,
			NSDictionary<String, ?> change, VoidPtr context);

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
	@Selector("pinchZoomEnabled")
	public native boolean pinchZoomEnabled();

	@Generated
	@Selector("pixelForValuesWithX:y:axis:")
	@ByValue
	public native CGPoint pixelForValuesWithXYAxis(double x, double y,
			@NInt long axis);

	@Generated
	@Selector("requiresConstraintBasedLayout")
	public static native boolean requiresConstraintBasedLayout();

	@Generated
	@Selector("resetViewPortOffsets")
	public native void resetViewPortOffsets();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("rightAxis")
	public native ChartYAxis rightAxis();

	@Generated
	@Selector("rightYAxisRenderer")
	public native ChartYAxisRenderer rightYAxisRenderer();

	@Generated
	@Selector("scaleX")
	@NFloat
	public native double scaleX();

	@Generated
	@Selector("scaleXEnabled")
	public native boolean scaleXEnabled();

	@Generated
	@Selector("scaleY")
	@NFloat
	public native double scaleY();

	@Generated
	@Selector("scaleYEnabled")
	public native boolean scaleYEnabled();

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
	@Selector("setAutoScaleMinMaxEnabled:")
	public native void setAutoScaleMinMaxEnabled(boolean value);

	@Generated
	@Selector("setBorderColor:")
	public native void setBorderColor(UIColor value);

	@Generated
	@Selector("setBorderLineWidth:")
	public native void setBorderLineWidth(@NFloat double value);

	@Generated
	@Selector("setClipValuesToContentEnabled:")
	public native void setClipValuesToContentEnabled(boolean value);

	@Generated
	@Selector("setDoubleTapToZoomEnabled:")
	public native void setDoubleTapToZoomEnabled(boolean value);

	@Generated
	@Selector("setDragEnabled:")
	public native void setDragEnabled(boolean value);

	@Generated
	@Selector("setDragOffsetX:")
	public native void setDragOffsetX(@NFloat double offset);

	@Generated
	@Selector("setDragOffsetY:")
	public native void setDragOffsetY(@NFloat double offset);

	@Generated
	@Selector("setDrawBordersEnabled:")
	public native void setDrawBordersEnabled(boolean value);

	@Generated
	@Selector("setDrawGridBackgroundEnabled:")
	public native void setDrawGridBackgroundEnabled(boolean value);

	@Generated
	@Selector("setGridBackgroundColor:")
	public native void setGridBackgroundColor(UIColor value);

	@Generated
	@Selector("setHighlightPerDragEnabled:")
	public native void setHighlightPerDragEnabled(boolean value);

	@Generated
	@Selector("setKeepPositionOnRotation:")
	public native void setKeepPositionOnRotation(boolean value);

	@Generated
	@Selector("setLeftYAxisRenderer:")
	public native void setLeftYAxisRenderer(ChartYAxisRenderer value);

	@Generated
	@Selector("setMaxVisibleCount:")
	public native void setMaxVisibleCount(@NInt long value);

	@Generated
	@Selector("setMinOffset:")
	public native void setMinOffset(@NFloat double value);

	@Generated
	@Selector("setPinchZoomEnabled:")
	public native void setPinchZoomEnabled(boolean value);

	@Generated
	@Selector("setRightYAxisRenderer:")
	public native void setRightYAxisRenderer(ChartYAxisRenderer value);

	@Generated
	@Selector("setScaleEnabled:")
	public native void setScaleEnabled(boolean enabled);

	@Generated
	@Selector("setScaleMinima:scaleY:")
	public native void setScaleMinimaScaleY(@NFloat double scaleX,
			@NFloat double scaleY);

	@Generated
	@Selector("setScaleXEnabled:")
	public native void setScaleXEnabled(boolean value);

	@Generated
	@Selector("setScaleYEnabled:")
	public native void setScaleYEnabled(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setViewPortOffsetsWithLeft:top:right:bottom:")
	public native void setViewPortOffsetsWithLeftTopRightBottom(
			@NFloat double left, @NFloat double top, @NFloat double right,
			@NFloat double bottom);

	@Generated
	@Selector("setVisibleXRangeMaximum:")
	public native void setVisibleXRangeMaximum(double maxXRange);

	@Generated
	@Selector("setVisibleXRangeMinimum:")
	public native void setVisibleXRangeMinimum(double minXRange);

	@Generated
	@Selector("setVisibleXRangeWithMinXRange:maxXRange:")
	public native void setVisibleXRangeWithMinXRangeMaxXRange(double minXRange,
			double maxXRange);

	@Generated
	@Selector("setVisibleYRangeMaximum:axis:")
	public native void setVisibleYRangeMaximumAxis(double maxYRange,
			@NInt long axis);

	@Generated
	@Selector("setVisibleYRangeMinimum:axis:")
	public native void setVisibleYRangeMinimumAxis(double minYRange,
			@NInt long axis);

	@Generated
	@Selector("setVisibleYRangeWithMinYRange:maxYRange:axis:")
	public native void setVisibleYRangeWithMinYRangeMaxYRangeAxis(
			double minYRange, double maxYRange, @NInt long axis);

	@Generated
	@Selector("setXAxisRenderer:")
	public native void setXAxisRenderer(ChartXAxisRenderer value);

	@Generated
	@Selector("setYAxisMaxWidth:width:")
	public native void setYAxisMaxWidthWidth(@NInt long axis,
			@NFloat double width);

	@Generated
	@Selector("setYAxisMinWidth:width:")
	public native void setYAxisMinWidthWidth(@NInt long axis,
			@NFloat double width);

	@Generated
	@Selector("stopDeceleration")
	public native void stopDeceleration();

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
	@Selector("valueForTouchPointWithPoint:axis:")
	@ByValue
	public native CGPoint valueForTouchPointWithPointAxis(@ByValue CGPoint pt,
			@NInt long axis);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("visibleXRange")
	public native double visibleXRange();

	@Generated
	@Selector("xAxisRenderer")
	public native ChartXAxisRenderer xAxisRenderer();

	@Generated
	@Selector("xRange")
	public native double xRange();

	@Generated
	@Selector("zoomAndCenterViewAnimatedWithScaleX:scaleY:xValue:yValue:axis:duration:")
	public native void zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDuration(
			@NFloat double scaleX, @NFloat double scaleY, double xValue,
			double yValue, @NInt long axis, double duration);

	@Generated
	@Selector("zoomAndCenterViewAnimatedWithScaleX:scaleY:xValue:yValue:axis:duration:easing:")
	public native void zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDurationEasing(
			@NFloat double scaleX,
			@NFloat double scaleY,
			double xValue,
			double yValue,
			@NInt long axis,
			double duration,
			@ObjCBlock(name = "call_zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDurationEasing") Block_zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDurationEasing {
		@Generated
		double call_zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDurationEasing(
				double arg0, double arg1);
	}

	@Generated
	@Selector("zoomAndCenterViewAnimatedWithScaleX:scaleY:xValue:yValue:axis:duration:easingOption:")
	public native void zoomAndCenterViewAnimatedWithScaleXScaleYXValueYValueAxisDurationEasingOption(
			@NFloat double scaleX, @NFloat double scaleY, double xValue,
			double yValue, @NInt long axis, double duration,
			@NInt long easingOption);

	@Generated
	@Selector("zoomIn")
	public native void zoomIn();

	@Generated
	@Selector("zoomOut")
	public native void zoomOut();

	@Generated
	@Selector("zoomToCenterWithScaleX:scaleY:")
	public native void zoomToCenterWithScaleXScaleY(@NFloat double scaleX,
			@NFloat double scaleY);

	@Generated
	@Selector("zoomWithScaleX:scaleY:x:y:")
	public native void zoomWithScaleXScaleYXY(@NFloat double scaleX,
			@NFloat double scaleY, @NFloat double x, @NFloat double y);

	@Generated
	@Selector("zoomWithScaleX:scaleY:xValue:yValue:axis:")
	public native void zoomWithScaleXScaleYXValueYValueAxis(
			@NFloat double scaleX, @NFloat double scaleY, double xValue,
			double yValue, @NInt long axis);
}