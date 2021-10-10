package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartYAxis;
import org.moe.samples.simplechart.charts.LineChartData;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("LineChartDataProvider")
@ObjCProtocolName("_TtP6Charts21LineChartDataProvider_")
public interface LineChartDataProvider extends BarLineScatterCandleBubbleChartDataProvider {
    @Generated
    @Selector("getAxis:")
    ChartYAxis getAxis(@NInt long axis);

    @Generated
    @Selector("lineData")
    LineChartData lineData();
}