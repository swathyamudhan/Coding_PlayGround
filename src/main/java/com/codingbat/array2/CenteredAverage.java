package com.codingbat.array2;

public class CenteredAverage {
	public int centeredAverage(int[] nums) {
		int sum = 0;
		int min = nums[0];
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			min = Integer.min(min, nums[i]);
			max = Integer.max(max, nums[i]);
		}
		sum = sum - (min + max);
		return sum / nums.length - 2;
	}
}
