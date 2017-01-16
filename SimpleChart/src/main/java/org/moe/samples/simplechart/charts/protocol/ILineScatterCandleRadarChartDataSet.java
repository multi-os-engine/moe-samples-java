package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ILineScatterCandleRadarChartDataSet")
@ObjCProtocolName("_TtP6Charts35ILineScatterCandleRadarChartDataSet_")
public interface ILineScatterCandleRadarChartDataSet extends
		IBarLineScatterCandleBubbleChartDataSet {
	@Generated
	@Selector("drawHorizontalHighlightIndicatorEnabled")
	boolean drawHorizontalHighlightIndicatorEnabled();

	@Generated
	@Selector("drawVerticalHighlightIndicatorEnabled")
	boolean drawVerticalHighlightIndicatorEnabled();

	@Generated
	@Selector("isHorizontalHighlightIndicatorEnabled")
	boolean isHorizontalHighlightIndicatorEnabled();

	@Generated
	@Selector("isVerticalHighlightIndicatorEnabled")
	boolean isVerticalHighlightIndicatorEnabled();

	@Generated
	@Selector("setDrawHighlightIndicators:")
	void setDrawHighlightIndicators(boolean enabled);

	@Generated
	@Selector("setDrawHorizontalHighlightIndicatorEnabled:")
	void setDrawHorizontalHighlightIndicatorEnabled(boolean value);

	@Generated
	@Selector("setDrawVerticalHighlightIndicatorEnabled:")
	void setDrawVerticalHighlightIndicatorEnabled(boolean value);
}