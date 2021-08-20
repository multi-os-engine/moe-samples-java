package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartAxisBase;

/**
 * An interface for providing custom axis Strings.
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartAxisValueFormatter")
public interface IChartAxisValueFormatter {
    /**
     * Called when a value from an axis is formatted before being drawn.
     * For performance reasons, avoid excessive calculations and memory allocations inside this method.
     * \param value the value that is currently being drawn
     * 
     * \param axis the axis that the value belongs to
     * 
     * 
     * returns:
     * The customized label that is drawn on the x-axis.
     */
    @Generated
    @Selector("stringForValue:axis:")
    String stringForValueAxis(double value, ChartAxisBase axis);
}