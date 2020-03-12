package com.codingbat.string2;

public class ZipZap {
	public String zipZap(String str) {

		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				str = str.substring(0, i + 1) + str.substring(i + 2, str.length());
			}
		}
		return str;
	}

}
