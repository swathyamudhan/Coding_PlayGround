package com.codingbat.warmup;

public class MixStart {
	public boolean mixStart(String str) {
		if (str.length() >= 3) {
			String sub = str.substring(1, 3);
			if (sub.equals("ix")) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}
}
