package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartDataEntry;
import org.moe.samples.simplechart.charts.ChartViewPortHandler;

/**
 * Interface that allows custom formatting of all values inside the chart before they are drawn to the screen.
 * Simply create your own formatting class and let it implement ValueFormatter. Then override the stringForValue()
 * method and return whatever you want.
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartValueFormatter")
public interface IChartValueFormatter {
    /**
     * Called when a value (from labels inside the chart) is formatted before being drawn.
     * For performance reasons, avoid excessive calculations and memory allocations inside this method.
     * \param value The value to be formatted
     * 
     * \param dataSetIndex The index of the DataSet the entry in focus belongs to
     * 
     * \param viewPortHandler provides information about the current chart state (scale, translation, …)
     * 
     * 
     * returns:
     * The formatted label ready to be drawn
     */
    @Generated
    @Selector("stringForValue:entry:dataSetIndex:viewPortHandler:")
    String stringForValueEntryDataSetIndexViewPortHandler(double value, ChartDataEntry entry, @NInt long dataSetIndex,
            ChartViewPortHandler viewPortHandler);
}