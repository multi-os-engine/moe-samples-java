/*
Copyright (C) 2016 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.moe.fastjni.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.uikit.UIButton;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
public class AppViewController extends UIViewController {

    @Owned
    @Selector("alloc")
    public static native AppViewController alloc();

    @Selector("init")
    public native AppViewController init();

    protected AppViewController(Pointer peer) {
        super(peer);
    }

    public UILabel statusText = null;
    public UIButton helloButton = null;

    @Override
    public void viewDidLoad() {
        statusText = getLabel();
        helloButton = getHelloButton();
    }

    @Selector("statusText")
    @Property
    public native UILabel getLabel();

    @Selector("helloButton")
    @Property
    public native UIButton getHelloButton();

    @Selector("BtnPressedCancel_helloButton:")
    public void BtnPressedCancel_button(NSObject sender) {
        statusText.setText("Hello Intel Multi-OS Engine!");
    }
}
