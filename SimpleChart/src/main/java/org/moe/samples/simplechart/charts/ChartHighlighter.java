package org.moe.samples.simplechart.charts;


import apple.NSObject;
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
import org.moe.samples.simplechart.charts.protocol.ChartDataProvider;
import org.moe.samples.simplechart.charts.protocol.IChartHighlighter;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts16ChartHighlighter")
@ObjCClassBinding
public class ChartHighlighter extends NSObject implements IChartHighlighter {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartHighlighter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartHighlighter alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * instance of the data-provider
     */
    @Generated
    @Selector("chart")
    @MappedReturn(ObjCObjectMapper.class)
    public native ChartDataProvider chart();

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
    @Selector("getHighlightWithX:y:")
    public native ChartHighlight getHighlightWithXY(@NFloat double x, @NFloat double y);

    /**
     * \param xValue
     * 
     * \param x
     * 
     * \param y
     * 
     * 
     * returns:
     * The corresponding ChartHighlight for a given x-value and xy-touch position in pixels.
     */
    @Generated
    @Selector("getHighlightWithXValue:x:y:")
    public native ChartHighlight getHighlightWithXValueXY(double xVal, @NFloat double x, @NFloat double y);

    /**
     * \param xValue the transformed x-value of the x-touch position
     * 
     * \param x touch position
     * 
     * \param y touch position
     * 
     * 
     * returns:
     * A list of Highlight objects representing the entries closest to the given xVal.
     * The returned list contains two objects per DataSet (closest rounding up, closest rounding down).
     */
    @Generated
    @Selector("getHighlightsWithXValue:x:y:")
    public native NSArray<? extends ChartHighlight> getHighlightsWithXValueXY(double xValue, @NFloat double x,
            @NFloat double y);

    /**
     * \param x
     * 
     * 
     * returns:
     * The corresponding x-pos for a given touch-position in pixels.
     */
    @Generated
    @Selector("getValsForTouchWithX:y:")
    @ByValue
    public native CGPoint getValsForTouchWithXY(@NFloat double x, @NFloat double y);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartHighlighter init();

    @Generated
    @Selector("initWithChart:")
    public native ChartHighlighter initWithChart(@Mapped(ObjCObjectMapper.class) Object chart);

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

    /**
     * instance of the data-provider
     */
    @Generated
    @Selector("setChart:")
    public native void setChart_unsafe(@Mapped(ObjCObjectMapper.class) ChartDataProvider value);

    /**
     * instance of the data-provider
     */
    @Generated
    public void setChart(@Mapped(ObjCObjectMapper.class) ChartDataProvider value) {
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