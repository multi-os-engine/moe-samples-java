package com.migeran.speakhere.ui;

import static apple.audiotoolbox.c.AudioToolbox.AudioQueueGetProperty;
import static apple.audiotoolbox.c.AudioToolbox.AudioQueueSetProperty;
import static apple.corefoundation.c.CoreFoundation.CFAbsoluteTimeGetCurrent;
import apple.audiotoolbox.enums.Enums;
import apple.audiotoolbox.opaque.AudioQueueRef;
import apple.audiotoolbox.struct.AudioQueueLevelMeterState;
import apple.coreaudio.struct.AudioStreamBasicDescription;
import apple.coregraphics.c.CoreGraphics;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMutableArray;
import apple.foundation.NSNumber;
import apple.foundation.NSTimer;
import apple.uikit.UIColor;
import apple.uikit.UIView;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import com.migeran.speakhere.CAXException;
import com.migeran.speakhere.MeterTable;
import com.migeran.speakhere.view.LevelMeter;

@Runtime(ObjCRuntime.class)
@ObjCClassName("AQLevelMeter")
@RegisterOnStartup
public class AQLevelMeter extends UIView {
	private static final boolean YES = true;
	private static final boolean NO = false;
	private static final int noErr = 0;

	private static final float kPeakFalloffPerSec = .7f;
	private static final float kLevelFalloffPerSec = .8f;
	private static final float kMinDBvalue = -80.0f;

	static {
		NatJ.register();
	}

	@Generated
	protected AQLevelMeter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AQLevelMeter alloc();

	@Generated
	@Selector("init")
	public native AQLevelMeter init();

	private AudioQueueRef _aq;
	private AudioQueueLevelMeterState[] _chan_lvls;
	private NSArray _channelNumbers;
	private NSArray _subLevelMeters;
	private MeterTable _meterTable;
	private NSTimer _updateTimer;
	private float _refreshHz;
	private boolean _showsPeaks;
	private boolean _vertical;

	private UIColor _bgColor, _borderColor;
	private double _peakFalloffLastFire;

	private void _performInit() {
		_refreshHz = 1.f / 30.f;
		_showsPeaks = YES;
		NSMutableArray channelNumbers = NSMutableArray.alloc().init();
		channelNumbers.add(NSNumber.numberWithInt(0));
		_channelNumbers = channelNumbers;
		_vertical = NO;
		_chan_lvls = new AudioQueueLevelMeterState[(int)_channelNumbers.count()];
		for (int i = 0; i < _chan_lvls.length; ++i) {
			_chan_lvls[i] = new AudioQueueLevelMeterState();
		}
		_meterTable = new MeterTable(kMinDBvalue);
		_bgColor = null;
		_borderColor = null;
		layoutSubLevelMeters();
	}

	@Override
	@Selector("initWithFrame:")
	public AQLevelMeter initWithFrame(CGRect frame) {
		super.initWithFrame(frame);
		_performInit();
		return this;
	}

	@Override
	@Selector("initWithCoder:")
	public AQLevelMeter initWithCoder(NSCoder aDecoder) {
		AQLevelMeter self = (AQLevelMeter) super.initWithCoder(aDecoder);
		self._performInit();
		return self;
	}

	public void setBorderColor(UIColor borderColor) {
		_borderColor = borderColor;

		if (_subLevelMeters == null) {
			return;
		}
		for (int i = 0; i < _subLevelMeters.count(); i++) {
			Object meter = _subLevelMeters.objectAtIndex(i);
			((LevelMeter) meter).setBorderColor(borderColor);
		}
	}

	@Selector("setBackgroundColor:")
	public void setBackgroundColor(UIColor bgColor) {
		_bgColor = bgColor;

		if (_subLevelMeters == null) {
			return;
		}
		for (int i = 0; i < _subLevelMeters.count(); i++) {
			Object meter = _subLevelMeters.objectAtIndex(i);
			((LevelMeter) meter).setBgColor(bgColor);
		}
	}

