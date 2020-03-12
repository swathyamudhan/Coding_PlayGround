package com.codingbat.string2;

public class WordEnds {
	public String wordEnds(String str, String word) {
		String result = "";
		int start = 0;
		int index = -1;
		int after = -1;
		int before = -1;
		while (start < str.length()) {

			index = str.indexOf(word, start);
			if (index < 0) {
				break;
			}
			before = index - 1;
			after = index + word.length();
			if (before >= 0) {
				result += str.charAt(before);
			}
			if (after < str.length()) {
				result += str.charAt(after);
			}
			start = after;
		}
		return result;
	}

}
