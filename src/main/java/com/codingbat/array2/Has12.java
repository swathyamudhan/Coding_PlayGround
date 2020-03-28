package com.codingbat.array2;

public class Has12 {
	public boolean has12(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				i++;
				while (i < nums.length) {
					if (nums[i] == 2) {
						return true;
					}
					i++;
				}
			}
		}
		return false;
	}
}
