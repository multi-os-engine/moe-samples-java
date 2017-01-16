package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IBubbleChartDataSet")
@ObjCProtocolName("_TtP6Charts19IBubbleChartDataSet_")
public interface IBubbleChartDataSet extends
		IBarLineScatterCandleBubbleChartDataSet {
	@Generated
	@Selector("highlightCircleWidth")
	@NFloat
	double highlightCircleWidth();

	@Generated
	@Selector("isNormalizeSizeEnabled")
	boolean isNormalizeSizeEnabled();

	@Generated
	@Selector("maxSize")
	@NFloat
	double maxSize();

	@Generated
	@Selector("setHighlightCircleWidth:")
	void setHighlightCircleWidth(@NFloat double value);
}