package com.migeran.speakhere;

public class MeterTable {

	private float mMinDecibels;
	private float mDecibelResolution;
	private float mScaleFactor;
	private float[] mTable;

	private static double DbToAmp(double inDb) {
		return Math.pow(10., 0.05 * inDb);
	}

	public MeterTable() {
		this(-80.f, 400, 2.0f);
	}

	public MeterTable(float inMinDecibels) {
		this(inMinDecibels, 400, 2.0f);
	}

	public MeterTable(float inMinDecibels, int inTableSize, float inRoot) {
		mMinDecibels = inMinDecibels;
		mDecibelResolution = mMinDecibels / (inTableSize - 1);
		mScaleFactor = 1.f / mDecibelResolution;

		if (inMinDecibels >= 0.) {
			System.out.println("MeterTable inMinDecibels must be negative");
			return;
		}

		mTable = new float[inTableSize];

		double minAmp = DbToAmp(inMinDecibels);
		double ampRange = 1. - minAmp;
		double invAmpRange = 1. / ampRange;

		double rroot = 1. / inRoot;
		for (int i = 0; i < inTableSize; ++i) {
			double decibels = i * mDecibelResolution;
			double amp = DbToAmp(decibels);
			double adjAmp = (amp - minAmp) * invAmpRange;
			mTable[i] = (float) Math.pow(adjAmp, rroot);
		}
	}

	public float ValueAt(float inDecibels) {
		if (inDecibels < mMinDecibels)
			return 0.f;
		if (inDecibels >= 0.)
			return 1.f;
		int index = (int) (inDecibels * mScaleFactor);
		return mTable[index];
	}
}
