// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.samples.museummap.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.museummap.common.MuseumSearchEngine;
import org.moe.samples.museummap.common.model.Museum;
import org.moe.samples.museummap.common.model.db.DataSource;
import org.moe.samples.museummap.ios.db.SQLiteDatabaseHelper;

import java.util.ArrayList;

import apple.c.Globals;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSMutableArray;
import apple.foundation.NSMutableDictionary;
import apple.mapkit.MKAnnotationView;
import apple.mapkit.MKMapView;
import apple.mapkit.MKPinAnnotationView;
import apple.mapkit.MKPointAnnotation;
import apple.mapkit.protocol.MKAnnotation;
import apple.mapkit.protocol.MKMapViewDelegate;
import apple.uikit.NSLayoutConstraint;
import apple.uikit.UIAlertView;
import apple.uikit.UIButton;
import apple.uikit.UIColor;
import apple.uikit.UITextField;
import apple.uikit.UIViewController;
import apple.uikit.enums.UIButtonType;
import apple.uikit.enums.UIControlEvents;
import apple.uikit.enums.UIControlState;
import apple.uikit.enums.UIRectEdge;
import apple.uikit.enums.UIReturnKeyType;
import apple.uikit.enums.UITextBorderStyle;
import apple.uikit.protocol.UITextFieldDelegate;

public class MuseumMapController extends UIViewController {

    private static final String PointAnnotationViewID = "PointAnnotation";

    private UITextField pinLabelField;
    private Thread updaterThread;
    private MKMapView mapView;
    private DataSource source;

    private final NSMutableDictionary views = NSMutableDictionary.alloc().init();
    private final NSMutableArray constraints = NSMutableArray.alloc().init();

    private final UITextFieldDelegate tfdelegate = new UITextFieldDelegate() {

        @Override
        public boolean textFieldShouldReturn(UITextField textField) {
            textField.resignFirstResponder();
            return false;
        }
    };

    public static native MuseumMapController alloc();

    @Override
    public native MuseumMapController init();

    protected MuseumMapController(Pointer peer) {
        super(peer);
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        source = new DataSource(new SQLiteDatabaseHelper("local.db"));
        source.open();

        setTitle("Museum Map");

        setEdgesForExtendedLayout(UIRectEdge.None);
        view().setBackgroundColor(UIColor.whiteColor());

        views.put("bottomGuide", this.bottomLayoutGuide());
        views.put("topGuide", this.topLayoutGuide());

        mapView = MKMapView.alloc().init();
        mapView.setTranslatesAutoresizingMaskIntoConstraints(false);
        view().addSubview(mapView);
        views.put("map", mapView);

        pinLabelField = UITextField.alloc().init();
        pinLabelField.setTranslatesAutoresizingMaskIntoConstraints(false);
        view().addSubview(pinLabelField);
        views.put("pinLabel", pinLabelField);

        mapView.setDelegate(new MKMapViewDelegate() {

            @Override
            public void mapViewDidSelectAnnotationView(MKMapView mapView, MKAnnotationView view) {
                MKPointAnnotation ann = (MKPointAnnotation) view.annotation();
                pinLabelField.setText(ann.title());
                MKPinAnnotationView pa = (MKPinAnnotationView) view;
                pa.setPinTintColor(MKPinAnnotationView.greenPinColor());
            }

            @Override
            public void mapViewDidDeselectAnnotationView(MKMapView mapView, MKAnnotationView view) {
                MKPinAnnotationView pa = (MKPinAnnotationView) view;
                pinLabelField.setText("");
                pa.setPinTintColor(MKPinAnnotationView.redPinColor());
            }

            @Override
            public MKAnnotationView mapViewViewForAnnotation(MKMapView mapView, Object annotation) {
                MKPinAnnotationView view = (MKPinAnnotationView) mapView
                        .dequeueReusableAnnotationViewWithIdentifier(PointAnnotationViewID);
                if (view == null) {
                    view = MKPinAnnotationView.alloc().initWithAnnotationReuseIdentifier(
                            (MKAnnotation) annotation, PointAnnotationViewID);
                } else {
                    view.setAnnotation((MKAnnotation) annotation);
                }
                view.setAnimatesDrop(true);
                return view;
            }
        });

        view().addSubview(mapView);

        pinLabelField.setReturnKeyType(UIReturnKeyType.Done);
        pinLabelField.setBorderStyle(UITextBorderStyle.RoundedRect);
        pinLabelField.setDelegate(tfdelegate);
        view().addSubview(pinLabelField);

        UIButton addPinBtn = UIButton.buttonWithType(UIButtonType.RoundedRect);
        addPinBtn.setTranslatesAutoresizingMaskIntoConstraints(false);
        addPinBtn.setTitleForState("+", UIControlState.Normal);
        views.put("addPinBtn", addPinBtn);
        view().addSubview(addPinBtn);

        addPinBtn.addTargetActionForControlEvents(this, new SEL("annotationAction:"),
                UIControlEvents.TouchUpInside);
        view().addSubview(addPinBtn);

        UIButton remPinBtn = UIButton.buttonWithType(UIButtonType.RoundedRect);
        remPinBtn.setTranslatesAutoresizingMaskIntoConstraints(false);
        remPinBtn.setTitleForState("-", UIControlState.Normal);
        views.put("remPinBtn", remPinBtn);
        view().addSubview(remPinBtn);

        remPinBtn.addTargetActionForControlEvents(this, new SEL("annotationAction:"),
                UIControlEvents.TouchUpInside);
        view().addSubview(remPinBtn);

        UIButton updatePinBtn = UIButton.buttonWithType(UIButtonType.RoundedRect);
        updatePinBtn.setTranslatesAutoresizingMaskIntoConstraints(false);
        updatePinBtn.setTitleForState("Update", UIControlState.Normal);
        views.put("updatePinBtn", updatePinBtn);
        view().addSubview(updatePinBtn);

        updatePinBtn.addTargetActionForControlEvents(this, new SEL("annotationAction:"),
                UIControlEvents.TouchUpInside);
        view().addSubview(updatePinBtn);

        constraints.addObjectsFromArray(NSLayoutConstraint
                .constraintsWithVisualFormatOptionsMetricsViews("H:|-2-[pinLabel]-2-|", 0, null,
                        views));
        constraints.addObjectsFromArray(NSLayoutConstraint
                .constraintsWithVisualFormatOptionsMetricsViews
                        ("H:|-[updatePinBtn]-[addPinBtn]-[remPinBtn]-|", 0, null, views));
        constraints.addObjectsFromArray(NSLayoutConstraint
                .constraintsWithVisualFormatOptionsMetricsViews("H:|-0-[map]-0-|", 0, null, views));
        constraints.addObjectsFromArray(NSLayoutConstraint
                .constraintsWithVisualFormatOptionsMetricsViews
                        ("V:[topGuide]-[pinLabel]-[updatePinBtn]-[map]-0-[bottomGuide]", 0, null,
                                views));
        constraints.addObjectsFromArray(NSLayoutConstraint
                .constraintsWithVisualFormatOptionsMetricsViews
                        ("V:[topGuide]-[pinLabel]-[addPinBtn]-[map]-0-[bottomGuide]", 0, null,
                                views));
        constraints.addObjectsFromArray(NSLayoutConstraint
                .constraintsWithVisualFormatOptionsMetricsViews
                        ("V:[topGuide]-[pinLabel]-[remPinBtn]-[map]-0-[bottomGuide]", 0, null,
                                views));

        view().addConstraints(constraints);
        view().layoutSubviews();

        ArrayList<Museum> museums = source.getAllMuseum();
        if (museums != null) {
            for (Museum museum : museums) {
                MKPointAnnotation pa = MKPointAnnotation.alloc().init();
                pa.setTitle(museum.getName());
                pa.setCoordinate(new CLLocationCoordinate2D(museum.getLatitude(), museum
                        .getLongitude()));
                mapView.addAnnotation(pa);
            }
        }
    }

