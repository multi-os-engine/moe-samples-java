package com.migeran.speakhere;

public class CAXException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6681481279914260099L;

	private final int error;

	public CAXException(String string, int error) {
		super(string);
		this.error = error;
	}

	public int getError() {
		return error;
	}
}
