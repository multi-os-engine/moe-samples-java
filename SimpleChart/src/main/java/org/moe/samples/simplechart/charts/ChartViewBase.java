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
import apple.uikit.UIEvent;
import apple.uikit.UIFont;
import apple.uikit.UIImage;
import apple.uikit.UITouch;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.ChartAnimatorDelegate;
import org.moe.samples.simplechart.charts.protocol.ChartDataProvider;
import org.moe.samples.simplechart.charts.protocol.ChartViewDelegate;
import org.moe.samples.simplechart.charts.protocol.IChartHighlighter;
import org.moe.samples.simplechart.charts.protocol.IChartMarker;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts13ChartViewBase")
@ObjCClassBinding
public class ChartViewBase extends NSUIView implements ChartAnimatorDelegate,
		ChartDataProvider {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartViewBase(Pointer peer) {
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
	@Selector("addViewportJob:")
	public native void addViewportJob(ChartViewPortJob job);

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartViewBase alloc();

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
	@Selector("animateWithXAxisDuration:")
	public native void animateWithXAxisDuration(double xAxisDuration);

	@Generated
	@Selector("animateWithXAxisDuration:easing:")
	public native void animateWithXAxisDurationEasing(
			double xAxisDuration,
			@ObjCBlock(name = "call_animateWithXAxisDurationEasing") Block_animateWithXAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationEasing {
		@Generated
		double call_animateWithXAxisDurationEasing(double arg0, double arg1);
	}

	@Generated
	@Selector("animateWithXAxisDuration:easingOption:")
	public native void animateWithXAxisDurationEasingOption(
			double xAxisDuration, @NInt long easingOption);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:")
	public native void animateWithXAxisDurationYAxisDuration(
			double xAxisDuration, double yAxisDuration);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easing:")
	public native void animateWithXAxisDurationYAxisDurationEasing(
			double xAxisDuration,
			double yAxisDuration,
			@ObjCBlock(name = "call_animateWithXAxisDurationYAxisDurationEasing") Block_animateWithXAxisDurationYAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationYAxisDurationEasing {
		@Generated
		double call_animateWithXAxisDurationYAxisDurationEasing(double arg0,
				double arg1);
	}

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easingOption:")
	public native void animateWithXAxisDurationYAxisDurationEasingOption(
			double xAxisDuration, double yAxisDuration, @NInt long easingOption);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easingOptionX:easingOptionY:")
	public native void animateWithXAxisDurationYAxisDurationEasingOptionXEasingOptionY(
			double xAxisDuration, double yAxisDuration,
			@NInt long easingOptionX, @NInt long easingOptionY);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easingX:easingY:")
	public native void animateWithXAxisDurationYAxisDurationEasingXEasingY(
			double xAxisDuration,
			double yAxisDuration,
			@ObjCBlock(name = "call_animateWithXAxisDurationYAxisDurationEasingXEasingY_2") Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_2 easingX,
			@ObjCBlock(name = "call_animateWithXAxisDurationYAxisDurationEasingXEasingY_3") Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_3 easingY);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_2 {
		@Generated
		double call_animateWithXAxisDurationYAxisDurationEasingXEasingY_2(
				double arg0, double arg1);
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_3 {
		@Generated
		double call_animateWithXAxisDurationYAxisDurationEasingXEasingY_3(
				double arg0, double arg1);
	}

	@Generated
	@Selector("animateWithYAxisDuration:")
	public native void animateWithYAxisDuration(double yAxisDuration);

	@Generated
	@Selector("animateWithYAxisDuration:easing:")
	public native void animateWithYAxisDurationEasing(
			double yAxisDuration,
			@ObjCBlock(name = "call_animateWithYAxisDurationEasing") Block_animateWithYAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithYAxisDurationEasing {
		@Generated
		double call_animateWithYAxisDurationEasing(double arg0, double arg1);
	}

	@Generated
	@Selector("animateWithYAxisDuration:easingOption:")
	public native void animateWithYAxisDurationEasingOption(
			double yAxisDuration, @NInt long easingOption);

	@Generated
	@Selector("animatorStopped:")
	public native void animatorStopped(ChartAnimator chartAnimator);

	@Generated
	@Selector("animatorUpdated:")
	public native void animatorUpdated(ChartAnimator chartAnimator);

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
	@Selector("centerOffsets")
	@ByValue
	public native CGPoint centerOffsets();

	@Generated
	@Selector("chartAnimator")
	public native ChartAnimator chartAnimator();

	@Generated
	@Selector("chartDescription")
	public native ChartDescription chartDescription();

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
	@Selector("clear")
	public native void clear();

	@Generated
	@Selector("clearAllViewportJobs")
	public native void clearAllViewportJobs();

	@Generated
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

	@Generated
	@Selector("clearValues")
	public native void clearValues();

	@Generated
	@Selector("commitAnimations")
	public static native void commitAnimations();

	@Generated
	@Selector("contentRect")
	@ByValue
	public native CGRect contentRect();

	@Generated
	@Selector("data")
	public native ChartData data();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native ChartViewDelegate delegate();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("descriptionFont")
	public native UIFont descriptionFont();

	@Generated
	@Selector("descriptionText")
	public native String descriptionText();

	@Generated
	@Selector("descriptionTextAlign")
	@NInt
	public native long descriptionTextAlign();

	@Generated
	@Selector("descriptionTextColor")
	public native UIColor descriptionTextColor();

	@Generated
	@Selector("dragDecelerationEnabled")
	public native boolean dragDecelerationEnabled();

	@Generated
	@Selector("dragDecelerationFrictionCoef")
	@NFloat
	public native double dragDecelerationFrictionCoef();

	@Generated
	@Selector("drawMarkers")
	public native boolean drawMarkers();

	@Generated
	@Selector("drawRect:")
	public native void drawRect(@ByValue CGRect rect);

	@Generated
	@Selector("extraBottomOffset")
	@NFloat
	public native double extraBottomOffset();

	@Generated
	@Selector("extraLeftOffset")
	@NFloat
	public native double extraLeftOffset();

	@Generated
	@Selector("extraRightOffset")
	@NFloat
	public native double extraRightOffset();

	@Generated
	@Selector("extraTopOffset")
	@NFloat
	public native double extraTopOffset();

	@Generated
	@Selector("getChartImageWithTransparent:")
	public native UIImage getChartImageWithTransparent(boolean transparent);

	@Generated
	@Selector("getHighlightByTouchPoint:")
	public native ChartHighlight getHighlightByTouchPoint(@ByValue CGPoint pt);

	@Generated
	@Selector("getMarkerPositionWithHighlight:")
	@ByValue
	public native CGPoint getMarkerPositionWithHighlight(
			ChartHighlight highlight);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("highlightPerTapEnabled")
	public native boolean highlightPerTapEnabled();

	@Generated
	@Selector("highlightValue:")
	public native void highlightValue(ChartHighlight highlight);

	@Generated
	@Selector("highlightValue:callDelegate:")
	public native void highlightValueCallDelegate(ChartHighlight highlight,
			boolean callDelegate);

	@Generated
	@Selector("highlightValueWithX:dataSetIndex:")
	public native void highlightValueWithXDataSetIndex(double x,
			@NInt long dataSetIndex);

	@Generated
	@Selector("highlightValueWithX:dataSetIndex:callDelegate:")
	public native void highlightValueWithXDataSetIndexCallDelegate(double x,
			@NInt long dataSetIndex, boolean callDelegate);

	@Generated
	@Selector("highlightValueWithX:y:dataSetIndex:")
	public native void highlightValueWithXYDataSetIndex(double x, double y,
			@NInt long dataSetIndex);

	@Generated
	@Selector("highlightValueWithX:y:dataSetIndex:callDelegate:")
	public native void highlightValueWithXYDataSetIndexCallDelegate(double x,
			double y, @NInt long dataSetIndex, boolean callDelegate);

	@Generated
	@Selector("highlightValues:")
	public native void highlightValues(NSArray<? extends ChartHighlight> highs);

	@Generated
	@Selector("highlighted")
	public native NSArray<? extends ChartHighlight> highlighted();

	@Generated
	@Selector("highlighter")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartHighlighter highlighter();

	@Generated
	@Selector("inheritedAnimationDuration")
	public static native double inheritedAnimationDuration();

	@Generated
	@Selector("init")
	public native ChartViewBase init();

	@Generated
	@Selector("initWithCoder:")
	public native ChartViewBase initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native ChartViewBase initWithFrame(@ByValue CGRect frame);

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
	@Selector("isDragDecelerationEnabled")
	public native boolean isDragDecelerationEnabled();

	@Generated
	@Selector("isDrawMarkersEnabled")
	public native boolean isDrawMarkersEnabled();

	@Generated
	@Selector("isEmpty")
	public native boolean isEmpty();

	@Generated
	@Selector("isHighLightPerTapEnabled")
	public native boolean isHighLightPerTapEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("lastHighlighted")
	public native ChartHighlight lastHighlighted();

	@Generated
	@Selector("layerClass")
	public static native Class layerClass();

	@Generated
	@Selector("legend")
	public native ChartLegend legend();

	@Generated
	@Selector("legendRenderer")
	public native ChartLegendRenderer legendRenderer();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("marker")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartMarker marker();

	@Generated
	@Selector("maxHighlightDistance")
	@NFloat
	public native double maxHighlightDistance();

	@Generated
	@Selector("maxVisibleCount")
	@NInt
	public native long maxVisibleCount();

	@Generated
	@Selector("midPoint")
	@ByValue
	public native CGPoint midPoint();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("noDataFont")
	public native UIFont noDataFont();

	@Generated
	@Selector("noDataText")
	public native String noDataText();

	@Generated
	@Selector("noDataTextColor")
	public native UIColor noDataTextColor();

	@Generated
	@Selector("notifyDataSetChanged")
	public native void notifyDataSetChanged();

	@Generated
	@Selector("nsuiTouchesBegan:withEvent:")
	public native void nsuiTouchesBeganWithEvent(
			NSSet<? extends UITouch> touches, UIEvent event);

	@Generated
	@Selector("nsuiTouchesCancelled:withEvent:")
	public native void nsuiTouchesCancelledWithEvent(
			NSSet<? extends UITouch> touches, UIEvent event);

	@Generated
	@Selector("nsuiTouchesEnded:withEvent:")
	public native void nsuiTouchesEndedWithEvent(
			NSSet<? extends UITouch> touches, UIEvent event);

	@Generated
	@Selector("nsuiTouchesMoved:withEvent:")
	public native void nsuiTouchesMovedWithEvent(
			NSSet<? extends UITouch> touches, UIEvent event);

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
	@Selector("removeViewportJob:")
	public native void removeViewportJob(ChartViewPortJob job);

	@Generated
	@Selector("renderer")
	public native ChartDataRendererBase renderer();

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
	@Selector("setChartDescription:")
	public native void setChartDescription(ChartDescription value);

	@Generated
	@Selector("setData:")
	public native void setData(ChartData value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) ChartViewDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) ChartViewDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setDescriptionFont:")
	public native void setDescriptionFont(UIFont value);

	@Generated
	@Selector("setDescriptionText:")
	public native void setDescriptionText(String value);

	@Generated
	@Selector("setDescriptionTextAlign:")
	public native void setDescriptionTextAlign(@NInt long value);

	@Generated
	@Selector("setDescriptionTextColor:")
	public native void setDescriptionTextColor(UIColor value);

	@Generated
	@Selector("setDragDecelerationEnabled:")
	public native void setDragDecelerationEnabled(boolean value);

	@Generated
	@Selector("setDragDecelerationFrictionCoef:")
	public native void setDragDecelerationFrictionCoef(@NFloat double value);

	@Generated
	@Selector("setDrawMarkers:")
	public native void setDrawMarkers(boolean value);

	@Generated
	@Selector("setExtraBottomOffset:")
	public native void setExtraBottomOffset(@NFloat double value);

	@Generated
	@Selector("setExtraLeftOffset:")
	public native void setExtraLeftOffset(@NFloat double value);

	@Generated
	@Selector("setExtraOffsetsWithLeft:top:right:bottom:")
	public native void setExtraOffsetsWithLeftTopRightBottom(
			@NFloat double left, @NFloat double top, @NFloat double right,
			@NFloat double bottom);

	@Generated
	@Selector("setExtraRightOffset:")
	public native void setExtraRightOffset(@NFloat double value);

	@Generated
	@Selector("setExtraTopOffset:")
	public native void setExtraTopOffset(@NFloat double value);

	@Generated
	@Selector("setHighlightPerTapEnabled:")
	public native void setHighlightPerTapEnabled(boolean value);

	@Generated
	@Selector("setHighlighter:")
	public native void setHighlighter(
			@Mapped(ObjCObjectMapper.class) IChartHighlighter value);

	@Generated
	@Selector("setLastHighlighted:")
	public native void setLastHighlighted(ChartHighlight value);

	@Generated
	@Selector("setMarker:")
	public native void setMarker(
			@Mapped(ObjCObjectMapper.class) IChartMarker value);

	@Generated
	@Selector("setMaxHighlightDistance:")
	public native void setMaxHighlightDistance(@NFloat double value);

	@Generated
	@Selector("setNoDataFont:")
	public native void setNoDataFont(UIFont value);

	@Generated
	@Selector("setNoDataText:")
	public native void setNoDataText(String value);

	@Generated
	@Selector("setNoDataTextColor:")
	public native void setNoDataTextColor(UIColor value);

	@Generated
	@Selector("setRenderer:")
	public native void setRenderer(ChartDataRendererBase value);

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
	@Selector("valuesToHighlight")
	public native boolean valuesToHighlight();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("viewPortHandler")
	public native ChartViewPortHandler viewPortHandler();

	@Generated
	@Selector("xAxis")
	public native ChartXAxis xAxis();

	@Generated
	@Selector("xRange")
	public native double xRange();
}