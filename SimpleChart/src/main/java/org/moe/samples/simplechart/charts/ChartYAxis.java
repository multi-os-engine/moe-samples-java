package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartYAxis extends ChartAxisBase {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartYAxis(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartYAxis alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("axisDependency")
	@NInt
	public native long axisDependency();

	@Generated
	@Selector("calculateWithMin:max:")
	public native void calculateWithMinMax(double dataMin, double dataMax);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

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
	@Selector("drawTopYLabelEntryEnabled")
	public native boolean drawTopYLabelEntryEnabled();

	@Generated
	@Selector("drawZeroLineEnabled")
	public native boolean drawZeroLineEnabled();

	@Generated
	@Selector("getRequiredHeightSpace")
	@NFloat
	public native double getRequiredHeightSpace();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartYAxis init();

	@Generated
	@Selector("initWithPosition:")
	public native ChartYAxis initWithPosition(@NInt long position);

	@Generated
	@Selector("initialize")
	public static native void initialize_static();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("inverted")
	public native boolean inverted();

	@Generated
	@Selector("isDrawTopYLabelEntryEnabled")
	public native boolean isDrawTopYLabelEntryEnabled();

	@Generated
	@Selector("isInverted")
	public native boolean isInverted();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("labelPosition")
	@NInt
	public native long labelPosition();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("maxWidth")
	@NFloat
	public native double maxWidth();

	@Generated
	@Selector("minWidth")
	@NFloat
	public native double minWidth();

	@Generated
	@Selector("needsOffset")
	public native boolean needsOffset();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("requiredSize")
	@ByValue
	public native CGSize requiredSize();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setDrawTopYLabelEntryEnabled:")
	public native void setDrawTopYLabelEntryEnabled(boolean value);

	@Generated
	@Selector("setDrawZeroLineEnabled:")
	public native void setDrawZeroLineEnabled(boolean value);

	@Generated
	@Selector("setInverted:")
	public native void setInverted(boolean value);

	@Generated
	@Selector("setLabelPosition:")
	public native void setLabelPosition(@NInt long value);

	@Generated
	@Selector("setMaxWidth:")
	public native void setMaxWidth(@NFloat double value);

	@Generated
	@Selector("setMinWidth:")
	public native void setMinWidth(@NFloat double value);

	@Generated
	@Selector("setSpaceBottom:")
	public native void setSpaceBottom(@NFloat double value);

	@Generated
	@Selector("setSpaceTop:")
	public native void setSpaceTop(@NFloat double value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setZeroLineColor:")
	public native void setZeroLineColor(UIColor value);

	@Generated
	@Selector("setZeroLineDashLengths:")
	public native void setZeroLineDashLengths(NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setZeroLineDashPhase:")
	public native void setZeroLineDashPhase(@NFloat double value);

	@Generated
	@Selector("setZeroLineWidth:")
	public native void setZeroLineWidth(@NFloat double value);

	@Generated
	@Selector("spaceBottom")
	@NFloat
	public native double spaceBottom();

	@Generated
	@Selector("spaceTop")
	@NFloat
	public native double spaceTop();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("zeroLineColor")
	public native UIColor zeroLineColor();

	@Generated
	@Selector("zeroLineDashLengths")
	public native NSArray<? extends NSNumber> zeroLineDashLengths();

	@Generated
	@Selector("zeroLineDashPhase")
	@NFloat
	public native double zeroLineDashPhase();

	@Generated
	@Selector("zeroLineWidth")
	@NFloat
	public native double zeroLineWidth();
}