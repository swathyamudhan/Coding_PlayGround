package com.codingbat.warmup;

public class BackAround {
	public String backAround(String str) {
		int l = str.length();
		String back;
		back = str.substring(l - 1);
		if (l > 0) {
			back = back + str + back;
		}
		return back;
	}
}