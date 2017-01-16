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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassName("_TtC6Charts12ChartDataSet")
@ObjCClassBinding
public class ChartDataSet extends ChartBaseDataSet {
	static {
		NatJ.register();
	}

	@Generated
	protected ChartDataSet(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addEntry:")
	public native boolean addEntry(ChartDataEntry e);

	@Generated
	@Selector("addEntryOrdered:")
	public native boolean addEntryOrdered(ChartDataEntry e);

	@Generated
	@Owned
	@Selector("alloc")
	public static native ChartDataSet alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("calcMinMax")
	public native void calcMinMax();

	@Generated
	@Selector("calcMinMaxXWithEntry:")
	public native void calcMinMaxXWithEntry(ChartDataEntry e);

	@Generated
	@Selector("calcMinMaxYFromX:toX:")
	public native void calcMinMaxYFromXToX(double fromX, double toX);

	@Generated
	@Selector("calcMinMaxYWithEntry:")
	public native void calcMinMaxYWithEntry(ChartDataEntry e);

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
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native ChartDataSet init();

	@Generated
	@Selector("initWithLabel:")
	public native ChartDataSet initWithLabel(String label);

	@Generated
	@Selector("initWithValues:")
	public native ChartDataSet initWithValues(
			NSArray<? extends ChartDataEntry> values);

	@Generated
	@Selector("initWithValues:label:")
	public native ChartDataSet initWithValuesLabel(
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
	@Selector("notifyDataSetChanged")
	public native void notifyDataSetChanged();

	@Generated
	@Selector("removeEntry:")
	public native boolean removeEntry(ChartDataEntry entry);

	@Generated
	@Selector("removeFirst")
	public native boolean removeFirst();

	@Generated
	@Selector("removeLast")
	public native boolean removeLast();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setValues:")
	public native void setValues(NSArray<? extends ChartDataEntry> value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("values")
	public native NSArray<? extends ChartDataEntry> values();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();

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