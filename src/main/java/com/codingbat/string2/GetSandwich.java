package com.codingbat.string2;

public class GetSandwich {
	public String getSandwich(String str) {
		String result = "";
		if (str.length() >= 11) {
			int index = str.indexOf("bread");
			int lastIndex = str.lastIndexOf("bread");
			result = str.substring(index + 5, lastIndex);
		}

		return result;
	}

}
