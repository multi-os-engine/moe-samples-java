package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.BarChartData;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("BarChartDataProvider")
@ObjCProtocolName("_TtP6Charts20BarChartDataProvider_")
public interface BarChartDataProvider extends BarLineScatterCandleBubbleChartDataProvider {
    @Generated
    @Selector("barData")
    BarChartData barData();

    @Generated
    @Selector("isDrawBarShadowEnabled")
    boolean isDrawBarShadowEnabled();

    @Generated
    @Selector("isDrawValueAboveBarEnabled")
    boolean isDrawValueAboveBarEnabled();

    @Generated
    @Selector("isHighlightFullBarEnabled")
    boolean isHighlightFullBarEnabled();
}