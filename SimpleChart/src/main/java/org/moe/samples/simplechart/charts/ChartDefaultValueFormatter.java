package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumberFormatter;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IChartValueFormatter;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartDefaultValueFormatter extends NSObject implements
		IChartValueFormatter {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartDefaultValueFormatter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartDefaultValueFormatter alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("block")
	@ObjCBlock(name = "call_block_ret")
	public native Block_block_ret block();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_block_ret {
		@Generated
		String call_block_ret(double arg0, ChartDataEntry arg1,
				@NInt long arg2, ChartViewPortHandler arg3);
	}

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
	@Selector("formatter")
	public native NSNumberFormatter formatter();

	@Generated
	@Selector("hasAutoDecimals")
	public native boolean hasAutoDecimals();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartDefaultValueFormatter init();

	@Generated
	@Selector("initWithBlock:")
	public native ChartDefaultValueFormatter initWithBlock(
			@ObjCBlock(name = "call_initWithBlock") Block_initWithBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithBlock {
		@Generated
		String call_initWithBlock(double arg0, ChartDataEntry arg1,
				@NInt long arg2, ChartViewPortHandler arg3);
	}

	@Generated
	@Selector("initWithDecimals:")
	public native ChartDefaultValueFormatter initWithDecimals(
			@NInt long decimals);

	@Generated
	@Selector("initWithFormatter:")
	public native ChartDefaultValueFormatter initWithFormatter(
			NSNumberFormatter formatter);

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
	@Selector("setBlock:")
	public native void setBlock(
			@ObjCBlock(name = "call_setBlock") Block_setBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setBlock {
		@Generated
		String call_setBlock(double arg0, ChartDataEntry arg1, @NInt long arg2,
				ChartViewPortHandler arg3);
	}

	@Generated
	@Selector("setFormatter:")
	public native void setFormatter(NSNumberFormatter value);

	@Generated
	@Selector("setHasAutoDecimals:")
	public native void setHasAutoDecimals(boolean value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("stringForValue:entry:dataSetIndex:viewPortHandler:")
	public native String stringForValueEntryDataSetIndexViewPortHandler(
			double value, ChartDataEntry entry, @NInt long dataSetIndex,
			ChartViewPortHandler viewPortHandler);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("withBlock:")
	public static native ChartDefaultValueFormatter withBlock(
			@ObjCBlock(name = "call_withBlock") Block_withBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_withBlock {
		@Generated
		String call_withBlock(double arg0, ChartDataEntry arg1,
				@NInt long arg2, ChartViewPortHandler arg3);
	}
}