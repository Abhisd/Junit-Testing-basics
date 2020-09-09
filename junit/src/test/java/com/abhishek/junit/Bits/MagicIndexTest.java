package com.abhishek.junit.Bits;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagicIndexTest {

	MagicIndex m=new MagicIndex();
	@Test
	public void arrayWithMagicIndex() {
		int arr[]= {-40,-20,-1,1,2,3,5,7,9,12,13};
		int result=m.magicIndex(arr);
		assertEquals(result,7);
	}
	
	@Test
	public void arrayWithNoMagicIndex() {

		int arr[]= {9,2,3,5,4,7,6};
		int result=m.magicIndex(arr);
		assertEquals(result,-1);
	
	}

}
