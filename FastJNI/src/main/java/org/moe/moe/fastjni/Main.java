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

package org.moe.moe.fastjni;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ann.Selector;

import java.util.Arrays;

import apple.NSObject;
import apple.foundation.NSDictionary;
import apple.uikit.UIApplication;
import apple.uikit.UIWindow;
import apple.uikit.c.UIKit;
import apple.uikit.protocol.UIApplicationDelegate;

@RegisterOnStartup
public class Main extends NSObject implements UIApplicationDelegate {

    public static void main(String[] args) {
        UIKit.UIApplicationMain(0, null, null, Main.class.getName());
    }

    @Selector("alloc")
    public static native Main alloc();

    protected Main(Pointer peer) {
        super(peer);
    }

    private UIWindow window;

    @Override
    public boolean applicationDidFinishLaunchingWithOptions(UIApplication application,
                                                            NSDictionary launchOptions) {
        System.loadLibrary("test");
        System.out.println("Array Size\tJNI Time\tFastJNI Time");
        test(1);
        test(2);
        test(5);
        test(10);
        test(20);
        test(50);
        test(100);
        test(200);
        test(500);
        test(1000);
        test(10000);
        test(100000);
        return true;
    }

    private void test(int arraySize) {
        // Quick cleanup
        Runtime.getRuntime().gc();

        // Setup
        byte[] buffer = new byte[arraySize];
        final Test test = new Test();
        long startTime;
        final int retries = 1000;
        final int iter = 100;
        final long[] times = new long[retries];

        // Measure JNI times
        for (int i = 0; i < retries; ++i) {
            startTime = System.nanoTime();
            for (int o = 0; o < iter; ++o)
                test.jni(buffer);
            times[i] = System.nanoTime() - startTime;
        }
        Arrays.sort(times);
        final long jniAvg = avg(Arrays.copyOfRange(times, 0, retries / 10));

        // Measure FastJNI times
        for (int i = 0; i < retries; ++i) {
            startTime = System.nanoTime();
            for (int o = 0; o < iter; ++o)
                test.fastjni(buffer);
            times[i] = System.nanoTime() - startTime;
        }
        Arrays.sort(times);
        final long fastjniAvg = avg(Arrays.copyOfRange(times, 0, retries / 10));

        // Print results
        System.out.println(arraySize + "\t" + jniAvg + "\t" + fastjniAvg);
    }

    private long avg(long[] longs) {
        long sum = 0;
        for (long d : longs)
            sum += d;
        return sum / longs.length;
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
