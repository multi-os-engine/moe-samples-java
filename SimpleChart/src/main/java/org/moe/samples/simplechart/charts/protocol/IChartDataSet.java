package org.moe.samples.simplechart.charts.protocol;


import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.samples.simplechart.charts.ChartDataEntry;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IChartDataSet")
@ObjCProtocolName("_TtP6Charts13IChartDataSet_")
public interface IChartDataSet {
    @Generated
    @Selector("addColor:")
    void addColor(UIColor color);

    /**
     * Adds an Entry to the DataSet dynamically.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * Entries are added to the end of the list.
     * \param e the entry to add
     * 
     * 
     * returns:
     * <code>true</code> if the entry was added successfully, <code>false</code> ifthis feature is not supported
     */
    @Generated
    @Selector("addEntry:")
    boolean addEntry(ChartDataEntry e);

    /**
     * Adds an Entry to the DataSet dynamically.
     * Entries are added to their appropriate index in the values array respective to their x-position.
     * This will also recalculate the current minimum and maximum values of the DataSet and the value-sum.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * Entries are added to the end of the list.
     * \param e the entry to add
     * 
     * 
     * returns:
     * <code>true</code> if the entry was added successfully, <code>false</code> ifthis feature is not supported
     */
    @Generated
    @Selector("addEntryOrdered:")
    boolean addEntryOrdered(ChartDataEntry e);

    /**
     * The axis this DataSet should be plotted against.
     */
    @Generated
    @Selector("axisDependency")
    @NInt
    long axisDependency();

    /**
     * Calculates the minimum and maximum x and y values (_xMin, _xMax, _yMin, _yMax).
     */
    @Generated
    @Selector("calcMinMax")
    void calcMinMax();

    /**
     * Calculates the min and max y-values from the Entry closest to the given fromX to the Entry closest to the given toX value.
     * This is only needed for the autoScaleMinMax feature.
     */
    @Generated
    @Selector("calcMinMaxYFromX:toX:")
    void calcMinMaxYFromXToX(double fromX, double toX);

    /**
     * Removes all values from this DataSet and does all necessary recalculations.
     * <em>optional feature, could throw if not implemented</em>
     */
    @Generated
    @Selector("clear")
    void clear();

    /**
     * returns:
     * The color at the given index of the DataSet’s color array.
     * This prevents out-of-bounds by performing a modulus on the color index, so colours will repeat themselves.
     */
    @Generated
    @Selector("colorAtIndex:")
    UIColor colorAtIndex(@NInt long atIndex);

    /**
     * All the colors that are used for this DataSet.
     * Colors are reused as soon as the number of Entries the DataSet represents is higher than the size of the colors array.
     */
    @Generated
    @Selector("colors")
    NSArray<? extends UIColor> colors();

    /**
     * Checks if this DataSet contains the specified Entry.
     * 
     * returns:
     * <code>true</code> if contains the entry, <code>false</code> ifnot.
     */
    @Generated
    @Selector("contains:")
    boolean contains(ChartDataEntry e);

    /**
     * Set this to true to draw y-icons on the chart
     * note:
     * For bar and line charts: if <code>maxVisibleCount</code> is reached, no icons will be drawn even if this is enabled.
     */
    @Generated
    @Selector("drawIconsEnabled")
    boolean drawIconsEnabled();

    /**
     * Set this to true to draw y-values on the chart.
     * note:
     * For bar and line charts: if <code>maxVisibleCount</code> is reached, no values will be drawn even if this is enabled.
     */
    @Generated
    @Selector("drawValuesEnabled")
    boolean drawValuesEnabled();

    /**
     * returns:
     * All Entry objects found at the given x-value with binary search.
     * An empty array if no Entry object at that x-value.
     */
    @Generated
    @Selector("entriesForXValue:")
    NSArray<? extends ChartDataEntry> entriesForXValue(double xValue);

    /**
     * The number of y-values this DataSet represents
     */
    @Generated
    @Selector("entryCount")
    @NInt
    long entryCount();

    /**
     * throws:
     * out of bounds
     * if <code>i</code> is out of bounds, it may throw an out-of-bounds exception
     * 
     * returns:
     * The entry object found at the given index (not x-value!)
     */
    @Generated
    @Selector("entryForIndex:")
    ChartDataEntry entryForIndex(@NInt long i);

    /**
     * \param xValue the x-value
     * 
     * \param closestToY If there are multiple y-values for the specified x-value,
     * 
     * 
     * returns:
     * The first Entry object found at the given x-value with binary search.
     * If the no Entry at the specified x-value is found, this method returns the Entry at the closest x-value.
     * nil if no Entry object at that x-value.
     */
    @Generated
    @Selector("entryForXValue:closestToY:")
    ChartDataEntry entryForXValueClosestToY(double xValue, double yValue);

