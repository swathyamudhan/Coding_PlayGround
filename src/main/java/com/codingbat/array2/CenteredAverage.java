package com.codingbat.array2;

public class CenteredAverage {
	public int centeredAverage(int[] nums) {
		int[] val = new int[nums.length];
		int sum = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[0] < nums[i]) {
				val[i] = nums[i];
			}
		}
		for (int i = 1; i < val.length - 1; i++) {
			sum += val[i];
		}
		return sum / val.length - 2;
	}
}
