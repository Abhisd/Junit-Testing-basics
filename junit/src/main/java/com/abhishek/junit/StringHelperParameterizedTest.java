package com.abhishek.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();

	private String input;
	private String output;

	public StringHelperParameterizedTest(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOp[][] = { { "AACD", "CD" }, { "ACD", "CD" }, { "CDEF", "CDEF" }, { "CDAA", "CDAA" } };
		return Arrays.asList(expectedOp);
	}

	@Test
	public void testTruncateAInFirst2Positions() {

		assertEquals(helper.truncateAInFirst2Positions(input), output);

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
