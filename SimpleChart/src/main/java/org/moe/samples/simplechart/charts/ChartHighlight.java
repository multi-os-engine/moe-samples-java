package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
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
public class ChartHighlight extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartHighlight(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartHighlight alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("axis")
	@NInt
	public native long axis();

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
	@Selector("dataIndex")
	@NInt
	public native long dataIndex();

	@Generated
	@Selector("dataSetIndex")
	@NInt
	public native long dataSetIndex();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("drawX")
	@NFloat
	public native double drawX();

	@Generated
	@Selector("drawY")
	@NFloat
	public native double drawY();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartHighlight init();

	@Generated
	@Selector("initWithX:dataSetIndex:stackIndex:")
	public native ChartHighlight initWithXDataSetIndexStackIndex(double x,
			@NInt long dataSetIndex, @NInt long stackIndex);

	@Generated
	@Selector("initWithX:y:dataSetIndex:")
	public native ChartHighlight initWithXYDataSetIndex(double x, double y,
			@NInt long dataSetIndex);

	@Generated
	@Selector("initWithX:y:xPx:yPx:dataIndex:dataSetIndex:stackIndex:axis:")
	public native ChartHighlight initWithXYXPxYPxDataIndexDataSetIndexStackIndexAxis(
			double x, double y, @NFloat double xPx, @NFloat double yPx,
			@NInt long dataIndex, @NInt long dataSetIndex,
			@NInt long stackIndex, @NInt long axis);

	@Generated
	@Selector("initWithX:y:xPx:yPx:dataSetIndex:axis:")
	public native ChartHighlight initWithXYXPxYPxDataSetIndexAxis(double x,
			double y, @NFloat double xPx, @NFloat double yPx,
			@NInt long dataSetIndex, @NInt long axis);

	@Generated
	@Selector("initWithX:y:xPx:yPx:dataSetIndex:stackIndex:axis:")
	public native ChartHighlight initWithXYXPxYPxDataSetIndexStackIndexAxis(
			double x, double y, @NFloat double xPx, @NFloat double yPx,
			@NInt long dataSetIndex, @NInt long stackIndex, @NInt long axis);

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
	@Selector("isEqual:")
	public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isStacked")
	public native boolean isStacked();

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
	@Selector("setDataIndex:")
	public native void setDataIndex(@NInt long value);

	@Generated
	@Selector("setDrawWithPt:")
	public native void setDrawWithPt(@ByValue CGPoint pt);

	@Generated
	@Selector("setDrawWithX:y:")
	public native void setDrawWithXY(@NFloat double x, @NFloat double y);

	@Generated
	@Selector("setDrawX:")
	public native void setDrawX(@NFloat double value);

	@Generated
	@Selector("setDrawY:")
	public native void setDrawY(@NFloat double value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("stackIndex")
	@NInt
	public native long stackIndex();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("x")
	public native double x();

	@Generated
	@Selector("xPx")
	@NFloat
	public native double xPx();

	@Generated
	@Selector("y")
	public native double y();

	@Generated
	@Selector("yPx")
	@NFloat
	public native double yPx();
}