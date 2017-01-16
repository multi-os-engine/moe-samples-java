package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
public class ChartXAxisRenderer extends ChartAxisRendererBase {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartXAxisRenderer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartXAxisRenderer alloc();

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
	@Selector("computeAxisValuesWithMin:max:")
	public native void computeAxisValuesWithMinMax(double min, double max);

	@Generated
	@Selector("computeAxisWithMin:max:inverted:")
	public native void computeAxisWithMinMaxInverted(double min, double max,
			boolean inverted);

	@Generated
	@Selector("computeSize")
	public native void computeSize();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("drawGridLineWithContext:x:y:")
	public native void drawGridLineWithContextXY(CGContextRef context,
			@NFloat double x, @NFloat double y);

	@Generated
	@Selector("drawLabelWithContext:formattedLabel:x:y:attributes:constrainedToSize:anchor:angleRadians:")
	public native void drawLabelWithContextFormattedLabelXYAttributesConstrainedToSizeAnchorAngleRadians(
			CGContextRef context, String formattedLabel, @NFloat double x,
			@NFloat double y,
			NSDictionary<String, ? extends NSObject> attributes,
			@ByValue CGSize constrainedToSize, @ByValue CGPoint anchor,
			@NFloat double angleRadians);

	@Generated
	@Selector("drawLabelsWithContext:pos:anchor:")
	public native void drawLabelsWithContextPosAnchor(CGContextRef context,
			@NFloat double pos, @ByValue CGPoint anchor);

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
	public native ChartXAxisRenderer init();

	@Generated
	@Selector("initWithViewPortHandler:")
	public native ChartXAxisRenderer initWithViewPortHandler(
			ChartViewPortHandler viewPortHandler);

	@Generated
	@Selector("initWithViewPortHandler:transformer:axis:")
	public native ChartXAxisRenderer initWithViewPortHandlerTransformerAxis(
			ChartViewPortHandler viewPortHandler, ChartTransformer transformer,
			ChartAxisBase axis);

	@Generated
	@Selector("initWithViewPortHandler:xAxis:transformer:")
	public native ChartXAxisRenderer initWithViewPortHandlerXAxisTransformer(
			ChartViewPortHandler viewPortHandler, ChartXAxis xAxis,
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
	@Selector("renderGridLinesWithContext:")
	public native void renderGridLinesWithContext(CGContextRef context);

	@Generated
	@Selector("renderLimitLineLabelWithContext:limitLine:position:yOffset:")
	public native void renderLimitLineLabelWithContextLimitLinePositionYOffset(
			CGContextRef context, ChartLimitLine limitLine,
			@ByValue CGPoint position, @NFloat double yOffset);

	@Generated
	@Selector("renderLimitLineLineWithContext:limitLine:position:")
	public native void renderLimitLineLineWithContextLimitLinePosition(
			CGContextRef context, ChartLimitLine limitLine,
			@ByValue CGPoint position);

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
	@Selector("version")
	@NInt
	public static native long version_static();
}