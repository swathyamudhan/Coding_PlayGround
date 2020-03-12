package com.codingbat.string2;

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		if (str.substring(n).contains(str.substring(0, n))) {
			return true;
		}
		return false;
	}

}
