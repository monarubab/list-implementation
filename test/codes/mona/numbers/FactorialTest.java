package codes.mona.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	@Test(expected = IllegalArgumentException.class)
	public void getFactorialMinusNumber() {
		new Factorial().getFactorial(-1);
	}

	@Test
	public void getFactorial0() {
		assertEquals(1, new Factorial().getFactorial(0));
	}
	
	@Test
	public void getFactorial4() {
		assertEquals(24, new Factorial().getFactorial(4));
	}
}
