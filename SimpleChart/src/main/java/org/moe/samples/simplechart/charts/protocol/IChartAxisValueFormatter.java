package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartAxisBase;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartAxisValueFormatter")
public interface IChartAxisValueFormatter {
	@Generated
	@Selector("stringForValue:axis:")
	String stringForValueAxis(double value, ChartAxisBase axis);
}