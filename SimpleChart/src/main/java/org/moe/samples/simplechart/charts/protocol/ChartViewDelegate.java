package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartAnimator;
import org.moe.samples.simplechart.charts.ChartDataEntry;
import org.moe.samples.simplechart.charts.ChartHighlight;
import org.moe.samples.simplechart.charts.ChartViewBase;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ChartViewDelegate")
@ObjCProtocolName("_TtP6Charts17ChartViewDelegate_")
public interface ChartViewDelegate {
    @Generated
    @IsOptional
    @Selector("chartScaled:scaleX:scaleY:")
    default void chartScaledScaleXScaleY(ChartViewBase chartView, @NFloat double scaleX, @NFloat double scaleY) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("chartTranslated:dX:dY:")
    default void chartTranslatedDXDY(ChartViewBase chartView, @NFloat double dX, @NFloat double dY) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("chartValueNothingSelected:")
    default void chartValueNothingSelected(ChartViewBase chartView) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a value has been selected inside the chart.
     * \param entry The selected Entry.
     * 
     * \param highlight The corresponding highlight object that contains information about the highlighted position such as dataSetIndex etc.
     */
    @Generated
    @IsOptional
    @Selector("chartValueSelected:entry:highlight:")
    default void chartValueSelectedEntryHighlight(ChartViewBase chartView, ChartDataEntry entry,
            ChartHighlight highlight) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("chartView:animatorDidStop:")
    default void chartViewAnimatorDidStop(ChartViewBase chartView, ChartAnimator animator) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when a user stops panning between values on the chart
     */
    @Generated
    @IsOptional
    @Selector("chartViewDidEndPanning:")
    default void chartViewDidEndPanning(ChartViewBase chartView) {
        throw new java.lang.UnsupportedOperationException();
    }
}