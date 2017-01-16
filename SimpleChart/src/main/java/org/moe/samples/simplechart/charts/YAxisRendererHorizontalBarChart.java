package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
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

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts31YAxisRendererHorizontalBarChart")
@ObjCClassBinding
public class YAxisRendererHorizontalBarChart extends ChartYAxisRenderer {
	static {
		NatJ.register();
	}

	@Generated
	protected YAxisRendererHorizontalBarChart(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native YAxisRendererHorizontalBarChart alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

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
	@Selector("computeAxisWithMin:max:inverted:")
	public native void computeAxisWithMinMaxInverted(double min, double max,
			boolean inverted);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("drawGridLineWithContext:position:")
	public native void drawGridLineWithContextPosition(CGContextRef context,
			@ByValue CGPoint position);

	@Generated
	@Selector("drawYLabelsWithContext:fixedPosition:positions:offset:")
	public native void drawYLabelsWithContextFixedPositionPositionsOffset(
			CGContextRef context, @NFloat double fixedPosition,
			NSArray<? extends NSValue> positions, @NFloat double offset);

	@Generated
	@Selector("drawZeroLineWithContext:")
	public native void drawZeroLineWithContext(CGContextRef context);

	@Generated
	@Selector("gridClippingRect")
	@ByValue
	public native CGRect gridClippingRect();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native YAxisRendererHorizontalBarChart init();

	@Generated
	@Selector("initWithViewPortHandler:")
	public native YAxisRendererHorizontalBarChart initWithViewPortHandler(
			ChartViewPortHandler viewPortHandler);

	@Generated
	@Selector("initWithViewPortHandler:transformer:axis:")
	public native YAxisRendererHorizontalBarChart initWithViewPortHandlerTransformerAxis(
			ChartViewPortHandler viewPortHandler, ChartTransformer transformer,
			ChartAxisBase axis);

	@Generated
	@Selector("initWithViewPortHandler:yAxis:transformer:")
	public native YAxisRendererHorizontalBarChart initWithViewPortHandlerYAxisTransformer(
			ChartViewPortHandler viewPortHandler, ChartYAxis yAxis,
			ChartTransformer transformer);

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
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("renderAxisLabelsWithContext:")
	public native void renderAxisLabelsWithContext(CGContextRef context);

	@Generated
	@Selector("renderAxisLineWithContext:")
	public native void renderAxisLineWithContext(CGContextRef context);

	@Generated
	@Selector("renderLimitLinesWithContext:")
	public native void renderLimitLinesWithContext(CGContextRef context);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("transformedPositions")
	public native NSArray<? extends NSValue> transformedPositions();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}