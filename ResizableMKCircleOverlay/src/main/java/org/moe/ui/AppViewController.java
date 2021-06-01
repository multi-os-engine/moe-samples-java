//
//  Created by Michael on 3/3/14.
//  Copyright (c) 2014 Orb. All rights reserved.
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

package org.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.c.Globals;
import apple.coregraphics.struct.CGPoint;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSSet;
import apple.mapkit.MKAnnotationView;
import apple.mapkit.MKCircle;
import apple.mapkit.MKMapView;
import apple.mapkit.MKOverlayRenderer;
import apple.mapkit.MKPinAnnotationView;
import apple.mapkit.MKPointAnnotation;
import apple.mapkit.MKUserLocation;
import apple.mapkit.enums.MKAnnotationViewDragState;
import apple.mapkit.enums.MKPinAnnotationColor;
import apple.mapkit.protocol.MKAnnotation;
import apple.mapkit.protocol.MKMapViewDelegate;
import apple.mapkit.protocol.MKOverlay;
import apple.mapkit.struct.MKCoordinateRegion;
import apple.mapkit.struct.MKCoordinateSpan;
import apple.mapkit.struct.MKMapPoint;
import apple.mapkit.struct.MKMapRect;
import apple.uikit.UIColor;
import apple.uikit.UIEvent;
import apple.uikit.UILabel;
import apple.uikit.UITouch;
import apple.uikit.UIViewController;

import static apple.corelocation.c.CoreLocation.CLLocationCoordinate2DMake;
import static apple.mapkit.c.MapKit.MKCoordinateRegionMakeWithDistance;
import static apple.mapkit.c.MapKit.MKMapPointForCoordinate;
import static apple.mapkit.c.MapKit.MKMapPointsPerMeterAtLatitude;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
public class AppViewController extends UIViewController implements MKMapViewDelegate, CustomMKCircleOverlay.CustomMapDelegate {

    private static final String TAG = "AppViewController";

    /* Default radius size in PX*/
    private double circleRadius = 0;

    /* Default Location */
    private double TOKYO_LATITUDE = 35.6895;
    private double TOKYO_LONGITUDE = 139.6917;
    private double ZOOM_DISTANCE = 500;
    private double DEFAULT_RADIUS = 100;


    private double oldoffset;
    private double setRadius = DEFAULT_RADIUS;

    private boolean panEnabled = true;
    private CLLocationCoordinate2D droppedAt;
    private MKMapPoint lastPoint;
    private CustomMKCircleOverlay circleView;

    private MKCircle circle;
    private MKPointAnnotation point;

    @Owned
    @Selector("alloc")
    public static native AppViewController alloc();

    @Selector("init")
    public native AppViewController init();

    protected AppViewController(Pointer peer) {
        super(peer);
    }

    @Selector("mapView")
    @Property
    public native MKMapView mapView();

    @Selector("distanceLabel")
    @Property
    public native UILabel distanceLabel();

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        mapView().setDelegate(this);

        droppedAt = CLLocationCoordinate2DMake(TOKYO_LATITUDE, TOKYO_LONGITUDE);


        MKCoordinateRegion region = MKCoordinateRegionMakeWithDistance(droppedAt,ZOOM_DISTANCE,ZOOM_DISTANCE);
        mapView().setRegionAnimated(mapView().regionThatFits(region), true);

        /* Add Custom MKCircle with Annotation*/
        addCircle();

        /* Setup Touch listener for custom circle */
        WildcardGestureRecognizer tapInterceptor = WildcardGestureRecognizer.alloc().init();

        tapInterceptor.touchesBeganCallback = new WildcardGestureRecognizer.TouchesEventBlock() {
            @Override
            public void callback(NSSet touches, UIEvent event) {
                UITouch touch = (UITouch) touches.anyObject();
                CGPoint p = touch.locationInView(mapView());

                CLLocationCoordinate2D coord = mapView().convertPointToCoordinateFromView(p,
                        mapView());
                MKMapPoint mapPoint = MKMapPointForCoordinate(coord);

                MKMapRect mapRect = circleView.circlebounds;


                double xPath = mapPoint.x() - (mapRect.origin().x() - (mapRect.size().width()/2));
                double yPath = mapPoint.y() - (mapRect.origin().y() - (mapRect.size().height()/2));

                /* Test if the touch was within the bounds of the circle */
                if(xPath >= 0 && yPath >= 0 && xPath < mapRect.size().width() && yPath < mapRect
                        .size().height()){
                    System.out.println(TAG + ": " + "Disable Map Panning");

                    /*
                     This block is to ensure scrollEnabled = NO happens before the any move event.
                     */
                    Globals.dispatch_async(Globals.dispatch_get_main_queue(), new Globals.Block_dispatch_async() {
                        @Override
                        public void call_dispatch_async() {
                            mapView().setScrollEnabled(false);
                            panEnabled = false;
                            oldoffset = circleView.getCircleRadius();
                        }
                    });

                } else{
                    mapView().setScrollEnabled(true);
                }
                lastPoint = mapPoint;
            }
        };

