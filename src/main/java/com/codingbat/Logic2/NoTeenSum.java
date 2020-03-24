package com.codingbat.Logic2;

public class NoTeenSum {
	public int noTeenSum(int a, int b, int c) {
		int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
		return sum;
	}

	public int fixTeen(int n) {
		if ((n != 15 && n != 16) && (n >= 13 && n <= 19)) {
			n = 0;
		}

		return n;
	}
}
