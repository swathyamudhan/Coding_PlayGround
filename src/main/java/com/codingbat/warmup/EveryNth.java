package com.codingbat.warmup;

public class EveryNth {
	public String everyNth(String str, int n) {
		String result = "";
		for (int i = 1; i < str.length(); i++) {
			if (i % n == 0) {
				result = result + str.charAt(i);
			}
		}

		return str.charAt(0) + result;

	}
}
