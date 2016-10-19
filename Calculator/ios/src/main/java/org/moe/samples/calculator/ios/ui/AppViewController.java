// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package org.moe.samples.calculator.ios.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IBAction;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;
import org.moe.samples.calculator.common.CalculatorAdapter;

import java.util.HashMap;
import java.util.Map;

import apple.uikit.UIButton;
import apple.uikit.UIColor;
import apple.uikit.UILabel;
import apple.uikit.UIViewController;
import apple.uikit.enums.UIControlEvents;

import static apple.uikit.UIColor.colorWithRedGreenBlueAlpha;

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

    private CalculatorAdapter myCalculatorAdapter;

    private UILabel calcNum;

    private UIColor blue = colorWithRedGreenBlueAlpha(0.0f, 0x71 / 255.0, 0xba / 255.0, 1.0f);
    private UIColor darkBlue = colorWithRedGreenBlueAlpha(0.0f, 0x4b / 255.0, 0x8d / 255.0, 1.0f);
    private UIColor orange = colorWithRedGreenBlueAlpha(0xfd / 255.0, 0xb8 / 255.0, 0x13 / 255.0,
            1.0f);

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        myCalculatorAdapter = new CalculatorAdapter();

        calcNum = getDisplayLabel();

        registerButton(getButtonC(), blue);
        registerButton(getButtonSign(), blue);
        registerButton(getButtonPerc(), blue);
        registerButton(getButtonDiv(), darkBlue);
        registerButton(getButtonMul(), darkBlue);
        registerButton(getButtonSub(), darkBlue);
        registerButton(getButtonAdd(), darkBlue);
        registerButton(getButtonEq(), darkBlue);
        registerButton(getButtonComma(), blue);
        registerButton(getButton0(), blue);
        registerButton(getButton1(), blue);
        registerButton(getButton2(), blue);
        registerButton(getButton3(), blue);
        registerButton(getButton4(), blue);
        registerButton(getButton5(), blue);
        registerButton(getButton6(), blue);
        registerButton(getButton7(), blue);
        registerButton(getButton8(), blue);
        registerButton(getButton9(), blue);
    }

    private final Map<UIButton, UIColor> defaultColorMap = new HashMap<>();

    private void registerButton(UIButton button, UIColor color) {
        defaultColorMap.put(button, color);
        button.setBackgroundColor(color);
        button.addTargetActionForControlEvents(this, new SEL("setButtonActive:"), UIControlEvents
                .TouchDown);
        button.addTargetActionForControlEvents(this, new SEL("setButtonInactive:"), UIControlEvents
                .TouchCancel);
        button.addTargetActionForControlEvents(this, new SEL("setButtonInactive:"), UIControlEvents
                .TouchUpInside);
        button.addTargetActionForControlEvents(this, new SEL("setButtonInactive:"), UIControlEvents
                .TouchUpOutside);
    }

    @IBAction
    @Selector("buttonCPressed:")
    public void buttonCPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("C");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonSignPressed:")
    public void buttonSignPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("INVERT");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonPercPressed:")
    public void buttonPercPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("C");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonDivPressed:")
    public void buttonDivPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("/");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonMulPressed:")
    public void buttonMulPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("*");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonSubPressed:")
    public void buttonSubPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("-");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonAddPressed:")
    public void buttonAddPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("+");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonEqPressed:")
    public void buttonEqPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("=");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("buttonCommaPressed:")
    public void buttonCommaPressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol(".");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button0Pressed:")
    public void button0Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("0");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button1Pressed:")
    public void button1Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("1");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button2Pressed:")
    public void button2Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("2");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button3Pressed:")
    public void button3Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("3");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button4Pressed:")
    public void button4Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("4");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button5Pressed:")
    public void button5Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("5");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button6Pressed:")
    public void button6Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("6");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button7Pressed:")
    public void button7Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("7");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button8Pressed:")
    public void button8Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("8");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("button9Pressed:")
    public void button9Pressed(UIButton sender) {
        String str = myCalculatorAdapter.sendNewSymbol("9");
        calcNum.setText(str);
    }

    @IBAction
    @Selector("setButtonActive:")
    public void setButtonActive(UIButton button) {
        button.setBackgroundColor(orange);
    }

    @IBAction
    @Selector("setButtonInactive:")
    public void setButtonInactive(UIButton button) {
        final UIColor color = defaultColorMap.get(button);
        button.setBackgroundColor(color == null ? blue : color);
    }

    @Selector("displayLabel")
    @Property
    public native UILabel getDisplayLabel();

    @Selector("buttonC")
    @Property
    public native UIButton getButtonC();

    @Selector("buttonSign")
    @Property
    public native UIButton getButtonSign();

    @Selector("buttonPerc")
    @Property
    public native UIButton getButtonPerc();

    @Selector("buttonDiv")
    @Property
    public native UIButton getButtonDiv();

    @Selector("buttonMul")
    @Property
    public native UIButton getButtonMul();

    @Selector("buttonSub")
    @Property
    public native UIButton getButtonSub();

    @Selector("buttonAdd")
    @Property
    public native UIButton getButtonAdd();

    @Selector("buttonEq")
    @Property
    public native UIButton getButtonEq();

    @Selector("buttonComma")
    @Property
    public native UIButton getButtonComma();

    @Selector("button0")
    @Property
    public native UIButton getButton0();

    @Selector("button1")
    @Property
    public native UIButton getButton1();

    @Selector("button2")
    @Property
    public native UIButton getButton2();

    @Selector("button3")
    @Property
    public native UIButton getButton3();

    @Selector("button4")
    @Property
    public native UIButton getButton4();

    @Selector("button5")
    @Property
    public native UIButton getButton5();

    @Selector("button6")
    @Property
    public native UIButton getButton6();

    @Selector("button7")
    @Property
    public native UIButton getButton7();

    @Selector("button8")
    @Property
    public native UIButton getButton8();

    @Selector("button9")
    @Property
    public native UIButton getButton9();
}
