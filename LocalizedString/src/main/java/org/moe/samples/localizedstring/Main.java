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

package org.moe.samples.localizedstring;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ann.Selector;

import java.io.UnsupportedEncodingException;

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

import static org.moe.natj.general.ptr.impl.PtrFactory.newPointerPtr;
import static org.moe.natj.general.ptr.impl.PtrFactory.newWeakByteArray;

@RegisterOnStartup
public class Main extends NSObject implements UIApplicationDelegate {

    public static void main(String[] args) {
        /*
         * When simulating other languages, Xcode will add arguments to the app which we would
         * like to pass to UIApplicationMain.
         * The code below will convert the Java String array to native pointers.
         */
        @SuppressWarnings("unchecked")
        Ptr<BytePtr> argsPtr = (Ptr<BytePtr>) newPointerPtr(Byte.class, 2, args.length, true, false);
        Ptr<BytePtr> argsPtrIt = argsPtr;
        for (String arg : args) {
            final byte[] bytes;
            try {
                bytes = arg.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            final BytePtr ptr = newWeakByteArray(bytes.length + 1);
            ptr.copyFrom(bytes);
            argsPtrIt.set(ptr);
            argsPtrIt = (Ptr<BytePtr>) argsPtrIt.ofs(1);
        }
        UIKit.UIApplicationMain(args.length, argsPtr, null, Main.class.getName());
    }

    @Selector("alloc")
    public static native Main alloc();

    protected Main(Pointer peer) {
        super(peer);
    }

    private UIWindow window;

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary launchOptions) {
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
}