    /**
     * \param xValue the x-value
     * 
     * \param closestToY If there are multiple y-values for the specified x-value,
     * 
     * \param rounding determine whether to round up/down/closest if there is no Entry matching the provided x-value
     * 
     * 
     * returns:
     * The first Entry object found at the given x-value with binary search.
     * If the no Entry at the specified x-value is found, this method returns the Entry at the closest x-value according to the rounding.
     * nil if no Entry object at that x-value.
     */
    @Generated
    @Selector("entryForXValue:closestToY:rounding:")
    ChartDataEntry entryForXValueClosestToYRounding(double xValue, double yValue, @NInt long rounding);

    /**
     * \param e the entry to search for
     * 
     * 
     * returns:
     * The array-index of the specified entry
     */
    @Generated
    @Selector("entryIndexWithEntry:")
    @NInt
    long entryIndexWithEntry(ChartDataEntry e);

    /**
     * \param xValue x-value of the entry to search for
     * 
     * \param closestToY If there are multiple y-values for the specified x-value,
     * 
     * \param rounding Rounding method if exact value was not found
     * 
     * 
     * returns:
     * The array-index of the specified entry.
     * If the no Entry at the specified x-value is found, this method returns the index of the Entry at the closest x-value according to the rounding.
     */
    @Generated
    @Selector("entryIndexWithX:closestToY:rounding:")
    @NInt
    long entryIndexWithXClosestToYRounding(double xValue, double yValue, @NInt long rounding);

    /**
     * The form to draw for this dataset in the legend.
     * Return <code>.Default</code> to use the default legend form.
     */
    @Generated
    @Selector("form")
    @NInt
    long form();

    /**
     * Line dash configuration for legend shapes that consist of lines.
     * This is the actual dash pattern.
     * I.e. [2, 3] will paint [–   –   ]
     * [1, 3, 4, 2] will paint [-   ––  -   ––  ]
     */
    @Generated
    @Selector("formLineDashLengths")
    NSArray<? extends NSNumber> formLineDashLengths();

    /**
     * Line dash configuration for legend shapes that consist of lines.
     * This is how much (in pixels) into the dash pattern are we starting from.
     */
    @Generated
    @Selector("formLineDashPhase")
    @NFloat
    double formLineDashPhase();

    /**
     * The line width for drawing the form of this dataset in the legend
     * Return <code>NaN</code> to use the default legend form line width.
     */
    @Generated
    @Selector("formLineWidth")
    @NFloat
    double formLineWidth();

    /**
     * The form size to draw for this dataset in the legend.
     * Return <code>NaN</code> to use the default legend form size.
     */
    @Generated
    @Selector("formSize")
    @NFloat
    double formSize();

    /**
     * if true, value highlighting is enabled
     */
    @Generated
    @Selector("highlightEnabled")
    boolean highlightEnabled();

    /**
     * Offset of icons drawn on the chart.
     * For all charts except Pie and Radar it will be ordinary (x offset, y offset).
     * For Pie and Radar chart it will be (y offset, distance from center offset); so if you want icon to be rendered under value, you should increase X component of CGPoint, and if you want icon to be rendered closet to center, you should decrease height component of CGPoint.
     */
    @Generated
    @Selector("iconsOffset")
    @ByValue
    CGPoint iconsOffset();

    /**
     * Returns true if y-icon drawing is enabled, false if not
     */
    @Generated
    @Selector("isDrawIconsEnabled")
    boolean isDrawIconsEnabled();

    /**
     * <code>true</code> if y-value drawing is enabled, <code>false</code> ifnot
     */
    @Generated
    @Selector("isDrawValuesEnabled")
    boolean isDrawValuesEnabled();

    /**
     * <code>true</code> if value highlighting is enabled for this dataset
     */
    @Generated
    @Selector("isHighlightEnabled")
    boolean isHighlightEnabled();

    /**
     * <code>true</code> if this DataSet is visible inside the chart, or <code>false</code> ifit is currently hidden.
     */
    @Generated
    @Selector("isVisible")
    boolean isVisible();

    /**
     * The label string that describes the DataSet.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * <code>true</code> if the valueFormatter object of this DataSet is null.
     */
    @Generated
    @Selector("needsFormatter")
    boolean needsFormatter();

    /**
     * Use this method to tell the data set that the underlying data has changed
     */
    @Generated
    @Selector("notifyDataSetChanged")
    void notifyDataSetChanged();

    /**
     * Removes an Entry from the DataSet dynamically.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * \param entry the entry to remove
     * 
     * 
     * returns:
     * <code>true</code> if the entry was removed successfully, <code>false</code> ifthe entry does not exist or if this feature is not supported
     */
    @Generated
    @Selector("removeEntry:")
    boolean removeEntry(ChartDataEntry entry);

    /**
     * Removes the Entry object at the given index in the values array from the DataSet.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * \param index the index of the entry to remove
     * 
     * 
     * returns:
     * <code>true</code> if the entry was removed successfully, <code>false</code> ifthe entry does not exist or if this feature is not supported
     */
    @Generated
    @Selector("removeEntryWithIndex:")
    boolean removeEntryWithIndex(@NInt long index);

