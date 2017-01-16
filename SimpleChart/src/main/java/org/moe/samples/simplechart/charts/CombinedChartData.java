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
import org.moe.samples.simplechart.charts.protocol.IChartDataSet;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts17CombinedChartData")
@ObjCClassBinding
public class CombinedChartData extends BarLineScatterCandleBubbleChartData {
	static {
		NatJ.register();
	}

	@Generated
	protected CombinedChartData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allData")
	public native NSArray<? extends ChartData> allData();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CombinedChartData alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("barData")
	public native BarChartData barData();

	@Generated
	@Selector("bubbleData")
	public native BubbleChartData bubbleData();

	@Generated
	@Selector("calcMinMax")
	public native void calcMinMax();

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
	@Selector("candleData")
	public native CandleChartData candleData();

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
	@Selector("dataByIndex:")
	public native ChartData dataByIndex(@NInt long index);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("entryForHighlight:")
	public native ChartDataEntry entryForHighlight(ChartHighlight highlight);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native CombinedChartData init();

	@Generated
	@Selector("initWithDataSet:")
	public native CombinedChartData initWithDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

	@Generated
	@Selector("initWithDataSets:")
	public native CombinedChartData initWithDataSets(NSArray<?> dataSets);

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
	@Selector("lineData")
	public native LineChartData lineData();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("notifyDataChanged")
	public native void notifyDataChanged();

	@Generated
	@Selector("removeDataSet:")
	public native boolean removeDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

	@Generated
	@Selector("removeDataSetByIndex:")
	public native boolean removeDataSetByIndex(@NInt long index);

	@Generated
	@Selector("removeEntry:dataSetIndex:")
	public native boolean removeEntryDataSetIndex(ChartDataEntry entry,
			@NInt long dataSetIndex);

	@Generated
	@Selector("removeEntryWithXValue:dataSetIndex:")
	public native boolean removeEntryWithXValueDataSetIndex(double xValue,
			@NInt long dataSetIndex);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("scatterData")
	public native ScatterChartData scatterData();

	@Generated
	@Selector("setBarData:")
	public native void setBarData(BarChartData value);

	@Generated
	@Selector("setBubbleData:")
	public native void setBubbleData(BubbleChartData value);

	@Generated
	@Selector("setCandleData:")
	public native void setCandleData(CandleChartData value);

	@Generated
	@Selector("setLineData:")
	public native void setLineData(LineChartData value);

	@Generated
	@Selector("setScatterData:")
	public native void setScatterData(ScatterChartData value);

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