package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
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
public class ChartHighlight extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartHighlight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartHighlight alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("axis")
    @NInt
    public native long axis();

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

    /**
     * the index of the data object - in case it refers to more than one
     */
    @Generated
    @Selector("dataIndex")
    @NInt
    public native long dataIndex();

    @Generated
    @Selector("dataSetIndex")
    @NInt
    public native long dataSetIndex();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public native String description();

    /**
     * the x-position (pixels) on which this highlight object was last drawn
     */
    @Generated
    @Selector("drawX")
    @NFloat
    public native double drawX();

    /**
     * the y-position (pixels) on which this highlight object was last drawn
     */
    @Generated
    @Selector("drawY")
    @NFloat
    public native double drawY();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ChartHighlight init();

    /**
     * \param x the x-value of the highlighted value
     * 
     * \param dataSetIndex the index of the DataSet the highlighted value belongs to
     * 
     * \param stackIndex references which value of a stacked-bar entry has been selected
     */
    @Generated
    @Selector("initWithX:dataSetIndex:stackIndex:")
    public native ChartHighlight initWithXDataSetIndexStackIndex(double x, @NInt long dataSetIndex,
            @NInt long stackIndex);

    /**
     * \param x the x-value of the highlighted value
     * 
     * \param y the y-value of the highlighted value
     * 
     * \param dataSetIndex the index of the DataSet the highlighted value belongs to
     * 
     * \param dataIndex The data index to search in (only used in CombinedChartView currently)
     */
    @Generated
    @Selector("initWithX:y:dataSetIndex:dataIndex:")
    public native ChartHighlight initWithXYDataSetIndexDataIndex(double x, double y, @NInt long dataSetIndex,
            @NInt long dataIndex);

    /**
     * \param x the x-value of the highlighted value
     * 
     * \param y the y-value of the highlighted value
     * 
     * \param xPx the x-pixel of the highlighted value
     * 
     * \param yPx the y-pixel of the highlighted value
     * 
     * \param dataIndex the index of the Data the highlighted value belongs to
     * 
     * \param dataSetIndex the index of the DataSet the highlighted value belongs to
     * 
     * \param stackIndex references which value of a stacked-bar entry has been selected
     * 
     * \param axis the axis the highlighted value belongs to
     */
    @Generated
    @Selector("initWithX:y:xPx:yPx:dataIndex:dataSetIndex:stackIndex:axis:")
    public native ChartHighlight initWithXYXPxYPxDataIndexDataSetIndexStackIndexAxis(double x, double y,
            @NFloat double xPx, @NFloat double yPx, @NInt long dataIndex, @NInt long dataSetIndex,
            @NInt long stackIndex, @NInt long axis);

    /**
     * \param x the x-value of the highlighted value
     * 
     * \param y the y-value of the highlighted value
     * 
     * \param xPx the x-pixel of the highlighted value
     * 
     * \param yPx the y-pixel of the highlighted value
     * 
     * \param dataIndex the index of the Data the highlighted value belongs to
     * 
     * \param dataSetIndex the index of the DataSet the highlighted value belongs to
     * 
     * \param stackIndex references which value of a stacked-bar entry has been selected
     * 
     * \param axis the axis the highlighted value belongs to
     */
    @Generated
    @Selector("initWithX:y:xPx:yPx:dataSetIndex:axis:")
    public native ChartHighlight initWithXYXPxYPxDataSetIndexAxis(double x, double y, @NFloat double xPx,
            @NFloat double yPx, @NInt long dataSetIndex, @NInt long axis);

    /**
     * \param x the x-value of the highlighted value
     * 
     * \param y the y-value of the highlighted value
     * 
     * \param xPx the x-pixel of the highlighted value
     * 
     * \param yPx the y-pixel of the highlighted value
     * 
     * \param dataSetIndex the index of the DataSet the highlighted value belongs to
     * 
     * \param stackIndex references which value of a stacked-bar entry has been selected
     * 
     * \param axis the axis the highlighted value belongs to
     */
    @Generated
    @Selector("initWithX:y:xPx:yPx:dataSetIndex:stackIndex:axis:")
    public native ChartHighlight initWithXYXPxYPxDataSetIndexStackIndexAxis(double x, double y, @NFloat double xPx,
            @NFloat double yPx, @NInt long dataSetIndex, @NInt long stackIndex, @NInt long axis);

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
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("isStacked")
    public native boolean isStacked();

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

    /**
     * the index of the data object - in case it refers to more than one
     */
    @Generated
    @Selector("setDataIndex:")
    public native void setDataIndex(@NInt long value);

    /**
     * Sets the x- and y-position (pixels) where this highlight was last drawn.
     */
    @Generated
    @Selector("setDrawWithPt:")
    public native void setDrawWithPt(@ByValue CGPoint pt);

    /**
     * Sets the x- and y-position (pixels) where this highlight was last drawn.
     */
    @Generated
    @Selector("setDrawWithX:y:")
    public native void setDrawWithXY(@NFloat double x, @NFloat double y);

    /**
     * the x-position (pixels) on which this highlight object was last drawn
     */
    @Generated
    @Selector("setDrawX:")
    public native void setDrawX(@NFloat double value);

    /**
     * the y-position (pixels) on which this highlight object was last drawn
     */
    @Generated
    @Selector("setDrawY:")
    public native void setDrawY(@NFloat double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("stackIndex")
    @NInt
    public native long stackIndex();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("x")
    public native double x();

    @Generated
    @Selector("xPx")
    @NFloat
    public native double xPx();

    @Generated
    @Selector("y")
    public native double y();

    @Generated
    @Selector("yPx")
    @NFloat
    public native double yPx();
}