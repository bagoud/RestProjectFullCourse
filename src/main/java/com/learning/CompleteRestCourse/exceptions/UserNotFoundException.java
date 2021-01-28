package com.learning.CompleteRestCourse.exceptions;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -832559745779738258L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
