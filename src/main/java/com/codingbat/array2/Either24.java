package com.codingbat.array2;

public class Either24 {
	public boolean either24(int[] nums) {
		boolean twoFlag = false;
		boolean fourFLag = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				twoFlag = true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				fourFLag = true;
			}
		}
		if (fourFLag && !twoFlag) {
			return true;
		} else if (twoFlag && !fourFLag) {
			return true;
		}
		return false;
	}
}
