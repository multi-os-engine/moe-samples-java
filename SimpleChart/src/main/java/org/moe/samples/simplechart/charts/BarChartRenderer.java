package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
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
import org.moe.samples.simplechart.charts.protocol.BarChartDataProvider;
import org.moe.samples.simplechart.charts.protocol.IBarChartDataSet;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts16BarChartRenderer")
@ObjCClassBinding
public class BarChartRenderer extends BarLineScatterCandleBubbleChartRenderer {
	static {
		NatJ.register();
	}

	@Generated
	protected BarChartRenderer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native BarChartRenderer alloc();

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
	@Selector("dataProvider")
	@MappedReturn(ObjCObjectMapper.class)
	public native BarChartDataProvider dataProvider();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("drawDataSetWithContext:dataSet:index:")
	public native void drawDataSetWithContextDataSetIndex(CGContextRef context,
			@Mapped(ObjCObjectMapper.class) IBarChartDataSet dataSet,
			@NInt long index);

	@Generated
	@Selector("drawDataWithContext:")
	public native void drawDataWithContext(CGContextRef context);

	@Generated
	@Selector("drawExtrasWithContext:")
	public native void drawExtrasWithContext(CGContextRef context);

	@Generated
	@Selector("drawHighlightedWithContext:indices:")
	public native void drawHighlightedWithContextIndices(CGContextRef context,
			NSArray<? extends ChartHighlight> indices);

	@Generated
	@Selector("drawValueWithContext:value:xPos:yPos:font:align:color:")
	public native void drawValueWithContextValueXPosYPosFontAlignColor(
			CGContextRef context, String value, @NFloat double xPos,
			@NFloat double yPos, UIFont font, @NInt long align, UIColor color);

	@Generated
	@Selector("drawValuesWithContext:")
	public native void drawValuesWithContext(CGContextRef context);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native BarChartRenderer init();

	@Generated
	@Selector("initBuffers")
	public native void initBuffers();

	@Generated
	@Selector("initWithAnimator:viewPortHandler:")
	public native BarChartRenderer initWithAnimatorViewPortHandler(
			ChartAnimator animator, ChartViewPortHandler viewPortHandler);

	@Generated
	@Selector("initWithDataProvider:animator:viewPortHandler:")
	public native BarChartRenderer initWithDataProviderAnimatorViewPortHandler(
			@Mapped(ObjCObjectMapper.class) BarChartDataProvider dataProvider,
			ChartAnimator animator, ChartViewPortHandler viewPortHandler);

	@Generated
	@Selector("initWithViewPortHandler:")
	public native BarChartRenderer initWithViewPortHandler(
			ChartViewPortHandler viewPortHandler);

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
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setDataProvider:")
	public native void setDataProvider_unsafe(
			@Mapped(ObjCObjectMapper.class) BarChartDataProvider value);

	@Generated
	public void setDataProvider(
			@Mapped(ObjCObjectMapper.class) BarChartDataProvider value) {
		Object __old = dataProvider();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDataProvider_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

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