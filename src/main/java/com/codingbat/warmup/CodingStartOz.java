package com.codingbat.warmup;

public class CodingStartOz {
	public String startOz(String str) {
		String result = "";
		if (str.length() == 1 && str.substring(0, 1).equals("o")) {
			result = "o";
		} else if (str.length() > 1 && str.substring(0, 1).equals("o") && !str.substring(0, 2).equals("oz")) {
			result = "o";
		} else if (str.length() > 1 && str.substring(1, 2).equals("z") && !str.substring(0, 2).equals("oz")) {
			result = "z";
		} else if (str.length() >= 2 && str.substring(0, 2).equals("oz")) {
			result = str.substring(0, 2);
		}
		return result;
	}
}
