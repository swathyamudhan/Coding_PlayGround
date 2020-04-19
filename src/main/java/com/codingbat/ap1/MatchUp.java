package com.codingbat.ap1;

public class MatchUp {
	public int matchUp(String[] a, String[] b) {
		int count = 0;
		int i = 0;
		while (i < a.length) {
			if (a[i].length() != 0 && b[i].length() != 0) {
				if (a[i].startsWith(b[i].substring(0, 1))) {
					count++;
				}
			}
			i++;
		}
		return count;
	}
}
