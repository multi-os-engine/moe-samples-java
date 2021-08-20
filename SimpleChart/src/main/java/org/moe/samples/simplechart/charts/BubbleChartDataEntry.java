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

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts20BubbleChartDataEntry")
@ObjCClassBinding
public class BubbleChartDataEntry extends ChartDataEntry {
    static {
        NatJ.register();
    }

    @Generated
    protected BubbleChartDataEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BubbleChartDataEntry alloc();

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
    public native BubbleChartDataEntry init();

    @Generated
    @Selector("initWithX:y:")
    public native BubbleChartDataEntry initWithXY(double x, double y);

    @Generated
    @Selector("initWithX:y:data:")
    public native BubbleChartDataEntry initWithXYData(double x, double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithX:y:icon:")
    public native BubbleChartDataEntry initWithXYIcon(double x, double y, UIImage icon);

    @Generated
    @Selector("initWithX:y:icon:data:")
    public native BubbleChartDataEntry initWithXYIconData(double x, double y, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * \param x The index on the x-axis.
     * 
     * \param y The value on the y-axis.
     * 
     * \param size The size of the bubble.
     */
    @Generated
    @Selector("initWithX:y:size:")
    public native BubbleChartDataEntry initWithXYSize(double x, double y, @NFloat double size);

    /**
     * \param x The index on the x-axis.
     * 
     * \param y The value on the y-axis.
     * 
     * \param size The size of the bubble.
     * 
     * \param data Spot for additional data this Entry represents.
     */
    @Generated
    @Selector("initWithX:y:size:data:")
    public native BubbleChartDataEntry initWithXYSizeData(double x, double y, @NFloat double size,
            @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * \param x The index on the x-axis.
     * 
     * \param y The value on the y-axis.
     * 
     * \param size The size of the bubble.
     * 
     * \param icon icon image
     */
    @Generated
    @Selector("initWithX:y:size:icon:")
    public native BubbleChartDataEntry initWithXYSizeIcon(double x, double y, @NFloat double size, UIImage icon);

    /**
     * \param x The index on the x-axis.
     * 
     * \param y The value on the y-axis.
     * 
     * \param size The size of the bubble.
     * 
     * \param icon icon image
     * 
     * \param data Spot for additional data this Entry represents.
     */
    @Generated
    @Selector("initWithX:y:size:icon:data:")
    public native BubbleChartDataEntry initWithXYSizeIconData(double x, double y, @NFloat double size, UIImage icon,
            @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:")
    public native BubbleChartDataEntry initWithY(double y);

    @Generated
    @Selector("initWithY:data:")
    public native BubbleChartDataEntry initWithYData(double y, @Mapped(ObjCObjectMapper.class) Object data);

    @Generated
    @Selector("initWithY:icon:")
    public native BubbleChartDataEntry initWithYIcon(double y, UIImage icon);

    @Generated
    @Selector("initWithY:icon:data:")
    public native BubbleChartDataEntry initWithYIconData(double y, UIImage icon,
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

    /**
     * The size of the bubble.
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * The size of the bubble.
     */
    @Generated
    @Selector("size")
    @NFloat
    public native double size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}