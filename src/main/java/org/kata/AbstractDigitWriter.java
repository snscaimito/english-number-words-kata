package org.kata;

import java.util.Map;

public abstract class AbstractDigitWriter implements NumberWriter {

	protected String writeOut(long number, Map<Long, String> wordMap) {
		if (number < 0)
			throw new NegativeNumberException(number) ;
		
		Long digit = new Long(number) ;
		if (wordMap.containsKey(digit))
			return wordMap.get(digit);
		else
			throw new RuntimeException("Cannot say word for " + digit + " in digit group " + wordMap.getClass().getSimpleName());
	}

}
