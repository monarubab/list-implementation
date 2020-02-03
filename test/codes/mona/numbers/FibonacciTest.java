package codes.mona.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void getFibonacci0() {

		assertEquals(0, new Fibonacci().getFibonacci(0));
	}

	@Test
	public void getFibonacci1() {

		assertEquals(1, new Fibonacci().getFibonacci(1));
	}

	@Test
	public void getFibonacci5() {

		assertEquals(5, new Fibonacci().getFibonacci(5));
	}

	@Test
	public void getFibonacci4() {

		assertEquals(3, new Fibonacci().getFibonacci(4));
	}

	@Test(expected=IllegalArgumentException.class)
	public void getFibonacciMinus1() {

		new Fibonacci().getFibonacci(-1);
	}
}
