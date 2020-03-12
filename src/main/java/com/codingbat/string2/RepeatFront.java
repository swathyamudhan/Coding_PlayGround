package com.codingbat.string2;

public class RepeatFront {
	public String repeatFront(String str, int n) {
		String result = "";
		String ff = "";
		for (int i = 0; i <= n; i++) {
			result = result + str.substring(0, n);
			n--;
		}
		if (n == 1) {
			ff = result + str.charAt(0);
			return ff;
		} else {
			return result;
		}
	}
}
