package org.moe.samples.simplechart.charts.protocol;


import apple.uikit.UIColor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IRadarChartDataSet")
@ObjCProtocolName("_TtP6Charts18IRadarChartDataSet_")
public interface IRadarChartDataSet extends ILineRadarChartDataSet {
	@Generated
	@Selector("drawHighlightCircleEnabled")
	boolean drawHighlightCircleEnabled();

	@Generated
	@Selector("highlightCircleFillColor")
	UIColor highlightCircleFillColor();

	@Generated
	@Selector("highlightCircleInnerRadius")
	@NFloat
	double highlightCircleInnerRadius();

	@Generated
	@Selector("highlightCircleOuterRadius")
	@NFloat
	double highlightCircleOuterRadius();

	@Generated
	@Selector("highlightCircleStrokeAlpha")
	@NFloat
	double highlightCircleStrokeAlpha();

	@Generated
	@Selector("highlightCircleStrokeColor")
	UIColor highlightCircleStrokeColor();

	@Generated
	@Selector("highlightCircleStrokeWidth")
	@NFloat
	double highlightCircleStrokeWidth();

	@Generated
	@Selector("isDrawHighlightCircleEnabled")
	boolean isDrawHighlightCircleEnabled();

	@Generated
	@Selector("setDrawHighlightCircleEnabled:")
	void setDrawHighlightCircleEnabled(boolean value);

	@Generated
	@Selector("setHighlightCircleFillColor:")
	void setHighlightCircleFillColor(UIColor value);

	@Generated
	@Selector("setHighlightCircleInnerRadius:")
	void setHighlightCircleInnerRadius(@NFloat double value);

	@Generated
	@Selector("setHighlightCircleOuterRadius:")
	void setHighlightCircleOuterRadius(@NFloat double value);

	@Generated
	@Selector("setHighlightCircleStrokeAlpha:")
	void setHighlightCircleStrokeAlpha(@NFloat double value);

	@Generated
	@Selector("setHighlightCircleStrokeColor:")
	void setHighlightCircleStrokeColor(UIColor value);

	@Generated
	@Selector("setHighlightCircleStrokeWidth:")
	void setHighlightCircleStrokeWidth(@NFloat double value);
}