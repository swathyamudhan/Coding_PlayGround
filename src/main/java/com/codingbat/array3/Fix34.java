package com.codingbat.array3;

public class Fix34 {
	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				int j = 0;
				int k = i + 1;
				if (nums[k] != 4) {
					while (j < nums.length) {
						if (nums[j] == 4 && nums[j - 1] != 3) {
							int temp = nums[j];
							nums[j] = nums[k];
							nums[k] = temp;
						}
						j++;
					}
				}
			}
		}
		return nums;
	}
}
