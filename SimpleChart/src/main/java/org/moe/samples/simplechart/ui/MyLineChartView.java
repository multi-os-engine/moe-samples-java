package org.moe.samples.simplechart.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.simplechart.charts.LineChartView;

@ObjCClassName("MyLineChartView")
@RegisterOnStartup
public class MyLineChartView extends LineChartView {

    public MyLineChartView(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native MyLineChartView alloc();

    @Selector("init")
    public native MyLineChartView init();

    @Override
    public void awakeFromNib() {
        super.awakeFromNib();

        setNoDataText("You need to provide data for the chart.");

        setDragEnabled(true);
        setScaleEnabled(true);
        setPinchZoomEnabled(true);
        setDrawGridBackgroundEnabled(false);
    }
}
