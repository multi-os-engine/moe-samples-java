package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
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
public class ChartLegendEntry extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartLegendEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartLegendEntry alloc();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The form to draw for this entry.
     * <code>None</code> will avoid drawing a form, and any related space.
     * <code>Empty</code> will avoid drawing a form, but keep its space.
     * <code>Default</code> will use the Legend’s default.
     */
    @Generated
    @Selector("form")
    @NInt
    public native long form();

    /**
     * The color for drawing the form
     */
    @Generated
    @Selector("formColor")
    public native UIColor formColor();

    /**
     * Line dash configuration for shapes that consist of lines.
     * This is the actual dash pattern.
     * I.e. [2, 3] will paint [–   –   ]
     * [1, 3, 4, 2] will paint [-   ––  -   ––  ]
     * Set to nil to use the legend’s default.
     */
    @Generated
    @Selector("formLineDashLengths")
    public native NSArray<? extends NSNumber> formLineDashLengths();

    /**
     * Line dash configuration for shapes that consist of lines.
     * This is how much (in pixels) into the dash pattern are we starting from.
     * Set to NaN to use the legend’s default.
     */
    @Generated
    @Selector("formLineDashPhase")
    @NFloat
    public native double formLineDashPhase();

    /**
     * Line width used for shapes that consist of lines.
     * Set to NaN to use the legend’s default.
     */
    @Generated
    @Selector("formLineWidth")
    @NFloat
    public native double formLineWidth();

    /**
     * Form size will be considered except for when .None is used
     * Set as NaN to use the legend’s default
     */
    @Generated
    @Selector("formSize")
    @NFloat
    public native double formSize();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartLegendEntry init();

    /**
     * \param label The legend entry text.
     * A <code>nil</code> label will start a group.
     * 
     * \param form The form to draw for this entry.
     * 
     * \param formSize Set to NaN to use the legend’s default.
     * 
     * \param formLineWidth Set to NaN to use the legend’s default.
     * 
     * \param formLineDashPhase Line dash configuration.
     * 
     * \param formLineDashLengths Line dash configurationas NaN to use the legend’s default.
     * 
     * \param formColor The color for drawing the form.
     */
    @Generated
    @Selector("initWithLabel:form:formSize:formLineWidth:formLineDashPhase:formLineDashLengths:formColor:")
    public native ChartLegendEntry initWithLabelFormFormSizeFormLineWidthFormLineDashPhaseFormLineDashLengthsFormColor(
            String label, @NInt long form, @NFloat double formSize, @NFloat double formLineWidth,
            @NFloat double formLineDashPhase, NSArray<? extends NSNumber> formLineDashLengths, UIColor formColor);

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
     * The legend entry text.
     * A <code>nil</code> label will start a group.
     */
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

    /**
     * The form to draw for this entry.
     * <code>None</code> will avoid drawing a form, and any related space.
     * <code>Empty</code> will avoid drawing a form, but keep its space.
     * <code>Default</code> will use the Legend’s default.
     */
    @Generated
    @Selector("setForm:")
    public native void setForm(@NInt long value);

    /**
     * The color for drawing the form
     */
    @Generated
    @Selector("setFormColor:")
    public native void setFormColor(UIColor value);

    /**
     * Line dash configuration for shapes that consist of lines.
     * This is the actual dash pattern.
     * I.e. [2, 3] will paint [–   –   ]
     * [1, 3, 4, 2] will paint [-   ––  -   ––  ]
     * Set to nil to use the legend’s default.
     */
    @Generated
    @Selector("setFormLineDashLengths:")
    public native void setFormLineDashLengths(NSArray<? extends NSNumber> value);

    /**
     * Line dash configuration for shapes that consist of lines.
     * This is how much (in pixels) into the dash pattern are we starting from.
     * Set to NaN to use the legend’s default.
     */
    @Generated
    @Selector("setFormLineDashPhase:")
    public native void setFormLineDashPhase(@NFloat double value);

    /**
     * Line width used for shapes that consist of lines.
     * Set to NaN to use the legend’s default.
     */
    @Generated
    @Selector("setFormLineWidth:")
    public native void setFormLineWidth(@NFloat double value);

    /**
     * Form size will be considered except for when .None is used
     * Set as NaN to use the legend’s default
     */
    @Generated
    @Selector("setFormSize:")
    public native void setFormSize(@NFloat double value);

    /**
     * The legend entry text.
     * A <code>nil</code> label will start a group.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

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