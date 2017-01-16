package org.moe.samples.simplechart.charts.protocol;


import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGPoint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.ChartDataEntry;
import org.moe.samples.simplechart.charts.ChartHighlight;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartMarker")
public interface IChartMarker {
	@Generated
	@Selector("drawWithContext:point:")
	void drawWithContextPoint(CGContextRef context, @ByValue CGPoint point);

	@Generated
	@Selector("offset")
	@ByValue
	CGPoint offset();

	@Generated
	@Selector("offsetForDrawingAtPoint:")
	@ByValue
	CGPoint offsetForDrawingAtPoint(@ByValue CGPoint atPoint);

	@Generated
	@Selector("refreshContentWithEntry:highlight:")
	void refreshContentWithEntryHighlight(ChartDataEntry entry,
			ChartHighlight highlight);
}