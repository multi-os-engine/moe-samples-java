package org.moe.samples.notetaking.ios;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import apple.uikit.UINavigationController;
import apple.uikit.UISplitViewController;
import apple.uikit.UIViewController;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;
import apple.uikit.protocol.UISplitViewControllerDelegate;

@RegisterOnStartup
public class Main extends NSObject implements UIApplicationDelegate, UISplitViewControllerDelegate {

    static {
        NatJ.register();
    }

    private UIWindow window;

    @Generated("NatJ")
    protected Main(Pointer peer) {
        super(peer);
    }

    public static void main(String[] args) {
        UIKit.UIApplicationMain(0, null, null, Main.class.getName());
    }

    public static native Main alloc();

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary launchOptions) {
        // Override point for customization after application launch.
        UISplitViewController splitViewController = (UISplitViewController) window.rootViewController();
        UINavigationController navigationController = (UINavigationController) splitViewController.viewControllers().lastObject();

        navigationController.topViewController().navigationItem().setLeftBarButtonItem(splitViewController.displayModeButtonItem());

        splitViewController.setDelegate(this);
        return true;
    }

    @Override
    public void setWindow(UIWindow value) {
        window = value;
    }

    @Override
    public UIWindow window() {
        return window;
    }

    @Override
    @Generated
    public boolean splitViewControllerCollapseSecondaryViewControllerOntoPrimaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController) {
        if (secondaryViewController.isKindOfClass(org.moe.natj.objc.Class.fromJavaClass(UINavigationController.class)) &&
                ((UINavigationController) secondaryViewController).topViewController().isKindOfClass(Class.fromJavaClass(DetailViewController.class)) &&
                ((DetailViewController) ((UINavigationController) secondaryViewController).topViewController()).getDetailItem() == "") {
            // Return YES to indicate that we have handled the collapse by doing nothing; the secondary controller will be discarded.
            return true;
        }
        return false;
    }
}
