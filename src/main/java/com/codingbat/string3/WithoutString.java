package com.codingbat.string3;

public class WithoutString {
	public String withoutString(String base, String remove) {

		String result;
		result = base.replaceAll("(?i)" + remove, "");
		return result;
	}
}
