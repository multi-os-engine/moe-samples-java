package org.moe.samples.simplechart.ui;

import apple.foundation.NSArray;
import apple.foundation.NSMutableArray;
import apple.foundation.NSNumber;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IBOutlet;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.uikit.UIViewController;
import org.moe.samples.simplechart.charts.ChartDataEntry;
import org.moe.samples.simplechart.charts.ChartLimitLine;
import org.moe.samples.simplechart.charts.ChartViewBase;
import org.moe.samples.simplechart.charts.ChartYAxis;
import org.moe.samples.simplechart.charts.LineChartData;
import org.moe.samples.simplechart.charts.LineChartDataSet;
import org.moe.samples.simplechart.charts.LineChartView;
import org.moe.samples.simplechart.charts.enums.ChartLimitLabelPosition;
import org.moe.samples.simplechart.charts.protocol.ChartViewDelegate;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
public class AppViewController extends UIViewController implements ChartViewDelegate {

    @Owned
    @Selector("alloc")
    public static native AppViewController alloc();

    @Selector("init")
    public native AppViewController init();

    protected AppViewController(Pointer peer) {
        super(peer);
    }

    private LineChartView lineChartView;

    @Property
    @IBOutlet
    @Selector("lineChartView")
    public LineChartView getLineChartView() {
        return lineChartView;
    }

    @Selector("setLineChartView:")
    public void setLineChartView(LineChartView lineChartView) {
        this.lineChartView = lineChartView;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void viewDidLoad() {
        super.viewDidLoad();

        final LineChartView chartView = getLineChartView();
        chartView.setDelegate(this);

        ChartLimitLine llXAxis = ChartLimitLine.alloc().initWithLimitLabel(10.0, "Index 10");
        llXAxis.setLineWidth(4.0);
        llXAxis.setLineDashLengths(arrayOfFloats(10.0f, 10.0f, 0.0f));
        llXAxis.setLabelPosition(ChartLimitLabelPosition.BottomRight);
        llXAxis.setValueFont(UIFont.systemFontOfSize(10.f));

        chartView.xAxis().setGridLineDashLengths(arrayOfFloats(10.0f, 10.0f));
        chartView.xAxis().setGridLineDashPhase(0f);

        ChartLimitLine ll1 = ChartLimitLine.alloc().initWithLimitLabel(10.0, "Upper Limit");
        ll1.setLineWidth(4.0);
        ll1.setLineDashLengths(arrayOfFloats(5.0f, 5.0f));
        ll1.setLabelPosition(ChartLimitLabelPosition.TopRight);
        ll1.setValueFont(UIFont.systemFontOfSize(10.f));

        ChartLimitLine ll2 = ChartLimitLine.alloc().initWithLimitLabel(10.0, "Lower Limit");
        ll2.setLineWidth(4.0);
        ll2.setLineDashLengths(arrayOfFloats(5.0f, 5.0f));
        ll2.setLabelPosition(ChartLimitLabelPosition.BottomRight);
        ll2.setValueFont(UIFont.systemFontOfSize(10.f));

        ChartYAxis leftAxis = chartView.leftAxis();
        leftAxis.removeAllLimitLines();
        leftAxis.addLimitLine(ll1);
        leftAxis.addLimitLine(ll2);
        leftAxis.setAxisMaximum(2.0);
        leftAxis.setAxisMinimum(-2.0);
        leftAxis.setGridLineDashLengths(arrayOfFloats(5.0f, 5.0f));
        leftAxis.setDrawZeroLineEnabled(false);
        leftAxis.setDrawLimitLinesBehindDataEnabled(true);

        chartView.rightAxis().setEnabled(false);

        final int resolution = 200;
        NSMutableArray values = NSMutableArray.arrayWithCapacity(resolution);
        final double step = (4 * Math.PI) / resolution;
        for (int i = 0; i < resolution; ++i) {
            final double stepI = step * i;
            values.add(ChartDataEntry.alloc().initWithXY(stepI, Math.sin(stepI)));
        }

        LineChartDataSet set1 = LineChartDataSet.alloc().initWithEntriesLabel(values, "DataSet 1");

        set1.setLineDashLengths(arrayOfFloats(5.0f, 2.5f));
        set1.setHighlightLineDashLengths(arrayOfFloats(5.0f, 2.5f));
        set1.setColor(UIColor.blackColor());
        set1.setCircleColor(UIColor.blackColor());
        set1.setLineWidth(1.0);
        set1.setCircleRadius(3.0);
        set1.setDrawCircleHoleEnabled(false);
        set1.setValueFont(UIFont.systemFontOfSize(9.f));
        set1.setFormLineDashLengths(arrayOfFloats(5.0f, 2.5f));
        set1.setFormLineWidth(1.0);
        set1.setFormSize(15.0);

        NSArray dataSets = NSArray.arrayWithObject(set1);
        LineChartData data = LineChartData.alloc().initWithDataSets(dataSets);

        chartView.setData(data);
    }

    @SuppressWarnings("unchecked")
    public static NSArray<NSNumber> arrayOfFloats(float... values) {
        NSMutableArray array = NSMutableArray.alloc().initWithCapacity(values.length);
        for (float value : values) {
            array.add(NSNumber.alloc().initWithFloat(value));
        }
        return array;
    }

    @Override
    public void chartTranslatedDXDY(ChartViewBase chartView, @NFloat double dX, @NFloat double dY) {
        System.out.println("translated -> " + dX + ":" + dY);
    }
}
