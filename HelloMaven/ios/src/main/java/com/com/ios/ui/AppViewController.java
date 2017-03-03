package com.com.ios.ui;

import apple.NSObject;
import apple.uikit.UIButton;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IBAction;
import org.moe.natj.objc.ann.IBOutlet;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;
import org.multi_os_engine.common.Message;

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
        helloButton = getButton();
    }

    @Selector("statusText")
    @Property
    @IBOutlet
    public native UILabel getLabel();

    @Selector("helloButton")
    @Property
    @IBOutlet
    public native UIButton getButton();

    @Selector("seyHello:")
    @IBAction
    public void seyHello(NSObject sender) {
        statusText.setText(Message.getMessage());
    }
}
