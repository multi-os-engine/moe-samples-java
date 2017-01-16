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
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IPieChartDataSet;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts15PieChartDataSet")
@ObjCClassBinding
public class PieChartDataSet extends ChartDataSet implements IPieChartDataSet {
	static {
		NatJ.register();
	}

	@Generated
	protected PieChartDataSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addColor:")
	public native void addColor(UIColor color);

	@Generated
	@Selector("addEntry:")
	public native boolean addEntry(ChartDataEntry e);

	@Generated
	@Selector("addEntryOrdered:")
	public native boolean addEntryOrdered(ChartDataEntry e);

	@Generated
	@Owned
	@Selector("alloc")
	public static native PieChartDataSet alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyDisableSliceSpacing")
	public native boolean automaticallyDisableSliceSpacing();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("axisDependency")
	@NInt
	public native long axisDependency();

	@Generated
	@Selector("calcMinMax")
	public native void calcMinMax();

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
	@Selector("clear")
	public native void clear();

	@Generated
	@Selector("colorAtIndex:")
	public native UIColor colorAtIndex(@NInt long atIndex);

	@Generated
	@Selector("colors")
	public native NSArray<? extends UIColor> colors();

	@Generated
	@Selector("contains:")
	public native boolean contains(ChartDataEntry e);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("drawValuesEnabled")
	public native boolean drawValuesEnabled();

	@Generated
	@Selector("entriesForXValue:")
	public native NSArray<? extends ChartDataEntry> entriesForXValue(
			double xValue);

	@Generated
	@Selector("entryCount")
	@NInt
	public native long entryCount();

	@Generated
	@Selector("entryForIndex:")
	public native ChartDataEntry entryForIndex(@NInt long i);

	@Generated
	@Selector("entryForXValue:closestToY:")
	public native ChartDataEntry entryForXValueClosestToY(double xValue,
			double yValue);

	@Generated
	@Selector("entryForXValue:closestToY:rounding:")
	public native ChartDataEntry entryForXValueClosestToYRounding(
			double xValue, double yValue, @NInt long rounding);

	@Generated
	@Selector("entryIndexWithEntry:")
	@NInt
	public native long entryIndexWithEntry(ChartDataEntry e);

	@Generated
	@Selector("entryIndexWithX:closestToY:rounding:")
	@NInt
	public native long entryIndexWithXClosestToYRounding(double xValue,
			double yValue, @NInt long rounding);

	@Generated
	@Selector("entryLabelColor")
	public native UIColor entryLabelColor();

	@Generated
	@Selector("entryLabelFont")
	public native UIFont entryLabelFont();

	@Generated
	@Selector("form")
	@NInt
	public native long form();

	@Generated
	@Selector("formLineDashLengths")
	public native NSArray<? extends NSNumber> formLineDashLengths();

	@Generated
	@Selector("formLineDashPhase")
	@NFloat
	public native double formLineDashPhase();

	@Generated
	@Selector("formLineWidth")
	@NFloat
	public native double formLineWidth();

	@Generated
	@Selector("formSize")
	@NFloat
	public native double formSize();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("highlightEnabled")
	public native boolean highlightEnabled();

	@Generated
	@Selector("init")
	public native PieChartDataSet init();

	@Generated
	@Selector("initWithLabel:")
	public native PieChartDataSet initWithLabel(String label);

	@Generated
	@Selector("initWithValues:")
	public native PieChartDataSet initWithValues(
			NSArray<? extends ChartDataEntry> values);

	@Generated
	@Selector("initWithValues:label:")
	public native PieChartDataSet initWithValuesLabel(
			NSArray<? extends ChartDataEntry> values, String label);

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
	@Selector("isDrawValuesEnabled")
	public native boolean isDrawValuesEnabled();

	@Generated
	@Selector("isHighlightEnabled")
	public native boolean isHighlightEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("isVisible")
	public native boolean isVisible();

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("label")
	public native String label();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("needsFormatter")
	public native boolean needsFormatter();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("notifyDataSetChanged")
	public native void notifyDataSetChanged();

	@Generated
	@Selector("removeEntry:")
	public native boolean removeEntry(ChartDataEntry entry);

	@Generated
	@Selector("removeEntryWithIndex:")
	public native boolean removeEntryWithIndex(@NInt long index);

