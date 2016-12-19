package com.migeran.speakhere.view;

import static apple.coregraphics.c.CoreGraphics.CGColorCreateCopyWithAlpha;
import static apple.coregraphics.c.CoreGraphics.CGColorRelease;
import static apple.coregraphics.c.CoreGraphics.CGColorSpaceCreateDeviceRGB;
import static apple.coregraphics.c.CoreGraphics.CGColorSpaceRelease;
import static apple.coregraphics.c.CoreGraphics.CGContextFillRect;
import static apple.coregraphics.c.CoreGraphics.CGContextRotateCTM;
import static apple.coregraphics.c.CoreGraphics.CGContextScaleCTM;
import static apple.coregraphics.c.CoreGraphics.CGContextSetFillColorSpace;
import static apple.coregraphics.c.CoreGraphics.CGContextSetFillColorWithColor;
import static apple.coregraphics.c.CoreGraphics.CGContextSetStrokeColorSpace;
import static apple.coregraphics.c.CoreGraphics.CGContextStrokeRect;
import static apple.coregraphics.c.CoreGraphics.CGContextTranslateCTM;
import static apple.coregraphics.c.CoreGraphics.CGRectInset;
import static apple.coregraphics.c.CoreGraphics.CGRectMake;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSCoder;
import apple.uikit.UIColor;
import apple.uikit.UIView;
import apple.uikit.c.UIKit;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

public class LevelMeter extends UIView {
	private static final boolean YES = true;
	private static final boolean NO = false;

	@Generated("NatJ")
	public static native LevelMeter alloc();

	@Generated("NatJ")
	protected LevelMeter(Pointer peer) {
		super(peer);
	}

	private static class LevelMeterColorThreshold {
		public float maxValue; // A value from 0 - 1. The maximum value shown in
								// this color
		public UIColor color; // A UIColor to be used for this value range
	}

	int _numLights;
	float _level, _peakLevel;
	LevelMeterColorThreshold[] _colorThresholds;
	int _numColorThresholds;
	boolean _vertical;
	boolean _variableLightIntensity;
	UIColor _bgColor, _borderColor;
	float _scaleFactor;

	private static int _cmp_levelThresholds(LevelMeterColorThreshold a, LevelMeterColorThreshold b) {
		if (a.maxValue > b.maxValue)
			return 1;
		if (a.maxValue < b.maxValue)
			return -1;
		return 0;
	}

	private static double LEVELMETER_CLAMP(double min, double x, double max) {
		return x < min ? min : (x > max ? max : x);
	}

	private void _performInit() {
		_level = 0.f;
		_numLights = 0;
		_numColorThresholds = 3;
		_variableLightIntensity = YES;
		_bgColor = UIColor.alloc().initWithRedGreenBlueAlpha(0.f, 0.f, 0.f, 0.6f);
		_borderColor = UIColor.alloc().initWithRedGreenBlueAlpha(0.f, 0.f, 0.f, 1.0f);
		_colorThresholds = new LevelMeterColorThreshold[3];
		_colorThresholds[0] = new LevelMeterColorThreshold();
		_colorThresholds[0].maxValue = 0.25f;
		_colorThresholds[0].color = UIColor.alloc().initWithRedGreenBlueAlpha(0.f, 1.f, 0.f, 1.f);
		_colorThresholds[1] = new LevelMeterColorThreshold();
		_colorThresholds[1].maxValue = 0.8f;
		_colorThresholds[1].color = UIColor.alloc().initWithRedGreenBlueAlpha(1.f, 1.f, 0.f, 1.f);
		_colorThresholds[2] = new LevelMeterColorThreshold();
		_colorThresholds[2].maxValue = 1.f;
		_colorThresholds[2].color = UIColor.alloc().initWithRedGreenBlueAlpha(1.f, 0.f, 0.f, 1.f);
		_vertical = (frame().size().width() < frame().size().height()) ? YES : NO;
	}

	@Override
	public LevelMeter initWithFrame(CGRect frame) {
		super.initWithFrame(frame);
		_performInit();
		return this;
	}

	@Override
	public LevelMeter initWithCoder(NSCoder aDecoder) {
		super.initWithCoder(aDecoder);
		_performInit();
		return this;
	}

