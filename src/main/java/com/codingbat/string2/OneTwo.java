package com.codingbat.string2;

public class OneTwo {
	public String oneTwo(String str) {
		String result = "";
		for (int i = 0; i <= str.length() - 3; i++) {
			if (i % 3 == 0) {
				result = result + str.substring(i + 1, i + 3) + str.charAt(i);
			}

		}
		return result;
	}

}
