package com.codingbat.array2;

public class Has22 {
	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2) {
				i++;
				if (nums[i] == 2) {
					return true;
				}
			}
		}
		return false;
	}
}