	private void layoutSubLevelMeters() {
		if (_subLevelMeters != null) {
			for (int i = 0; i < _subLevelMeters.count(); i++) {
				UIView thisMeter = (UIView) _subLevelMeters.objectAtIndex(i);
				thisMeter.removeFromSuperview();
			}
		}
		_subLevelMeters = null;

		NSMutableArray meters_build = NSMutableArray.alloc().initWithCapacity(_channelNumbers.count());
		CGRect totalRect = new CGRect();

		if (_vertical) {
			totalRect = new CGRect(new CGPoint(), new CGSize(frame().size().width() + 2.0f, frame().size().height()));
		} else {
			totalRect = new CGRect(new CGPoint(), new CGSize(frame().size().width(), frame().size().height() + 2.0f));
		}

		for (int i = 0; i < _channelNumbers.count(); ++i) {
			CGRect fr;

			if (_vertical) {
				fr = CoreGraphics.CGRectMake(totalRect.origin().x() + (((float) i / (float) _channelNumbers.count()) * totalRect.size().width()), totalRect.origin().y(), (1.f / (float) _channelNumbers.count()) * totalRect.size().width() - 2.f, totalRect.size().height());
			} else {
				fr = CoreGraphics.CGRectMake(totalRect.origin().x(), totalRect.origin().y() + (((float) i / (float) _channelNumbers.count()) * totalRect.size().height()), totalRect.size().width(), (1.f / (float) _channelNumbers.count()) * totalRect.size().height() - 2.f);
			}

			LevelMeter newMeter;

			// if (_useGL) newMeter = [[GLLevelMeter alloc] initWithFrame:fr];
			/* else */newMeter = LevelMeter.alloc().initWithFrame(fr);

			newMeter.setNumLights(30);
			newMeter.setVertical(_vertical);
			newMeter.setBgColor(_bgColor);
			newMeter.setBorderColor(_borderColor);

			meters_build.add(newMeter);
			addSubview(newMeter);
		}

		_subLevelMeters = meters_build;
	}

	@Selector("_refresh")
	private void _refresh() {
		boolean success = NO;

		// if we have no queue, but still have levels, gradually bring them down
		if (_aq == null) {
			float maxLvl = -1.f;
			double thisFire = CFAbsoluteTimeGetCurrent();
			// calculate how much time passed since the last draw
			double timePassed = thisFire - _peakFalloffLastFire;
			for (Object thisMeterObject : _subLevelMeters) {
				LevelMeter thisMeter = (LevelMeter) thisMeterObject;
				float newPeak, newLevel;
				newLevel = (float) (thisMeter.level() - timePassed * kLevelFalloffPerSec);
				if (newLevel < 0.f)
					newLevel = 0.f;
				thisMeter.setLevel(newLevel);
				if (_showsPeaks) {
					newPeak = (float) (thisMeter.peakLevel() - timePassed * kPeakFalloffPerSec);
					if (newPeak < 0.f)
						newPeak = 0.f;
					thisMeter.setPeakLevel(newPeak);
					if (newPeak > maxLvl)
						maxLvl = newPeak;
				} else if (newLevel > maxLvl)
					maxLvl = newLevel;

				thisMeter.setNeedsDisplay();
			}
			// stop the timer when the last level has hit 0
			if (maxLvl <= 0.) {
				_updateTimer.invalidate();
				_updateTimer = null;
			}

			_peakFalloffLastFire = thisFire;
			success = YES;
		} else {
			try {
				int data_sz = (int) (CRuntime.sizeOfNativeObject(AudioQueueLevelMeterState.class) * _channelNumbers.count());
				IntPtr data_szRef = PtrFactory.newIntReference(data_sz);
				Ptr<AudioQueueLevelMeterState> chan_lvlsRef = PtrFactory.newStructArray(AudioQueueLevelMeterState.class, (int)_channelNumbers.count());
				int status = AudioQueueGetProperty(_aq, Enums.kAudioQueueProperty_CurrentLevelMeterDB, chan_lvlsRef, data_szRef);
				for (int i = 0; i < _channelNumbers.count(); ++i) {
					_chan_lvls[i] = chan_lvlsRef.get(i);
				}
				if (status != noErr)
					throw new Exception();

				for (int i = 0; i < _channelNumbers.count(); i++) {
					int channelIdx = ((NSNumber) _channelNumbers.objectAtIndex(i)).intValue();
					LevelMeter channelView = (LevelMeter) _subLevelMeters.objectAtIndex(channelIdx);

					if (channelIdx >= _channelNumbers.count())
						throw new Exception();
					if (channelIdx > 127)
						throw new Exception();

					if (_chan_lvls != null) {
						channelView.setLevel(_meterTable.ValueAt(_chan_lvls[channelIdx].mAveragePower()));
						if (_showsPeaks)
							channelView.setPeakLevel(_meterTable.ValueAt(_chan_lvls[channelIdx].mPeakPower()));
						else
							channelView.setPeakLevel(0.f);
						channelView.setNeedsDisplay();
						success = YES;
					}
				}
			} catch (Exception e) {
				// Ignore
			}
		}

		if (!success) {
			for (Object object : _subLevelMeters) {
				LevelMeter thisMeter = (LevelMeter) object;
				thisMeter.setLevel(0.f);
				thisMeter.setNeedsDisplay();
			}
			System.out.print("ERROR: metering failed\n");
		}
	}

