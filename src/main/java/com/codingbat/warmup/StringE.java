package com.codingbat.warmup;

public class StringE {
	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count = count + 1;
			}
		}
		if (str.length() > 0 && count >= 1 && count <= 3) {
			return true;
		} else {
			return false;
		}
	}

}
