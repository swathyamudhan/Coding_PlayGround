package com.codingbat.array3;

public class SeriesUp {
	public int[] seriesUp(int n) {
		int len = n * (n + 1) / 2;
		int[] arr = new int[len];
		int i = 0;
		for (int end = 1; end <= n; end++) {
			for (int num = 1; num <= end; num++, i++) {
				arr[i] = num;
			}
		}
		return arr;
	}
}