	@Generated
	@Selector("removeEntryWithX:")
	public native boolean removeEntryWithX(double x);

	@Generated
	@Selector("removeFirst")
	public native boolean removeFirst();

	@Generated
	@Selector("removeLast")
	public native boolean removeLast();

	@Generated
	@Selector("resetColors")
	public native void resetColors();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("selectionShift")
	@NFloat
	public native double selectionShift();

	@Generated
	@Selector("setAutomaticallyDisableSliceSpacing:")
	public native void setAutomaticallyDisableSliceSpacing(boolean value);

	@Generated
	@Selector("setColor:")
	public native void setColor(UIColor color);

	@Generated
	@Selector("setDrawValuesEnabled:")
	public native void setDrawValuesEnabled(boolean value);

	@Generated
	@Selector("setEntryLabelColor:")
	public native void setEntryLabelColor(UIColor value);

	@Generated
	@Selector("setEntryLabelFont:")
	public native void setEntryLabelFont(UIFont value);

	@Generated
	@Selector("setHighlightEnabled:")
	public native void setHighlightEnabled(boolean value);

	@Generated
	@Selector("setSelectionShift:")
	public native void setSelectionShift(@NFloat double value);

	@Generated
	@Selector("setSliceSpace:")
	public native void setSliceSpace(@NFloat double value);

	@Generated
	@Selector("setValueFont:")
	public native void setValueFont(UIFont value);

	@Generated
	@Selector("setValueFormatter:")
	public native void setValueFormatter(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setValueLineColor:")
	public native void setValueLineColor(UIColor value);

	@Generated
	@Selector("setValueLinePart1Length:")
	public native void setValueLinePart1Length(@NFloat double value);

	@Generated
	@Selector("setValueLinePart1OffsetPercentage:")
	public native void setValueLinePart1OffsetPercentage(@NFloat double value);

	@Generated
	@Selector("setValueLinePart2Length:")
	public native void setValueLinePart2Length(@NFloat double value);

	@Generated
	@Selector("setValueLineVariableLength:")
	public native void setValueLineVariableLength(boolean value);

	@Generated
	@Selector("setValueLineWidth:")
	public native void setValueLineWidth(@NFloat double value);

	@Generated
	@Selector("setValueTextColor:")
	public native void setValueTextColor(UIColor value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setVisible:")
	public native void setVisible(boolean value);

	@Generated
	@Selector("setXValuePosition:")
	public native void setXValuePosition(@NInt long value);

	@Generated
	@Selector("setYValuePosition:")
	public native void setYValuePosition(@NInt long value);

	@Generated
	@Selector("sliceSpace")
	@NFloat
	public native double sliceSpace();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("valueColors")
	public native NSArray<? extends UIColor> valueColors();

	@Generated
	@Selector("valueFont")
	public native UIFont valueFont();

	@Generated
	@Selector("valueFormatter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueFormatter();

	@Generated
	@Selector("valueLineColor")
	public native UIColor valueLineColor();

	@Generated
	@Selector("valueLinePart1Length")
	@NFloat
	public native double valueLinePart1Length();

	@Generated
	@Selector("valueLinePart1OffsetPercentage")
	@NFloat
	public native double valueLinePart1OffsetPercentage();

	@Generated
	@Selector("valueLinePart2Length")
	@NFloat
	public native double valueLinePart2Length();

	@Generated
	@Selector("valueLineVariableLength")
	public native boolean valueLineVariableLength();

	@Generated
	@Selector("valueLineWidth")
	@NFloat
	public native double valueLineWidth();

	@Generated
	@Selector("valueTextColor")
	public native UIColor valueTextColor();

	@Generated
	@Selector("valueTextColorAt:")
	public native UIColor valueTextColorAt(@NInt long index);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("visible")
	public native boolean visible();

	@Generated
	@Selector("xMax")
	public native double xMax();

	@Generated
	@Selector("xMin")
	public native double xMin();

	@Generated
	@Selector("xValuePosition")
	@NInt
	public native long xValuePosition();

	@Generated
	@Selector("yMax")
	public native double yMax();

	@Generated
	@Selector("yMin")
	public native double yMin();

	@Generated
	@Selector("yValuePosition")
	@NInt
	public native long yValuePosition();
}