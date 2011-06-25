package org.kata;

import java.util.HashMap;
import java.util.Map;

public class TeenDigitWriter extends AbstractDigitWriter {
	private static Map<Long, String> teenWords = new HashMap<Long, String>();

	static {
		teenWords.put(11L, "eleven");
		teenWords.put(12L, "twelve");
		teenWords.put(13L, "thirteen");
		teenWords.put(14L, "fourteen");
		teenWords.put(15L, "fifteen");
		teenWords.put(16L, "sixteen");
		teenWords.put(17L, "seventeen");
		teenWords.put(18L, "eighteen");
		teenWords.put(19L, "nineteen");
	}

	public String writeOut(long number) {
		if (number > 10 && number < 20)
			return super.writeOut(number, teenWords) ;
		else
			throw new OutOfRangeException(number) ;
	}

}
