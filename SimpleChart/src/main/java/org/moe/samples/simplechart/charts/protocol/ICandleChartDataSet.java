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
@ObjCProtocolSourceName("ICandleChartDataSet")
@ObjCProtocolName("_TtP6Charts19ICandleChartDataSet_")
public interface ICandleChartDataSet extends
		ILineScatterCandleRadarChartDataSet {
	@Generated
	@Selector("barSpace")
	@NFloat
	double barSpace();

	@Generated
	@Selector("decreasingColor")
	UIColor decreasingColor();

	@Generated
	@Selector("decreasingFilled")
	boolean decreasingFilled();

	@Generated
	@Selector("increasingColor")
	UIColor increasingColor();

	@Generated
	@Selector("increasingFilled")
	boolean increasingFilled();

	@Generated
	@Selector("isDecreasingFilled")
	boolean isDecreasingFilled();

	@Generated
	@Selector("isIncreasingFilled")
	boolean isIncreasingFilled();

	@Generated
	@Selector("isShadowColorSameAsCandle")
	boolean isShadowColorSameAsCandle();

	@Generated
	@Selector("neutralColor")
	UIColor neutralColor();

	@Generated
	@Selector("setBarSpace:")
	void setBarSpace(@NFloat double value);

	@Generated
	@Selector("setDecreasingColor:")
	void setDecreasingColor(UIColor value);

	@Generated
	@Selector("setDecreasingFilled:")
	void setDecreasingFilled(boolean value);

	@Generated
	@Selector("setIncreasingColor:")
	void setIncreasingColor(UIColor value);

	@Generated
	@Selector("setIncreasingFilled:")
	void setIncreasingFilled(boolean value);

	@Generated
	@Selector("setNeutralColor:")
	void setNeutralColor(UIColor value);

	@Generated
	@Selector("setShadowColor:")
	void setShadowColor(UIColor value);

	@Generated
	@Selector("setShadowColorSameAsCandle:")
	void setShadowColorSameAsCandle(boolean value);

	@Generated
	@Selector("setShadowWidth:")
	void setShadowWidth(@NFloat double value);

	@Generated
	@Selector("setShowCandleBar:")
	void setShowCandleBar(boolean value);

	@Generated
	@Selector("shadowColor")
	UIColor shadowColor();

	@Generated
	@Selector("shadowColorSameAsCandle")
	boolean shadowColorSameAsCandle();

	@Generated
	@Selector("shadowWidth")
	@NFloat
	double shadowWidth();

	@Generated
	@Selector("showCandleBar")
	boolean showCandleBar();
}