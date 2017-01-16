package org.moe.samples.simplechart.charts.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.uikit.UIColor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("ILineChartDataSet")
@ObjCProtocolName("_TtP6Charts17ILineChartDataSet_")
public interface ILineChartDataSet extends ILineRadarChartDataSet {
	@Generated
	@Selector("circleColors")
	NSArray<? extends UIColor> circleColors();

	@Generated
	@Selector("circleHoleColor")
	UIColor circleHoleColor();

	@Generated
	@Selector("circleHoleRadius")
	@NFloat
	double circleHoleRadius();

	@Generated
	@Selector("circleRadius")
	@NFloat
	double circleRadius();

	@Generated
	@Selector("cubicIntensity")
	@NFloat
	double cubicIntensity();

	@Generated
	@Selector("drawCircleHoleEnabled")
	boolean drawCircleHoleEnabled();

	@Generated
	@Selector("drawCirclesEnabled")
	boolean drawCirclesEnabled();

	@Generated
	@Selector("drawCubicEnabled")
	boolean drawCubicEnabled();

	@Generated
	@Selector("drawSteppedEnabled")
	boolean drawSteppedEnabled();

	@Generated
	@Selector("fillFormatter")
	@MappedReturn(ObjCObjectMapper.class)
	Object fillFormatter();

	@Generated
	@Selector("getCircleColorAtIndex:")
	UIColor getCircleColorAtIndex(@NInt long atIndex);

	@Generated
	@Selector("isDrawCircleHoleEnabled")
	boolean isDrawCircleHoleEnabled();

	@Generated
	@Selector("isDrawCirclesEnabled")
	boolean isDrawCirclesEnabled();

	@Generated
	@Selector("isDrawCubicEnabled")
	boolean isDrawCubicEnabled();

	@Generated
	@Selector("isDrawSteppedEnabled")
	boolean isDrawSteppedEnabled();

	@Generated
	@Selector("lineCapType")
	int lineCapType();

	@Generated
	@Selector("lineDashLengths")
	NSArray<? extends NSNumber> lineDashLengths();

	@Generated
	@Selector("lineDashPhase")
	@NFloat
	double lineDashPhase();

	@Generated
	@Selector("mode")
	@NInt
	long mode();

	@Generated
	@Selector("resetCircleColors:")
	void resetCircleColors(@NInt long index);

	@Generated
	@Selector("setCircleColor:")
	void setCircleColor(UIColor color);

	@Generated
	@Selector("setCircleColors:")
	void setCircleColors(NSArray<? extends UIColor> value);

	@Generated
	@Selector("setCircleHoleColor:")
	void setCircleHoleColor(UIColor value);

	@Generated
	@Selector("setCircleHoleRadius:")
	void setCircleHoleRadius(@NFloat double value);

	@Generated
	@Selector("setCircleRadius:")
	void setCircleRadius(@NFloat double value);

	@Generated
	@Selector("setCubicIntensity:")
	void setCubicIntensity(@NFloat double value);

	@Generated
	@Selector("setDrawCircleHoleEnabled:")
	void setDrawCircleHoleEnabled(boolean value);

	@Generated
	@Selector("setDrawCirclesEnabled:")
	void setDrawCirclesEnabled(boolean value);

	@Generated
	@Selector("setDrawCubicEnabled:")
	void setDrawCubicEnabled(boolean value);

	@Generated
	@Selector("setDrawSteppedEnabled:")
	void setDrawSteppedEnabled(boolean value);

	@Generated
	@Selector("setFillFormatter:")
	void setFillFormatter(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setLineCapType:")
	void setLineCapType(int value);

	@Generated
	@Selector("setLineDashLengths:")
	void setLineDashLengths(NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setMode:")
	void setMode(@NInt long value);
}