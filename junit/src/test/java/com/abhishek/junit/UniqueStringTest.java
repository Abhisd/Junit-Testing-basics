package com.abhishek.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueStringTest {
	UniqueString us=new UniqueString();
	@Test
	public void testRepetedCharacterString() {
		boolean result=us.isUnique("abhishek");
		assertFalse( result);
	}
	@Test
	public void testUniqueCharacterString() {
		boolean result=us.isUnique("asdfghjkl");
		assertTrue(result);
	}

}
