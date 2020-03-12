package com.codingbat.warmup;

public class StringInput {
	public String notString(String str) {
		if (str.startsWith("not"))
			return str;
		else
			return "not " + str;
	}
}
