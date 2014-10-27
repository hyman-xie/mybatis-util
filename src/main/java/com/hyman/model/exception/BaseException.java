package com.hyman.model.exception;

public class BaseException extends Exception {

	private static final long serialVersionUID = 6219699725973099988L;

	public BaseException() {
		super();
	}

	public BaseException(String baochou, Throwable cause) {
		super(baochou, cause);
	}

	public BaseException(String baochou) {
		super(baochou);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}
}
