package org.moe.samples.simplechart.charts;


import apple.NSObject;
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
import org.moe.samples.simplechart.charts.protocol.IChartValueFormatter;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts9ChartData")
@ObjCClassBinding
public class ChartData extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addDataSet:")
	public native void addDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

	@Generated
	@Selector("addEntry:dataSetIndex:")
	public native void addEntryDataSetIndex(ChartDataEntry e,
			@NInt long dataSetIndex);

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartData alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("calcMinMax")
	public native void calcMinMax();

	@Generated
	@Selector("calcMinMaxWithDataSet:")
	public native void calcMinMaxWithDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet d);

	@Generated
	@Selector("calcMinMaxWithEntry:axis:")
	public native void calcMinMaxWithEntryAxis(ChartDataEntry e, @NInt long axis);

	@Generated
	@Selector("calcMinMaxYFromX:toX:")
	public native void calcMinMaxYFromXToX(double fromX, double toX);

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
	@Selector("clearValues")
	public native void clearValues();

	@Generated
	@Selector("containsWithDataSet:")
	public native boolean containsWithDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

	@Generated
	@Selector("dataSetCount")
	@NInt
	public native long dataSetCount();

	@Generated
	@Selector("dataSets")
	public native NSArray<?> dataSets();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("entryCount")
	@NInt
	public native long entryCount();

	@Generated
	@Selector("entryForHighlight:")
	public native ChartDataEntry entryForHighlight(ChartHighlight highlight);

	@Generated
	@Selector("getColors")
	public native NSArray<? extends UIColor> getColors();

	@Generated
	@Selector("getDataSetByIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartDataSet getDataSetByIndex(@NInt long index);

	@Generated
	@Selector("getDataSetByLabel:ignorecase:")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartDataSet getDataSetByLabelIgnorecase(String label,
			boolean ignorecase);

	@Generated
	@Selector("getDataSetForEntry:")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartDataSet getDataSetForEntry(ChartDataEntry e);

	@Generated
	@Selector("getFirstLeftWithDataSets:")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartDataSet getFirstLeftWithDataSets(NSArray<?> dataSets);

	@Generated
	@Selector("getFirstRightWithDataSets:")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartDataSet getFirstRightWithDataSets(NSArray<?> dataSets);

	@Generated
	@Selector("getYMaxWithAxis:")
	public native double getYMaxWithAxis(@NInt long axis);

	@Generated
	@Selector("getYMinWithAxis:")
	public native double getYMinWithAxis(@NInt long axis);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("highlightEnabled")
	public native boolean highlightEnabled();

	@Generated
	@Selector("indexOfDataSet:")
	@NInt
	public native long indexOfDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

	@Generated
	@Selector("init")
	public native ChartData init();

	@Generated
	@Selector("initWithDataSet:")
	public native ChartData initWithDataSet(
			@Mapped(ObjCObjectMapper.class) IChartDataSet dataSet);

	@Generated
	@Selector("initWithDataSets:")
	public native ChartData initWithDataSets(NSArray<?> dataSets);

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
	@Selector("isHighlightEnabled")
	public native boolean isHighlightEnabled();

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
	@Selector("maxEntryCountSet")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartDataSet maxEntryCountSet();

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
	@Selector("setDataSets:")
	public native void setDataSets(NSArray<?> value);

	@Generated
	@Selector("setDrawValues:")
	public native void setDrawValues(boolean enabled);

	@Generated
	@Selector("setHighlightEnabled:")
	public native void setHighlightEnabled(boolean value);

	@Generated
	@Selector("setValueFont:")
	public native void setValueFont(UIFont font);

	@Generated
	@Selector("setValueFormatter:")
	public native void setValueFormatter(
			@Mapped(ObjCObjectMapper.class) IChartValueFormatter formatter);

	@Generated
	@Selector("setValueTextColor:")
	public native void setValueTextColor(UIColor color);

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

	@Generated
	@Selector("xMax")
	public native double xMax();

	@Generated
	@Selector("xMin")
	public native double xMin();

	@Generated
	@Selector("yMax")
	public native double yMax();

	@Generated
	@Selector("yMin")
	public native double yMin();
}