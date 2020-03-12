package com.codingbat.string3;

public class MaxBlock {
	public int maxBlock(String str) {
		int start = 0;
		int count = 1;
		int maxCount = 0;
		while (start < str.length()) {
			int next = start + 1;
			while (next < str.length()) {
				if (str.charAt(start) == str.charAt(next)) {
					count++;
					next++;
				} else {
					next++;
					break;
				}

			}
			start++;
			if (maxCount < count) {
				maxCount = count;
			}
			count = 1;
		}
		return maxCount;
	}

}
