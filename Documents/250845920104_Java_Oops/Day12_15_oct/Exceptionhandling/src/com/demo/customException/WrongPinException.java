package com.demo.customException;

public class WrongPinException extends Exception {
	public WrongPinException(String msg) {
		super(msg);
	}
}
