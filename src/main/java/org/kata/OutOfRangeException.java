package org.kata;

public class OutOfRangeException extends RuntimeException {

	private static final long serialVersionUID = 6133553059838588156L;

	public OutOfRangeException(long number) {
		super(number + " is out of range") ;
	}

}
