package org.moe.bencmark.ui;

import org.moe.benchmark.commandline;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.c.Globals;
import apple.foundation.NSFileManager;
import apple.foundation.NSURL;
import apple.foundation.enums.NSSearchPathDirectory;
import apple.foundation.enums.NSSearchPathDomainMask;
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

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        Globals.dispatch_async(Globals.dispatch_get_global_queue(0, 0
        ), new Globals
                .Block_dispatch_async() {
            @Override
            public void call_dispatch_async() {
                double[] res = commandline.createRes();
                commandline.writeCSV(res, "csvfile", applicationDocumentsDirectory());
                System.out.println(applicationDocumentsDirectory());
            }
        });
    }

    public String applicationDocumentsDirectory() {
        return ((NSURL) NSFileManager.defaultManager().URLsForDirectoryInDomains(NSSearchPathDirectory.DocumentDirectory, NSSearchPathDomainMask.UserDomainMask).firstObject()).fileSystemRepresentation();
    }

}
