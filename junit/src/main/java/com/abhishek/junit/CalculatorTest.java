package com.abhishek.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();
	@Test
	public void testAddition() {
		
		int result=cal.addition(2,3);
		assertEquals(result,5);
		
	}
	
	@Test
	public void testSubstarction() {
		int result=cal.subsrtaction(2,3);
		assertEquals(result,-1);
	}
	
	@Test
	public void testMultiplication() {
		int result=cal.multiplication(2,3);
		assertEquals(result,6);
	}
	@Test
	public void testDivision() {
		int result=cal.division(6,3);
		assertEquals(2,result);
		
	}
	@Test(expected=NumberFormatException.class)
	public void testDivideByZeroNotPossible() {
		int result=cal.division(1, 0);
			
		
	}

}



