package org.moe.samples.simplechart.charts.protocol;


import apple.uikit.UIColor;
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
@ObjCProtocolSourceName("ICandleChartDataSet")
@ObjCProtocolName("_TtP6Charts19ICandleChartDataSet_")
public interface ICandleChartDataSet extends ILineScatterCandleRadarChartDataSet {
    /**
     * the space that is left out on the left and right side of each candle,
     * <em>default</em>: 0.1 (10%), max 0.45, min 0.0
     */
    @Generated
    @Selector("barSpace")
    @NFloat
    double barSpace();

    /**
     * color for open < close
     */
    @Generated
    @Selector("decreasingColor")
    UIColor decreasingColor();

    /**
     * Are decreasing values drawn as filled?
     */
    @Generated
    @Selector("decreasingFilled")
    boolean decreasingFilled();

    /**
     * color for open > close
     */
    @Generated
    @Selector("increasingColor")
    UIColor increasingColor();

    /**
     * Are increasing values drawn as filled?
     */
    @Generated
    @Selector("increasingFilled")
    boolean increasingFilled();

    /**
     * Are decreasing values drawn as filled?
     */
    @Generated
    @Selector("isDecreasingFilled")
    boolean isDecreasingFilled();

    /**
     * Are increasing values drawn as filled?
     */
    @Generated
    @Selector("isIncreasingFilled")
    boolean isIncreasingFilled();

    /**
     * Is the shadow color same as the candle color?
     */
    @Generated
    @Selector("isShadowColorSameAsCandle")
    boolean isShadowColorSameAsCandle();

    /**
     * color for open == close
     */
    @Generated
    @Selector("neutralColor")
    UIColor neutralColor();

    /**
     * the space that is left out on the left and right side of each candle,
     * <em>default</em>: 0.1 (10%), max 0.45, min 0.0
     */
    @Generated
    @Selector("setBarSpace:")
    void setBarSpace(@NFloat double value);

    /**
     * color for open < close
     */
    @Generated
    @Selector("setDecreasingColor:")
    void setDecreasingColor(UIColor value);

    /**
     * Are decreasing values drawn as filled?
     */
    @Generated
    @Selector("setDecreasingFilled:")
    void setDecreasingFilled(boolean value);

    /**
     * color for open > close
     */
    @Generated
    @Selector("setIncreasingColor:")
    void setIncreasingColor(UIColor value);

    /**
     * Are increasing values drawn as filled?
     */
    @Generated
    @Selector("setIncreasingFilled:")
    void setIncreasingFilled(boolean value);

    /**
     * color for open == close
     */
    @Generated
    @Selector("setNeutralColor:")
    void setNeutralColor(UIColor value);

    /**
     * the color of the shadow line
     */
    @Generated
    @Selector("setShadowColor:")
    void setShadowColor(UIColor value);

    /**
     * use candle color for the shadow
     */
    @Generated
    @Selector("setShadowColorSameAsCandle:")
    void setShadowColorSameAsCandle(boolean value);

    /**
     * the width of the candle-shadow-line in pixels.
     * <em>default</em>: 3.0
     */
    @Generated
    @Selector("setShadowWidth:")
    void setShadowWidth(@NFloat double value);

    /**
     * should the candle bars show?
     * when false, only “ticks” will show
     * <em>default</em>: true
     */
    @Generated
    @Selector("setShowCandleBar:")
    void setShowCandleBar(boolean value);

    /**
     * the color of the shadow line
     */
    @Generated
    @Selector("shadowColor")
    UIColor shadowColor();

    /**
     * use candle color for the shadow
     */
    @Generated
    @Selector("shadowColorSameAsCandle")
    boolean shadowColorSameAsCandle();

    /**
     * the width of the candle-shadow-line in pixels.
     * <em>default</em>: 3.0
     */
    @Generated
    @Selector("shadowWidth")
    @NFloat
    double shadowWidth();

    /**
     * should the candle bars show?
     * when false, only “ticks” will show
     * <em>default</em>: true
     */
    @Generated
    @Selector("showCandleBar")
    boolean showCandleBar();
}