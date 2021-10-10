package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartTransformer;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("BarLineScatterCandleBubbleChartDataProvider")
@ObjCProtocolName("_TtP6Charts43BarLineScatterCandleBubbleChartDataProvider_")
public interface BarLineScatterCandleBubbleChartDataProvider extends ChartDataProvider {
    @Generated
    @Selector("getTransformerForAxis:")
    ChartTransformer getTransformerForAxis(@NInt long forAxis);

    @Generated
    @Selector("highestVisibleX")
    double highestVisibleX();

    @Generated
    @Selector("isInvertedWithAxis:")
    boolean isInvertedWithAxis(@NInt long axis);

    @Generated
    @Selector("lowestVisibleX")
    double lowestVisibleX();
}