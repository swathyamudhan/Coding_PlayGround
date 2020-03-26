package com.codingbat.array2;

public class BigDiff {
	public int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		int diff = max - min;
		return diff;
	}
}

/*
 * int min = Ints.min(nums); int max = Ints.max(nums); int diff = max - min;
 * return diff;
 * 
 */