package com.nt.Exception;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException() {
	}

	public StudentNotFoundException(String msg) {
		super(msg);
	}

}
