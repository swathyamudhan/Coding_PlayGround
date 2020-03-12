package com.codingbat.string3;

public class MirrorEnds {
	public String mirrorEnds1(String string) {
		int start = 0;
		int end = string.length() - 1;
		while (start < string.length() && end >= 0) {
			if (string.charAt(start) == string.charAt(end)) {
				start++;
				end--;
			} else {
				break;
			}
		}
		return string.substring(0, start);

	}

}
