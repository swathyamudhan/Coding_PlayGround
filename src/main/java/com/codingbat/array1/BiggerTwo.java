package com.codingbat.array1;

public class BiggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		int sum1 = a[0] + a[1];
		int sum2 = b[0] + b[1];

		if (sum1 >= sum2) {
			return a;
		} else {
			return b;
		}
	}

}
