package com.codingbat.warmup;

public class DelDel {
	public String delDel(String str) {
		String result;
		if (str.length() >= 4) {
			String s = str.substring(1, 4);
			if (s.equals("del")) {
				result = str.replace(s, "");
			} else {
				result = str;
			}
		} else {
			result = str;
		}
		return result;
	}
}
