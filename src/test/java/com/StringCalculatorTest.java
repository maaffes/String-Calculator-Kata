package com;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public final void ShouldReturnZeroForEmptyString() throws Exception {
			String numbers="";
			int actual = StringCalculator.Add(numbers);
			assertEquals(0,actual);

	}

	@Test
	public final void ShouldReturnNumberIfGivenOneNumber() throws Exception {
			String numbers="1,2";
			int actual = StringCalculator.Add(numbers);
			assertEquals(3,actual);

	}
	@Test
	public final void ShouldAllowNewLineAsASeparator() throws Exception {
			String numbers="1/n2,2";
			int actual = StringCalculator.Add(numbers);
			assertEquals(5,actual);

	}
	@Test
	public final void ShouldSupportDifferentSeparators() throws Exception {
			String numbers="//;1/n2;2";
			int actual = StringCalculator.Add(numbers);
			assertEquals(5,actual);

	}
	
	@Test
	public final void  ShouldThrowExceptionIfEndWhithASeparator() throws Exception {
		String numbers="1,/n";
	    exceptionRule.expectMessage("Number not allowed: "+numbers);
	    StringCalculator.Add(numbers);

	}
	@Test
	public final void  ShouldThrowExceptionNumberNotAllowed() throws Exception {
		String numbers="d1s,/n";
	    exceptionRule.expectMessage("Number not allowed: "+numbers);
	    StringCalculator.Add(numbers);

	}

	@Test
	public void ShouldThrowExceptionIfNegativeInArgs() throws Exception {
		
	    String numbers="//;1/n2;-2";
	    List<String> neg= Arrays.asList("-2");
	    exceptionRule.expectMessage("negatives not allowed"+neg);
	    StringCalculator.Add(numbers);
	
	}
		

}


	   
