package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartHighlight;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartHighlighter")
public interface IChartHighlighter {
	@Generated
	@Selector("getHighlightWithX:y:")
	ChartHighlight getHighlightWithXY(@NFloat double x, @NFloat double y);
}