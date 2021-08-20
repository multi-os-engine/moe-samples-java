package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts20CandleChartDataEntry")
@ObjCClassBinding
public class CandleChartDataEntry extends ChartDataEntry {
    static {
        NatJ.register();
    }

    @Generated
    protected CandleChartDataEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CandleChartDataEntry alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The body size (difference between open and close).
     */
    @Generated
    @Selector("bodyRange")
    public native double bodyRange();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * close value
     */
    @Generated
    @Selector("close")
    public native double close();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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

    /**
     * shadow-high value
     */
    @Generated
    @Selector("high")
    public native double high();

    @Generated
    @Selector("init")
    public native CandleChartDataEntry init();

    @Generated
    @Selector("initWithX:shadowH:shadowL:open:close:")
    public native CandleChartDataEntry initWithXShadowHShadowLOpenClose(double x, double shadowH, double shadowL,
            double open, double close);

    @Generated
    @Selector("initWithX:shadowH:shadowL:open:close:data:")
    public native CandleChartDataEntry initWithXShadowHShadowLOpenCloseData(double x, double shadowH, double shadowL,
            double open, double close, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:shadowH:shadowL:open:close:icon:")
    public native CandleChartDataEntry initWithXShadowHShadowLOpenCloseIcon(double x, double shadowH, double shadowL,
            double open, double close, UIImage icon);

    @Generated
    @Selector("initWithX:shadowH:shadowL:open:close:icon:data:")
    public native CandleChartDataEntry initWithXShadowHShadowLOpenCloseIconData(double x, double shadowH,
            double shadowL, double open, double close, UIImage icon, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:")
    public native CandleChartDataEntry initWithXY(double x, double y);

    @Generated
    @Selector("initWithX:y:data:")
    public native CandleChartDataEntry initWithXYData(double x, double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:icon:")
    public native CandleChartDataEntry initWithXYIcon(double x, double y, UIImage icon);

    @Generated
    @Selector("initWithX:y:icon:data:")
    public native CandleChartDataEntry initWithXYIconData(double x, double y, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:")
    public native CandleChartDataEntry initWithY(double y);

    @Generated
    @Selector("initWithY:data:")
    public native CandleChartDataEntry initWithYData(double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:icon:")
    public native CandleChartDataEntry initWithYIcon(double y, UIImage icon);

    @Generated
    @Selector("initWithY:icon:data:")
    public native CandleChartDataEntry initWithYIconData(double y, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

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

    /**
     * shadow-low value
     */
    @Generated
    @Selector("low")
    public native double low();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * open value
     */
    @Generated
    @Selector("open")
    public native double open();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * close value
     */
    @Generated
    @Selector("setClose:")
    public native void setClose(double value);

    /**
     * shadow-high value
     */
    @Generated
    @Selector("setHigh:")
    public native void setHigh(double value);

    /**
     * shadow-low value
     */
    @Generated
    @Selector("setLow:")
    public native void setLow(double value);

    /**
     * open value
     */
    @Generated
    @Selector("setOpen:")
    public native void setOpen(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * the center value of the candle. (Middle value between high and low)
     */
    @Generated
    @Selector("setY:")
    public native void setY(double value);

    /**
     * The overall range (difference) between shadow-high and shadow-low.
     */
    @Generated
    @Selector("shadowRange")
    public native double shadowRange();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * the center value of the candle. (Middle value between high and low)
     */
    @Generated
    @Selector("y")
    public native double y();
}