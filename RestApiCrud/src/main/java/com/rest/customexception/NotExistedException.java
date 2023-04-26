package com.rest.customexception;

public class NotExistedException extends RuntimeException {

	public NotExistedException(String msg) {
		super(msg);
	}
}
