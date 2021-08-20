package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IChartAxisValueFormatter;

/**
 * Base class for all axes
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartAxisBase extends ChartComponentBase {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartAxisBase(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds a new ChartLimitLine to this axis.
     */
    @Generated
    @Selector("addLimitLine:")
    public native void addLimitLine(ChartLimitLine line);

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartAxisBase alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("axisLineColor")
    public native UIColor axisLineColor();

    @Generated
    @Selector("axisLineDashLengths")
    public native NSArray<? extends NSNumber> axisLineDashLengths();

    @Generated
    @Selector("axisLineDashPhase")
    @NFloat
    public native double axisLineDashPhase();

    @Generated
    @Selector("axisLineWidth")
    @NFloat
    public native double axisLineWidth();

    /**
     * The maximum number of labels on the axis
     */
    @Generated
    @Selector("axisMaxLabels")
    @NInt
    public native long axisMaxLabels();

    /**
     * The maximum value for this axis.
     * If set, this value will not be calculated automatically depending on the provided data.
     * Use <code>resetCustomAxisMax()</code> to undo this.
     */
    @Generated
    @Selector("axisMaximum")
    public native double axisMaximum();

    /**
     * The minumum number of labels on the axis
     */
    @Generated
    @Selector("axisMinLabels")
    @NInt
    public native long axisMinLabels();

    /**
     * The minimum value for this axis.
     * If set, this value will not be calculated automatically depending on the provided data.
     * Use <code>resetCustomAxisMin()</code> to undo this.
     */
    @Generated
    @Selector("axisMinimum")
    public native double axisMinimum();

    /**
     * the total range of values this axis covers
     */
    @Generated
    @Selector("axisRange")
    public native double axisRange();

    /**
     * Calculates the minimum, maximum and range values of the YAxis with the given minimum and maximum values from the chart data.
     * \param dataMin the y-min value according to chart data
     * 
     * \param dataMax the y-max value according to chart
     */
    @Generated
    @Selector("calculateWithMin:max:")
    public native void calculateWithMinMax(double dataMin, double dataMax);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Centers the axis labels instead of drawing them at their original position.
     * This is useful especially for grouped BarChart.
     */
    @Generated
    @Selector("centerAxisLabelsEnabled")
    public native boolean centerAxisLabelsEnabled();

    /**
     * axis label entries only used for centered labels
     */
    @Generated
    @Selector("centeredEntries")
    public native NSArray<? extends NSNumber> centeredEntries();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * the number of decimal digits to use (for the default formatter
     */
    @Generated
    @Selector("decimals")
    @NInt
    public native long decimals();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("drawAxisLineEnabled")
    public native boolean drawAxisLineEnabled();

    /**
     * Are the grid lines drawn behind the data or in front of the data?
     * <em>default</em>: true
     */
    @Generated
    @Selector("drawGridLinesBehindDataEnabled")
    public native boolean drawGridLinesBehindDataEnabled();

    @Generated
    @Selector("drawGridLinesEnabled")
    public native boolean drawGridLinesEnabled();

    /**
     * flag that indicates of the labels of this axis should be drawn or not
     */
    @Generated
    @Selector("drawLabelsEnabled")
    public native boolean drawLabelsEnabled();

    /**
     * Are the LimitLines drawn behind the data or in front of the data?
     * <em>default</em>: false
     */
    @Generated
    @Selector("drawLimitLinesBehindDataEnabled")
    public native boolean drawLimitLinesBehindDataEnabled();

    /**
     * the actual array of entries
     */
    @Generated
    @Selector("entries")
    public native NSArray<? extends NSNumber> entries();

    /**
     * the number of entries the legend contains
     */
    @Generated
    @Selector("entryCount")
    @NInt
    public native long entryCount();

    /**
     * if true, the set number of y-labels will be forced
     */
    @Generated
    @Selector("forceLabelsEnabled")
    public native boolean forceLabelsEnabled();

    /**
     * returns:
     * The formatted label at the specified index. This will either use the auto-formatter or the custom formatter (if one is set).
     */
    @Generated
    @Selector("getFormattedLabel:")
    public native String getFormattedLabel(@NInt long index);

    @Generated
    @Selector("getLongestLabel")
    public native String getLongestLabel();

    /**
     * The minimum interval between axis values.
     * This can be used to avoid label duplicating when zooming in.
     * <em>default</em>: 1.0
     */
    @Generated
    @Selector("granularity")
    public native double granularity();

    /**
     * When true, axis labels are controlled by the <code>granularity</code> property.
     * When false, axis values could possibly be repeated.
     * This could happen if two adjacent axis values are rounded to same value.
     * If using granularity this could be avoided by having fewer axis values visible.
     */
    @Generated
    @Selector("granularityEnabled")
    public native boolean granularityEnabled();

    /**
     * the flag can be used to turn off the antialias for grid lines
     */
    @Generated
    @Selector("gridAntialiasEnabled")
    public native boolean gridAntialiasEnabled();

    @Generated
    @Selector("gridColor")
    public native UIColor gridColor();

    @Generated
    @Selector("gridLineCap")
    public native int gridLineCap();

    @Generated
    @Selector("gridLineDashLengths")
    public native NSArray<? extends NSNumber> gridLineDashLengths();

    @Generated
    @Selector("gridLineDashPhase")
    @NFloat
    public native double gridLineDashPhase();

    @Generated
    @Selector("gridLineWidth")
    @NFloat
    public native double gridLineWidth();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartAxisBase init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isAxisMaxCustom")
    public native boolean isAxisMaxCustom();

    @Generated
    @Selector("isAxisMinCustom")
    public native boolean isAxisMinCustom();

    @Generated
    @Selector("isCenterAxisLabelsEnabled")
    public native boolean isCenterAxisLabelsEnabled();

    @Generated
    @Selector("isDrawAxisLineEnabled")
    public native boolean isDrawAxisLineEnabled();

    /**
     * Are the grid lines drawn behind the data or in front of the data?
     * <em>default</em>: true
     */
    @Generated
    @Selector("isDrawGridLinesBehindDataEnabled")
    public native boolean isDrawGridLinesBehindDataEnabled();

    @Generated
    @Selector("isDrawGridLinesEnabled")
    public native boolean isDrawGridLinesEnabled();

    @Generated
    @Selector("isDrawLabelsEnabled")
    public native boolean isDrawLabelsEnabled();

    /**
     * Are the LimitLines drawn behind the data or in front of the data?
     * <em>default</em>: false
     */
    @Generated
    @Selector("isDrawLimitLinesBehindDataEnabled")
    public native boolean isDrawLimitLinesBehindDataEnabled();

    /**
     * <code>true</code> if focing the y-label count is enabled. Default: false
     */
    @Generated
    @Selector("isForceLabelsEnabled")
    public native boolean isForceLabelsEnabled();

    /**
     * The minimum interval between axis values.
     */
    @Generated
    @Selector("isGranularityEnabled")
    public native boolean isGranularityEnabled();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * the number of label entries the axis should have
     * max = 25,
     * min = 2,
     * default = 6,
     * be aware that this number is not fixed and can only be approximated
     */
    @Generated
    @Selector("labelCount")
    @NInt
    public native long labelCount();

    @Generated
    @Selector("labelFont")
    public native UIFont labelFont();

    @Generated
    @Selector("labelTextColor")
    public native UIColor labelTextColor();

    /**
     * The LimitLines of this axis.
     */
    @Generated
    @Selector("limitLines")
    public native NSArray<? extends ChartLimitLine> limitLines();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Removes all LimitLines from the axis.
     */
    @Generated
    @Selector("removeAllLimitLines")
    public native void removeAllLimitLines();

    /**
     * Removes the specified ChartLimitLine from the axis.
     */
    @Generated
    @Selector("removeLimitLine:")
    public native void removeLimitLine(ChartLimitLine line);

    /**
     * By calling this method, any custom maximum value that has been previously set is reseted, and the calculation is done automatically.
     */
    @Generated
    @Selector("resetCustomAxisMax")
    public native void resetCustomAxisMax();

    /**
     * By calling this method, any custom minimum value that has been previously set is reseted, and the calculation is done automatically.
     */
    @Generated
    @Selector("resetCustomAxisMin")
    public native void resetCustomAxisMin();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAxisLineColor:")
    public native void setAxisLineColor(UIColor value);

    @Generated
    @Selector("setAxisLineDashLengths:")
    public native void setAxisLineDashLengths(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setAxisLineDashPhase:")
    public native void setAxisLineDashPhase(@NFloat double value);

    @Generated
    @Selector("setAxisLineWidth:")
    public native void setAxisLineWidth(@NFloat double value);

    /**
     * The maximum number of labels on the axis
     */
    @Generated
    @Selector("setAxisMaxLabels:")
    public native void setAxisMaxLabels(@NInt long value);

    /**
     * The maximum value for this axis.
     * If set, this value will not be calculated automatically depending on the provided data.
     * Use <code>resetCustomAxisMax()</code> to undo this.
     */
    @Generated
    @Selector("setAxisMaximum:")
    public native void setAxisMaximum(double value);

    /**
     * The minumum number of labels on the axis
     */
    @Generated
    @Selector("setAxisMinLabels:")
    public native void setAxisMinLabels(@NInt long value);

    /**
     * The minimum value for this axis.
     * If set, this value will not be calculated automatically depending on the provided data.
     * Use <code>resetCustomAxisMin()</code> to undo this.
     */
    @Generated
    @Selector("setAxisMinimum:")
    public native void setAxisMinimum(double value);

    /**
     * the total range of values this axis covers
     */
    @Generated
    @Selector("setAxisRange:")
    public native void setAxisRange(double value);

    /**
     * Centers the axis labels instead of drawing them at their original position.
     * This is useful especially for grouped BarChart.
     */
    @Generated
    @Selector("setCenterAxisLabelsEnabled:")
    public native void setCenterAxisLabelsEnabled(boolean value);

    /**
     * axis label entries only used for centered labels
     */
    @Generated
    @Selector("setCenteredEntries:")
    public native void setCenteredEntries(NSArray<? extends NSNumber> value);

    /**
     * the number of decimal digits to use (for the default formatter
     */
    @Generated
    @Selector("setDecimals:")
    public native void setDecimals(@NInt long value);

    @Generated
    @Selector("setDrawAxisLineEnabled:")
    public native void setDrawAxisLineEnabled(boolean value);

    /**
     * Are the grid lines drawn behind the data or in front of the data?
     * <em>default</em>: true
     */
    @Generated
    @Selector("setDrawGridLinesBehindDataEnabled:")
    public native void setDrawGridLinesBehindDataEnabled(boolean value);

    @Generated
    @Selector("setDrawGridLinesEnabled:")
    public native void setDrawGridLinesEnabled(boolean value);

    /**
     * flag that indicates of the labels of this axis should be drawn or not
     */
    @Generated
    @Selector("setDrawLabelsEnabled:")
    public native void setDrawLabelsEnabled(boolean value);

    /**
     * Are the LimitLines drawn behind the data or in front of the data?
     * <em>default</em>: false
     */
    @Generated
    @Selector("setDrawLimitLinesBehindDataEnabled:")
    public native void setDrawLimitLinesBehindDataEnabled(boolean value);

    /**
     * the actual array of entries
     */
    @Generated
    @Selector("setEntries:")
    public native void setEntries(NSArray<? extends NSNumber> value);

    /**
     * if true, the set number of y-labels will be forced
     */
    @Generated
    @Selector("setForceLabelsEnabled:")
    public native void setForceLabelsEnabled(boolean value);

    /**
     * The minimum interval between axis values.
     * This can be used to avoid label duplicating when zooming in.
     * <em>default</em>: 1.0
     */
    @Generated
    @Selector("setGranularity:")
    public native void setGranularity(double value);

    /**
     * When true, axis labels are controlled by the <code>granularity</code> property.
     * When false, axis values could possibly be repeated.
     * This could happen if two adjacent axis values are rounded to same value.
     * If using granularity this could be avoided by having fewer axis values visible.
     */
    @Generated
    @Selector("setGranularityEnabled:")
    public native void setGranularityEnabled(boolean value);

    /**
     * the flag can be used to turn off the antialias for grid lines
     */
    @Generated
    @Selector("setGridAntialiasEnabled:")
    public native void setGridAntialiasEnabled(boolean value);

    @Generated
    @Selector("setGridColor:")
    public native void setGridColor(UIColor value);

    @Generated
    @Selector("setGridLineCap:")
    public native void setGridLineCap(int value);

    @Generated
    @Selector("setGridLineDashLengths:")
    public native void setGridLineDashLengths(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setGridLineDashPhase:")
    public native void setGridLineDashPhase(@NFloat double value);

    @Generated
    @Selector("setGridLineWidth:")
    public native void setGridLineWidth(@NFloat double value);

    /**
     * the number of label entries the axis should have
     * max = 25,
     * min = 2,
     * default = 6,
     * be aware that this number is not fixed and can only be approximated
     */
    @Generated
    @Selector("setLabelCount:")
    public native void setLabelCount(@NInt long value);

    @Generated
    @Selector("setLabelCount:force:")
    public native void setLabelCountForce(@NInt long count, boolean force);

    @Generated
    @Selector("setLabelFont:")
    public native void setLabelFont(UIFont value);

    @Generated
    @Selector("setLabelTextColor:")
    public native void setLabelTextColor(UIColor value);

    /**
     * Extra spacing for <code>axisMaximum</code> to be added to automatically calculated <code>axisMaximum</code>
     */
    @Generated
    @Selector("setSpaceMax:")
    public native void setSpaceMax(double value);

    /**
     * Extra spacing for <code>axisMinimum</code> to be added to automatically calculated <code>axisMinimum</code>
     */
    @Generated
    @Selector("setSpaceMin:")
    public native void setSpaceMin(double value);

    /**
     * Sets the formatter to be used for formatting the axis labels.
     * If no formatter is set, the chart will automatically determine a reasonable formatting (concerning decimals) for all the values that are drawn inside the chart.
     * Use <code>nil</code> to use the formatter calculated by the chart.
     */
    @Generated
    @Selector("setValueFormatter:")
    public native void setValueFormatter(@Mapped(ObjCObjectMapper.class) IChartAxisValueFormatter value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    /**
     * Extra spacing for <code>axisMaximum</code> to be added to automatically calculated <code>axisMaximum</code>
     */
    @Generated
    @Selector("spaceMax")
    public native double spaceMax();

    /**
     * Extra spacing for <code>axisMinimum</code> to be added to automatically calculated <code>axisMinimum</code>
     */
    @Generated
    @Selector("spaceMin")
    public native double spaceMin();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Sets the formatter to be used for formatting the axis labels.
     * If no formatter is set, the chart will automatically determine a reasonable formatting (concerning decimals) for all the values that are drawn inside the chart.
     * Use <code>nil</code> to use the formatter calculated by the chart.
     */
    @Generated
    @Selector("valueFormatter")
    @MappedReturn(ObjCObjectMapper.class)
    public native IChartAxisValueFormatter valueFormatter();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}