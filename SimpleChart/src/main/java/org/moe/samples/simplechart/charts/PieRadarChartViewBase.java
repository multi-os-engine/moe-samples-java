package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIEvent;
import apple.uikit.UITouch;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
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

/**
 * Base class of PieChartView and RadarChartView.
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts21PieRadarChartViewBase")
@ObjCClassBinding
public class PieRadarChartViewBase extends ChartViewBase {
    static {
        NatJ.register();
    }

    @Generated
    protected PieRadarChartViewBase(Pointer peer) {
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
    public static native PieRadarChartViewBase alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * returns:
     * The angle relative to the chart center for the given point on the chart in degrees.
     * The angle is always between 0 and 360°, 0° is NORTH, 90° is EAST, …
     */
    @Generated
    @Selector("angleForPointWithX:y:")
    @NFloat
    public native double angleForPointWithXY(@NFloat double x, @NFloat double y);

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
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

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
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
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
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("chartYMax")
    public native double chartYMax();

    @Generated
    @Selector("chartYMin")
    public native double chartYMin();

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

    /**
     * The diameter of the pie- or radar-chart
     */
    @Generated
    @Selector("diameter")
    @NFloat
    public native double diameter();

    /**
     * returns:
     * The distance of a certain point on the chart to the center of the chart.
     */
    @Generated
    @Selector("distanceToCenterWithX:y:")
    @NFloat
    public native double distanceToCenterWithXY(@NFloat double x, @NFloat double y);

    /**
     * Calculates the position around a center point, depending on the distance
     * from the center, and the angle of the position around the center.
     */
    @Generated
    @Selector("getPositionWithCenter:dist:angle:")
    @ByValue
    public native CGPoint getPositionWithCenterDistAngle(@ByValue CGPoint center, @NFloat double dist,
            @NFloat double angle);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * returns:
     * The xIndex for the given angle around the center of the chart.
     * -1 if not found / outofbounds.
     */
    @Generated
    @Selector("indexForAngle:")
    @NInt
    public native long indexForAngle(@NFloat double angle);

    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    @Generated
    @Selector("init")
    public native PieRadarChartViewBase init();

    @Generated
    @Selector("initWithCoder:")
    public native PieRadarChartViewBase initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native PieRadarChartViewBase initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isRotationEnabled")
    public native boolean isRotationEnabled();

    /**
     * flag that indicates if rotation is done with two fingers or one.
     * when the chart is inside a scrollview, you need a two-finger rotation because a one-finger rotation eats up all touch events.
     * On iOS this will disable one-finger rotation.
     * On OSX this will keep two-finger multitouch rotation, and one-pointer mouse rotation.
     * <em>default</em>: false
     */
    @Generated
    @Selector("isRotationWithTwoFingers")
    public native boolean isRotationWithTwoFingers();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Selector("maxVisibleCount")
    @NInt
    public native long maxVisibleCount();

    /**
     * Sets the minimum offset (padding) around the chart, defaults to 0.0
     */
    @Generated
    @Selector("minOffset")
    @NFloat
    public native double minOffset();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(
            @NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("notifyDataSetChanged")
    public native void notifyDataSetChanged();

    @Generated
    @Selector("nsuiTouchesBegan:withEvent:")
    public native void nsuiTouchesBeganWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    @Generated
    @Selector("nsuiTouchesCancelled:withEvent:")
    public native void nsuiTouchesCancelledWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    @Generated
    @Selector("nsuiTouchesEnded:withEvent:")
    public native void nsuiTouchesEndedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

    @Generated
    @Selector("nsuiTouchesMoved:withEvent:")
    public native void nsuiTouchesMovedWithEvent(NSSet<? extends UITouch> touches, UIEvent event);

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

    /**
     * The radius of the chart in pixels.
     */
    @Generated
    @Selector("radius")
    @NFloat
    public native double radius();

    /**
     * gets the raw version of the current rotation angle of the pie chart the returned value could be any value, negative or positive, outside of the 360 degrees.
     * this is used when working with rotation direction, mainly by gestures and animations.
     */
    @Generated
    @Selector("rawRotationAngle")
    @NFloat
    public native double rawRotationAngle();

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * current rotation angle of the pie chart
     * <em>default</em>: 270 –> top (NORTH)
     * Will always return a normalized value, which will be between 0.0 < 360.0
     */
    @Generated
    @Selector("rotationAngle")
    @NFloat
    public native double rotationAngle();

    /**
     * flag that indicates if rotation is enabled or not
     */
    @Generated
    @Selector("rotationEnabled")
    public native boolean rotationEnabled();

    /**
     * flag that indicates if rotation is done with two fingers or one.
     * when the chart is inside a scrollview, you need a two-finger rotation because a one-finger rotation eats up all touch events.
     * On iOS this will disable one-finger rotation.
     * On OSX this will keep two-finger multitouch rotation, and one-pointer mouse rotation.
     * <em>default</em>: false
     */
    @Generated
    @Selector("rotationWithTwoFingers")
    public native boolean rotationWithTwoFingers();

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    /**
     * Sets the minimum offset (padding) around the chart, defaults to 0.0
     */
    @Generated
    @Selector("setMinOffset:")
    public native void setMinOffset(@NFloat double value);

    /**
     * current rotation angle of the pie chart
     * <em>default</em>: 270 –> top (NORTH)
     * Will always return a normalized value, which will be between 0.0 < 360.0
     */
    @Generated
    @Selector("setRotationAngle:")
    public native void setRotationAngle(@NFloat double value);

    /**
     * flag that indicates if rotation is enabled or not
     */
    @Generated
    @Selector("setRotationEnabled:")
    public native void setRotationEnabled(boolean value);

    /**
     * flag that indicates if rotation is done with two fingers or one.
     * when the chart is inside a scrollview, you need a two-finger rotation because a one-finger rotation eats up all touch events.
     * On iOS this will disable one-finger rotation.
     * On OSX this will keep two-finger multitouch rotation, and one-pointer mouse rotation.
     * <em>default</em>: false
     */
    @Generated
    @Selector("setRotationWithTwoFingers:")
    public native void setRotationWithTwoFingers(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("spinWithDuration:fromAngle:toAngle:")
    public native void spinWithDurationFromAngleToAngle(double duration, @NFloat double fromAngle,
            @NFloat double toAngle);

    /**
     * Applys a spin animation to the Chart.
     */
    @Generated
    @Selector("spinWithDuration:fromAngle:toAngle:easing:")
    public native void spinWithDurationFromAngleToAngleEasing(
            double duration,
            @NFloat double fromAngle,
            @NFloat double toAngle,
            @ObjCBlock(name = "call_spinWithDurationFromAngleToAngleEasing") Block_spinWithDurationFromAngleToAngleEasing easing);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_spinWithDurationFromAngleToAngleEasing {
        @Generated
        double call_spinWithDurationFromAngleToAngleEasing(double arg0, double arg1);
    }

    @Generated
    @Selector("spinWithDuration:fromAngle:toAngle:easingOption:")
    public native void spinWithDurationFromAngleToAngleEasingOption(double duration, @NFloat double fromAngle,
            @NFloat double toAngle, @NInt long easingOption);

    @Generated
    @Selector("stopDeceleration")
    public native void stopDeceleration();

    @Generated
    @Selector("stopSpinAnimation")
    public native void stopSpinAnimation();

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
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

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