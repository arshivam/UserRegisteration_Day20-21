package com.bridgrlabz.uservalidation;



import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

	@Test
	public void GivenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Shivam");
		Assert.assertEquals(true, result);
	}
	@Test
	public void GivenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Sh");
		Assert.assertEquals(false, result);
	}
	@Test
	public void GivenFirstName_WhenSpecialChar_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Shiv@m");
		Assert.assertEquals(false, result);
	}
	@Test
	public void GivenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Armarkar");
		Assert.assertEquals(true, result);
	}
	@Test
	public void GivenLastName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Ar");
		Assert.assertEquals(false, result);
	}
	@Test
	public void GivenLastName_WhenSpecialChar_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Arm@rkar");
		Assert.assertEquals(false, result);
	}
	@Test
	public void GivenPassWord_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassWord("Sagar@123");
		Assert.assertEquals(true, result);
	}
	@Test
	public void GivenPassWord_WhenNotProper_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassWord("Sagar");
		Assert.assertEquals(false, result);
	}
	@Test
	public void GivenEmail_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("sagar.khobragade@gmail.com");
		Assert.assertEquals(true, result);
	}
	@Test
	public void GivenEmail_WhenNotProper_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("sagar.khobragade@.com");
		Assert.assertEquals(false, result);
	}
	@Test
	public void GivenPhoneNum_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePhoneNum("91 8667598657");
		Assert.assertEquals(true, result);
	}
	@Test
	public void GivenPhoneNum_WhenNotProper_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePhoneNum("79 8667598657");
		Assert.assertEquals(false, result);
	}
}
