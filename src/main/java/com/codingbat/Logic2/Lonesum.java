package com.codingbat.Logic2;

public class Lonesum {
	public int loneSum(int a, int b, int c) {
		int sum = a + b + c;
		if (a == b && b == c) {
			return 0;
		}
		if (a == c) {
			return b;
		}
		if (b == c) {
			return a;
		}
		if (a == b) {
			return c;
		}
		return sum;
	}

}
