package org.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeenDigitWriterTest {

	@Test
	public void writeEleven() {
		NumberWriter writer = new TeenDigitWriter() ;
		assertEquals("eleven", writer.writeOut(11)) ;
	}

	@Test
	public void writeNineteen() {
		NumberWriter writer = new TeenDigitWriter() ;
		assertEquals("nineteen", writer.writeOut(19)) ;
	}

	@Test(expected=OutOfRangeException.class)
	public void writeTen() {
		NumberWriter writer = new TeenDigitWriter() ;
		writer.writeOut(10) ;
	}

	@Test(expected=OutOfRangeException.class)
	public void writeTwenty() {
		NumberWriter writer = new TeenDigitWriter() ;
		writer.writeOut(20) ;
	}

}
