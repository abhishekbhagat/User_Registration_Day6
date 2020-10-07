package com.example.demo;

public class UserValidateException extends Exception {
	enum ExceptionType {
		ENTERED_INVALID_FIRST_NAME, ENTERED_INVALID_LAST_NAME, ENTERED_INVALID_EMAIL_ID, ENTERED_INVALID_MOBILE_NUMBER,
		ENTERED_INVALID_PASSWORD;
	}

	ExceptionType type;

	public UserValidateException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
