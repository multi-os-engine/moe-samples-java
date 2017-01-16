package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IChartAxisValueFormatter;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartAxisBase extends ChartComponentBase {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartAxisBase(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addLimitLine:")
	public native void addLimitLine(ChartLimitLine line);

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartAxisBase alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("axisLineColor")
	public native UIColor axisLineColor();

	@Generated
	@Selector("axisLineDashLengths")
	public native NSArray<? extends NSNumber> axisLineDashLengths();

	@Generated
	@Selector("axisLineDashPhase")
	@NFloat
	public native double axisLineDashPhase();

	@Generated
	@Selector("axisLineWidth")
	@NFloat
	public native double axisLineWidth();

	@Generated
	@Selector("axisMaxValue")
	public native double axisMaxValue();

	@Generated
	@Selector("axisMaximum")
	public native double axisMaximum();

	@Generated
	@Selector("axisMinValue")
	public native double axisMinValue();

	@Generated
	@Selector("axisMinimum")
	public native double axisMinimum();

	@Generated
	@Selector("axisRange")
	public native double axisRange();

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
	@Selector("centerAxisLabelsEnabled")
	public native boolean centerAxisLabelsEnabled();

	@Generated
	@Selector("centeredEntries")
	public native NSArray<? extends NSNumber> centeredEntries();

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
	@Selector("decimals")
	@NInt
	public native long decimals();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("drawAxisLineEnabled")
	public native boolean drawAxisLineEnabled();

	@Generated
	@Selector("drawGridLinesEnabled")
	public native boolean drawGridLinesEnabled();

	@Generated
	@Selector("drawLabelsEnabled")
	public native boolean drawLabelsEnabled();

	@Generated
	@Selector("drawLimitLinesBehindDataEnabled")
	public native boolean drawLimitLinesBehindDataEnabled();

	@Generated
	@Selector("entries")
	public native NSArray<? extends NSNumber> entries();

	@Generated
	@Selector("entryCount")
	@NInt
	public native long entryCount();

	@Generated
	@Selector("forceLabelsEnabled")
	public native boolean forceLabelsEnabled();

	@Generated
	@Selector("getFormattedLabel:")
	public native String getFormattedLabel(@NInt long index);

	@Generated
	@Selector("getLongestLabel")
	public native String getLongestLabel();

	@Generated
	@Selector("granularity")
	public native double granularity();

	@Generated
	@Selector("granularityEnabled")
	public native boolean granularityEnabled();

	@Generated
	@Selector("gridAntialiasEnabled")
	public native boolean gridAntialiasEnabled();

	@Generated
	@Selector("gridColor")
	public native UIColor gridColor();

	@Generated
	@Selector("gridLineCap")
	public native int gridLineCap();

	@Generated
	@Selector("gridLineDashLengths")
	public native NSArray<? extends NSNumber> gridLineDashLengths();

	@Generated
	@Selector("gridLineDashPhase")
	@NFloat
	public native double gridLineDashPhase();

	@Generated
	@Selector("gridLineWidth")
	@NFloat
	public native double gridLineWidth();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartAxisBase init();

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
	@Selector("isAxisMaxCustom")
	public native boolean isAxisMaxCustom();

	@Generated
	@Selector("isAxisMinCustom")
	public native boolean isAxisMinCustom();

	@Generated
	@Selector("isCenterAxisLabelsEnabled")
	public native boolean isCenterAxisLabelsEnabled();

	@Generated
	@Selector("isDrawAxisLineEnabled")
	public native boolean isDrawAxisLineEnabled();

	@Generated
	@Selector("isDrawGridLinesEnabled")
	public native boolean isDrawGridLinesEnabled();

	@Generated
	@Selector("isDrawLabelsEnabled")
	public native boolean isDrawLabelsEnabled();

	@Generated
	@Selector("isDrawLimitLinesBehindDataEnabled")
	public native boolean isDrawLimitLinesBehindDataEnabled();

	@Generated
	@Selector("isForceLabelsEnabled")
	public native boolean isForceLabelsEnabled();

	@Generated
	@Selector("isGranularityEnabled")
	public native boolean isGranularityEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("labelCount")
	@NInt
	public native long labelCount();

	@Generated
	@Selector("labelFont")
	public native UIFont labelFont();

	@Generated
	@Selector("labelTextColor")
	public native UIColor labelTextColor();

	@Generated
	@Selector("limitLines")
	public native NSArray<? extends ChartLimitLine> limitLines();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("removeAllLimitLines")
	public native void removeAllLimitLines();

	@Generated
	@Selector("removeLimitLine:")
	public native void removeLimitLine(ChartLimitLine line);

	@Generated
	@Selector("resetCustomAxisMax")
	public native void resetCustomAxisMax();

	@Generated
	@Selector("resetCustomAxisMin")
	public native void resetCustomAxisMin();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAxisLineColor:")
	public native void setAxisLineColor(UIColor value);

	@Generated
	@Selector("setAxisLineDashLengths:")
	public native void setAxisLineDashLengths(NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setAxisLineDashPhase:")
	public native void setAxisLineDashPhase(@NFloat double value);

	@Generated
	@Selector("setAxisLineWidth:")
	public native void setAxisLineWidth(@NFloat double value);

	@Generated
	@Selector("setAxisMaxValue:")
	public native void setAxisMaxValue(double value);

	@Generated
	@Selector("setAxisMaximum:")
	public native void setAxisMaximum(double value);

	@Generated
	@Selector("setAxisMinValue:")
	public native void setAxisMinValue(double value);

	@Generated
	@Selector("setAxisMinimum:")
	public native void setAxisMinimum(double value);

	@Generated
	@Selector("setAxisRange:")
	public native void setAxisRange(double value);

	@Generated
	@Selector("setCenterAxisLabelsEnabled:")
	public native void setCenterAxisLabelsEnabled(boolean value);

	@Generated
	@Selector("setCenteredEntries:")
	public native void setCenteredEntries(NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setDecimals:")
	public native void setDecimals(@NInt long value);

	@Generated
	@Selector("setDrawAxisLineEnabled:")
	public native void setDrawAxisLineEnabled(boolean value);

	@Generated
	@Selector("setDrawGridLinesEnabled:")
	public native void setDrawGridLinesEnabled(boolean value);

	@Generated
	@Selector("setDrawLabelsEnabled:")
	public native void setDrawLabelsEnabled(boolean value);

	@Generated
	@Selector("setDrawLimitLinesBehindDataEnabled:")
	public native void setDrawLimitLinesBehindDataEnabled(boolean value);

	@Generated
	@Selector("setEntries:")
	public native void setEntries(NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setForceLabelsEnabled:")
	public native void setForceLabelsEnabled(boolean value);

	@Generated
	@Selector("setGranularity:")
	public native void setGranularity(double value);

	@Generated
	@Selector("setGranularityEnabled:")
	public native void setGranularityEnabled(boolean value);

	@Generated
	@Selector("setGridAntialiasEnabled:")
	public native void setGridAntialiasEnabled(boolean value);

	@Generated
	@Selector("setGridColor:")
	public native void setGridColor(UIColor value);

	@Generated
	@Selector("setGridLineCap:")
	public native void setGridLineCap(int value);

	@Generated
	@Selector("setGridLineDashLengths:")
	public native void setGridLineDashLengths(NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setGridLineDashPhase:")
	public native void setGridLineDashPhase(@NFloat double value);

	@Generated
	@Selector("setGridLineWidth:")
	public native void setGridLineWidth(@NFloat double value);

	@Generated
	@Selector("setLabelCount:")
	public native void setLabelCount(@NInt long value);

	@Generated
	@Selector("setLabelCount:force:")
	public native void setLabelCountForce(@NInt long count, boolean force);

	@Generated
	@Selector("setLabelFont:")
	public native void setLabelFont(UIFont value);

	@Generated
	@Selector("setLabelTextColor:")
	public native void setLabelTextColor(UIColor value);

	@Generated
	@Selector("setSpaceMax:")
	public native void setSpaceMax(double value);

	@Generated
	@Selector("setSpaceMin:")
	public native void setSpaceMin(double value);

	@Generated
	@Selector("setValueFormatter:")
	public native void setValueFormatter(
			@Mapped(ObjCObjectMapper.class) IChartAxisValueFormatter value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("spaceMax")
	public native double spaceMax();

	@Generated
	@Selector("spaceMin")
	public native double spaceMin();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("valueFormatter")
	@MappedReturn(ObjCObjectMapper.class)
	public native IChartAxisValueFormatter valueFormatter();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}