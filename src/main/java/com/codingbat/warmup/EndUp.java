package com.codingbat.warmup;

public class EndUp {
	public String endUp(String str) {
		if (str.length() >= 3) {
			return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
		} else {
			return str.toUpperCase();
		}

	}
}

/*
 * String result = ""; if (str.length() >= 3) { String[] spt = str.split(" ");
 * for (int i = 0; i < spt.length; i++) { result = str.substring(0, str.length()
 * - 3) + spt[spt.length - 1].substring(2, 5).toUpperCase(); } } else { result =
 * str.toUpperCase(); } return result;
 */