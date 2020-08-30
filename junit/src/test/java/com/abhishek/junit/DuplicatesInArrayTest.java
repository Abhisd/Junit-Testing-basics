package com.abhishek.junit;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicatesInArrayTest {

	DuplicatesInArray da=new DuplicatesInArray();
	@Test
	public void arrayWithDuplicates() {
		int arr[]= {2,3,1,4,3,1};
		int n=arr.length;
		int result=da.countDuplicates(arr,n);
		assertEquals(result,2);
	}
	
	@Test
	public void arrayWithoutDuplicates() {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		int result=da.countDuplicates(arr, n);
		assertEquals(result,0);
	}
}


