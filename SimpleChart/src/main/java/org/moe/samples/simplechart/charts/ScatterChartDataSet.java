package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIFont;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IScatterChartDataSet;
import org.moe.samples.simplechart.charts.protocol.IShapeRenderer;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts19ScatterChartDataSet")
@ObjCClassBinding
public class ScatterChartDataSet extends LineScatterCandleRadarChartDataSet
		implements IScatterChartDataSet {
	static {
		NatJ.register();
	}

	@Generated
	protected ScatterChartDataSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addColor:")
	public native void addColor(UIColor color);

	@Generated
	@Selector("addEntry:")
	public native boolean addEntry(ChartDataEntry e);

	@Generated
	@Selector("addEntryOrdered:")
	public native boolean addEntryOrdered(ChartDataEntry e);

	@Generated
	@Owned
	@Selector("alloc")
	public static native ScatterChartDataSet alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("axisDependency")
	@NInt
	public native long axisDependency();

	@Generated
	@Selector("calcMinMax")
	public native void calcMinMax();

	@Generated
	@Selector("calcMinMaxYFromX:toX:")
	public native void calcMinMaxYFromXToX(double fromX, double toX);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("clear")
	public native void clear();

	@Generated
	@Selector("colorAtIndex:")
	public native UIColor colorAtIndex(@NInt long atIndex);

	@Generated
	@Selector("colors")
	public native NSArray<? extends UIColor> colors();

	@Generated
	@Selector("contains:")
	public native boolean contains(ChartDataEntry e);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("drawHorizontalHighlightIndicatorEnabled")
	public native boolean drawHorizontalHighlightIndicatorEnabled();

	@Generated
	@Selector("drawValuesEnabled")
	public native boolean drawValuesEnabled();

	@Generated
	@Selector("drawVerticalHighlightIndicatorEnabled")
	public native boolean drawVerticalHighlightIndicatorEnabled();

	@Generated
	@Selector("entriesForXValue:")
	public native NSArray<? extends ChartDataEntry> entriesForXValue(
			double xValue);

	@Generated
	@Selector("entryCount")
	@NInt
	public native long entryCount();

	@Generated
	@Selector("entryForIndex:")
	public native ChartDataEntry entryForIndex(@NInt long i);

	@Generated
	@Selector("entryForXValue:closestToY:")
	public native ChartDataEntry entryForXValueClosestToY(double xValue,
			double yValue);

	@Generated
	@Selector("entryForXValue:closestToY:rounding:")
	public native ChartDataEntry entryForXValueClosestToYRounding(
			double xValue, double yValue, @NInt long rounding);

	@Generated
	@Selector("entryIndexWithEntry:")
	@NInt
	public native long entryIndexWithEntry(ChartDataEntry e);

	@Generated
	@Selector("entryIndexWithX:closestToY:rounding:")
	@NInt
	public native long entryIndexWithXClosestToYRounding(double xValue,
			double yValue, @NInt long rounding);

	@Generated
	@Selector("form")
	@NInt
	public native long form();

	@Generated
	@Selector("formLineDashLengths")
	public native NSArray<? extends NSNumber> formLineDashLengths();

	@Generated
	@Selector("formLineDashPhase")
	@NFloat
	public native double formLineDashPhase();

	@Generated
	@Selector("formLineWidth")
	@NFloat
	public native double formLineWidth();

	@Generated
	@Selector("formSize")
	@NFloat
	public native double formSize();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("highlightColor")
	public native UIColor highlightColor();

	@Generated
	@Selector("highlightEnabled")
	public native boolean highlightEnabled();

	@Generated
	@Selector("highlightLineDashLengths")
	public native NSArray<? extends NSNumber> highlightLineDashLengths();

	@Generated
	@Selector("highlightLineDashPhase")
	@NFloat
	public native double highlightLineDashPhase();

	@Generated
	@Selector("highlightLineWidth")
	@NFloat
	public native double highlightLineWidth();

	@Generated
	@Selector("init")
	public native ScatterChartDataSet init();

	@Generated
	@Selector("initWithLabel:")
	public native ScatterChartDataSet initWithLabel(String label);

	@Generated
	@Selector("initWithValues:")
	public native ScatterChartDataSet initWithValues(
			NSArray<? extends ChartDataEntry> values);

	@Generated
	@Selector("initWithValues:label:")
	public native ScatterChartDataSet initWithValuesLabel(
			NSArray<? extends ChartDataEntry> values, String label);

	@Generated
	@Selector("initialize")
	public static native void initialize_static();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isDrawValuesEnabled")
	public native boolean isDrawValuesEnabled();

	@Generated
	@Selector("isHighlightEnabled")
	public native boolean isHighlightEnabled();

	@Generated
	@Selector("isHorizontalHighlightIndicatorEnabled")
	public native boolean isHorizontalHighlightIndicatorEnabled();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("isVerticalHighlightIndicatorEnabled")
	public native boolean isVerticalHighlightIndicatorEnabled();

	@Generated
	@Selector("isVisible")
	public native boolean isVisible();

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("label")
	public native String label();

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("needsFormatter")
	public native boolean needsFormatter();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("notifyDataSetChanged")
	public native void notifyDataSetChanged();

	@Generated
	@Selector("removeEntry:")
	public native boolean removeEntry(ChartDataEntry entry);

	@Generated
	@Selector("removeEntryWithIndex:")
	public native boolean removeEntryWithIndex(@NInt long index);

	@Generated
	@Selector("removeEntryWithX:")
	public native boolean removeEntryWithX(double x);

	@Generated
	@Selector("removeFirst")
	public native boolean removeFirst();

	@Generated
	@Selector("removeLast")
	public native boolean removeLast();

	@Generated
	@Selector("rendererForShape:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native IShapeRenderer rendererForShape(@NInt long shape);

	@Generated
	@Selector("resetColors")
	public native void resetColors();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("scatterShapeHoleColor")
	public native UIColor scatterShapeHoleColor();

	@Generated
	@Selector("scatterShapeHoleRadius")
	@NFloat
	public native double scatterShapeHoleRadius();

	@Generated
	@Selector("scatterShapeSize")
	@NFloat
	public native double scatterShapeSize();

	@Generated
	@Selector("setColor:")
	public native void setColor(UIColor color);

	@Generated
	@Selector("setDrawHighlightIndicators:")
	public native void setDrawHighlightIndicators(boolean enabled);

	@Generated
	@Selector("setDrawHorizontalHighlightIndicatorEnabled:")
	public native void setDrawHorizontalHighlightIndicatorEnabled(boolean value);

	@Generated
	@Selector("setDrawValuesEnabled:")
	public native void setDrawValuesEnabled(boolean value);

	@Generated
	@Selector("setDrawVerticalHighlightIndicatorEnabled:")
	public native void setDrawVerticalHighlightIndicatorEnabled(boolean value);

	@Generated
	@Selector("setHighlightColor:")
	public native void setHighlightColor(UIColor value);

	@Generated
	@Selector("setHighlightEnabled:")
	public native void setHighlightEnabled(boolean value);

	@Generated
	@Selector("setHighlightLineDashLengths:")
	public native void setHighlightLineDashLengths(
			NSArray<? extends NSNumber> value);

	@Generated
	@Selector("setHighlightLineDashPhase:")
	public native void setHighlightLineDashPhase(@NFloat double value);

	@Generated
	@Selector("setHighlightLineWidth:")
	public native void setHighlightLineWidth(@NFloat double value);

	@Generated
	@Selector("setScatterShape:")
	public native void setScatterShape(@NInt long shape);

	@Generated
	@Selector("setScatterShapeHoleColor:")
	public native void setScatterShapeHoleColor(UIColor value);

	@Generated
	@Selector("setScatterShapeHoleRadius:")
	public native void setScatterShapeHoleRadius(@NFloat double value);

	@Generated
	@Selector("setScatterShapeSize:")
	public native void setScatterShapeSize(@NFloat double value);

	@Generated
	@Selector("setShapeRenderer:")
	public native void setShapeRenderer(
			@Mapped(ObjCObjectMapper.class) IShapeRenderer value);

	@Generated
	@Selector("setValueFont:")
	public native void setValueFont(UIFont value);

	@Generated
	@Selector("setValueFormatter:")
	public native void setValueFormatter(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setValueTextColor:")
	public native void setValueTextColor(UIColor value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setVisible:")
	public native void setVisible(boolean value);

	@Generated
	@Selector("shapeRenderer")
	@MappedReturn(ObjCObjectMapper.class)
	public native IShapeRenderer shapeRenderer();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("valueColors")
	public native NSArray<? extends UIColor> valueColors();

	@Generated
	@Selector("valueFont")
	public native UIFont valueFont();

	@Generated
	@Selector("valueFormatter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueFormatter();

	@Generated
	@Selector("valueTextColor")
	public native UIColor valueTextColor();

	@Generated
	@Selector("valueTextColorAt:")
	public native UIColor valueTextColorAt(@NInt long index);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("visible")
	public native boolean visible();

	@Generated
	@Selector("xMax")
	public native double xMax();

	@Generated
	@Selector("xMin")
	public native double xMin();

	@Generated
	@Selector("yMax")
	public native double yMax();

	@Generated
	@Selector("yMin")
	public native double yMin();
}