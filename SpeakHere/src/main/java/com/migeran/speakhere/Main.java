package com.migeran.speakhere;

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.Selector;

@RegisterOnStartup
public class Main extends NSObject implements UIApplicationDelegate {

	public static void main(String[] args) {
		UIKit.UIApplicationMain(0, null, null, Main.class.getName());
	}

	@Selector("alloc")
	public static native Main alloc();

	@Generated("NatJ")
	protected Main(Pointer peer) {
		super(peer);
	}

	private UIWindow window;

	@Override
	public void setWindow(UIWindow value) {
		window = value;
	}

	@Override
	public UIWindow window() {
		return window;
	}
}
