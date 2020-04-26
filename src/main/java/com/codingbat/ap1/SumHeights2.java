package com.codingbat.ap1;

public class SumHeights2 {
	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end - 1; i++) {
			if (heights[i] - heights[i + 1] < 0) {
				sum += Math.abs(heights[i] - heights[i + 1]) * 2;
			} else {
				sum += heights[i] - heights[i + 1];
			}
		}
		return sum;
	}
}
