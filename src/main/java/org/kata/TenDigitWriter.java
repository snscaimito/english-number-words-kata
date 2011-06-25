package org.kata;

import java.util.HashMap;
import java.util.Map;

public class TenDigitWriter extends AbstractDigitWriter {

	private static Map<Long, String> tenWords = new HashMap<Long, String>();

	static {
		tenWords.put(10L, "ten");
		tenWords.put(20L, "twenty");
		tenWords.put(30L, "thirty");
		tenWords.put(40L, "fourty");
		tenWords.put(50L, "fifty");
		tenWords.put(60L, "sixty");
		tenWords.put(70L, "seventy");
		tenWords.put(80L, "eighty");
		tenWords.put(90L, "ninety");
	}
	public String writeOut(long number) {
		if (tenWords.containsKey(new Long(number)))
			return super.writeOut(number, tenWords) ;
		else
			throw new OutOfRangeException(number) ;
	}

}
