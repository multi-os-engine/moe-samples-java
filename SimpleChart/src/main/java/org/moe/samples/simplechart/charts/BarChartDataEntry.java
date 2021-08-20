package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
@ObjCClassName("_TtC6Charts17BarChartDataEntry")
@ObjCClassBinding
public class BarChartDataEntry extends ChartDataEntry {
    static {
        NatJ.register();
    }

    @Generated
    protected BarChartDataEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BarChartDataEntry alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("calcPosNegSum")
    public native void calcPosNegSum();

    /**
     * Splits up the stack-values of the given bar-entry into Range objects.
     * \param entry
     * 
     * 
     * returns:
     */
    @Generated
    @Selector("calcRanges")
    public native void calcRanges();

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
    public native BarChartDataEntry init();

    /**
     * Constructor for normal bars (not stacked).
     */
    @Generated
    @Selector("initWithX:y:")
    public native BarChartDataEntry initWithXY(double x, double y);

    /**
     * Constructor for normal bars (not stacked).
     */
    @Generated
    @Selector("initWithX:y:data:")
    public native BarChartDataEntry initWithXYData(double x, double y, @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * Constructor for normal bars (not stacked).
     */
    @Generated
    @Selector("initWithX:y:icon:")
    public native BarChartDataEntry initWithXYIcon(double x, double y, UIImage icon);

    /**
     * Constructor for normal bars (not stacked).
     */
    @Generated
    @Selector("initWithX:y:icon:data:")
    public native BarChartDataEntry initWithXYIconData(double x, double y, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * Constructor for stacked bar entries.
     */
    @Generated
    @Selector("initWithX:yValues:")
    public native BarChartDataEntry initWithXYValues(double x, NSArray<? extends NSNumber> yValues);

    /**
     * Constructor for stacked bar entries. One data object for whole stack
     */
    @Generated
    @Selector("initWithX:yValues:data:")
    public native BarChartDataEntry initWithXYValuesData(double x, NSArray<? extends NSNumber> yValues,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * Constructor for stacked bar entries. One data object for whole stack
     */
    @Generated
    @Selector("initWithX:yValues:icon:")
    public native BarChartDataEntry initWithXYValuesIcon(double x, NSArray<? extends NSNumber> yValues, UIImage icon);

    /**
     * Constructor for stacked bar entries. One data object for whole stack
     */
    @Generated
    @Selector("initWithX:yValues:icon:data:")
    public native BarChartDataEntry initWithXYValuesIconData(double x, NSArray<? extends NSNumber> yValues,
            UIImage icon, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:")
    public native BarChartDataEntry initWithY(double y);

    @Generated
    @Selector("initWithY:data:")
    public native BarChartDataEntry initWithYData(double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:icon:")
    public native BarChartDataEntry initWithYIcon(double y, UIImage icon);

    @Generated
    @Selector("initWithY:icon:data:")
    public native BarChartDataEntry initWithYIconData(double y, UIImage icon,
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

    /**
     * the values the stacked barchart holds
     */
    @Generated
    @Selector("isStacked")
    public native boolean isStacked();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * The sum of all negative values this entry (if stacked) contains. (this is a positive number)
     */
    @Generated
    @Selector("negativeSum")
    public native double negativeSum();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * The sum of all positive values this entry (if stacked) contains.
     */
    @Generated
    @Selector("positiveSum")
    public native double positiveSum();

    /**
     * The ranges of the individual stack-entries. Will return null if this entry is not stacked.
     */
    @Generated
    @Selector("ranges")
    public native NSArray<? extends ChartRange> ranges();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * the values the stacked barchart holds
     */
    @Generated
    @Selector("setYValues:")
    public native void setYValues(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("sumBelowStackIndex:")
    public native double sumBelowStackIndex(@NInt long stackIndex);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * the values the stacked barchart holds
     */
    @Generated
    @Selector("yValues")
    public native NSArray<? extends NSNumber> yValues();
}