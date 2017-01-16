package org.moe.samples.simplechart.charts.protocol;


import apple.foundation.NSArray;
import apple.uikit.UIColor;
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
@ObjCProtocolSourceName("IBarChartDataSet")
@ObjCProtocolName("_TtP6Charts16IBarChartDataSet_")
public interface IBarChartDataSet extends
		IBarLineScatterCandleBubbleChartDataSet {
	@Generated
	@Selector("barBorderColor")
	UIColor barBorderColor();

	@Generated
	@Selector("barBorderWidth")
	@NFloat
	double barBorderWidth();

	@Generated
	@Selector("barShadowColor")
	UIColor barShadowColor();

	@Generated
	@Selector("highlightAlpha")
	@NFloat
	double highlightAlpha();

	@Generated
	@Selector("isStacked")
	boolean isStacked();

	@Generated
	@Selector("setBarBorderColor:")
	void setBarBorderColor(UIColor value);

	@Generated
	@Selector("setBarBorderWidth:")
	void setBarBorderWidth(@NFloat double value);

	@Generated
	@Selector("setBarShadowColor:")
	void setBarShadowColor(UIColor value);

	@Generated
	@Selector("setHighlightAlpha:")
	void setHighlightAlpha(@NFloat double value);

	@Generated
	@Selector("setStackLabels:")
	void setStackLabels(NSArray<String> value);

	@Generated
	@Selector("stackLabels")
	NSArray<String> stackLabels();

	@Generated
	@Selector("stackSize")
	@NInt
	long stackSize();
}