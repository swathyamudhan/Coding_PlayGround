package com.codingbat.string2;

public class XyBalance {
	public boolean xyBalance(String str) {
		if (str.isEmpty() || !str.contains("x")) {
			return true;
		}
		if (str.length() >= 1) {
			for (int i = 0; i <= str.length() - 1; i++) {
				if (str.substring(i, i + 1).equals("x")) {
					if (!str.substring(i + 1).contains("y")) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
