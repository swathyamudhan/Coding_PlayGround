package com.codingbat.string2;

public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		int start = 0;
		int mid = str.length() / 2;
		if (str.length() >= 3) {
			if (str.charAt(mid) == 'x') {
				start = mid;
			}
			if (str.charAt(mid) == 'y') {
				start = mid - 1;
			}
			if (str.charAt(mid) == 'z') {
				start = mid - 2;
			}

			int index = str.lastIndexOf("xyz", start);
			if (index < 0)
				return false;
			int lcount = str.substring(0, index).length();
			int rCount = str.substring(index + 3).length();
			int count = rCount - lcount;
			if (Math.abs(count) <= 1) {
				return true;
			}
		}
		return false;
	}
}
