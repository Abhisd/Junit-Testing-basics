package com.abhishek.isbntool;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidateIsnbTest {

	private ValidateIsbn validate;

	@Before
	public void setUp() {
		validate = new ValidateIsbn();
	}

	@Test
	public void checkValid10DigitIsbn() {

		boolean result = validate.checkIsbn("0140449116");
		assertTrue(result);
	}

	@Test
	public void TenDigitIsbnEndingWithXisValid() {

		boolean result = validate.checkIsbn("097522980X");
		assertTrue(result);
	}

	@Test
	public void checkInvalid10DigitIsbn() {

		boolean result = validate.checkIsbn("0140449117");
		assertFalse(result);
	}

	@Test(expected = NumberFormatException.class)
	public void nineDigitIsbnNotAllowed() {
		validate.checkIsbn("140449117");

	}

	@Test(expected = NumberFormatException.class)
	public void NonNumeric10DigitIsbnIsInvalid() {
		validate.checkIsbn("helloworld");
	}

	@Test
	public void checkValid13DigitIsbn() {
		boolean result = validate.checkIsbn("9781853260087");
		assertTrue("firstvalue", result);
		result = validate.checkIsbn("9783161484100");
		assertTrue("secondvalue", result);
	}

	@Test
	public void checkInvalid13DigitIsbn() {
		boolean result = validate.checkIsbn("9781853260088");
		assertFalse(result);
	}

}
