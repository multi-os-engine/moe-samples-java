package org.moe.samples.simplechart.charts.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("IChartFillFormatter")
public interface IChartFillFormatter {
	@Generated
	@Selector("getFillLinePositionWithDataSet:dataProvider:")
	@NFloat
	double getFillLinePositionWithDataSetDataProvider(
			@Mapped(ObjCObjectMapper.class) Object dataSet,
			@Mapped(ObjCObjectMapper.class) Object dataProvider);
}