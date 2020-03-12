package com.codingbat.string3;

public class SameEnds {
	public String sameEnds(String string) {
		if (string.length() <= 1 || string.isEmpty()) {
			return "";
		}

		int evenLength = string.length() / 2;
		int oddLength = (string.length() / 2) + 1;

		int index = string.lastIndexOf(string.substring(0, 1));
		int start = 0;

		if (0 == index) {
			return "";
		}

		if (string.length() % 2 == 0) {
			index = evenLength;
		} else {
			index = oddLength;
		}
		while (start < string.length()) {
			if (string.charAt(start) == string.charAt(index)) {
				start++;
				index++;
				if (index == string.length()) {
					return string.substring(0, start);
				}
			} else {
				index = index + 1;
			}
		}
		return "";
	}

}
