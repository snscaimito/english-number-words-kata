package org.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitWriterFactoryTest {

	@Test(expected = OutOfRangeException.class)
	public void rejectNegativeNumbers() {
		DigitWriterFactory factory = new DigitWriterFactory();
		factory.getWriter(-5);
	}

	@Test(expected = OutOfRangeException.class)
	public void unsupportedNumber() {
		DigitWriterFactory factory = new DigitWriterFactory();
		factory.getWriter(9999999999L);
	}

	@Test
	public void singleDigit() {
		DigitWriterFactory factory = new DigitWriterFactory();
		assertTrue(factory.getWriter(5) instanceof SingleDigitWriter);
	}
	
	@Test
	public void teenNumber() {
		DigitWriterFactory factory = new DigitWriterFactory();
		assertTrue(factory.getWriter(12) instanceof TeenDigitWriter);
	}

	@Test
	public void tenNumber() {
		DigitWriterFactory factory = new DigitWriterFactory();
		assertTrue(factory.getWriter(30) instanceof TenDigitWriter);
	}

	@Test(expected=OutOfRangeException.class)
	public void tenNumber25() {
		DigitWriterFactory factory = new DigitWriterFactory();
		assertTrue(factory.getWriter(25) instanceof TenDigitWriter);
	}
}
