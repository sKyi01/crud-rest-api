package com.rest.customexception;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String msg) {
		super(msg);
	}
}
