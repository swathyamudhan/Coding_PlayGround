package com.codingbat.string2;

public class MixString {
	public String mixString(String a, String b) {
		String result = "";
		int l = 0;
		if (a.isEmpty() || b.isEmpty() || (a.length() == 1 && b.length() == 1)) {
			return a + b;
		}
		if (a.length() == b.length()) {
			for (int i = 0; i <= a.length() - 1; i++) {
				result = result + a.charAt(i) + b.charAt(i);
			}
			return result;

		}
		int temp = b.length();
		if (a.length() < b.length()) {
			temp = a.length();
		}
		if (temp == a.length()) {
			for (int i = 0; i < a.length(); i++) {
				result = result + a.charAt(i) + b.charAt(i);
				l = i;
			}
			result = result + b.substring(l + 1);

		}
		if (temp == b.length()) {
			for (int i = 0; i < b.length(); i++) {
				result = result + a.charAt(i) + b.charAt(i);
				l = i;
			}
			result = result + a.substring(l + 1);

		}
		return result;
	}

}
