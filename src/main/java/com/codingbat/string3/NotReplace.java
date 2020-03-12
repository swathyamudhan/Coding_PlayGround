package com.codingbat.string3;

public class NotReplace {
	public String notReplace(String str) {
		str = str.replaceAll("\\bis\\b", "is not");
		return str;
	}

}
/*
 * int start = 0; String result = ""; while (start < str.length()) { int index =
 * str.indexOf("is", start); if (index < 0) { break; } if (index >= 0 &&
 * !Character.isLetter(index - 1)) { str = str.replace(str.substring(index,
 * index + 2), "is not"); } start = index + 3; } return str;
 * 
 * 
 */
