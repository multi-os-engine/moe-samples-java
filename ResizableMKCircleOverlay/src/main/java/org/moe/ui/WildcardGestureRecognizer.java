//
//
//  Modified by Orb on 3/27/14.
//
//  Created by Raymond Daly on 10/31/10.
//  Copyright 2010 Floatopian LLC. All rights reserved.
//  Copyright (C) 2017 Migeran
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.foundation.NSSet;
import apple.uikit.UIEvent;
import apple.uikit.UIGestureRecognizer;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("WildcardGestureRecognizer")
@RegisterOnStartup
public class WildcardGestureRecognizer extends UIGestureRecognizer {

    public TouchesEventBlock touchesBeganCallback;
    public TouchesEventBlock touchesMovedCallback;
    public TouchesEventBlock touchesEndedCallback;

    @Owned
    @Selector("alloc")
    public static native WildcardGestureRecognizer alloc();

    @Selector("init")
    public WildcardGestureRecognizer init() {
        WildcardGestureRecognizer gestureRecognizer = (WildcardGestureRecognizer) super.init();
        gestureRecognizer.setCancelsTouchesInView(false);
        return gestureRecognizer;
    }

    protected WildcardGestureRecognizer(Pointer peer) {
        super(peer);
    }

    @Selector("touchesBegan:withEvent:")
    public void touchesBegan(NSSet touches, UIEvent event) {
        if (touchesBeganCallback != null) {
            touchesBeganCallback.callback(touches, event);
        }
    }

    @Selector("touchesEnded:withEvent:")
    public void touchesEnded(NSSet touches, UIEvent event) {
        if (touchesEndedCallback != null) {
            touchesEndedCallback.callback(touches, event);
        }
    }

    @Selector("touchesMoved:withEvent:")
    public void touchesMoved(NSSet touches, UIEvent event) {
        if (touchesMovedCallback != null) {
            touchesMovedCallback.callback(touches, event);
        }
    }

    public interface TouchesEventBlock {
        public void callback(NSSet touches, UIEvent event);
    }
}
