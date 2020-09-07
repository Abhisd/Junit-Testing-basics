package com.abhishek.junit.Bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryToStringTest {

	BinaryToString b = new BinaryToString();

	@Test
	public void testValidRealNumber() {
		String result = b.printBinary(0.625);
		assertEquals(result, ".101");
	}
	
	@Test
	public void testInvalidNumber() {
		String result=b.printBinary(0.725);
		assertEquals(result,"Error");
	}

}
