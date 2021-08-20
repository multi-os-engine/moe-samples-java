package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartXAxis extends ChartAxisBase {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartXAxis(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartXAxis alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * if set to true, the chart will avoid that the first and last label entry in the chart “clip” off the edge of the chart
     */
    @Generated
    @Selector("avoidFirstLastClippingEnabled")
    public native boolean avoidFirstLastClippingEnabled();

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
    public native ChartXAxis init();

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
    @Selector("isAvoidFirstLastClippingEnabled")
    public native boolean isAvoidFirstLastClippingEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * <code>true</code> if word wrapping the labels is enabled
     */
    @Generated
    @Selector("isWordWrapEnabled")
    public native boolean isWordWrapEnabled();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * height of the x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("labelHeight")
    @NFloat
    public native double labelHeight();

    /**
     * the position of the x-labels relative to the chart
     */
    @Generated
    @Selector("labelPosition")
    @NInt
    public native long labelPosition();

    /**
     * height of the (rotated) x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("labelRotatedHeight")
    @NFloat
    public native double labelRotatedHeight();

    /**
     * width of the (rotated) x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("labelRotatedWidth")
    @NFloat
    public native double labelRotatedWidth();

    /**
     * This is the angle for drawing the X axis labels (in degrees)
     */
    @Generated
    @Selector("labelRotationAngle")
    @NFloat
    public native double labelRotationAngle();

    /**
     * width of the x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("labelWidth")
    @NFloat
    public native double labelWidth();

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
     * if set to true, the chart will avoid that the first and last label entry in the chart “clip” off the edge of the chart
     */
    @Generated
    @Selector("setAvoidFirstLastClippingEnabled:")
    public native void setAvoidFirstLastClippingEnabled(boolean value);

    /**
     * height of the x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("setLabelHeight:")
    public native void setLabelHeight(@NFloat double value);

    /**
     * the position of the x-labels relative to the chart
     */
    @Generated
    @Selector("setLabelPosition:")
    public native void setLabelPosition(@NInt long value);

    /**
     * height of the (rotated) x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("setLabelRotatedHeight:")
    public native void setLabelRotatedHeight(@NFloat double value);

    /**
     * width of the (rotated) x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("setLabelRotatedWidth:")
    public native void setLabelRotatedWidth(@NFloat double value);

    /**
     * This is the angle for drawing the X axis labels (in degrees)
     */
    @Generated
    @Selector("setLabelRotationAngle:")
    public native void setLabelRotationAngle(@NFloat double value);

    /**
     * width of the x-axis labels in pixels - this is automatically calculated by the <code>computeSize()</code> methods in the renderers
     */
    @Generated
    @Selector("setLabelWidth:")
    public native void setLabelWidth(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * if set to true, word wrapping the labels will be enabled.
     * word wrapping is done using <code>(value width * labelRotatedWidth)</code>
     * note:
     * currently supports all charts except pie/radar/horizontal-bar*
     */
    @Generated
    @Selector("setWordWrapEnabled:")
    public native void setWordWrapEnabled(boolean value);

    /**
     * the width for wrapping the labels, as percentage out of one value width.
     * used only when isWordWrapEnabled = true.
     * <em>default</em>: 1.0
     */
    @Generated
    @Selector("setWordWrapWidthPercent:")
    public native void setWordWrapWidthPercent(@NFloat double value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * if set to true, word wrapping the labels will be enabled.
     * word wrapping is done using <code>(value width * labelRotatedWidth)</code>
     * note:
     * currently supports all charts except pie/radar/horizontal-bar*
     */
    @Generated
    @Selector("wordWrapEnabled")
    public native boolean wordWrapEnabled();

    /**
     * the width for wrapping the labels, as percentage out of one value width.
     * used only when isWordWrapEnabled = true.
     * <em>default</em>: 1.0
     */
    @Generated
    @Selector("wordWrapWidthPercent")
    @NFloat
    public native double wordWrapWidthPercent();
}