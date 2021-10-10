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
@ObjCClassName("_TtC6Charts17PieChartDataEntry")
@ObjCClassBinding
public class PieChartDataEntry extends ChartDataEntry {
    static {
        NatJ.register();
    }

    @Generated
    protected PieChartDataEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PieChartDataEntry alloc();

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
    public native PieChartDataEntry init();

    /**
     * \param value The value on the y-axis
     */
    @Generated
    @Selector("initWithValue:")
    public native PieChartDataEntry initWithValue(double value);

    /**
     * \param value The value on the y-axis
     * 
     * \param data Spot for additional data this Entry represents
     */
    @Generated
    @Selector("initWithValue:data:")
    public native PieChartDataEntry initWithValueData(double value, @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * \param value The value on the y-axis
     * 
     * \param icon icon image
     */
    @Generated
    @Selector("initWithValue:icon:")
    public native PieChartDataEntry initWithValueIcon(double value, UIImage icon);

    /**
     * \param value The value on the y-axis
     * 
     * \param icon icon image
     * 
     * \param data Spot for additional data this Entry represents
     */
    @Generated
    @Selector("initWithValue:icon:data:")
    public native PieChartDataEntry initWithValueIconData(double value, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * \param value The value on the y-axis
     * 
     * \param label The label for the x-axis
     */
    @Generated
    @Selector("initWithValue:label:")
    public native PieChartDataEntry initWithValueLabel(double value, String label);

    /**
     * \param value The value on the y-axis
     * 
     * \param label The label for the x-axis
     * 
     * \param data Spot for additional data this Entry represents
     */
    @Generated
    @Selector("initWithValue:label:data:")
    public native PieChartDataEntry initWithValueLabelData(double value, String label,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * \param value The value on the y-axis
     * 
     * \param label The label for the x-axis
     * 
     * \param icon icon image
     */
    @Generated
    @Selector("initWithValue:label:icon:")
    public native PieChartDataEntry initWithValueLabelIcon(double value, String label, UIImage icon);

    /**
     * \param value The value on the y-axis
     * 
     * \param label The label for the x-axis
     * 
     * \param icon icon image
     * 
     * \param data Spot for additional data this Entry represents
     */
    @Generated
    @Selector("initWithValue:label:icon:data:")
    public native PieChartDataEntry initWithValueLabelIconData(double value, String label, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:")
    public native PieChartDataEntry initWithXY(double x, double y);

    @Generated
    @Selector("initWithX:y:data:")
    public native PieChartDataEntry initWithXYData(double x, double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:icon:")
    public native PieChartDataEntry initWithXYIcon(double x, double y, UIImage icon);

    @Generated
    @Selector("initWithX:y:icon:data:")
    public native PieChartDataEntry initWithXYIconData(double x, double y, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:")
    public native PieChartDataEntry initWithY(double y);

    @Generated
    @Selector("initWithY:data:")
    public native PieChartDataEntry initWithYData(double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:icon:")
    public native PieChartDataEntry initWithYIcon(double y, UIImage icon);

    @Generated
    @Selector("initWithY:icon:data:")
    public native PieChartDataEntry initWithYIconData(double y, UIImage icon,
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
    @Selector("label")
    public native String label();

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
    @Selector("setLabel:")
    public native void setLabel(String value);

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