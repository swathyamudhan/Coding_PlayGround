package com.codingbat.recursion1;

public class PowerN {
	public int powerN(int base, int n) {
		if (n == 0) {
			return 1;
		}

		return base * powerN(base - 1, n - 1);
	}
}
