package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts19AnimatedZoomViewJob")
@ObjCClassBinding
public class AnimatedZoomViewJob extends AnimatedViewPortJob {
	static {
		NatJ.register();
	}

	@Generated
	protected AnimatedZoomViewJob(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native AnimatedZoomViewJob alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

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
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native AnimatedZoomViewJob init();

	@Generated
	@Selector("initWithViewPortHandler:transformer:view:yAxis:xAxisRange:scaleX:scaleY:xOrigin:yOrigin:zoomCenterX:zoomCenterY:zoomOriginX:zoomOriginY:duration:easing:")
	public native AnimatedZoomViewJob initWithViewPortHandlerTransformerViewYAxisXAxisRangeScaleXScaleYXOriginYOriginZoomCenterXZoomCenterYZoomOriginXZoomOriginYDurationEasing(
			ChartViewPortHandler viewPortHandler,
			ChartTransformer transformer,
			ChartViewBase view,
			ChartYAxis yAxis,
			double xAxisRange,
			@NFloat double scaleX,
			@NFloat double scaleY,
			@NFloat double xOrigin,
			@NFloat double yOrigin,
			@NFloat double zoomCenterX,
			@NFloat double zoomCenterY,
			@NFloat double zoomOriginX,
			@NFloat double zoomOriginY,
			double duration,
			@ObjCBlock(name = "call_initWithViewPortHandlerTransformerViewYAxisXAxisRangeScaleXScaleYXOriginYOriginZoomCenterXZoomCenterYZoomOriginXZoomOriginYDurationEasing") Block_initWithViewPortHandlerTransformerViewYAxisXAxisRangeScaleXScaleYXOriginYOriginZoomCenterXZoomCenterYZoomOriginXZoomOriginYDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_initWithViewPortHandlerTransformerViewYAxisXAxisRangeScaleXScaleYXOriginYOriginZoomCenterXZoomCenterYZoomOriginXZoomOriginYDurationEasing {
		@Generated
		double call_initWithViewPortHandlerTransformerViewYAxisXAxisRangeScaleXScaleYXOriginYOriginZoomCenterXZoomCenterYZoomOriginXZoomOriginYDurationEasing(
				double arg0, double arg1);
	}

	@Generated
	@Selector("initWithViewPortHandler:xValue:yValue:transformer:view:")
	public native AnimatedZoomViewJob initWithViewPortHandlerXValueYValueTransformerView(
			ChartViewPortHandler viewPortHandler, double xValue, double yValue,
			ChartTransformer transformer, ChartViewBase view);

	@Generated
	@Selector("initWithViewPortHandler:xValue:yValue:transformer:view:xOrigin:yOrigin:duration:easing:")
	public native AnimatedZoomViewJob initWithViewPortHandlerXValueYValueTransformerViewXOriginYOriginDurationEasing(
			ChartViewPortHandler viewPortHandler,
			double xValue,
			double yValue,
			ChartTransformer transformer,
			ChartViewBase view,
			@NFloat double xOrigin,
			@NFloat double yOrigin,
			double duration,
			@ObjCBlock(name = "call_initWithViewPortHandlerXValueYValueTransformerViewXOriginYOriginDurationEasing") AnimatedViewPortJob.Block_initWithViewPortHandlerXValueYValueTransformerViewXOriginYOriginDurationEasing easing);

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
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}