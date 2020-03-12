package com.codingbat.string2;

public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		String result = "";
		if (count == 0) {
			return result;
		}
		if (count >= 2) {
			for (int i = 1; i <= count; i++) {
				if (i == count) {
					result = result + word;
				} else {
					result = result + word + sep;
				}
			}
		} else {
			result = word;
		}

		return result;
	}

}
