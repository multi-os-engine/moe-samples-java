package org.moe.samples.simplechart.charts.protocol;


import apple.uikit.UIColor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ObjCProtocolSourceName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolSourceName("IScatterChartDataSet")
@ObjCProtocolName("_TtP6Charts20IScatterChartDataSet_")
public interface IScatterChartDataSet extends
		ILineScatterCandleRadarChartDataSet {
	@Generated
	@Selector("scatterShapeHoleColor")
	UIColor scatterShapeHoleColor();

	@Generated
	@Selector("scatterShapeHoleRadius")
	@NFloat
	double scatterShapeHoleRadius();

	@Generated
	@Selector("scatterShapeSize")
	@NFloat
	double scatterShapeSize();

	@Generated
	@Selector("shapeRenderer")
	@MappedReturn(ObjCObjectMapper.class)
	Object shapeRenderer();
}