package com.codingbat.string2;

public class StarOut {
	public String starOut(String str) {
		String result = "";
		int index = -1;
		int before = -1;
		int start = 0;
		while (start < str.length()) {
			index = str.indexOf("*", start);
			if (index < 0) {
				result += str.substring(start);
				break;
			}
			before = index - 1;
			if (before > start) {
				result += str.substring(start, before);
			}
			while (index + 1 < str.length() && str.charAt(index + 1) == '*') {
				index++;
			}
			start = index + 2;
		}

		return result;
	}

}
