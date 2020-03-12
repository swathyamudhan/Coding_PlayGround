package com.codingbat.warmup;

public class StringX {
	public String stringX(String str) {
		String result = "";
		String join = "";
		if (str.length() >= 2) {
			join = str.replace("x", "");
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
					result = str.charAt(0) + join + str.charAt(str.length() - 1);
				} else {
					result = join;
				}
			}
		} else {
			result = str;
		}

		return result;
	}

}
