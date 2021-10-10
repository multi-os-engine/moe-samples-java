package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
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
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IPieChartDataSet;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts16PieChartRenderer")
@ObjCClassBinding
public class PieChartRenderer extends ChartDataRendererBase {
    static {
        NatJ.register();
    }

    @Generated
    protected PieChartRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PieChartRenderer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("calculateMinimumRadiusForSpacedSliceWithCenter:radius:angle:arcStartPointX:arcStartPointY:startAngle:sweepAngle:")
    @NFloat
    public native double calculateMinimumRadiusForSpacedSliceWithCenterRadiusAngleArcStartPointXArcStartPointYStartAngleSweepAngle(
            @ByValue CGPoint center, @NFloat double radius, @NFloat double angle, @NFloat double arcStartPointX,
            @NFloat double arcStartPointY, @NFloat double startAngle, @NFloat double sweepAngle);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("chart")
    public native PieChartView chart();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("drawDataSetWithContext:dataSet:")
    public native void drawDataSetWithContextDataSet(CGContextRef context,
            @Mapped(ObjCObjectMapper.class) IPieChartDataSet dataSet);

    @Generated
    @Selector("drawDataWithContext:")
    public native void drawDataWithContext(CGContextRef context);

    @Generated
    @Selector("drawExtrasWithContext:")
    public native void drawExtrasWithContext(CGContextRef context);

    @Generated
    @Selector("drawHighlightedWithContext:indices:")
    public native void drawHighlightedWithContextIndices(CGContextRef context, NSArray<? extends ChartHighlight> indices);

    @Generated
    @Selector("drawValuesWithContext:")
    public native void drawValuesWithContext(CGContextRef context);

    /**
     * Calculates the sliceSpace to use based on visible values and their size compared to the set sliceSpace.
     */
    @Generated
    @Selector("getSliceSpaceWithDataSet:")
    @NFloat
    public native double getSliceSpaceWithDataSet(@Mapped(ObjCObjectMapper.class) IPieChartDataSet dataSet);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native PieChartRenderer init();

    @Generated
    @Selector("initBuffers")
    public native void initBuffers();

    @Generated
    @Selector("initWithAnimator:viewPortHandler:")
    public native PieChartRenderer initWithAnimatorViewPortHandler(ChartAnimator animator,
            ChartViewPortHandler viewPortHandler);

    @Generated
    @Selector("initWithChart:animator:viewPortHandler:")
    public native PieChartRenderer initWithChartAnimatorViewPortHandler(PieChartView chart, ChartAnimator animator,
            ChartViewPortHandler viewPortHandler);

    @Generated
    @Selector("initWithViewPortHandler:")
    public native PieChartRenderer initWithViewPortHandler(ChartViewPortHandler viewPortHandler);

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
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    @Selector("setChart:")
    public native void setChart_unsafe(PieChartView value);

    @Generated
    public void setChart(PieChartView value) {
        Object __old = chart();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setChart_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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