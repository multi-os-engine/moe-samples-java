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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.samples.simplechart.charts.protocol.IChartFillFormatter;
import org.moe.samples.simplechart.charts.protocol.ILineChartDataSet;
import org.moe.samples.simplechart.charts.protocol.LineChartDataProvider;

/**
 * Default formatter that calculates the position of the filled line.
 */
@Generated
@Library("Charts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ChartDefaultFillFormatter extends NSObject implements IChartFillFormatter {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartDefaultFillFormatter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartDefaultFillFormatter alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("block")
    @ObjCBlock(name = "call_block_ret")
    public native Block_block_ret block();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_block_ret {
        @Generated
        @NFloat
        double call_block_ret(@Mapped(ObjCObjectMapper.class) Object arg0, @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

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
    @Selector("getFillLinePositionWithDataSet:dataProvider:")
    @NFloat
    public native double getFillLinePositionWithDataSetDataProvider(
            @Mapped(ObjCObjectMapper.class) ILineChartDataSet dataSet,
            @Mapped(ObjCObjectMapper.class) LineChartDataProvider dataProvider);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartDefaultFillFormatter init();

    @Generated
    @Selector("initWithBlock:")
    public native ChartDefaultFillFormatter initWithBlock(
            @ObjCBlock(name = "call_initWithBlock") Block_initWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithBlock {
        @Generated
        @NFloat
        double call_initWithBlock(@Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    @Selector("setBlock:")
    public native void setBlock(@ObjCBlock(name = "call_setBlock") Block_setBlock value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setBlock {
        @Generated
        @NFloat
        double call_setBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @Mapped(ObjCObjectMapper.class) Object arg1);
    }

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

    @Generated
    @Selector("withBlock:")
    public static native ChartDefaultFillFormatter withBlock(@ObjCBlock(name = "call_withBlock") Block_withBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_withBlock {
        @Generated
        @NFloat
        double call_withBlock(@Mapped(ObjCObjectMapper.class) Object arg0, @Mapped(ObjCObjectMapper.class) Object arg1);
    }
}