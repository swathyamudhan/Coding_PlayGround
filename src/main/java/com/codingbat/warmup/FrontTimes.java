package com.codingbat.warmup;

public class FrontTimes {
	public String frontTimes(String str, int n) {
		String result = "";
		if (str.length() >= 3) {
			for (int i = 0; i < n; i++) {
				result = result + str.substring(0, 3);
			}
		}
		if (str.length() == 2) {
			for (int i = 0; i < n; i++) {
				result = result + str.substring(0, 2);
			}
		}
		if (str.length() == 1) {
			for (int i = 0; i < n; i++) {
				result = result + str.substring(0, 1);
			}
		}

		return result;
	}

}
