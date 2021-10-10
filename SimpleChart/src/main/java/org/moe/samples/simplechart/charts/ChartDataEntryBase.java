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
@ObjCClassName("_TtC6Charts18ChartDataEntryBase")
@ObjCClassBinding
public class ChartDataEntryBase extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartDataEntryBase(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartDataEntryBase alloc();

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

    /**
     * optional spot for additional data this Entry represents
     */
    @Generated
    @Selector("data")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object data();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * optional icon image
     */
    @Generated
    @Selector("icon")
    public native UIImage icon();

    @Generated
    @Selector("init")
    public native ChartDataEntryBase init();

    /**
     * An Entry represents one single entry in the chart.
     * \param y the y value (the actual value of the entry)
     */
    @Generated
    @Selector("initWithY:")
    public native ChartDataEntryBase initWithY(double y);

    /**
     * \param y the y value (the actual value of the entry)
     * 
     * \param data Space for additional data this Entry represents.
     */
    @Generated
    @Selector("initWithY:data:")
    public native ChartDataEntryBase initWithYData(double y, @Mapped(ObjCObjectMapper.class) Object data);

    /**
     * \param y the y value (the actual value of the entry)
     * 
     * \param icon icon image
     */
    @Generated
    @Selector("initWithY:icon:")
    public native ChartDataEntryBase initWithYIcon(double y, UIImage icon);

    /**
     * \param y the y value (the actual value of the entry)
     * 
     * \param icon icon image
     * 
     * \param data Space for additional data this Entry represents.
     */
    @Generated
    @Selector("initWithY:icon:data:")
    public native ChartDataEntryBase initWithYIconData(double y, UIImage icon,
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
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

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
     * optional spot for additional data this Entry represents
     */
    @Generated
    @Selector("setData:")
    public native void setData(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * optional icon image
     */
    @Generated
    @Selector("setIcon:")
    public native void setIcon(UIImage value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * the y value
     */
    @Generated
    @Selector("setY:")
    public native void setY(double value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * the y value
     */
    @Generated
    @Selector("y")
    public native double y();
}