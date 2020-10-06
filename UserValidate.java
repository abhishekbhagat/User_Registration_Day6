package com.example.demo;

import java.util.regex.Pattern;

public class UserValidate {
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-zA-Z]+[-+.]{0,1}[a-zA-Z0-9]+@[A-Za-z0-9]+(.[A-Za-z]{2,4}){1,2}$";

	public boolean validFirstName(String firstName) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	}

	public boolean validLastName(String lastName) {
		return Pattern.matches(LAST_NAME_PATTERN, lastName);
	}

	public boolean validEmailId(String emailId) {
		return Pattern.matches(EMAIL_ID_PATTERN, emailId);

	}

}
