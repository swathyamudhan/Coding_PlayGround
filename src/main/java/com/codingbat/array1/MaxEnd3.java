package com.codingbat.array1;

public class MaxEnd3 {
	public int[] maxEnd3(int[] nums) {
		int temp = 0;
		if (nums[0] > nums[2]) {
			temp = nums[0];
		} else {
			temp = nums[2];
		}
		return new int[] { temp, temp, temp };
	}

}
