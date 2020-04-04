package com.codingbat.array2;

public class IsEverywhere {
	public boolean isEverywhere(int[] nums, int val) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i + 1] == val || nums[i] == val)) {
				flag = true;
				count++;
			} else {
				flag = false;
			}
		}
		if (flag && count == nums.length - 1 || nums.length <= 1) {
			return true;
		}
		return false;
	}
}
