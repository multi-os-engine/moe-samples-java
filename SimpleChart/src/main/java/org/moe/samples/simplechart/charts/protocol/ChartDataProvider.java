package org.moe.samples.simplechart.charts.protocol;


import apple.coregraphics.struct.CGPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartData;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ChartDataProvider")
@ObjCProtocolName("_TtP6Charts17ChartDataProvider_")
public interface ChartDataProvider {
    @Generated
    @Selector("centerOffsets")
    @ByValue
    CGPoint centerOffsets();

    /**
     * The maximum x-value of the chart, regardless of zoom or translation.
     */
    @Generated
    @Selector("chartXMax")
    double chartXMax();

    /**
     * The minimum x-value of the chart, regardless of zoom or translation.
     */
    @Generated
    @Selector("chartXMin")
    double chartXMin();

    /**
     * The maximum y-value of the chart, regardless of zoom or translation.
     */
    @Generated
    @Selector("chartYMax")
    double chartYMax();

    /**
     * The minimum y-value of the chart, regardless of zoom or translation.
     */
    @Generated
    @Selector("chartYMin")
    double chartYMin();

    @Generated
    @Selector("data")
    ChartData data();

    @Generated
    @Selector("maxHighlightDistance")
    @NFloat
    double maxHighlightDistance();

    @Generated
    @Selector("maxVisibleCount")
    @NInt
    long maxVisibleCount();

    @Generated
    @Selector("xRange")
    double xRange();
}