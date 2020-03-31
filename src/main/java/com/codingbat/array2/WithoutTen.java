package com.codingbat.array2;

public class WithoutTen {
	public int[] withoutTen(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 10) {
				nums[i] = 0;
			}
		}
		return nums;
	}
}
