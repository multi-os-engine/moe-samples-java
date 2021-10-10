package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Class that contains information about the charts current viewport settings, including offsets, scale & translation levels, …
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartViewPortHandler extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartViewPortHandler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartViewPortHandler alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * <code>true</code> if the chart is not yet fully zoomed in on the x-axis
     */
    @Generated
    @Selector("canZoomInMoreX")
    public native boolean canZoomInMoreX();

    /**
     * <code>true</code> if the chart is not yet fully zoomed in on the y-axis
     */
    @Generated
    @Selector("canZoomInMoreY")
    public native boolean canZoomInMoreY();

    /**
     * <code>true</code> if the chart is not yet fully zoomed out on the x-axis
     */
    @Generated
    @Selector("canZoomOutMoreX")
    public native boolean canZoomOutMoreX();

    /**
     * <code>true</code> if the chart is not yet fully zoomed out on the y-axis
     */
    @Generated
    @Selector("canZoomOutMoreY")
    public native boolean canZoomOutMoreY();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Centers the viewport around the specified position (x-index and y-value) in the chart.
     * Centering the viewport outside the bounds of the chart is not possible.
     * Makes most sense in combination with the setScaleMinima(…) method.
     */
    @Generated
    @Selector("centerViewPortWithPt:chart:")
    public native void centerViewPortWithPtChart(@ByValue CGPoint pt, ChartViewBase chart);

    @Generated
    @Selector("chartHeight")
    @NFloat
    public native double chartHeight();

    @Generated
    @Selector("chartWidth")
    @NFloat
    public native double chartWidth();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("contentBottom")
    @NFloat
    public native double contentBottom();

    @Generated
    @Selector("contentCenter")
    @ByValue
    public native CGPoint contentCenter();

    @Generated
    @Selector("contentHeight")
    @NFloat
    public native double contentHeight();

    @Generated
    @Selector("contentLeft")
    @NFloat
    public native double contentLeft();

    @Generated
    @Selector("contentRect")
    @ByValue
    public native CGRect contentRect();

    @Generated
    @Selector("contentRight")
    @NFloat
    public native double contentRight();

    @Generated
    @Selector("contentTop")
    @NFloat
    public native double contentTop();

    @Generated
    @Selector("contentWidth")
    @NFloat
    public native double contentWidth();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Resets all zooming and dragging and makes the chart fit exactly it’s bounds.
     */
    @Generated
    @Selector("fitScreen")
    @ByValue
    public native CGAffineTransform fitScreen();

    @Generated
    @Selector("hasChartDimens")
    public native boolean hasChartDimens();

    /**
     * <code>true</code> if both drag offsets (x and y) are zero or smaller.
     */
    @Generated
    @Selector("hasNoDragOffset")
    public native boolean hasNoDragOffset();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartViewPortHandler init();

    /**
     * Constructor - don’t forget calling setChartDimens(…)
     */
    @Generated
    @Selector("initWithWidth:height:")
    public native ChartViewPortHandler initWithWidthHeight(@NFloat double width, @NFloat double height);

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
     * if the chart is fully zoomed out, return true
     */
    @Generated
    @Selector("isFullyZoomedOut")
    public native boolean isFullyZoomedOut();

    /**
     * <code>true</code> if the chart is fully zoomed out on it’s x-axis (horizontal).
     */
    @Generated
    @Selector("isFullyZoomedOutX")
    public native boolean isFullyZoomedOutX();

    /**
     * <code>true</code> if the chart is fully zoomed out on it’s y-axis (vertical).
     */
    @Generated
    @Selector("isFullyZoomedOutY")
    public native boolean isFullyZoomedOutY();

    @Generated
    @Selector("isInBoundsBottom:")
    public native boolean isInBoundsBottom(@NFloat double y);

    @Generated
    @Selector("isInBoundsLeft:")
    public native boolean isInBoundsLeft(@NFloat double x);

    @Generated
    @Selector("isInBoundsRight:")
    public native boolean isInBoundsRight(@NFloat double x);

    @Generated
    @Selector("isInBoundsTop:")
    public native boolean isInBoundsTop(@NFloat double y);

    /**
     * A method to check whether coordinate lies within the viewport.
     * \param point a coordinate.
     */
    @Generated
    @Selector("isInBoundsWithPoint:")
    public native boolean isInBoundsWithPoint(@ByValue CGPoint point);

    @Generated
    @Selector("isInBoundsWithX:y:")
    public native boolean isInBoundsWithXY(@NFloat double x, @NFloat double y);

    @Generated
    @Selector("isInBoundsX:")
    public native boolean isInBoundsX(@NFloat double x);

    @Generated
    @Selector("isInBoundsY:")
    public native boolean isInBoundsY(@NFloat double y);

    /**
     * A method to check whether a line between two coordinates intersects with the view port  by using a linear function.
     * Linear function (calculus): <code>y = ax + b</code>
     * Note: this method will not check for collision with the right edge of the view port, as we assume lines run from left
     * to right (e.g. <code>startPoint < endPoint</code>).
     * \param startPoint the start coordinate of the line.
     * 
     * \param endPoint the end coordinate of the line.
     */
    @Generated
    @Selector("isIntersectingLineFrom:to:")
    public native boolean isIntersectingLineFromTo(@ByValue CGPoint startPoint, @ByValue CGPoint endPoint);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The minimum x-scale factor
     */
    @Generated
    @Selector("maxScaleX")
    @NFloat
    public native double maxScaleX();

    /**
     * The minimum y-scale factor
     */
    @Generated
    @Selector("maxScaleY")
    @NFloat
    public native double maxScaleY();

    /**
     * The minimum x-scale factor
     */
    @Generated
    @Selector("minScaleX")
    @NFloat
    public native double minScaleX();

    /**
     * The minimum y-scale factor
     */
    @Generated
    @Selector("minScaleY")
    @NFloat
    public native double minScaleY();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("offsetBottom")
    @NFloat
    public native double offsetBottom();

    @Generated
    @Selector("offsetLeft")
    @NFloat
    public native double offsetLeft();

    @Generated
    @Selector("offsetRight")
    @NFloat
    public native double offsetRight();

    @Generated
    @Selector("offsetTop")
    @NFloat
    public native double offsetTop();

    /**
     * call this method to refresh the graph with a given matrix
     */
    @Generated
    @Selector("refreshWithNewMatrix:chart:invalidate:")
    @ByValue
    public native CGAffineTransform refreshWithNewMatrixChartInvalidate(@ByValue CGAffineTransform newMatrix,
            ChartViewBase chart, boolean invalidate);

    /**
     * Zooms out to original size.
     */
    @Generated
    @Selector("resetZoom")
    @ByValue
    public native CGAffineTransform resetZoom();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("restrainViewPortWithOffsetLeft:offsetTop:offsetRight:offsetBottom:")
    public native void restrainViewPortWithOffsetLeftOffsetTopOffsetRightOffsetBottom(@NFloat double offsetLeft,
            @NFloat double offsetTop, @NFloat double offsetRight, @NFloat double offsetBottom);

    /**
     * The current x-scale factor
     */
    @Generated
    @Selector("scaleX")
    @NFloat
    public native double scaleX();

    /**
     * The current y-scale factor
     */
    @Generated
    @Selector("scaleY")
    @NFloat
    public native double scaleY();

    @Generated
    @Selector("setChartDimensWithWidth:height:")
    public native void setChartDimensWithWidthHeight(@NFloat double width, @NFloat double height);

    /**
     * Set an offset in pixels that allows the user to drag the chart over it’s bounds on the x-axis.
     */
    @Generated
    @Selector("setDragOffsetX:")
    public native void setDragOffsetX(@NFloat double offset);

    /**
     * Set an offset in pixels that allows the user to drag the chart over it’s bounds on the y-axis.
     */
    @Generated
    @Selector("setDragOffsetY:")
    public native void setDragOffsetY(@NFloat double offset);

    /**
     * Sets the maximum scale factor for the x-axis
     */
    @Generated
    @Selector("setMaximumScaleX:")
    public native void setMaximumScaleX(@NFloat double xScale);

    /**
     * Sets the maximum scale factor for the y-axis
     */
    @Generated
    @Selector("setMaximumScaleY:")
    public native void setMaximumScaleY(@NFloat double yScale);

    /**
     * Sets the minimum and maximum scale factors for the x-axis
     */
    @Generated
    @Selector("setMinMaxScaleXWithMinScaleX:maxScaleX:")
    public native void setMinMaxScaleXWithMinScaleXMaxScaleX(@NFloat double minScaleX, @NFloat double maxScaleX);

    @Generated
    @Selector("setMinMaxScaleYWithMinScaleY:maxScaleY:")
    public native void setMinMaxScaleYWithMinScaleYMaxScaleY(@NFloat double minScaleY, @NFloat double maxScaleY);

    /**
     * Sets the minimum scale factor for the x-axis
     */
    @Generated
    @Selector("setMinimumScaleX:")
    public native void setMinimumScaleX(@NFloat double xScale);

    /**
     * Sets the minimum scale factor for the y-axis
     */
    @Generated
    @Selector("setMinimumScaleY:")
    public native void setMinimumScaleY(@NFloat double yScale);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * Sets the scale factor to the specified values.
     */
    @Generated
    @Selector("setZoomWithScaleX:scaleY:")
    @ByValue
    public native CGAffineTransform setZoomWithScaleXScaleY(@NFloat double scaleX, @NFloat double scaleY);

    /**
     * Sets the scale factor to the specified values. x and y is pivot.
     */
    @Generated
    @Selector("setZoomWithScaleX:scaleY:x:y:")
    @ByValue
    public native CGAffineTransform setZoomWithScaleXScaleYXY(@NFloat double scaleX, @NFloat double scaleY,
            @NFloat double x, @NFloat double y);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("touchMatrix")
    @ByValue
    public native CGAffineTransform touchMatrix();

    /**
     * The translation (drag / pan) distance on the x-axis
     */
    @Generated
    @Selector("transX")
    @NFloat
    public native double transX();

    /**
     * The translation (drag / pan) distance on the y-axis
     */
    @Generated
    @Selector("transY")
    @NFloat
    public native double transY();

    /**
     * Translates to the specified point.
     */
    @Generated
    @Selector("translateWithPt:")
    @ByValue
    public native CGAffineTransform translateWithPt(@ByValue CGPoint pt);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Zooms in by 1.4, x and y are the coordinates (in pixels) of the zoom center.
     */
    @Generated
    @Selector("zoomInX:y:")
    @ByValue
    public native CGAffineTransform zoomInXY(@NFloat double x, @NFloat double y);

    /**
     * Zooms out by 0.7, x and y are the coordinates (in pixels) of the zoom center.
     */
    @Generated
    @Selector("zoomOutWithX:y:")
    @ByValue
    public native CGAffineTransform zoomOutWithXY(@NFloat double x, @NFloat double y);

    /**
     * Zooms by the specified zoom factors.
     */
    @Generated
    @Selector("zoomWithScaleX:scaleY:")
    @ByValue
    public native CGAffineTransform zoomWithScaleXScaleY(@NFloat double scaleX, @NFloat double scaleY);

    /**
     * Zooms around the specified center
     */
    @Generated
    @Selector("zoomWithScaleX:scaleY:x:y:")
    @ByValue
    public native CGAffineTransform zoomWithScaleXScaleYXY(@NFloat double scaleX, @NFloat double scaleY,
            @NFloat double x, @NFloat double y);
}