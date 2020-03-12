package com.codingbat.warmup;

public class MissingChar {

	public String missingChar(String str, int n) {
		StringBuilder st = new StringBuilder(str);
		st.deleteCharAt(n);
		return st.toString();
	}
}
