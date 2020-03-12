package com.codingbat.warmup;

public class FrontBack {
	public String frontBack(String str) {
		if (str.length() == 1 || str.isEmpty()) {
			return str;
		} else {
			String front = str.replace(str.charAt(0), str.charAt(str.length() - 1));
			String back = str.replace(str.charAt(str.length() - 1), str.charAt(0));
			char f = front.charAt(0);
			char b = back.charAt(str.length() - 1);
			String s = str.substring(1, str.length() - 1);
			return f + s + b;
		}
	}
}
