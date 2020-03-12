package com.codingbat.warmup;

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		int len = 4;
		if (len > nums.length) {
			len = nums.length;
		}
		for (int i = 0; i < len; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}
		return false;
	}

}
