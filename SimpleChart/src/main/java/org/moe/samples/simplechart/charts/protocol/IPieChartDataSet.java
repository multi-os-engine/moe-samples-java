package org.moe.samples.simplechart.charts.protocol;


import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IPieChartDataSet")
@ObjCProtocolName("_TtP6Charts16IPieChartDataSet_")
public interface IPieChartDataSet extends IChartDataSet {
	@Generated
	@Selector("automaticallyDisableSliceSpacing")
	boolean automaticallyDisableSliceSpacing();

	@Generated
	@Selector("entryLabelColor")
	UIColor entryLabelColor();

	@Generated
	@Selector("entryLabelFont")
	UIFont entryLabelFont();

	@Generated
	@Selector("selectionShift")
	@NFloat
	double selectionShift();

	@Generated
	@Selector("setAutomaticallyDisableSliceSpacing:")
	void setAutomaticallyDisableSliceSpacing(boolean value);

	@Generated
	@Selector("setEntryLabelColor:")
	void setEntryLabelColor(UIColor value);

	@Generated
	@Selector("setEntryLabelFont:")
	void setEntryLabelFont(UIFont value);

	@Generated
	@Selector("setSelectionShift:")
	void setSelectionShift(@NFloat double value);

	@Generated
	@Selector("setSliceSpace:")
	void setSliceSpace(@NFloat double value);

	@Generated
	@Selector("setValueLineColor:")
	void setValueLineColor(UIColor value);

	@Generated
	@Selector("setValueLinePart1Length:")
	void setValueLinePart1Length(@NFloat double value);

	@Generated
	@Selector("setValueLinePart1OffsetPercentage:")
	void setValueLinePart1OffsetPercentage(@NFloat double value);

	@Generated
	@Selector("setValueLinePart2Length:")
	void setValueLinePart2Length(@NFloat double value);

	@Generated
	@Selector("setValueLineVariableLength:")
	void setValueLineVariableLength(boolean value);

	@Generated
	@Selector("setValueLineWidth:")
	void setValueLineWidth(@NFloat double value);

	@Generated
	@Selector("setXValuePosition:")
	void setXValuePosition(@NInt long value);

	@Generated
	@Selector("setYValuePosition:")
	void setYValuePosition(@NInt long value);

	@Generated
	@Selector("sliceSpace")
	@NFloat
	double sliceSpace();

	@Generated
	@Selector("valueLineColor")
	UIColor valueLineColor();

	@Generated
	@Selector("valueLinePart1Length")
	@NFloat
	double valueLinePart1Length();

	@Generated
	@Selector("valueLinePart1OffsetPercentage")
	@NFloat
	double valueLinePart1OffsetPercentage();

	@Generated
	@Selector("valueLinePart2Length")
	@NFloat
	double valueLinePart2Length();

	@Generated
	@Selector("valueLineVariableLength")
	boolean valueLineVariableLength();

	@Generated
	@Selector("valueLineWidth")
	@NFloat
	double valueLineWidth();

	@Generated
	@Selector("xValuePosition")
	@NInt
	long xValuePosition();

	@Generated
	@Selector("yValuePosition")
	@NInt
	long yValuePosition();
}