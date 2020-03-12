package com.codingbat.string2;

public class SameStarCharTest {
	public boolean sameStarChar(String str) {
		if (str.isEmpty() || !str.contains("*") || str.equals("*") || str.equals("**")) {
			return true;
		}
		int y = 0;
		for (int i = 0; i <= str.length() - 2; i++) {
			if ((str.charAt(i) == '*')) {
				y = i;
			}
		}
		if (str.charAt(y - 1) == str.charAt(y + 1)) {
			return true;
		}
		return false;
	}

}
