//
//
//  Modified by Orb on 3/27/14.
//  Copyright (C) 2017 Migeran
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// Special thanks to: https://github.com/yickhong/YHMapDemo/tree/master/YHMapDemo
//

package org.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import android.util.Log;

import apple.c.Globals;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.enums.CGPathDrawingMode;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGRect;
import apple.mapkit.MKCircle;
import apple.mapkit.MKCircleRenderer;
import apple.mapkit.c.MapKit;
import apple.mapkit.struct.MKMapPoint;
import apple.mapkit.struct.MKMapRect;

import static apple.c.Globals.dispatch_get_main_queue;
import static apple.coregraphics.c.CoreGraphics.CGContextSetFillColorWithColor;
import static apple.coregraphics.c.CoreGraphics.CGContextSetLineWidth;
import static apple.coregraphics.c.CoreGraphics.CGContextSetShouldAntialias;
import static apple.uikit.c.UIKit.UIGraphicsPopContext;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("CustomMKCircleOverlay")
@RegisterOnStartup
public class CustomMKCircleOverlay extends MKCircleRenderer {

    private static final String TAG = "CustomMKCircleOverlay";

    protected CustomMKCircleOverlay(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native CustomMKCircleOverlay alloc();

    @Selector("init")
    public native CustomMKCircleOverlay init();

    @Selector("initWithCircle:")
    public native CustomMKCircleOverlay initWithCircle(MKCircle circle);

    private double MINDIS;
    private double MAXDIS;
    public MKMapRect circlebounds;
    private double alpha;
    private double border;


    private double MINDISTANCE = 100.0;
    private double MAXDISTANCE = 2000.0;
    private double DEFAULT_ALPHA = 0.3;
    private double DEFAULT_BORDER = 15;

    private double radius;
    private double mapRadius;

    private CustomMapDelegate delegate;

    public CustomMKCircleOverlay initWithCircle2(MKCircle circle, float radius, int min,
                                                         int max) {
        CustomMKCircleOverlay self = initWithCircle(circle);

        if(max > min && min > 0){
            MINDIS = min;
            MAXDIS = max;
        }else if(min > 0){
            Log.d(TAG, "Max distance smaller than Min");
            MINDIS = min;
            MAXDIS = min;
        }else{
            Log.d(TAG, "Trying to set a negative radius--Using Default");
            MINDIS = MINDISTANCE;
            MAXDIS = MAXDISTANCE;
        }
        if(radius > 0){
            mapRadius = radius;
        }
        commonInit();
        return self;
    }

    public CustomMKCircleOverlay initWithCircle1(MKCircle circle, float radius) {
        CustomMKCircleOverlay self = initWithCircle(circle);
        MINDIS = MINDISTANCE;
        MAXDIS = MAXDISTANCE;
        if(radius > 0){
            mapRadius = radius;
        }
        commonInit();
        return self;
    }

    public CustomMKCircleOverlay initWithCircle0(MKCircle circle) {
        CustomMKCircleOverlay self = initWithCircle(circle);
        MINDIS = MINDISTANCE;
        MAXDIS = MAXDISTANCE;
        commonInit();
        return self;
    }

    public void commonInit() {
        alpha = DEFAULT_ALPHA;
        border = DEFAULT_BORDER;
    }

    public void setCircleRadius(double radius) {
        if(radius > MAXDIS){
            mapRadius = MAXDIS;
        }else if(radius < MINDIS){
            mapRadius = MINDIS;
        }else{
            mapRadius = radius;
        }
        invalidatePath();
    }

    public double getCircleRadius() {
        return mapRadius;
    }


    @Generated
    @Selector("drawMapRect:zoomScale:inContext:")
    public void drawMapRectZoomScaleInContext(@ByValue MKMapRect mapRect, @NFloat double zoomScale,
                                                     CGContextRef ctx) {

        MKMapPoint mpoint = MapKit.MKMapPointForCoordinate(overlay().coordinate());

        double radiusAtLatitude = (mapRadius) * MapKit.MKMapPointsPerMeterAtLatitude(overlay()
                .coordinate().latitude());

        circlebounds = MapKit.MKMapRectMake(mpoint.x(), mpoint.y(), radiusAtLatitude *2,
                radiusAtLatitude * 2);
        CGRect overlayRect = rectForMapRect(circlebounds);


        CoreGraphics.CGContextSetStrokeColorWithColor(ctx, fillColor().CGColor());
        CGContextSetFillColorWithColor(ctx, fillColor().colorWithAlphaComponent(alpha).CGColor());
        CGContextSetLineWidth(ctx, border);
        CGContextSetShouldAntialias(ctx, true);

        CoreGraphics.CGContextAddArc(ctx, overlayRect.origin().x(), overlayRect.origin().y(),
                radiusAtLatitude, 0, 2 * Math.PI, 0);
        CoreGraphics.CGContextDrawPath(ctx, CGPathDrawingMode.FillStroke);

        if(delegate != null) {
            Globals.dispatch_async(Globals.dispatch_get_main_queue(), () -> {
                delegate.onRadiusChange(mapRadius);
            });
        }

        UIGraphicsPopContext();
    }

    public void setDelegate(CustomMapDelegate delegate) {
        this.delegate = delegate;
    }

    public interface CustomMapDelegate {
        void onRadiusChange(double radius);
    }
}
