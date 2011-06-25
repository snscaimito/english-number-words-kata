package org.kata;

public class DigitWriterFactory {

	public NumberWriter getWriter(long number) {
		if (number < 0)
			throw new OutOfRangeException(number) ;
		
		if (number < 10)
			return new SingleDigitWriter() ;
		else if (number < 100 && number % 10 == 0)
			return new TenDigitWriter() ;
		else if (number < 20)
			return new TeenDigitWriter() ;
		else
			throw new OutOfRangeException(number) ;
	}

}
