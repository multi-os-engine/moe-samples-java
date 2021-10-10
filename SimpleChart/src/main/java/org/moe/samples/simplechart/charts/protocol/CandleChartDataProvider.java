package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.CandleChartData;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("CandleChartDataProvider")
@ObjCProtocolName("_TtP6Charts23CandleChartDataProvider_")
public interface CandleChartDataProvider extends BarLineScatterCandleBubbleChartDataProvider {
    @Generated
    @Selector("candleData")
    CandleChartData candleData();
}