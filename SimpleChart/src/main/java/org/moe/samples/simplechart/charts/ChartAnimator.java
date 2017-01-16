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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.ChartAnimatorDelegate;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartAnimator extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartAnimator(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartAnimator alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("animateWithXAxisDuration:")
	public native void animateWithXAxisDuration(double xAxisDuration);

	@Generated
	@Selector("animateWithXAxisDuration:easing:")
	public native void animateWithXAxisDurationEasing(
			double xAxisDuration,
			@ObjCBlock(name = "call_animateWithXAxisDurationEasing") Block_animateWithXAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationEasing {
		@Generated
		double call_animateWithXAxisDurationEasing(double arg0, double arg1);
	}

	@Generated
	@Selector("animateWithXAxisDuration:easingOption:")
	public native void animateWithXAxisDurationEasingOption(
			double xAxisDuration, @NInt long easingOption);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:")
	public native void animateWithXAxisDurationYAxisDuration(
			double xAxisDuration, double yAxisDuration);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easing:")
	public native void animateWithXAxisDurationYAxisDurationEasing(
			double xAxisDuration,
			double yAxisDuration,
			@ObjCBlock(name = "call_animateWithXAxisDurationYAxisDurationEasing") Block_animateWithXAxisDurationYAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationYAxisDurationEasing {
		@Generated
		double call_animateWithXAxisDurationYAxisDurationEasing(double arg0,
				double arg1);
	}

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easingOption:")
	public native void animateWithXAxisDurationYAxisDurationEasingOption(
			double xAxisDuration, double yAxisDuration, @NInt long easingOption);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easingOptionX:easingOptionY:")
	public native void animateWithXAxisDurationYAxisDurationEasingOptionXEasingOptionY(
			double xAxisDuration, double yAxisDuration,
			@NInt long easingOptionX, @NInt long easingOptionY);

	@Generated
	@Selector("animateWithXAxisDuration:yAxisDuration:easingX:easingY:")
	public native void animateWithXAxisDurationYAxisDurationEasingXEasingY(
			double xAxisDuration,
			double yAxisDuration,
			@ObjCBlock(name = "call_animateWithXAxisDurationYAxisDurationEasingXEasingY_2") Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_2 easingX,
			@ObjCBlock(name = "call_animateWithXAxisDurationYAxisDurationEasingXEasingY_3") Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_3 easingY);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_2 {
		@Generated
		double call_animateWithXAxisDurationYAxisDurationEasingXEasingY_2(
				double arg0, double arg1);
	}

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithXAxisDurationYAxisDurationEasingXEasingY_3 {
		@Generated
		double call_animateWithXAxisDurationYAxisDurationEasingXEasingY_3(
				double arg0, double arg1);
	}

	@Generated
	@Selector("animateWithYAxisDuration:")
	public native void animateWithYAxisDuration(double yAxisDuration);

	@Generated
	@Selector("animateWithYAxisDuration:easing:")
	public native void animateWithYAxisDurationEasing(
			double yAxisDuration,
			@ObjCBlock(name = "call_animateWithYAxisDurationEasing") Block_animateWithYAxisDurationEasing easing);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_animateWithYAxisDurationEasing {
		@Generated
		double call_animateWithYAxisDurationEasing(double arg0, double arg1);
	}

	@Generated
	@Selector("animateWithYAxisDuration:easingOption:")
	public native void animateWithYAxisDurationEasingOption(
			double yAxisDuration, @NInt long easingOption);

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
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native ChartAnimatorDelegate delegate();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartAnimator init();

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
	@Selector("phaseX")
	public native double phaseX();

	@Generated
	@Selector("phaseY")
	public native double phaseY();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) ChartAnimatorDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) ChartAnimatorDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setPhaseX:")
	public native void setPhaseX(double value);

	@Generated
	@Selector("setPhaseY:")
	public native void setPhaseY(double value);

	@Generated
	@Selector("setStopBlock:")
	public native void setStopBlock(
			@ObjCBlock(name = "call_setStopBlock") Block_setStopBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setStopBlock {
		@Generated
		void call_setStopBlock();
	}

	@Generated
	@Selector("setUpdateBlock:")
	public native void setUpdateBlock(
			@ObjCBlock(name = "call_setUpdateBlock") Block_setUpdateBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setUpdateBlock {
		@Generated
		void call_setUpdateBlock();
	}

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("stop")
	public native void stop();

	@Generated
	@Selector("stopBlock")
	@ObjCBlock(name = "call_stopBlock_ret")
	public native Block_stopBlock_ret stopBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_stopBlock_ret {
		@Generated
		void call_stopBlock_ret();
	}

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("updateBlock")
	@ObjCBlock(name = "call_updateBlock_ret")
	public native Block_updateBlock_ret updateBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_updateBlock_ret {
		@Generated
		void call_updateBlock_ret();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}