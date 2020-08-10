package com.abhishek.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	@Before
	public void before()
	{
		System.out.println("before test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@After
	public void after()
	{
		System.out.println("after test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

}


//@Before method executes after every test method
//@After method executes after every test method
//@BeforeClass and @AfterClass executes before and after class execution.
