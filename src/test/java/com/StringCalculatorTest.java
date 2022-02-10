package com;

import static org.junit.Assert.*;

import org.junit.*;

public class StringCalculatorTest {

	@Test
	public final void test_calculator() throws Exception {
			String numbers="//;1/n2;2";
			int actual = StringCalculator.Add(numbers);
			assertEquals(5,actual);

	}

}
