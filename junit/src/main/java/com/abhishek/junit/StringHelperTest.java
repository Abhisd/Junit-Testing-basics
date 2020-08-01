package com.abhishek.junit;

import static org.junit.Assert.*;


import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions() {

		assertEquals(helper.truncateAInFirst2Positions("AACD"), "CD");

	}

	@Test
	public void testTruncateAInFirst2Positions2() {

		assertEquals(helper.truncateAInFirst2Positions("ACD"), "CD");
	}

	@Test
	public void testTruncateAInFirst2Positions3() {
		assertEquals(helper.truncateAInFirst2Positions("CDEF"), "CDEF");
	}

	@Test
	public void testTruncateAInFirst2Positions4() {
		assertEquals(helper.truncateAInFirst2Positions("CDAA"), "CDAA");
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_basicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_basicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_trueScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_falseScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	

}

//tests are always successful if there are no failures.
//test methods should be public void methodName()
//AACD->CD ACD->CD CDEF->CDEF CDAA->CDAA
//ABCD->false ABAB->true AB->true A->false
