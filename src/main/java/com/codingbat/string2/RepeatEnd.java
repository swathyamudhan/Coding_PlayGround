package com.codingbat.string2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		if (str.isEmpty() || n == 0) {
			return "";
		}
		String result;
		int len = str.length() - n;
		result = str.substring(len);
		String newString = String.format("%0" + n + "d", 0).replace("0", result);
		return newString;
	}

}
