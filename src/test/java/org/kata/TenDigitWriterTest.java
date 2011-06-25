package org.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TenDigitWriterTest {

	@Test
	public void writeTen() {
		NumberWriter writer = new TenDigitWriter() ;
		assertEquals("ten", writer.writeOut(10)) ;
	}

	@Test
	public void writeThirty() {
		NumberWriter writer = new TenDigitWriter() ;
		assertEquals("thirty", writer.writeOut(30)) ;
	}
	
	@Test(expected=OutOfRangeException.class)
	public void writeEleven() {
		NumberWriter writer = new TenDigitWriter() ;
		writer.writeOut(11) ;
	}
	

}
