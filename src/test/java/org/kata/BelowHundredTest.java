package org.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BelowHundredTest {

	@Test(expected=NegativeNumberException.class)
	public void rejectNegativeNumbers() {
		NumberWriter writer = new SingleDigitWriter() ;
		writer.writeOut(-1) ;
	}
	
	@Test
	public void writeTwentyOne() {
		NumberWriter writer = new BigNumberWriter() ;
		assertEquals("twenty one", writer.writeOut(21)) ;
	}

	@Test
	public void writeFourtyFive() {
		NumberWriter writer = new BigNumberWriter() ;
		assertEquals("fourty five", writer.writeOut(45)) ;
	}

}
