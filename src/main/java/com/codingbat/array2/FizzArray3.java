package com.codingbat.array2;

public class FizzArray3 {
	public int[] fizzArray3(int start, int end) {
		int[] arr = new int[end - start];
		for (int i = 0; start < end; i++) {
			arr[i] += start;
			start++;
		}
		return arr;
	}
}