	@Override
	public void drawRect(CGRect rect) {
		CGColorSpaceRef cs = null;
		CGContextRef cxt = null;
		CGRect bds;

		cxt = UIKit.UIGraphicsGetCurrentContext();
		cs = CGColorSpaceCreateDeviceRGB();

		if (_vertical) {
			CGContextTranslateCTM(cxt, 0.f, bounds().size().height());
			CGContextScaleCTM(cxt, 1.f, -1.f);
			bds = bounds();
		} else {
			CGContextTranslateCTM(cxt, 0.f, bounds().size().height());
			CGContextRotateCTM(cxt, -(float) Math.PI / 2.0f);
			bds = CGRectMake(0.f, 0.f, bounds().size().height(), bounds().size().width());
		}

		CGContextSetFillColorSpace(cxt, cs);
		CGContextSetStrokeColorSpace(cxt, cs);

		if (_numLights == 0) {
			int i;
			float currentTop = 0.f;

			if (_bgColor != null) {
				_bgColor.set();
				CGContextFillRect(cxt, bds);
			}

			for (i = 0; i < _numColorThresholds; i++) {
				LevelMeterColorThreshold thisThresh = _colorThresholds[i];
				float val = Math.min(thisThresh.maxValue, _level);

				CGRect rect2 = CGRectMake(0.0f, (bds.size().height()) * currentTop, bds.size().width(), (bds.size().height()) * (val - currentTop));

				thisThresh.color.set();
				CGContextFillRect(cxt, rect2);

				if (_level < thisThresh.maxValue)
					break;

				currentTop = val;
			}

			if (_borderColor != null) {
				_borderColor.set();
				CGContextStrokeRect(cxt, CGRectInset(bds, .5f, .5f));
			}

		} else {
			int light_i;
			double lightMinVal = 0.f;
			double insetAmount, lightVSpace;
			lightVSpace = bds.size().height() / (double) _numLights;
			if (lightVSpace < 4.f)
				insetAmount = 0.f;
			else if (lightVSpace < 8.f)
				insetAmount = 0.5f;
			else
				insetAmount = 1.f;

			int peakLight = -1;
			if (_peakLevel > 0.f) {
				peakLight = (int) (_peakLevel * _numLights);
				if (peakLight >= _numLights)
					peakLight = _numLights - 1;
			}

			for (light_i = 0; light_i < _numLights; light_i++) {
				double lightMaxVal = (double) (light_i + 1) / (double) _numLights;
				double lightIntensity;
				CGRect lightRect;
				UIColor lightColor;

				if (light_i == peakLight) {
					lightIntensity = 1.f;
				} else {
					lightIntensity = (_level - lightMinVal) / (lightMaxVal - lightMinVal);
					lightIntensity = LEVELMETER_CLAMP(0.f, lightIntensity, 1.f);
					if ((!_variableLightIntensity) && (lightIntensity > 0.f))
						lightIntensity = 1.f;
				}

				lightColor = _colorThresholds[0].color;
				int color_i;
				for (color_i = 0; color_i < (_numColorThresholds - 1); color_i++) {
					LevelMeterColorThreshold thisThresh = _colorThresholds[color_i];
					LevelMeterColorThreshold nextThresh = _colorThresholds[color_i + 1];
					if (thisThresh.maxValue <= lightMaxVal)
						lightColor = nextThresh.color;
				}

				lightRect = CGRectMake(0.f, bds.size().height() * ((float) (light_i) / (float) _numLights), bds.size().width(), bds.size().height() * (1.f / (float) _numLights));
				lightRect = CGRectInset(lightRect, insetAmount, insetAmount);

				if (_bgColor != null) {
					_bgColor.set();
					CGContextFillRect(cxt, lightRect);
				}

				if (lightIntensity == 1.f) {
					lightColor.set();
					CGContextFillRect(cxt, lightRect);
				} else if (lightIntensity > 0.f) {
					CGColorRef clr = CGColorCreateCopyWithAlpha(lightColor.CGColor(), lightIntensity);
					CGContextSetFillColorWithColor(cxt, clr);
					CGContextFillRect(cxt, lightRect);
					CGColorRelease(clr);
				}

				if (_borderColor != null) {
					_borderColor.set();
					CGContextStrokeRect(cxt, CGRectInset(lightRect, 0.5f, 0.5f));
				}

				lightMinVal = lightMaxVal;
			}

		}

		CGColorSpaceRelease(cs);
	}

	public float level() {
		return _level;
	}

	public void setLevel(float v) {
		_level = v;
	}

	public float peakLevel() {
		return _peakLevel;
	}

	public void setPeakLevel(float v) {
		_peakLevel = v;
	}

	public int numLights() {
		return _numLights;
	}

	public void setNumLights(int v) {
		_numLights = v;
	}

	public boolean vertical() {
		return _vertical;
	}

	public void setVertical(boolean v) {
		_vertical = v;
	}

	public UIColor bgColor() {
		return _bgColor;
	}

	public void setBgColor(UIColor v) {
		_bgColor = v;
	}

	public UIColor BorderColor() {
		return _borderColor;
	}

	public void setBorderColor(UIColor v) {
		_borderColor = v;
	}
}
