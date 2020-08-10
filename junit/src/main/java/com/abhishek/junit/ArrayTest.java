package com.abhishek.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testArray_RandomNumbers() {
		int num[] = { 3, 6, 2, 9 };
		int result[] = { 2, 3, 6, 9 };
		Arrays.sort(num);
		assertArrayEquals(num, result);
		// assertEquals() does not work with arrays
	}

	@Test(expected=NullPointerException.class)
	public void testArrayException_nullArray() {
		int a[] = null;
		Arrays.sort(a);
	}
	
	@Test(timeout=100)	//time is in m seconds
	public void testArraySort_Performance() {
		int arr[]= {12,4,6};
		for(int i=0;i<1000000;i++) {
			arr[0]=i;
			Arrays.sort(arr);
		}
		
	}
}
