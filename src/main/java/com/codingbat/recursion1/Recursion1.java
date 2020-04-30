package com.codingbat.recursion1;

public class Recursion1 {
	public int factorial(int n) {
		int total = 0;
		if (n <= 1) {
			return 1;
		}
		total = n * factorial(n - 1);
		return total;
	}
}
