package org.moe.samples.simplechart.charts.protocol;


import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IPieChartDataSet")
@ObjCProtocolName("_TtP6Charts16IPieChartDataSet_")
public interface IPieChartDataSet extends IChartDataSet {
    /**
     * When enabled, slice spacing will be 0.0 when the smallest value is going to be smaller than the slice spacing itself.
     */
    @Generated
    @Selector("automaticallyDisableSliceSpacing")
    boolean automaticallyDisableSliceSpacing();

    /**
     * the color for the slice-text labels
     */
    @Generated
    @Selector("entryLabelColor")
    UIColor entryLabelColor();

    /**
     * the font for the slice-text labels
     */
    @Generated
    @Selector("entryLabelFont")
    UIFont entryLabelFont();

    /**
     * get/sets the color for the highlighted sector
     */
    @Generated
    @Selector("highlightColor")
    UIColor highlightColor();

    /**
     * indicates the selection distance of a pie slice
     */
    @Generated
    @Selector("selectionShift")
    @NFloat
    double selectionShift();

    /**
     * When enabled, slice spacing will be 0.0 when the smallest value is going to be smaller than the slice spacing itself.
     */
    @Generated
    @Selector("setAutomaticallyDisableSliceSpacing:")
    void setAutomaticallyDisableSliceSpacing(boolean value);

    /**
     * the color for the slice-text labels
     */
    @Generated
    @Selector("setEntryLabelColor:")
    void setEntryLabelColor(UIColor value);

    /**
     * the font for the slice-text labels
     */
    @Generated
    @Selector("setEntryLabelFont:")
    void setEntryLabelFont(UIFont value);

    /**
     * get/sets the color for the highlighted sector
     */
    @Generated
    @Selector("setHighlightColor:")
    void setHighlightColor(UIColor value);

    /**
     * indicates the selection distance of a pie slice
     */
    @Generated
    @Selector("setSelectionShift:")
    void setSelectionShift(@NFloat double value);

    /**
     * the space in pixels between the pie-slices
     * <em>default</em>: 0
     * <em>maximum</em>: 20
     */
    @Generated
    @Selector("setSliceSpace:")
    void setSliceSpace(@NFloat double value);

    /**
     * When valuePosition is OutsideSlice and enabled, line will have the same color as the slice
     */
    @Generated
    @Selector("setUseValueColorForLine:")
    void setUseValueColorForLine(boolean value);

    /**
     * When valuePosition is OutsideSlice, indicates line color
     */
    @Generated
    @Selector("setValueLineColor:")
    void setValueLineColor(UIColor value);

    /**
     * When valuePosition is OutsideSlice, indicates length of first half of the line
     */
    @Generated
    @Selector("setValueLinePart1Length:")
    void setValueLinePart1Length(@NFloat double value);

    /**
     * When valuePosition is OutsideSlice, indicates offset as percentage out of the slice size
     */
    @Generated
    @Selector("setValueLinePart1OffsetPercentage:")
    void setValueLinePart1OffsetPercentage(@NFloat double value);

    /**
     * When valuePosition is OutsideSlice, indicates length of second half of the line
     */
    @Generated
    @Selector("setValueLinePart2Length:")
    void setValueLinePart2Length(@NFloat double value);

    /**
     * When valuePosition is OutsideSlice, this allows variable line length
     */
    @Generated
    @Selector("setValueLineVariableLength:")
    void setValueLineVariableLength(boolean value);

    /**
     * When valuePosition is OutsideSlice, indicates line width
     */
    @Generated
    @Selector("setValueLineWidth:")
    void setValueLineWidth(@NFloat double value);

    @Generated
    @Selector("setXValuePosition:")
    void setXValuePosition(@NInt long value);

    @Generated
    @Selector("setYValuePosition:")
    void setYValuePosition(@NInt long value);

    /**
     * the space in pixels between the pie-slices
     * <em>default</em>: 0
     * <em>maximum</em>: 20
     */
    @Generated
    @Selector("sliceSpace")
    @NFloat
    double sliceSpace();

    /**
     * When valuePosition is OutsideSlice and enabled, line will have the same color as the slice
     */
    @Generated
    @Selector("useValueColorForLine")
    boolean useValueColorForLine();

    /**
     * When valuePosition is OutsideSlice, indicates line color
     */
    @Generated
    @Selector("valueLineColor")
    UIColor valueLineColor();

    /**
     * When valuePosition is OutsideSlice, indicates length of first half of the line
     */
    @Generated
    @Selector("valueLinePart1Length")
    @NFloat
    double valueLinePart1Length();

    /**
     * When valuePosition is OutsideSlice, indicates offset as percentage out of the slice size
     */
    @Generated
    @Selector("valueLinePart1OffsetPercentage")
    @NFloat
    double valueLinePart1OffsetPercentage();

    /**
     * When valuePosition is OutsideSlice, indicates length of second half of the line
     */
    @Generated
    @Selector("valueLinePart2Length")
    @NFloat
    double valueLinePart2Length();

    /**
     * When valuePosition is OutsideSlice, this allows variable line length
     */
    @Generated
    @Selector("valueLineVariableLength")
    boolean valueLineVariableLength();

    /**
     * When valuePosition is OutsideSlice, indicates line width
     */
    @Generated
    @Selector("valueLineWidth")
    @NFloat
    double valueLineWidth();

    @Generated
    @Selector("xValuePosition")
    @NInt
    long xValuePosition();

    @Generated
    @Selector("yValuePosition")
    @NInt
    long yValuePosition();
}