package com.codingbat.warmup;

public class StringMatch {
	public int stringMatch(String a, String b) {
		int count = 0;
		int len = b.length() - 1;
		if (b.length() > a.length()) {
			len = a.length() - 1;
		}
		if (a.length() >= 2 && b.length() >= 2) {
			for (int i = 0; i < len; i++) {
				if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
					count++;
				}
			}
		} else {
			return 0;
		}
		return count;
	}

}
