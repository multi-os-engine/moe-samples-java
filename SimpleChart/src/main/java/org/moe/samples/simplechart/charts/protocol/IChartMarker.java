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
    /**
     * Draws the IMarker on the given position on the given context
     */
    @Generated
    @Selector("drawWithContext:point:")
    void drawWithContextPoint(CGContextRef context, @ByValue CGPoint point);

    /**
     * returns:
     * The desired (general) offset you wish the IMarker to have on the x-axis.
     * By returning x: -(width / 2) you will center the IMarker horizontally.
     * By returning y: -(height / 2) you will center the IMarker vertically.
     */
    @Generated
    @Selector("offset")
    @ByValue
    CGPoint offset();

    /**
     * \param point This is the point at which the marker wants to be drawn. You can adjust the offset conditionally based on this argument.
     * 
     * 
     * returns:
     * The offset for drawing at the specific <code>point</code>.
     * This allows conditional adjusting of the Marker position.
     * If you have no adjustments to make, return self.offset().
     */
    @Generated
    @Selector("offsetForDrawingAtPoint:")
    @ByValue
    CGPoint offsetForDrawingAtPoint(@ByValue CGPoint atPoint);

    /**
     * This method enables a custom IMarker to update it’s content every time the IMarker is redrawn according to the data entry it points to.
     * \param entry The Entry the IMarker belongs to. This can also be any subclass of Entry, like BarEntry or CandleEntry, simply cast it at runtime.
     * 
     * \param highlight The highlight object contains information about the highlighted value such as it’s dataset-index, the selected range or stack-index (only stacked bar entries).
     */
    @Generated
    @Selector("refreshContentWithEntry:highlight:")
    void refreshContentWithEntryHighlight(ChartDataEntry entry, ChartHighlight highlight);
}