package org.moe.samples.notetaking.ios;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.uikit.UISplitViewController;
import apple.uikit.enums.UIStatusBarStyle;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("SplitViewController")
@RegisterOnStartup
public class SplitViewController extends UISplitViewController {

    protected SplitViewController(Pointer peer) {
        super(peer);
    }

    public static native SplitViewController alloc();

    @Override
    public native SplitViewController init();

    @Override
    public void viewDidLoad() {

    }

    @Override
    public long preferredStatusBarStyle() {

        return UIStatusBarStyle.LightContent;
    }
}
