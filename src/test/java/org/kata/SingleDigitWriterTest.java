package org.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleDigitWriterTest {

	@Test
	public void writeZero() {
		NumberWriter writer = new SingleDigitWriter() ;
		assertEquals("zero", writer.writeOut(0)) ;
	}

	@Test
	public void writeOne() {
		NumberWriter writer = new SingleDigitWriter() ;
		assertEquals("one", writer.writeOut(1)) ;
	}

	@Test(expected=OutOfRangeException.class)
	public void rejectTwenty() {
		NumberWriter writer = new SingleDigitWriter() ;
		writer.writeOut(20) ;
	}

}
