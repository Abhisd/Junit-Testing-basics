package testing.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BiggerAndSmallerTest {

	private BiggerAndSmaller algo;

	@Before
	public void setup() {
		algo = new BiggerAndSmaller();
	}

	private int[] nums(int... ns) {
		return ns;
	}

	private void assertNumbers(int bigger, int smaller) {
		assertEquals(bigger, algo.getBigger());
		assertEquals(smaller, algo.getSmaller());
	}

	@Test
	public void NumbersIncreasingOrder() {

		algo.find(nums ( 2, 3, 4 ));
		assertNumbers(4, 2);
	}

	@Test
	public void NumbersDecreasingOrder() {

		algo.find(nums( 4, 3, 2 ));
		assertNumbers(4, 2);
	}

	@Test
	public void NumbersRandomOrder() {

		algo.find(nums( 4, 6, 3, 9, 2 ));
		assertNumbers(9, 2);
	}

	@Test
	public void repeatedNumbers() {

		algo.find(nums( 4, 2, 5, 4, 3, 2, 5, 3 ));
		assertNumbers(5, 2);
	}

	@Test
	public void singleNumber() {

		algo.find(nums(2));
		assertNumbers(2, 2);
	}

}
