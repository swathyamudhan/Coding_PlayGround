package com.codingbat.string2;

public class BobThere {
	public boolean bobThere(String str) {
		if (str.length() >= 3) {
			for (int i = 0; i <= str.length() - 3; i++) {
				if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
					return true;
				}
			}
		}
		return false;
	}

}
