package org.kata;

public class BigNumberWriter implements NumberWriter {

	private static final long HUNDRED = 100;
	private static final long THOUSAND = 1000;
	private static final long MILLION = 1000000;

	private DigitWriterFactory writerFactory = new DigitWriterFactory();
	private NumberWriter singleDigitWriter = new SingleDigitWriter();
	private NumberWriter tenDigitWriter = new TenDigitWriter();

	public String writeOut(long number) {
		String output = "";

		if (number > 999999999) {
			throw new OutOfRangeException(number);
		} else if (number < 20) {
			return writerFactory.getWriter(number).writeOut(number);
		} else if (number > 999999) {
			output += writeOutGroup(number, "million", MILLION);
		} else if (number > 999) {
			output += writeOutGroup(number, "thousand", THOUSAND);
		} else if (number > 99) {
			output += writeOutGroup(number, "hundred", HUNDRED);
		} else {
			output += writeOutCouple(number);
		}

		return output;
	}

	private String writeOutGroup(long number, String groupName, long groupValue) {
		long fraction = number / groupValue;
		String output = writeOut(fraction) + " " + groupName;

		long remainder = number - fraction * groupValue;
		if (remainder > 0)
			output += " and " + writeOut(remainder);

		return output;
	}

	private String writeOutCouple(long number) {
		long tenFraction = (number / 10) * 10;
		String output = tenDigitWriter.writeOut(tenFraction);

		long lastDigit = number - tenFraction;
		if (lastDigit > 0)
			output += " " + singleDigitWriter.writeOut(lastDigit);

		return output;
	}

}
