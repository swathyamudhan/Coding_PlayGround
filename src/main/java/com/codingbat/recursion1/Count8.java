package com.codingbat.recursion1;

public class Count8 {
	public int count8(int n) {
		int count = 0;
		if (n == 0) {
			return 0;
		}
		if (n % 10 == 8) {
			int val = n / 10;
			if (val % 10 == 8) {
				count += 2;
			} else {
				count += 1;
			}
		}
		return count + count8(n / 10);
	}
}
