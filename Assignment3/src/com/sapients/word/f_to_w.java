package com.sapients.word;

/*public class f_to_w {
	private static final String[] specialNames = {

			"", " thousand", " million", " billion", " trillion", " quadrillion", " quintillion"

	};

	private static final String[] tensNames = {

			"", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"

	};

	private static final String[] numNames = {

			"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven",
			" twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"

	};

	private static String convertLessThanOneThousand(int n) {

		String current;

		if (n % 100 < 20) {
			current = numNames[n % 100];
			n /= 100;
		} else {
			current = numNames[n % 10];
			n /= 10;
			current = tensNames[n % 10] + current;
			n /= 10;
		}

		if (n == 0) {
			return current;
		}
		return numNames[n] + " hundred" + current;
	}

	public static String fig_to_word(long number) {

		if (number == 0) {
			return "zero";
		}

		String prefix = "";

		if (number < 0) {
			number = -number;
			prefix = "negative";
		}

		String Word = "";
		int i = 0; // this specifies the power of 1000 the number is at.

		do {
			long n = number % 1000;
			if (n != 0) {
				String s = convertLessThanOneThousand((int) n);
				Word = s + specialNames[i] + Word;
			}
			i++;
			number /= 1000;
		} while (number > 0);

		return (prefix + Word).trim() + " only.";
	}

}*/
public class f_to_w {
	public static String fig_to_word(long number) {
		String words = "";

		String units[] = { "zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String tens[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String val[] = { "Crores", "Lakhs", "Thousands", "Hundreds", "only" };
		;

		long inVal[] = { 10000000, 100000, 1000, 100, 1 };

		for (int i = 0; i < inVal.length; i++) {
			long b1 = number / inVal[i];
			number = number % inVal[i];

			if (b1 > 0) {
				if (b1 > 19) {
					words = words + tens[(int) b1 / 10] + units[(int) b1 % 10] + val[i];
				} else {
					words = words + units[(int) b1] + val[i];
				}
			}

		}
		return words;
	}

}


