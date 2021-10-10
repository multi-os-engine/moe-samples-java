package org.moe.samples.simplechart.charts.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.uikit.UIColor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ILineChartDataSet")
@ObjCProtocolName("_TtP6Charts17ILineChartDataSet_")
public interface ILineChartDataSet extends ILineRadarChartDataSet {
    @Generated
    @Selector("circleColors")
    NSArray<? extends UIColor> circleColors();

    /**
     * The color of the inner circle (the circle-hole).
     */
    @Generated
    @Selector("circleHoleColor")
    UIColor circleHoleColor();

    /**
     * The hole radius of the drawn circles.
     */
    @Generated
    @Selector("circleHoleRadius")
    @NFloat
    double circleHoleRadius();

    /**
     * The radius of the drawn circles.
     */
    @Generated
    @Selector("circleRadius")
    @NFloat
    double circleRadius();

    /**
     * Intensity for cubic lines (min = 0.05, max = 1)
     * <em>default</em>: 0.2
     */
    @Generated
    @Selector("cubicIntensity")
    @NFloat
    double cubicIntensity();

    /**
     * <code>true</code> if drawing circles for this DataSet is enabled, <code>false</code> ifnot
     */
    @Generated
    @Selector("drawCircleHoleEnabled")
    boolean drawCircleHoleEnabled();

    /**
     * If true, drawing circles is enabled
     */
    @Generated
    @Selector("drawCirclesEnabled")
    boolean drawCirclesEnabled();

    /**
     * Sets a custom IFillFormatter to the chart that handles the position of the filled-line for each DataSet. Set this to null to use the default logic.
     */
    @Generated
    @Selector("fillFormatter")
    @MappedReturn(ObjCObjectMapper.class)
    IChartFillFormatter fillFormatter();

    /**
     * returns:
     * The color at the given index of the DataSet’s circle-color array.
     * Performs a IndexOutOfBounds check by modulus.
     */
    @Generated
    @Selector("getCircleColorAtIndex:")
    UIColor getCircleColorAtIndex(@NInt long atIndex);

    /**
     * <code>true</code> if drawing the circle-holes is enabled, <code>false</code> ifnot.
     */
    @Generated
    @Selector("isDrawCircleHoleEnabled")
    boolean isDrawCircleHoleEnabled();

    /**
     * <code>true</code> if drawing circles for this DataSet is enabled, <code>false</code> ifnot
     */
    @Generated
    @Selector("isDrawCirclesEnabled")
    boolean isDrawCirclesEnabled();

    /**
     * Line cap type, default is CGLineCap.Butt
     */
    @Generated
    @Selector("lineCapType")
    int lineCapType();

    /**
     * This is the actual dash pattern.
     * I.e. [2, 3] will paint [–   –   ]
     * [1, 3, 4, 2] will paint [-   ––  -   ––  ]
     */
    @Generated
    @Selector("lineDashLengths")
    NSArray<? extends NSNumber> lineDashLengths();

    /**
     * This is how much (in pixels) into the dash pattern are we starting from.
     */
    @Generated
    @Selector("lineDashPhase")
    @NFloat
    double lineDashPhase();

    /**
     * The drawing mode for this line dataset
     * <em>default</em>: Linear
     */
    @Generated
    @Selector("mode")
    @NInt
    long mode();

    /**
     * Resets the circle-colors array and creates a new one
     */
    @Generated
    @Selector("resetCircleColors:")
    void resetCircleColors(@NInt long index);

    /**
     * Sets the one and ONLY color that should be used for this DataSet.
     * Internally, this recreates the colors array and adds the specified color.
     */
    @Generated
    @Selector("setCircleColor:")
    void setCircleColor(UIColor color);

    @Generated
    @Selector("setCircleColors:")
    void setCircleColors(NSArray<? extends UIColor> value);

    /**
     * The color of the inner circle (the circle-hole).
     */
    @Generated
    @Selector("setCircleHoleColor:")
    void setCircleHoleColor(UIColor value);

    /**
     * The hole radius of the drawn circles.
     */
    @Generated
    @Selector("setCircleHoleRadius:")
    void setCircleHoleRadius(@NFloat double value);

    /**
     * The radius of the drawn circles.
     */
    @Generated
    @Selector("setCircleRadius:")
    void setCircleRadius(@NFloat double value);

    /**
     * Intensity for cubic lines (min = 0.05, max = 1)
     * <em>default</em>: 0.2
     */
    @Generated
    @Selector("setCubicIntensity:")
    void setCubicIntensity(@NFloat double value);

    /**
     * <code>true</code> if drawing circles for this DataSet is enabled, <code>false</code> ifnot
     */
    @Generated
    @Selector("setDrawCircleHoleEnabled:")
    void setDrawCircleHoleEnabled(boolean value);

    /**
     * If true, drawing circles is enabled
     */
    @Generated
    @Selector("setDrawCirclesEnabled:")
    void setDrawCirclesEnabled(boolean value);

    /**
     * Sets a custom IFillFormatter to the chart that handles the position of the filled-line for each DataSet. Set this to null to use the default logic.
     */
    @Generated
    @Selector("setFillFormatter:")
    void setFillFormatter(@Mapped(ObjCObjectMapper.class) IChartFillFormatter value);

    /**
     * Line cap type, default is CGLineCap.Butt
     */
    @Generated
    @Selector("setLineCapType:")
    void setLineCapType(int value);

    /**
     * This is the actual dash pattern.
     * I.e. [2, 3] will paint [–   –   ]
     * [1, 3, 4, 2] will paint [-   ––  -   ––  ]
     */
    @Generated
    @Selector("setLineDashLengths:")
    void setLineDashLengths(NSArray<? extends NSNumber> value);

    /**
     * The drawing mode for this line dataset
     * <em>default</em>: Linear
     */
    @Generated
    @Selector("setMode:")
    void setMode(@NInt long value);
}