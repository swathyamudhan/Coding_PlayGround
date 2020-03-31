package com.codingbat.array2;

public class TripleUp {
	public boolean tripleUp(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			int temp = nums[i];
			if (nums[i + 1] == temp + 1 && nums[i + 2] == temp + 2) {
				return true;
			}
		}
		return false;
	}
}
