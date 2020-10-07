package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserValidateTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validFirstName("Abhisehk");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldThrowCustomException() {
		UserValidate uservalidate = new UserValidate();
		try {
			uservalidate.validFirstName("abhisehk");
		} catch (UserValidateException u) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID_FIRST_NAME, u.type);
		}
	}

	@Test
	public void givenLast_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validLastName("Abhisehk");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLast_WhenNotProper_ShouldThrowCustomException() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		try {
			uservalidate.validLastName("abhisehk");
		} catch (UserValidateException u) {
			System.out.println(u.type);
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID_LAST_NAME, u.type);
		}
	}

	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validEmailId("afn@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmailId_WhenNotProper_ShouldThrowCutomException() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		try {
			uservalidate.validEmailId("adfh.gmai.com");
		} catch (UserValidateException u) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID_EMAIL_ID, u.type);
		}
	}

	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validMobileNumber("10 7209300456");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNumber_WhenNotProper_ShouldThrowCustomException() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		try {
			uservalidate.validMobileNumber("0930045612354");
		} catch (UserValidateException u) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID_MOBILE_NUMBER, u.type);
		}
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldThrowCustomException() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		try {
			uservalidate.validPassword("Abhise12hk");
		} catch (UserValidateException u) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID_PASSWORD, u.type);
		}
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validPassword("Abi13@ksdfjlsdfj");
		Assert.assertEquals(true, result);
	}
}
