package com.example.demo;

import java.util.regex.Pattern;

public class UserValidate {
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-zA-Z]+[-+.]{0,1}[a-zA-Z0-9]+@[A-Za-z0-9]+(.[A-Za-z]{2,4}){1,2}$";
	private static final String MOBILE_NUMBER_PATTERN = "[1-9]{1}[0-9]{1}( )[1-9]{1}[0-9]{9}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z])[a-zA-Z0-9]{8,}$";

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

	public boolean validMobileNumber(String mobileNumber) {
		return Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
	}

	public boolean validPassword(String password) {
		return Pattern.matches(PASSWORD_PATTERN, password);
	}

}
