package com.codingbat.string3;

public class GHappy {
	public boolean gHappy(String str) {
		boolean flag = false;
		int start = 0;
		if (str.isEmpty()) {
			return true;
		}

		while (start < str.length()) {
			int index = str.indexOf('g', start);
			if (index < 0) {
				break;
			}
			if (index != 0 && str.charAt(index - 1) == 'g') {
				flag = true;
			} else {
				flag = false;
			}
			start = index + 1;
		}
		return flag;
	}
}
