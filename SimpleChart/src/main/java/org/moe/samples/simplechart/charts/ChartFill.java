package org.moe.samples.simplechart.charts;


import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGGradientRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.opaque.CGLayerRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
import apple.uikit.UIImage;
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
public class ChartFill extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ChartFill(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ChartFill alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("color")
    public native CGColorRef color();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Draws the provided path in filled mode with the provided area
     */
    @Generated
    @Selector("fillPathWithContext:rect:")
    public native void fillPathWithContextRect(CGContextRef context, @ByValue CGRect rect);

    @Generated
    @Selector("fillWithCGColor:")
    public static native ChartFill fillWithCGColor(CGColorRef CGColor);

    @Generated
    @Selector("fillWithCGImage:")
    public static native ChartFill fillWithCGImage(CGImageRef CGImage);

    @Generated
    @Selector("fillWithCGImage:tiled:")
    public static native ChartFill fillWithCGImageTiled(CGImageRef CGImage, boolean tiled);

    @Generated
    @Selector("fillWithCGLayer:")
    public static native ChartFill fillWithCGLayer(CGLayerRef CGLayer);

    @Generated
    @Selector("fillWithColor:")
    public static native ChartFill fillWithColor(UIColor color);

    @Generated
    @Selector("fillWithImage:")
    public static native ChartFill fillWithImage(UIImage image);

    @Generated
    @Selector("fillWithImage:tiled:")
    public static native ChartFill fillWithImageTiled(UIImage image, boolean tiled);

    @Generated
    @Selector("fillWithLinearGradient:angle:")
    public static native ChartFill fillWithLinearGradientAngle(CGGradientRef linearGradient, @NFloat double angle);

    @Generated
    @Selector("fillWithRadialGradient:")
    public static native ChartFill fillWithRadialGradient(CGGradientRef radialGradient);

    @Generated
    @Selector("fillWithRadialGradient:startOffsetPercent:startRadiusPercent:endOffsetPercent:endRadiusPercent:")
    public static native ChartFill fillWithRadialGradientStartOffsetPercentStartRadiusPercentEndOffsetPercentEndRadiusPercent(
            CGGradientRef radialGradient, @ByValue CGPoint startOffsetPercent, @NFloat double startRadiusPercent,
            @ByValue CGPoint endOffsetPercent, @NFloat double endRadiusPercent);

    @Generated
    @Selector("gradient")
    public native CGGradientRef gradient();

    @Generated
    @Selector("gradientAngle")
    @NFloat
    public native double gradientAngle();

    @Generated
    @Selector("gradientEndOffsetPercent")
    @ByValue
    public native CGPoint gradientEndOffsetPercent();

    @Generated
    @Selector("gradientEndRadiusPercent")
    @NFloat
    public native double gradientEndRadiusPercent();

    @Generated
    @Selector("gradientStartOffsetPercent")
    @ByValue
    public native CGPoint gradientStartOffsetPercent();

    @Generated
    @Selector("gradientStartRadiusPercent")
    @NFloat
    public native double gradientStartRadiusPercent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("image")
    public native CGImageRef image();

    @Generated
    @Selector("init")
    public native ChartFill init();

    @Generated
    @Selector("initWithCGColor:")
    public native ChartFill initWithCGColor(CGColorRef CGColor);

    @Generated
    @Selector("initWithCGImage:")
    public native ChartFill initWithCGImage(CGImageRef CGImage);

    @Generated
    @Selector("initWithCGImage:tiled:")
    public native ChartFill initWithCGImageTiled(CGImageRef CGImage, boolean tiled);

    @Generated
    @Selector("initWithCGLayer:")
    public native ChartFill initWithCGLayer(CGLayerRef CGLayer);

    @Generated
    @Selector("initWithColor:")
    public native ChartFill initWithColor(UIColor color);

    @Generated
    @Selector("initWithImage:")
    public native ChartFill initWithImage(UIImage image);

    @Generated
    @Selector("initWithImage:tiled:")
    public native ChartFill initWithImageTiled(UIImage image, boolean tiled);

    @Generated
    @Selector("initWithLinearGradient:angle:")
    public native ChartFill initWithLinearGradientAngle(CGGradientRef linearGradient, @NFloat double angle);

    @Generated
    @Selector("initWithRadialGradient:")
    public native ChartFill initWithRadialGradient(CGGradientRef radialGradient);

    @Generated
    @Selector("initWithRadialGradient:startOffsetPercent:startRadiusPercent:endOffsetPercent:endRadiusPercent:")
    public native ChartFill initWithRadialGradientStartOffsetPercentStartRadiusPercentEndOffsetPercentEndRadiusPercent(
            CGGradientRef radialGradient, @ByValue CGPoint startOffsetPercent, @NFloat double startRadiusPercent,
            @ByValue CGPoint endOffsetPercent, @NFloat double endRadiusPercent);

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
    @Selector("layer")
    public native CGLayerRef layer();

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
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}