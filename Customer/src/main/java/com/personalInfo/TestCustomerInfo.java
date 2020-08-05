package com.personalInfo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomerInfo {

	CustomerInfo customer = new CustomerInfo(null, "MS", "Dhoni");

	@Test
	public void testValidAadharNoFor16Digits() {
		assertTrue(CustomerInfo.isValidAadharNo("512354832145"));

	}

	@Test
	public void testisValidAadharNo_forStartingWith0_1() {
		assertFalse(CustomerInfo.isValidAadharNo("012354832145"));
		assertFalse(CustomerInfo.isValidAadharNo("162354832145"));
	}

	@Test
	public void testEqualityOfFirstNameAndLastName() {
		assertNotEquals(customer.getfName(), customer.getlName());
	}

}
