package com.codingbat.string2;

public class PlusOut {
	public String plusOut(String str, String word) {
		String result = "";
		int start = 0;
		int index = 0;
		while (start < str.length()) {
			index = str.indexOf(word, start);
			if (index < 0) {
				index = str.length();
			}
			while (start < index) {
				result += "+";
				start++;

			}
			if (index != str.length()) {
				result += word;
			}

			start = index + word.length();
		}
		return result;
	}
}
