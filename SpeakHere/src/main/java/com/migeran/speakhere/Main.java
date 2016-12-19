package com.migeran.speakhere;

import apple.NSObject;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

public class Main extends NSObject implements UIApplicationDelegate {

	public static void main(String[] args) {
		UIKit.UIApplicationMain(0, null, null, Main.class.getName());
	}

	@Generated("NatJ")
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
