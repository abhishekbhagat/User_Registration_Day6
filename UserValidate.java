package com.example.demo;

import java.util.regex.Pattern;

public class UserValidate {
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";

	public boolean validFirstName(String firstName) {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		return pattern.matcher(firstName).matches();
	}

	public boolean validLastName(String lastName) {
		return Pattern.matches(LAST_NAME_PATTERN, lastName);
	}
}
