package testing.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {

	private RomanNumerals roman;
	
	@Before
	public void setup() {
	roman=new RomanNumerals();
	}
	
	@Test
	public void singleNumber() {
		
		assertEquals(1,roman.convert("I"));
		assertEquals(5,roman.convert("V"));
		assertEquals(10,roman.convert("X"));
		assertEquals(100,roman.convert("C"));
		assertEquals(1000,roman.convert("M"));
	}
	
	@Test
	public void compositeNumber() {
		assertEquals(2,roman.convert("II"));
		assertEquals(6,roman.convert("VI"));
		assertEquals(16,roman.convert("XVI"));
		assertEquals(101,roman.convert("CI"));
		
	}
	
	@Test
	public void compositeNumbberWithRegression() {
		assertEquals(4,roman.convert("IV"));
		assertEquals(9,roman.convert("IX"));
		assertEquals(14,roman.convert("XIV"));
		assertEquals(99,roman.convert("IC"));
		assertEquals(999,roman.convert("IM"));
	}
	
	

}
