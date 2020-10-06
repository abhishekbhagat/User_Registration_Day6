package com.example.demo;
// import com.example.demo.*;

import org.junit.Assert;
import org.junit.Test;

public class UserValidateTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validFirstName("Abhisehk");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validFirstName("abhisehk");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLast_WhenProper_ShouldReturnTrue() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validLastName("Abhisehk");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLast_WhenNotProper_ShouldReturnFalse() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validLastName("abhisehk");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validEmailId("afn@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validEmailId("adfh.gmai.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validMobileNumber("7209300456");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validMobileNumber("0930045612354");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validPassword("Abhise12hk");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validPassword("Abi13@ksdfjlsdfj");
		Assert.assertEquals(true, result);
	}
}
