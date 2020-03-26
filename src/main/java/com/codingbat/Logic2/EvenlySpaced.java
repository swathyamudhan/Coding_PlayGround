package com.codingbat.Logic2;

import java.util.Arrays;

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		int[] ar = { a, b, c };
		Arrays.sort(ar);
		if ((ar[1] - ar[0]) == (ar[2] - ar[1])) {
			return true;
		}
		return false;
	}
}
