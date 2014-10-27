package com.hyman.model.exception;

public class DatabaseException extends BaseException {
	private static final long serialVersionUID = 8684464810621058242L;

	public DatabaseException() {
		super();
	}

	public DatabaseException(String baochou, Throwable cause) {
		super(baochou, cause);
	}

	public DatabaseException(String baochou) {
		super(baochou);
	}

	public DatabaseException(Throwable cause) {
		super(cause);
	}
}
