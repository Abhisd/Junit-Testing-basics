package com.abhishek.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompressedStringTest {

	CompressedString cs=new CompressedString();
	@Test
	public void stringWithRepetedCharacters() {
		String str="aabbsss";
		String resultString=cs.compressString(str);
		assertEquals(resultString,"a2b2s3");
		
	}
	
	@Test
	public void stringWithoutRepetedCharacters() {
		String str="asd";
		String resultString=cs.compressString(str);
		assertEquals(resultString,"asd");
	}
	@Test
	public void StringWithUpperCaseLetters() {
		String str="AAaassSDdD";
		String resultString=cs.compressString(str);
		assertEquals(resultString,"a4s3d3");
	}
}
