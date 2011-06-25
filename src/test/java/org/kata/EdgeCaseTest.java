package org.kata;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class EdgeCaseTest {

	private static Map<Long, String> badMap = new HashMap<Long, String>() ;
	
	static {
		badMap.put(23L, "twenty three") ;
	}
	
	private class EdgeCaseWriter extends AbstractDigitWriter {
		public String writeOut(long number) {
			return super.writeOut(number, badMap) ;
		}
	}
	
	@Test(expected=RuntimeException.class)
	public void badMap() {
		NumberWriter writer = new EdgeCaseWriter() ;
		writer.writeOut(34) ;
	}
	
}
