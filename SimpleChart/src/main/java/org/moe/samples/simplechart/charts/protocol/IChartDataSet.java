package org.moe.samples.simplechart.charts.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.ChartDataEntry;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IChartDataSet")
@ObjCProtocolName("_TtP6Charts13IChartDataSet_")
public interface IChartDataSet {
	@Generated
	@Selector("addColor:")
	void addColor(UIColor color);

	@Generated
	@Selector("addEntry:")
	boolean addEntry(ChartDataEntry e);

	@Generated
	@Selector("addEntryOrdered:")
	boolean addEntryOrdered(ChartDataEntry e);

	@Generated
	@Selector("axisDependency")
	@NInt
	long axisDependency();

	@Generated
	@Selector("calcMinMax")
	void calcMinMax();

	@Generated
	@Selector("calcMinMaxYFromX:toX:")
	void calcMinMaxYFromXToX(double fromX, double toX);

	@Generated
	@Selector("clear")
	void clear();

	@Generated
	@Selector("colorAtIndex:")
	UIColor colorAtIndex(@NInt long atIndex);

	@Generated
	@Selector("colors")
	NSArray<? extends UIColor> colors();

	@Generated
	@Selector("contains:")
	boolean contains(ChartDataEntry e);

	@Generated
	@Selector("drawValuesEnabled")
	boolean drawValuesEnabled();

	@Generated
	@Selector("entriesForXValue:")
	NSArray<? extends ChartDataEntry> entriesForXValue(double xValue);

	@Generated
	@Selector("entryCount")
	@NInt
	long entryCount();

	@Generated
	@Selector("entryForIndex:")
	ChartDataEntry entryForIndex(@NInt long i);

	@Generated
	@Selector("entryForXValue:closestToY:")
	ChartDataEntry entryForXValueClosestToY(double xValue, double yValue);

	@Generated
	@Selector("entryForXValue:closestToY:rounding:")
	ChartDataEntry entryForXValueClosestToYRounding(double xValue,
			double yValue, @NInt long rounding);

	@Generated
	@Selector("entryIndexWithEntry:")
	@NInt
	long entryIndexWithEntry(ChartDataEntry e);

	@Generated
	@Selector("entryIndexWithX:closestToY:rounding:")
	@NInt
	long entryIndexWithXClosestToYRounding(double xValue, double yValue,
			@NInt long rounding);

	@Generated
	@Selector("form")
	@NInt
	long form();

	@Generated
	@Selector("formLineDashLengths")
	NSArray<? extends NSNumber> formLineDashLengths();

	@Generated
	@Selector("formLineDashPhase")
	@NFloat
	double formLineDashPhase();

	@Generated
	@Selector("formLineWidth")
	@NFloat
	double formLineWidth();

	@Generated
	@Selector("formSize")
	@NFloat
	double formSize();

	@Generated
	@Selector("highlightEnabled")
	boolean highlightEnabled();

	@Generated
	@Selector("isDrawValuesEnabled")
	boolean isDrawValuesEnabled();

	@Generated
	@Selector("isHighlightEnabled")
	boolean isHighlightEnabled();

	@Generated
	@Selector("isVisible")
	boolean isVisible();

	@Generated
	@Selector("label")
	String label();

	@Generated
	@Selector("needsFormatter")
	boolean needsFormatter();

	@Generated
	@Selector("notifyDataSetChanged")
	void notifyDataSetChanged();

	@Generated
	@Selector("removeEntry:")
	boolean removeEntry(ChartDataEntry entry);

	@Generated
	@Selector("removeEntryWithIndex:")
	boolean removeEntryWithIndex(@NInt long index);

	@Generated
	@Selector("removeEntryWithX:")
	boolean removeEntryWithX(double x);

	@Generated
	@Selector("removeFirst")
	boolean removeFirst();

	@Generated
	@Selector("removeLast")
	boolean removeLast();

	@Generated
	@Selector("resetColors")
	void resetColors();

	@Generated
	@Selector("setColor:")
	void setColor(UIColor color);

	@Generated
	@Selector("setDrawValuesEnabled:")
	void setDrawValuesEnabled(boolean value);

	@Generated
	@Selector("setHighlightEnabled:")
	void setHighlightEnabled(boolean value);

	@Generated
	@Selector("setValueFont:")
	void setValueFont(UIFont value);

	@Generated
	@Selector("setValueFormatter:")
	void setValueFormatter(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setValueTextColor:")
	void setValueTextColor(UIColor value);

	@Generated
	@Selector("setVisible:")
	void setVisible(boolean value);

	@Generated
	@Selector("valueColors")
	NSArray<? extends UIColor> valueColors();

	@Generated
	@Selector("valueFont")
	UIFont valueFont();

	@Generated
	@Selector("valueFormatter")
	@MappedReturn(ObjCObjectMapper.class)
	Object valueFormatter();

	@Generated
	@Selector("valueTextColor")
	UIColor valueTextColor();

	@Generated
	@Selector("valueTextColorAt:")
	UIColor valueTextColorAt(@NInt long index);

	@Generated
	@Selector("visible")
	boolean visible();

	@Generated
	@Selector("xMax")
	double xMax();

	@Generated
	@Selector("xMin")
	double xMin();

	@Generated
	@Selector("yMax")
	double yMax();

	@Generated
	@Selector("yMin")
	double yMin();
}