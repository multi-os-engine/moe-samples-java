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
@ObjCClassName("_TtC6Charts19RadarChartDataEntry")
@ObjCClassBinding
public class RadarChartDataEntry extends ChartDataEntry {
    static {
        NatJ.register();
    }

    @Generated
    protected RadarChartDataEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native RadarChartDataEntry alloc();

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

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

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

    @Generated
    @Selector("init")
    public native RadarChartDataEntry init();

    /**
     * \param value The value on the y-axis.
     */
    @Generated
    @Selector("initWithValue:")
    public native RadarChartDataEntry initWithValue(double value);

    /**
     * \param value The value on the y-axis.
     * 
     * \param data Spot for additional data this Entry represents.
     */
    @Generated
    @Selector("initWithValue:data:")
    public native RadarChartDataEntry initWithValueData(double value, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:")
    public native RadarChartDataEntry initWithXY(double x, double y);

    @Generated
    @Selector("initWithX:y:data:")
    public native RadarChartDataEntry initWithXYData(double x, double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:icon:")
    public native RadarChartDataEntry initWithXYIcon(double x, double y, UIImage icon);

    @Generated
    @Selector("initWithX:y:icon:data:")
    public native RadarChartDataEntry initWithXYIconData(double x, double y, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:")
    public native RadarChartDataEntry initWithY(double y);

    @Generated
    @Selector("initWithY:data:")
    public native RadarChartDataEntry initWithYData(double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:icon:")
    public native RadarChartDataEntry initWithYIcon(double y, UIImage icon);

    @Generated
    @Selector("initWithY:icon:data:")
    public native RadarChartDataEntry initWithYIconData(double y, UIImage icon,
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
    @Selector("setValue:")
    public native void setValue(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("value")
    public native double value();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}