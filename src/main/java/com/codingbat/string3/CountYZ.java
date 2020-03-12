package com.codingbat.string3;

public class CountYZ {
	public int countYZ(String str) {
		int start = 0;
		int count = 0;
		str = str.toLowerCase();
		while (start < str.length()) {
			int yIndex = str.indexOf('y', start);
			int zIndex = str.indexOf('z', start);
			if (yIndex < 0 && zIndex < 0) {
				break;
			}
			int index = yIndex >= 0 && (yIndex < zIndex || zIndex < 0) ? yIndex : zIndex;
			if (index + 1 == str.length() || !Character.isLetter(str.charAt(index + 1))) {
				count++;
				start = index + 2;
			} else {
				start = index + 1;
			}
		}

		return count;
	}
}
