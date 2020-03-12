package com.codingbat.string3;

public class EqualIsNot {
	public boolean equalIsNot(String str) {
		int isCount = 0;
		int notCount = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
				isCount++;
			} else {
				if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
					notCount++;
				}
			}
		}

		if (isCount == notCount) {
			return true;
		}
		return false;
	}
}
