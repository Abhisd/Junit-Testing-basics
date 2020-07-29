package com.abhishek.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersTest {

	Numbers pm = new Numbers();

	@Test
	public void testPrime() {

		boolean result = pm.isPrime(7);
		assertTrue(result);
	}

	@Test
	public void testNonPrime() {
		boolean result = pm.isPrime(6);
		assertFalse(result);
	}

	@Test
	public void testEven() {
		boolean result = pm.isEven(2);
		assertTrue(result);
	}

	@Test
	public void testOdd() {
		boolean result = pm.isEven(1);
		assertFalse(result);
	}

	@Test
	public void testSum() {
		int result = pm.summationUptoTheNumberFromOne(10);
		assertEquals(55, result);
	}

	@Test
	public void testSumOfDigits() {
		int result = pm.sumOfDigits(199);
		assertEquals(19, result);
	}

	@Test
	public void testValidNumberPalindrome() {
		boolean result = pm.validNumberPalindrome(121);
		assertTrue(result);
	}
	
	@Test
	public void testInnvalidPalindrome() {
		boolean result=pm.validNumberPalindrome(123);
		assertFalse(result);
	}

}