    @Selector("annotationAction:")
    public void annotationAction(UIButton sender) {
        if (sender.titleLabel().text().equals("+")) {
            MKPointAnnotation pa = MKPointAnnotation.alloc().init();
            pa.setTitle(pinLabelField.text());
            pa.setCoordinate(mapView.centerCoordinate());
            mapView.addAnnotation(pa);
            source.createMuseum(new Museum(pa.title(), pa.coordinate().latitude(), pa.coordinate
                    ().longitude()));
        } else if (sender.titleLabel().text().equals("-")) {
            NSArray<MKPointAnnotation> annotations = (NSArray<MKPointAnnotation>) mapView
                    .selectedAnnotations();
            for (int i = 0; i < annotations.size(); i++) {
                MKPointAnnotation annotation = annotations.get(i);
                ArrayList<Museum> museums = source.getMuseumsByAllParameters(annotation.title(),
                        annotation.coordinate().latitude(), annotation.coordinate().longitude());
                for (Museum museum : museums) {
                    source.deleteMuseum(museum.getId());
                }
            }
            mapView.removeAnnotations(annotations);
            pinLabelField.setText("");
        } else {
            if (updaterThread != null) {
                return;
            }

            updaterThread = new Thread(() -> {
                try {
                    CLLocationCoordinate2D centerCoordinate = mapView.centerCoordinate();
                    final ArrayList<Museum> museums = MuseumSearchEngine.find(centerCoordinate
                            .latitude(), centerCoordinate.longitude());
                    if (museums == null) {
                        handleError(MuseumSearchEngine.getLastError());
                        return;
                    }

                    for (int i = 0; i < museums.size(); i++) {
                        ArrayList<Museum> existMuseums = source.getMuseumsByAllParameters(museums
                                .get(i).getName(), museums.get(i).getLatitude(), museums.get(i)
                                .getLongitude());
                        if (existMuseums.size() != 0) {
                            museums.get(i).setId(existMuseums.get(0).getId());
                        }
                    }

                    Globals.dispatch_sync(Globals.dispatch_get_main_queue(), () -> {
                        for (Museum museum : museums) {
                            if (museum.getId() == -1) {
                                MKPointAnnotation pa = MKPointAnnotation.alloc().init();
                                pa.setTitle(museum.getName());
                                pa.setCoordinate(new CLLocationCoordinate2D(museum.getLatitude(),
                                        museum.getLongitude()));
                                mapView.addAnnotation(pa);
                            }
                            source.createMuseum(museum);
                        }
                    });
                } finally {
                    updaterThread = null;
                }
            });
            updaterThread.start();
        }
    }

    private void handleError(String errorMessage) {
        Globals.dispatch_sync(Globals.dispatch_get_main_queue(), () -> {
            UIAlertView alertView = UIAlertView.alloc().init();
            alertView.setMessage("Cannot get museums: " + errorMessage);
            alertView.show();
        });
    }
}
