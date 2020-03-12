package com.codingbat.warmup;

public class DoubleX {
	boolean doubleX(String str) {
		boolean flag = false;
		if (str.length() >= 2) {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == 'x') {
					if (str.charAt(i + 1) == 'x') {
						flag = true;
					} else {
						break;
					}
				}
			}
		}
		return flag;
	}

}
