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
public class ChartViewBase extends NSUIView implements ChartAnimatorDelegate, ChartDataProvider {
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
    @Selector("accessibilityChildren")
    public native NSArray<?> accessibilityChildren();

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

    /**
     * Animates the drawing / rendering of the chart the x-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     */
    @Generated
    @Selector("animateWithXAxisDuration:")
    public native void animateWithXAxisDuration(double xAxisDuration);

    /**
     * Animates the drawing / rendering of the chart the x-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param easing an easing function for the animation
     */
    @Generated
    @Selector("animateWithXAxisDuration:easing:")
    public native void animateWithXAxisDurationEasing(double xAxisDuration,
            @ObjCBlock(name = "call_animateWithXAxisDurationEasing") Block_animateWithXAxisDurationEasing easing);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithXAxisDurationEasing {
        @Generated
        double call_animateWithXAxisDurationEasing(double arg0, double arg1);
    }

    /**
     * Animates the drawing / rendering of the chart the x-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param easingOption the easing function for the animation
     */
    @Generated
    @Selector("animateWithXAxisDuration:easingOption:")
    public native void animateWithXAxisDurationEasingOption(double xAxisDuration, @NInt long easingOption);

    /**
     * Animates the drawing / rendering of the chart on both x- and y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param yAxisDuration duration for animating the y axis
     */
    @Generated
    @Selector("animateWithXAxisDuration:yAxisDuration:")
    public native void animateWithXAxisDurationYAxisDuration(double xAxisDuration, double yAxisDuration);

