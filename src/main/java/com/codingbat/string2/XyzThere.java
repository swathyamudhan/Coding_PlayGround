package com.codingbat.string2;

public class XyzThere {
	public boolean xyzThere(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("xyz"))
				return true;
			for (int i = 1; i <= str.length() - 3; i++) {
				if (!(str.charAt(i - 1) == '.') && str.substring(i, i + 3).equals("xyz")) {
					return true;
				}
			}
		}
		return false;
	}
}