    /**
     * Removes the Entry object closest to the given x-value from the DataSet.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * \param x the x-value to remove
     * 
     * 
     * returns:
     * <code>true</code> if the entry was removed successfully, <code>false</code> ifthe entry does not exist or if this feature is not supported
     */
    @Generated
    @Selector("removeEntryWithX:")
    boolean removeEntryWithX(double x);

    /**
     * Removes the first Entry (at index 0) of this DataSet from the entries array.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * 
     * returns:
     * <code>true</code> if the entry was removed successfully, <code>false</code> ifthe entry does not exist or if this feature is not supported
     */
    @Generated
    @Selector("removeFirst")
    boolean removeFirst();

    /**
     * Removes the last Entry (at index 0) of this DataSet from the entries array.
     * <em>optional feature, can return <code>false</code> ifnot implemented</em>
     * 
     * returns:
     * <code>true</code> if the entry was removed successfully, <code>false</code> ifthe entry does not exist or if this feature is not supported
     */
    @Generated
    @Selector("removeLast")
    boolean removeLast();

    @Generated
    @Selector("resetColors")
    void resetColors();

    @Generated
    @Selector("setColor:")
    void setColor(UIColor color);

    /**
     * Set this to true to draw y-icons on the chart
     * note:
     * For bar and line charts: if <code>maxVisibleCount</code> is reached, no icons will be drawn even if this is enabled.
     */
    @Generated
    @Selector("setDrawIconsEnabled:")
    void setDrawIconsEnabled(boolean value);

    /**
     * Set this to true to draw y-values on the chart.
     * note:
     * For bar and line charts: if <code>maxVisibleCount</code> is reached, no values will be drawn even if this is enabled.
     */
    @Generated
    @Selector("setDrawValuesEnabled:")
    void setDrawValuesEnabled(boolean value);

    /**
     * if true, value highlighting is enabled
     */
    @Generated
    @Selector("setHighlightEnabled:")
    void setHighlightEnabled(boolean value);

    /**
     * Offset of icons drawn on the chart.
     * For all charts except Pie and Radar it will be ordinary (x offset, y offset).
     * For Pie and Radar chart it will be (y offset, distance from center offset); so if you want icon to be rendered under value, you should increase X component of CGPoint, and if you want icon to be rendered closet to center, you should decrease height component of CGPoint.
     */
    @Generated
    @Selector("setIconsOffset:")
    void setIconsOffset(@ByValue CGPoint value);

    /**
     * the font for the value-text labels
     */
    @Generated
    @Selector("setValueFont:")
    void setValueFont(UIFont value);

    /**
     * Custom formatter that is used instead of the auto-formatter if set
     */
    @Generated
    @Selector("setValueFormatter:")
    void setValueFormatter(@Mapped(ObjCObjectMapper.class) IChartValueFormatter value);

    /**
     * Sets/get a single color for value text.
     * Setting the color clears the colors array and adds a single color.
     * Getting will return the first color in the array.
     */
    @Generated
    @Selector("setValueTextColor:")
    void setValueTextColor(UIColor value);

    /**
     * Set the visibility of this DataSet. If not visible, the DataSet will not be drawn to the chart upon refreshing it.
     */
    @Generated
    @Selector("setVisible:")
    void setVisible(boolean value);

    /**
     * List representing all colors that are used for drawing the actual values for this DataSet
     */
    @Generated
    @Selector("valueColors")
    NSArray<? extends UIColor> valueColors();

    /**
     * the font for the value-text labels
     */
    @Generated
    @Selector("valueFont")
    UIFont valueFont();

    /**
     * Custom formatter that is used instead of the auto-formatter if set
     */
    @Generated
    @Selector("valueFormatter")
    @MappedReturn(ObjCObjectMapper.class)
    IChartValueFormatter valueFormatter();

    /**
     * Sets/get a single color for value text.
     * Setting the color clears the colors array and adds a single color.
     * Getting will return the first color in the array.
     */
    @Generated
    @Selector("valueTextColor")
    UIColor valueTextColor();

    /**
     * returns:
     * The color at the specified index that is used for drawing the values inside the chart. Uses modulus internally.
     */
    @Generated
    @Selector("valueTextColorAt:")
    UIColor valueTextColorAt(@NInt long index);

    /**
     * Set the visibility of this DataSet. If not visible, the DataSet will not be drawn to the chart upon refreshing it.
     */
    @Generated
    @Selector("visible")
    boolean visible();

    /**
     * The maximum x-value this DataSet holds
     */
    @Generated
    @Selector("xMax")
    double xMax();

    /**
     * The minimum x-value this DataSet holds
     */
    @Generated
    @Selector("xMin")
    double xMin();

    /**
     * The maximum y-value this DataSet holds
     */
    @Generated
    @Selector("yMax")
    double yMax();

    /**
     * The minimum y-value this DataSet holds
     */
    @Generated
    @Selector("yMin")
    double yMin();
}