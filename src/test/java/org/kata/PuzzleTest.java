package org.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuzzleTest {

	private NumberWriter writer = new BigNumberWriter() ;
	
	@Test(expected=NegativeNumberException.class)
	public void rejectNegativeNumbers() {
		NumberWriter writer = new SingleDigitWriter() ;
		writer.writeOut(-1) ;
	}
	
	@Test
	public void writeZero() {
		assertEquals("zero", writer.writeOut(0)) ;
	}

	@Test
	public void writeOne() {
		assertEquals("one", writer.writeOut(1)) ;
	}

	@Test
	public void writeEleven() {
		assertEquals("eleven", writer.writeOut(11)) ;
	}

	@Test
	public void writeNineteen() {
		assertEquals("nineteen", writer.writeOut(19)) ;
	}

	@Test
	public void writeTen() {
		assertEquals("ten", writer.writeOut(10)) ;
	}

	@Test
	public void writeThirty() {
		assertEquals("thirty", writer.writeOut(30)) ;
	}

	@Test
	public void writeOneHundred() {
		assertEquals("one hundred", writer.writeOut(100)) ;
	}

	@Test
	public void writeOneHundredAndFive() {
		assertEquals("one hundred and five", writer.writeOut(105)) ;
	}

	@Test
	public void writeOneThousand() {
		assertEquals("one thousand", writer.writeOut(1000)) ;
	}

	@Test
	public void writeThreeThousandAndOneHundredAndFive() {
		assertEquals("three thousand and one hundred and five", writer.writeOut(3105)) ;
	}

	@Test
	public void writeOneMillion() {
		assertEquals("one million", writer.writeOut(1000000)) ;
	}

	@Test
	public void writeThreeMillionAndOneHundredAndFive() {
		assertEquals("three million and one hundred and five", writer.writeOut(3000105)) ;
	}
	
	@Test
	public void writeThreeMillionAndFiveThousandAndOneHundredAndFive() {
		assertEquals("three million and five thousand and one hundred and five", writer.writeOut(3005105)) ;
	}
	
	@Test
	public void fiftySixMillionAndNineHundredAndFortyFiveThousandAndSevenHundredAndEightyOne() {
		assertEquals("fifty six million and nine hundred and fourty five thousand and seven hundred and eighty one", writer.writeOut(56945781)) ;
	}
	
	@Test(expected=OutOfRangeException.class)
	public void §unsupportedNumber() {
		writer.writeOut(1000000000) ;
	}
	
	@Test
	public void objectPrimitiveEquality() {
		assertTrue(new Long(1).equals(1L)) ;
	}
}
