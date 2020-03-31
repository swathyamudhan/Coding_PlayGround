package com.codingbat.array2;

public class NotAlone {
	public int[] notAlone(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i] == val) {
				if ((nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) && nums[i - 1] > nums[i + 1]) {
					nums[i] = nums[i - 1];
				} else if (nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {
					nums[i] = nums[i + 1];
				}
			}
		}
		return nums;
	}
}
