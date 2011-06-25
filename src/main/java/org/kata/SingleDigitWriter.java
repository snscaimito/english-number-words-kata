package org.kata;

import java.util.HashMap;
import java.util.Map;

public class SingleDigitWriter extends AbstractDigitWriter {

	private static Map<Long, String> digitWords = new HashMap<Long, String>();

	static {
		digitWords.put(0L, "zero");
		digitWords.put(1L, "one");
		digitWords.put(2L, "two");
		digitWords.put(3L, "three");
		digitWords.put(4L, "four");
		digitWords.put(5L, "five");
		digitWords.put(6L, "six");
		digitWords.put(7L, "seven");
		digitWords.put(8L, "eight");
		digitWords.put(9L, "nine");
	}

	public String writeOut(long number) {
		if (number < 10)
			return super.writeOut(number, digitWords) ;
		else
			throw new OutOfRangeException(number) ;
	}

}
