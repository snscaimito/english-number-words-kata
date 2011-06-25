package org.kata;

public class NegativeNumberException extends OutOfRangeException {

	private static final long serialVersionUID = 510689940676308119L;

	public NegativeNumberException(long number) {
		super(number) ;
	}

}