        tapInterceptor.touchesMovedCallback = new WildcardGestureRecognizer.TouchesEventBlock() {
            @Override
            public void callback(NSSet touches, UIEvent event) {
                if (!panEnabled && event.allTouches().count() == 1) {
                    UITouch touch = (UITouch) touches.anyObject();
                    CGPoint p = touch.locationInView(mapView());

                    CLLocationCoordinate2D coord = mapView().convertPointToCoordinateFromView(p,
                            mapView());
                    MKMapPoint mapPoint = MKMapPointForCoordinate(coord);

                    MKMapRect mRect = mapView().visibleMapRect();
                    MKMapRect circleRect = circleView.circlebounds;
                    //NSLog(@"radius: %f", [circleView getCircleRadius]);

                    /* Check if the map needs to zoom */
                    if (circleRect.size().width() > mRect.size().width() * .55) {
                        MKCoordinateRegion region = new MKCoordinateRegion();
                        //Set Zoom level using Span
                        MKCoordinateSpan span = new MKCoordinateSpan();
                        region.setCenter(droppedAt);
                        span.setLatitudeDelta(mapView().region().span().latitudeDelta() * 2.0);
                        span.setLongitudeDelta(mapView().region().span().longitudeDelta() * 2.0);
                        region.setSpan(span);
                        mapView().setRegionAnimated(region, true);
                    }
                    if (circleRect.size().width() < mRect.size().width() * .25) {
                        MKCoordinateRegion region = new MKCoordinateRegion();
                        //Set Zoom level using Span
                        MKCoordinateSpan span = new MKCoordinateSpan();
                        region.setCenter(droppedAt);
                        span.setLatitudeDelta(mapView().region().span().latitudeDelta() / 3.0002);
                        span.setLongitudeDelta(mapView().region().span().longitudeDelta() / 3.0002);
                        region.setSpan(span);
                        mapView().setRegionAnimated(region, true);
                    }


                    double meterDistance = (mapPoint.x() - lastPoint.x())
                            / MKMapPointsPerMeterAtLatitude(mapView().centerCoordinate()
                            .latitude()) + oldoffset;
                    if (meterDistance > 0) {
                        circleView.setCircleRadius(meterDistance);
                    }
                    setRadius = circleView.getCircleRadius();

                    String distance;

                    if (setRadius > 1000) {
                        distance = "" + setRadius / 1000 + " km";
                    } else {
                        distance = "" + setRadius + " m";
                    }

                    distanceLabel().setText(distance);
                }
            }
        };

        tapInterceptor.touchesEndedCallback = new WildcardGestureRecognizer.TouchesEventBlock() {
            @Override
            public void callback(NSSet touches, UIEvent event) {
                panEnabled = true;
                //NSLog(@"Enable Map Panning");

                mapView().setZoomEnabled(true);
                mapView().setScrollEnabled(true);
                mapView().setUserInteractionEnabled(true);
            }
        };

        mapView().addGestureRecognizer(tapInterceptor);
    }


    @Override
    public void mapViewAnnotationViewDidChangeDragStateFromOldState(MKMapView mapView, MKAnnotationView view, @NUInt long newState, @NUInt long oldState) {

        if(newState == MKAnnotationViewDragState.Starting){
            panEnabled = true;
        }
        if (newState == MKAnnotationViewDragState.Ending) {
            droppedAt = view.annotation().coordinate();
            //NSLog(@"dropped at %f,%f", droppedAt.latitude, droppedAt.longitude);
            addCircle();
        }

    }

    @Override
    public MKAnnotationView mapViewViewForAnnotation(MKMapView mapView, MKAnnotation annotation) {

        if (annotation instanceof MKUserLocation) {
            return null;
        }
        MKPinAnnotationView annotationView = MKPinAnnotationView.alloc()
                .initWithAnnotationReuseIdentifier((MKAnnotation) annotation, "pin");
        annotationView.setDraggable(true);
        annotationView.setPinColor(MKPinAnnotationColor.Purple);

        annotationView.setSelectedAnimated(true, true);
        return annotationView.init();
    }

    @Override
    public MKOverlayRenderer mapViewRendererForOverlay(MKMapView mapView, MKOverlay overlay) {
        circleView = CustomMKCircleOverlay.alloc().initWithCircle0((MKCircle) overlay);
        circleView.setFillColor(UIColor.redColor());
        circleView.setDelegate(this);

        return circleView;
    }

    public void addCircle() {

        if(circle != null)
        mapView().removeOverlay(circle);
        circle = MKCircle.circleWithCenterCoordinateRadius(droppedAt, 2000.0); //Set the radius
        // to the maximum circle size or larger

        mapView().addOverlay(circle);

        circleView.setCircleRadius(setRadius);

        if(point == null){
            point = MKPointAnnotation.alloc().init();

            point.setCoordinate(droppedAt);
            mapView().addAnnotation(point);
        }
    }

    public void didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning();
    }

    @Override
    public void onRadiusChange(double radius) {
        System.out.println(TAG + ": " +  "on radius change: " + radius);
    }
}
