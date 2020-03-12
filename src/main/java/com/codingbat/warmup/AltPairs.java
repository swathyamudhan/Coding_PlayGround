package com.codingbat.warmup;

public class AltPairs {
	public String altPairs(String str) {
		String result = "";
		if (str.length() >= 3) {
			for (int i = 0; i <= str.length() - 1; i += 4) {
				if ((i) == str.length() - 1) {
					result = result + str.substring(i);
				} else {
					result = result + str.substring(i, i + 2);
				}

			}
		} else {
			result = str;
		}

		return result;
	}

}
