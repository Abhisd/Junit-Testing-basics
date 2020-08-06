package com.abhishek.mockito.bussiness;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


import java.util.List;

import org.junit.Test;

public class ListTest {
	
	@Test
	public void testListSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void testList() {
		List listMock = mock(List.class);
		//Argument matcher
		//by using anyInt() testList() will show hello for every integer value. 
		when(listMock.get(anyInt())).thenReturn("hello");
		assertEquals("hello",listMock.get(0));
		
	}
	
	@Test(expected=RuntimeException.class)
	public void testListExceptionHandling() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		listMock.get(0);
	}
	
	@Test
	public void testList_usingBDD() {
		
		//given
		List<String> listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("hello");
		
		//when
		String firstElement=listMock.get(0);
		
		//then
		assertThat(firstElement,is("hello"));
		
	}
	

}







