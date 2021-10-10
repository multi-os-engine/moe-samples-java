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
public interface ILineScatterCandleRadarChartDataSet extends IBarLineScatterCandleBubbleChartDataSet {
    /**
     * Enables / disables the horizontal highlight-indicator. If disabled, the indicator is not drawn.
     */
    @Generated
    @Selector("drawHorizontalHighlightIndicatorEnabled")
    boolean drawHorizontalHighlightIndicatorEnabled();

    /**
     * Enables / disables the vertical highlight-indicator. If disabled, the indicator is not drawn.
     */
    @Generated
    @Selector("drawVerticalHighlightIndicatorEnabled")
    boolean drawVerticalHighlightIndicatorEnabled();

    /**
     * <code>true</code> if horizontal highlight indicator lines are enabled (drawn)
     */
    @Generated
    @Selector("isHorizontalHighlightIndicatorEnabled")
    boolean isHorizontalHighlightIndicatorEnabled();

    /**
     * <code>true</code> if vertical highlight indicator lines are enabled (drawn)
     */
    @Generated
    @Selector("isVerticalHighlightIndicatorEnabled")
    boolean isVerticalHighlightIndicatorEnabled();

    /**
     * Enables / disables both vertical and horizontal highlight-indicators.
     * :param: enabled
     */
    @Generated
    @Selector("setDrawHighlightIndicators:")
    void setDrawHighlightIndicators(boolean enabled);

    /**
     * Enables / disables the horizontal highlight-indicator. If disabled, the indicator is not drawn.
     */
    @Generated
    @Selector("setDrawHorizontalHighlightIndicatorEnabled:")
    void setDrawHorizontalHighlightIndicatorEnabled(boolean value);

    /**
     * Enables / disables the vertical highlight-indicator. If disabled, the indicator is not drawn.
     */
    @Generated
    @Selector("setDrawVerticalHighlightIndicatorEnabled:")
    void setDrawVerticalHighlightIndicatorEnabled(boolean value);
}