package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.BubbleChartData;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("BubbleChartDataProvider")
@ObjCProtocolName("_TtP6Charts23BubbleChartDataProvider_")
public interface BubbleChartDataProvider extends
		BarLineScatterCandleBubbleChartDataProvider {
	@Generated
	@Selector("bubbleData")
	BubbleChartData bubbleData();
}