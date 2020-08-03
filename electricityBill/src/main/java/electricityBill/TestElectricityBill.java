package electricityBill;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestElectricityBill {

	ElectricityBillCalculator ecb;

	@Test
	public void testEBillFor0Units() {
		ecb = new ElectricityBillCalculator(0);
		assertEquals(0.0, ecb.calculateBillAmount(), 0.0000000000001);

	}

	@Test
	public void testBillAmountFor40Units() {
		ecb = new ElectricityBillCalculator(40);
		assertEquals(104.0, ecb.calculateBillAmount(), 0.0000000000001);
	}

	@Test
	public void testBillAmountFor160Units() {
		ecb = new ElectricityBillCalculator(160);
		assertEquals(608.0999999999999, ecb.calculateBillAmount(), 0.0000000000001);
	}

	@Test
	public void testBillAmountFor400Units() {
		ecb = new ElectricityBillCalculator(400);
		assertEquals(2368.5, ecb.calculateBillAmount(), 0.0000000000001);
	}

	@Test
	public void testBillAmountFor4000Units() {
		ecb = new ElectricityBillCalculator(4000);
		assertEquals(37018.5, ecb.calculateBillAmount(), 0.0000000000001);
	}

}