	public AudioQueueRef aq() {
		return _aq;
	}

	public void setAq(AudioQueueRef v) {
		if ((_aq == null) && (v != null)) {
			if (_updateTimer != null)
				_updateTimer.invalidate();

			_updateTimer = NSTimer.scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(_refreshHz, this, new SEL("_refresh"), null, YES);
		} else if ((_aq != null) && (v == null)) {
			_peakFalloffLastFire = CFAbsoluteTimeGetCurrent();
		}

		_aq = v;

		if (_aq != null) {
			try {
				IntPtr valRef = PtrFactory.newIntReference(1);
				XThrowIfError(AudioQueueSetProperty(_aq, Enums.kAudioQueueProperty_EnableLevelMetering, valRef, Integer.SIZE / 8), "couldn't enable metering");

				// now check the number of channels in the new queue, we will
				// need to reallocate if this has changed
				AudioStreamBasicDescription queueFormat = new AudioStreamBasicDescription();
				Ptr<AudioStreamBasicDescription> queueFormatRef = PtrFactory.newStructReference(queueFormat);
				IntPtr data_szRef = PtrFactory.newIntReference((int) CRuntime.sizeOfNativeObject(AudioStreamBasicDescription.class));
				XThrowIfError(AudioQueueGetProperty(_aq, Enums.kAudioQueueProperty_StreamDescription, queueFormatRef, data_szRef), "couldn't get stream description");

				if (queueFormat.mChannelsPerFrame() != _channelNumbers.count()) {
					NSMutableArray chan_array = NSMutableArray.alloc().initWithCapacity(2);
					if (queueFormat.mChannelsPerFrame() < 2)
						chan_array.add(NSNumber.numberWithInt(0));
					else {
						chan_array.add(NSNumber.numberWithInt(0));
						chan_array.add(NSNumber.numberWithInt(1));
					}

					setChannelNumbers(chan_array);

					_chan_lvls = new AudioQueueLevelMeterState[(int)chan_array.count()];
					for (int i = 0; i < _chan_lvls.length; ++i) {
						_chan_lvls[i] = new AudioQueueLevelMeterState();
					}
				}
			} catch (CAXException e) {
				System.err.println("Error: " + e.getMessage() + " (" + e.getError() + ")");
			}
		} else {
			for (Object object : _subLevelMeters) {
				LevelMeter thisMeter = (LevelMeter) object;
				thisMeter.setNeedsDisplay();
			}
		}
	}

	public float refreshHz() {
		return _refreshHz;
	}

	public void setRefreshHz(float v) {
		_refreshHz = v;
		if (_updateTimer != null) {
			_updateTimer.invalidate();
			_updateTimer = NSTimer.scheduledTimerWithTimeIntervalTargetSelectorUserInfoRepeats(_refreshHz, this, new SEL("_refresh"), null, YES);
		}
	}

	public NSArray channelNumbers() {
		return _channelNumbers;
	}

	public void setChannelNumbers(NSArray v) {
		_channelNumbers = v;
		layoutSubLevelMeters();
	}

	private void XThrowIfError(int error, String string) throws CAXException {
		if (error != 0) {
			throw new CAXException(string, error);
		}
	}
}