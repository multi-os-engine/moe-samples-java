package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartViewPortHandler extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartViewPortHandler(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartViewPortHandler alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("canZoomInMoreX")
	public native boolean canZoomInMoreX();

	@Generated
	@Selector("canZoomInMoreY")
	public native boolean canZoomInMoreY();

	@Generated
	@Selector("canZoomOutMoreX")
	public native boolean canZoomOutMoreX();

	@Generated
	@Selector("canZoomOutMoreY")
	public native boolean canZoomOutMoreY();

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
	@Selector("centerViewPortWithPt:chart:")
	public native void centerViewPortWithPtChart(@ByValue CGPoint pt,
			ChartViewBase chart);

	@Generated
	@Selector("chartHeight")
	@NFloat
	public native double chartHeight();

	@Generated
	@Selector("chartWidth")
	@NFloat
	public native double chartWidth();

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
	@Selector("contentBottom")
	@NFloat
	public native double contentBottom();

	@Generated
	@Selector("contentCenter")
	@ByValue
	public native CGPoint contentCenter();

	@Generated
	@Selector("contentHeight")
	@NFloat
	public native double contentHeight();

	@Generated
	@Selector("contentLeft")
	@NFloat
	public native double contentLeft();

	@Generated
	@Selector("contentRect")
	@ByValue
	public native CGRect contentRect();

	@Generated
	@Selector("contentRight")
	@NFloat
	public native double contentRight();

	@Generated
	@Selector("contentTop")
	@NFloat
	public native double contentTop();

	@Generated
	@Selector("contentWidth")
	@NFloat
	public native double contentWidth();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("fitScreen")
	@ByValue
	public native CGAffineTransform fitScreen();

	@Generated
	@Selector("hasChartDimens")
	public native boolean hasChartDimens();

	@Generated
	@Selector("hasNoDragOffset")
	public native boolean hasNoDragOffset();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartViewPortHandler init();

	@Generated
	@Selector("initWithWidth:height:")
	public native ChartViewPortHandler initWithWidthHeight(
			@NFloat double width, @NFloat double height);

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
	@Selector("isFullyZoomedOut")
	public native boolean isFullyZoomedOut();

	@Generated
	@Selector("isFullyZoomedOutX")
	public native boolean isFullyZoomedOutX();

	@Generated
	@Selector("isFullyZoomedOutY")
	public native boolean isFullyZoomedOutY();

	@Generated
	@Selector("isInBoundsBottom:")
	public native boolean isInBoundsBottom(@NFloat double y);

	@Generated
	@Selector("isInBoundsLeft:")
	public native boolean isInBoundsLeft(@NFloat double x);

	@Generated
	@Selector("isInBoundsRight:")
	public native boolean isInBoundsRight(@NFloat double x);

	@Generated
	@Selector("isInBoundsTop:")
	public native boolean isInBoundsTop(@NFloat double y);

	@Generated
	@Selector("isInBoundsWithX:y:")
	public native boolean isInBoundsWithXY(@NFloat double x, @NFloat double y);

	@Generated
	@Selector("isInBoundsX:")
	public native boolean isInBoundsX(@NFloat double x);

	@Generated
	@Selector("isInBoundsY:")
	public native boolean isInBoundsY(@NFloat double y);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("maxScaleX")
	@NFloat
	public native double maxScaleX();

	@Generated
	@Selector("maxScaleY")
	@NFloat
	public native double maxScaleY();

	@Generated
	@Selector("minScaleX")
	@NFloat
	public native double minScaleX();

	@Generated
	@Selector("minScaleY")
	@NFloat
	public native double minScaleY();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("offsetBottom")
	@NFloat
	public native double offsetBottom();

	@Generated
	@Selector("offsetLeft")
	@NFloat
	public native double offsetLeft();

	@Generated
	@Selector("offsetRight")
	@NFloat
	public native double offsetRight();

	@Generated
	@Selector("offsetTop")
	@NFloat
	public native double offsetTop();

	@Generated
	@Selector("refreshWithNewMatrix:chart:invalidate:")
	@ByValue
	public native CGAffineTransform refreshWithNewMatrixChartInvalidate(
			@ByValue CGAffineTransform newMatrix, ChartViewBase chart,
			boolean invalidate);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("restrainViewPortWithOffsetLeft:offsetTop:offsetRight:offsetBottom:")
	public native void restrainViewPortWithOffsetLeftOffsetTopOffsetRightOffsetBottom(
			@NFloat double offsetLeft, @NFloat double offsetTop,
			@NFloat double offsetRight, @NFloat double offsetBottom);

	@Generated
	@Selector("scaleX")
	@NFloat
	public native double scaleX();

	@Generated
	@Selector("scaleY")
	@NFloat
	public native double scaleY();

	@Generated
	@Selector("setChartDimensWithWidth:height:")
	public native void setChartDimensWithWidthHeight(@NFloat double width,
			@NFloat double height);

	@Generated
	@Selector("setDragOffsetX:")
	public native void setDragOffsetX(@NFloat double offset);

	@Generated
	@Selector("setDragOffsetY:")
	public native void setDragOffsetY(@NFloat double offset);

	@Generated
	@Selector("setMaximumScaleX:")
	public native void setMaximumScaleX(@NFloat double xScale);

	@Generated
	@Selector("setMaximumScaleY:")
	public native void setMaximumScaleY(@NFloat double yScale);

	@Generated
	@Selector("setMinMaxScaleXWithMinScaleX:maxScaleX:")
	public native void setMinMaxScaleXWithMinScaleXMaxScaleX(
			@NFloat double minScaleX, @NFloat double maxScaleX);

	@Generated
	@Selector("setMinMaxScaleYWithMinScaleY:maxScaleY:")
	public native void setMinMaxScaleYWithMinScaleYMaxScaleY(
			@NFloat double minScaleY, @NFloat double maxScaleY);

	@Generated
	@Selector("setMinimumScaleX:")
	public native void setMinimumScaleX(@NFloat double xScale);

	@Generated
	@Selector("setMinimumScaleY:")
	public native void setMinimumScaleY(@NFloat double yScale);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("setZoomWithScaleX:scaleY:")
	@ByValue
	public native CGAffineTransform setZoomWithScaleXScaleY(
			@NFloat double scaleX, @NFloat double scaleY);

	@Generated
	@Selector("setZoomWithScaleX:scaleY:x:y:")
	@ByValue
	public native CGAffineTransform setZoomWithScaleXScaleYXY(
			@NFloat double scaleX, @NFloat double scaleY, @NFloat double x,
			@NFloat double y);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("touchMatrix")
	@ByValue
	public native CGAffineTransform touchMatrix();

	@Generated
	@Selector("transX")
	@NFloat
	public native double transX();

	@Generated
	@Selector("transY")
	@NFloat
	public native double transY();

	@Generated
	@Selector("translateWithPt:")
	@ByValue
	public native CGAffineTransform translateWithPt(@ByValue CGPoint pt);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

	@Generated
	@Selector("zoomInX:y:")
	@ByValue
	public native CGAffineTransform zoomInXY(@NFloat double x, @NFloat double y);

	@Generated
	@Selector("zoomOutWithX:y:")
	@ByValue
	public native CGAffineTransform zoomOutWithXY(@NFloat double x,
			@NFloat double y);

	@Generated
	@Selector("zoomWithScaleX:scaleY:")
	@ByValue
	public native CGAffineTransform zoomWithScaleXScaleY(@NFloat double scaleX,
			@NFloat double scaleY);

	@Generated
	@Selector("zoomWithScaleX:scaleY:x:y:")
	@ByValue
	public native CGAffineTransform zoomWithScaleXScaleYXY(
			@NFloat double scaleX, @NFloat double scaleY, @NFloat double x,
			@NFloat double y);
}