    /**
     * Animates the drawing / rendering of the chart on both x- and y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param yAxisDuration duration for animating the y axis
     * 
     * \param easing an easing function for the animation
     */
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
        double call_animateWithXAxisDurationYAxisDurationEasing(double arg0, double arg1);
    }

    /**
     * Animates the drawing / rendering of the chart on both x- and y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param yAxisDuration duration for animating the y axis
     * 
     * \param easingOption the easing function for the animation
     */
    @Generated
    @Selector("animateWithXAxisDuration:yAxisDuration:easingOption:")
    public native void animateWithXAxisDurationYAxisDurationEasingOption(double xAxisDuration, double yAxisDuration,
            @NInt long easingOption);

    /**
     * Animates the drawing / rendering of the chart on both x- and y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param yAxisDuration duration for animating the y axis
     * 
     * \param easingOptionX the easing function for the animation on the x axis
     * 
     * \param easingOptionY the easing function for the animation on the y axis
     */
    @Generated
    @Selector("animateWithXAxisDuration:yAxisDuration:easingOptionX:easingOptionY:")
    public native void animateWithXAxisDurationYAxisDurationEasingOptionXEasingOptionY(double xAxisDuration,
            double yAxisDuration, @NInt long easingOptionX, @NInt long easingOptionY);

    /**
     * Animates the drawing / rendering of the chart on both x- and y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param xAxisDuration duration for animating the x axis
     * 
     * \param yAxisDuration duration for animating the y axis
     * 
     * \param easingX an easing function for the animation on the x axis
     * 
     * \param easingY an easing function for the animation on the y axis
     */
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
        double call_animateWithXAxisDurationYAxisDurationEasingXEasingY_2(double arg0, double arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_3 {
        @Generated
        double call_animateWithXAxisDurationYAxisDurationEasingXEasingY_3(double arg0, double arg1);
    }

    /**
     * Animates the drawing / rendering of the chart the y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param yAxisDuration duration for animating the y axis
     */
    @Generated
    @Selector("animateWithYAxisDuration:")
    public native void animateWithYAxisDuration(double yAxisDuration);

    /**
     * Animates the drawing / rendering of the chart the y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param yAxisDuration duration for animating the y axis
     * 
     * \param easing an easing function for the animation
     */
    @Generated
    @Selector("animateWithYAxisDuration:easing:")
    public native void animateWithYAxisDurationEasing(double yAxisDuration,
            @ObjCBlock(name = "call_animateWithYAxisDurationEasing") Block_animateWithYAxisDurationEasing easing);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithYAxisDurationEasing {
        @Generated
        double call_animateWithYAxisDurationEasing(double arg0, double arg1);
    }

    /**
     * Animates the drawing / rendering of the chart the y-axis with the specified animation time.
     * If <code>animate(...)</code> is called, no further calling of <code>invalidate()</code> is necessary to refresh the chart.
     * \param yAxisDuration duration for animating the y axis
     * 
     * \param easingOption the easing function for the animation
     */
    @Generated
    @Selector("animateWithYAxisDuration:easingOption:")
    public native void animateWithYAxisDurationEasingOption(double yAxisDuration, @NInt long easingOption);

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
    @Selector("centerOffsets")
    @ByValue
    public native CGPoint centerOffsets();

    /**
     * The animator responsible for animating chart values.
     */
    @Generated
    @Selector("chartAnimator")
    public native ChartAnimator chartAnimator();

    /**
     * The <code>Description</code> object of the chart.
     * This should have been called just “description”, but
     */
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
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Clears the chart from all data (sets it to null) and refreshes it (by calling setNeedsDisplay()).
     */
    @Generated
    @Selector("clear")
    public native void clear();

    @Generated
    @Selector("clearAllViewportJobs")
    public native void clearAllViewportJobs();

    @Generated
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    /**
     * Removes all DataSets (and thereby Entries) from the chart. Does not set the data object to nil. Also refreshes the chart by calling setNeedsDisplay().
     */
    @Generated
    @Selector("clearValues")
    public native void clearValues();

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    /**
     * The rectangle that defines the borders of the chart-value surface (into which the actual values are drawn).
     */
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

    /**
     * delegate to receive chart events
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native ChartViewDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * If set to true, chart continues to scroll after touch up
     */
    @Generated
    @Selector("dragDecelerationEnabled")
    public native boolean dragDecelerationEnabled();

    /**
     * Deceleration friction coefficient in [0 ; 1] interval, higher values indicate that speed will decrease slowly, for example if it set to 0, it will stop immediately.
     * 1 is an invalid value, and will be converted to 0.999 automatically.
     * <em>default</em>: true
     */
    @Generated
    @Selector("dragDecelerationFrictionCoef")
    @NFloat
    public native double dragDecelerationFrictionCoef();

    /**
     * <code>true</code> if drawing the marker is enabled when tapping on values
     * (use the <code>marker</code> property to specify a marker)
     */
    @Generated
    @Selector("drawMarkers")
    public native boolean drawMarkers();

    @Generated
    @Selector("drawRect:")
    public native void drawRect(@ByValue CGRect rect);

    /**
     * An extra offset to be appended to the viewport’s bottom
     */
    @Generated
    @Selector("extraBottomOffset")
    @NFloat
    public native double extraBottomOffset();

    /**
     * An extra offset to be appended to the viewport’s left
     */
    @Generated
    @Selector("extraLeftOffset")
    @NFloat
    public native double extraLeftOffset();

    /**
     * An extra offset to be appended to the viewport’s right
     */
    @Generated
    @Selector("extraRightOffset")
    @NFloat
    public native double extraRightOffset();

    /**
     * An extra offset to be appended to the viewport’s top
     */
    @Generated
    @Selector("extraTopOffset")
    @NFloat
    public native double extraTopOffset();

    /**
     * returns:
     * The bitmap that represents the chart.
     */
    @Generated
    @Selector("getChartImageWithTransparent:")
    public native UIImage getChartImageWithTransparent(boolean transparent);

    /**
     * returns:
     * The Highlight object (contains x-index and DataSet index) of the
     * selected value at the given touch point inside the Line-, Scatter-, or
     * CandleStick-Chart.
     */
    @Generated
    @Selector("getHighlightByTouchPoint:")
    public native ChartHighlight getHighlightByTouchPoint(@ByValue CGPoint pt);

    /**
     * returns:
     * The actual position in pixels of the MarkerView for the given Entry in the given DataSet.
     */
    @Generated
    @Selector("getMarkerPositionWithHighlight:")
    @ByValue
    public native CGPoint getMarkerPositionWithHighlight(ChartHighlight highlight);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Set this to false to prevent values from being highlighted by tap gesture.
     * Values can still be highlighted via drag or programmatically.
     * <em>default</em>: true
     */
    @Generated
    @Selector("highlightPerTapEnabled")
    public native boolean highlightPerTapEnabled();

    /**
     * Highlights the values represented by the provided Highlight object
     * This method <em>will not</em> call the delegate.
     * \param highlight contains information about which entry should be highlighted
     */
    @Generated
    @Selector("highlightValue:")
    public native void highlightValue(ChartHighlight highlight);

    /**
     * Highlights the value selected by touch gesture.
     */
    @Generated
    @Selector("highlightValue:callDelegate:")
    public native void highlightValueCallDelegate(ChartHighlight highlight, boolean callDelegate);

    /**
     * Highlights any y-value at the given x-value in the given DataSet.
     * Provide -1 as the dataSetIndex to undo all highlighting.
     * This method will call the delegate.
     * \param x The x-value to highlight
     * 
     * \param dataSetIndex The dataset index to search in
     * 
     * \param dataIndex The data index to search in (only used in CombinedChartView currently)
     */
    @Generated
    @Selector("highlightValueWithX:dataSetIndex:dataIndex:")
    public native void highlightValueWithXDataSetIndexDataIndex(double x, @NInt long dataSetIndex, @NInt long dataIndex);

    /**
     * Highlights any y-value at the given x-value in the given DataSet.
     * Provide -1 as the dataSetIndex to undo all highlighting.
     * \param x The x-value to highlight
     * 
     * \param dataSetIndex The dataset index to search in
     * 
     * \param dataIndex The data index to search in (only used in CombinedChartView currently)
     * 
     * \param callDelegate Should the delegate be called for this change
     */
    @Generated
    @Selector("highlightValueWithX:dataSetIndex:dataIndex:callDelegate:")
    public native void highlightValueWithXDataSetIndexDataIndexCallDelegate(double x, @NInt long dataSetIndex,
            @NInt long dataIndex, boolean callDelegate);

    /**
     * Highlights the value at the given x-value and y-value in the given DataSet.
     * Provide -1 as the dataSetIndex to undo all highlighting.
     * This method will call the delegate.
     * \param x The x-value to highlight
     * 
     * \param y The y-value to highlight. Supply <code>NaN</code> for “any”
     * 
     * \param dataSetIndex The dataset index to search in
     * 
     * \param dataIndex The data index to search in (only used in CombinedChartView currently)
     */
    @Generated
    @Selector("highlightValueWithX:y:dataSetIndex:dataIndex:")
    public native void highlightValueWithXYDataSetIndexDataIndex(double x, double y, @NInt long dataSetIndex,
            @NInt long dataIndex);

    /**
     * Highlights the value at the given x-value and y-value in the given DataSet.
     * Provide -1 as the dataSetIndex to undo all highlighting.
     * \param x The x-value to highlight
     * 
     * \param y The y-value to highlight. Supply <code>NaN</code> for “any”
     * 
     * \param dataSetIndex The dataset index to search in
     * 
     * \param dataIndex The data index to search in (only used in CombinedChartView currently)
     * 
     * \param callDelegate Should the delegate be called for this change
     */
    @Generated
    @Selector("highlightValueWithX:y:dataSetIndex:dataIndex:callDelegate:")
    public native void highlightValueWithXYDataSetIndexDataIndexCallDelegate(double x, double y,
            @NInt long dataSetIndex, @NInt long dataIndex, boolean callDelegate);

    /**
     * Highlights the values at the given indices in the given DataSets. Provide
     * null or an empty array to undo all highlighting.
     * This should be used to programmatically highlight values.
     * This method <em>will not</em> call the delegate.
     */
    @Generated
    @Selector("highlightValues:")
    public native void highlightValues(NSArray<? extends ChartHighlight> highs);

    /**
     * The array of currently highlighted values. This might an empty if nothing is highlighted.
     */
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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * <em>default</em>: true
     * <code>true</code> if chart continues to scroll after touch up, <code>false</code> ifnot.
     */
    @Generated
    @Selector("isDragDecelerationEnabled")
    public native boolean isDragDecelerationEnabled();

    /**
     * returns:
     * <code>true</code> if drawing the marker is enabled when tapping on values
     * (use the <code>marker</code> property to specify a marker)
     */
    @Generated
    @Selector("isDrawMarkersEnabled")
    public native boolean isDrawMarkersEnabled();

    /**
     * returns:
     * <code>true</code> if the chart is empty (meaning it’s data object is either null or contains no entries).
     */
    @Generated
    @Selector("isEmpty")
    public native boolean isEmpty();

    /**
     * <code>true</code> if values can be highlighted via tap gesture, <code>false</code> ifnot.
     */
    @Generated
    @Selector("isHighLightPerTapEnabled")
    public native boolean isHighLightPerTapEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The last value that was highlighted via touch.
     */
    @Generated
    @Selector("lastHighlighted")
    public native ChartHighlight lastHighlighted();

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    /**
     * The Legend object of the chart. This method can be used to get an instance of the legend in order to customize the automatically generated Legend.
     */
    @Generated
    @Selector("legend")
    public native ChartLegend legend();

    /**
     * The renderer object responsible for rendering / drawing the Legend.
     */
    @Generated
    @Selector("legendRenderer")
    public native ChartLegendRenderer legendRenderer();

    /**
     * The marker that is displayed when a value is clicked on the chart
     */
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

    /**
     * note:
     * (Equivalent of getCenter() in MPAndroidChart, as center is already a standard in iOS that returns the center point relative to superview, and MPAndroidChart returns relative to self)*
     * The center point of the chart (the whole View) in pixels.
     */
    @Generated
    @Selector("midPoint")
    @ByValue
    public native CGPoint midPoint();

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

    /**
     * Font to be used for the no data text.
     */
    @Generated
    @Selector("noDataFont")
    public native UIFont noDataFont();

    /**
     * text that is displayed when the chart is empty
     */
    @Generated
    @Selector("noDataText")
    public native String noDataText();

    /**
     * alignment of the no data text
     */
    @Generated
    @Selector("noDataTextAlignment")
    @NInt
    public native long noDataTextAlignment();

    /**
     * color of the no data text
     */
    @Generated
    @Selector("noDataTextColor")
    public native UIColor noDataTextColor();

    /**
     * Lets the chart know its underlying data has changed and should perform all necessary recalculations.
     * It is crucial that this method is called everytime data is changed dynamically. Not calling this method can lead to crashes or unexpected behaviour.
     */
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
    @Selector("observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPathOfObjectChangeContext(String keyPath,
            @Mapped(ObjCObjectMapper.class) Object object, NSDictionary<String, ?> change, VoidPtr context);

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

    /**
     * object responsible for rendering the data
     */
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
     * The <code>Description</code> object of the chart.
     * This should have been called just “description”, but
     */
    @Generated
    @Selector("setChartDescription:")
    public native void setChartDescription(ChartDescription value);

    /**
     * The data for the chart
     */
    @Generated
    @Selector("setData:")
    public native void setData(ChartData value);

    /**
     * delegate to receive chart events
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) ChartViewDelegate value);

    /**
     * delegate to receive chart events
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) ChartViewDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * If set to true, chart continues to scroll after touch up
     */
    @Generated
    @Selector("setDragDecelerationEnabled:")
    public native void setDragDecelerationEnabled(boolean value);

    /**
     * Deceleration friction coefficient in [0 ; 1] interval, higher values indicate that speed will decrease slowly, for example if it set to 0, it will stop immediately.
     * 1 is an invalid value, and will be converted to 0.999 automatically.
     * <em>default</em>: true
     */
    @Generated
    @Selector("setDragDecelerationFrictionCoef:")
    public native void setDragDecelerationFrictionCoef(@NFloat double value);

    /**
     * <code>true</code> if drawing the marker is enabled when tapping on values
     * (use the <code>marker</code> property to specify a marker)
     */
    @Generated
    @Selector("setDrawMarkers:")
    public native void setDrawMarkers(boolean value);

    /**
     * An extra offset to be appended to the viewport’s bottom
     */
    @Generated
    @Selector("setExtraBottomOffset:")
    public native void setExtraBottomOffset(@NFloat double value);

    /**
     * An extra offset to be appended to the viewport’s left
     */
    @Generated
    @Selector("setExtraLeftOffset:")
    public native void setExtraLeftOffset(@NFloat double value);

    @Generated
    @Selector("setExtraOffsetsWithLeft:top:right:bottom:")
    public native void setExtraOffsetsWithLeftTopRightBottom(@NFloat double left, @NFloat double top,
            @NFloat double right, @NFloat double bottom);

    /**
     * An extra offset to be appended to the viewport’s right
     */
    @Generated
    @Selector("setExtraRightOffset:")
    public native void setExtraRightOffset(@NFloat double value);

    /**
     * An extra offset to be appended to the viewport’s top
     */
    @Generated
    @Selector("setExtraTopOffset:")
    public native void setExtraTopOffset(@NFloat double value);

    /**
     * Set this to false to prevent values from being highlighted by tap gesture.
     * Values can still be highlighted via drag or programmatically.
     * <em>default</em>: true
     */
    @Generated
    @Selector("setHighlightPerTapEnabled:")
    public native void setHighlightPerTapEnabled(boolean value);

    @Generated
    @Selector("setHighlighter:")
    public native void setHighlighter(@Mapped(ObjCObjectMapper.class) IChartHighlighter value);

    /**
     * The last value that was highlighted via touch.
     */
    @Generated
    @Selector("setLastHighlighted:")
    public native void setLastHighlighted(ChartHighlight value);

    /**
     * The marker that is displayed when a value is clicked on the chart
     */
    @Generated
    @Selector("setMarker:")
    public native void setMarker(@Mapped(ObjCObjectMapper.class) IChartMarker value);

    /**
     * The maximum distance in screen pixels away from an entry causing it to highlight.
     * <em>default</em>: 500.0
     */
    @Generated
    @Selector("setMaxHighlightDistance:")
    public native void setMaxHighlightDistance(@NFloat double value);

    /**
     * Font to be used for the no data text.
     */
    @Generated
    @Selector("setNoDataFont:")
    public native void setNoDataFont(UIFont value);

    /**
     * text that is displayed when the chart is empty
     */
    @Generated
    @Selector("setNoDataText:")
    public native void setNoDataText(String value);

    /**
     * alignment of the no data text
     */
    @Generated
    @Selector("setNoDataTextAlignment:")
    public native void setNoDataTextAlignment(@NInt long value);

    /**
     * color of the no data text
     */
    @Generated
    @Selector("setNoDataTextColor:")
    public native void setNoDataTextColor(UIColor value);

    /**
     * object responsible for rendering the data
     */
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
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    /**
     * Checks if the highlight array is null, has a length of zero or if the first object is null.
     * 
     * returns:
     * <code>true</code> if there are values to highlight, <code>false</code> ifthere are no values to highlight.
     */
    @Generated
    @Selector("valuesToHighlight")
    public native boolean valuesToHighlight();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * returns:
     * The ViewPortHandler of the chart that is responsible for the
     * content area of the chart and its offsets and dimensions.
     */
    @Generated
    @Selector("viewPortHandler")
    public native ChartViewPortHandler viewPortHandler();

    /**
     * returns:
     * The object representing all x-labels, this method can be used to
     * acquire the XAxis object and modify it (e.g. change the position of the
     * labels)
     */
    @Generated
    @Selector("xAxis")
    public native ChartXAxis xAxis();

    @Generated
    @Selector("xRange")
    public native double xRange();
}