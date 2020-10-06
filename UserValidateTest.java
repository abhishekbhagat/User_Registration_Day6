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
	public void givenFirstName_WhenProper_ShouldReturnFalse() {
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
	public void givenLast_WhenProper_ShouldReturnFalse() {
		UserValidate uservalidate = new UserValidate();
		boolean result = uservalidate.validLastName("Abhisehk");
		Assert.assertEquals(false, result);
	}
}
