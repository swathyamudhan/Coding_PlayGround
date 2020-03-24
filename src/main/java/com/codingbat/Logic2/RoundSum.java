package com.codingbat.Logic2;

public class RoundSum {
	public int roundSum(int a, int b, int c) {
		int sum = round10(a) + round10(b) + round10(c);
		return sum;
	}

	public int round10(int num) {
		int modVal = num % 10;
		int divVal = num / 10;
		if (modVal >= 5) {
			num = 10 * divVal + (10 - modVal) + modVal;
		} else {
			num = 10 * divVal;
		}
		return num;
	}

}
