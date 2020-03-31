package com.codingbat.array2;

public class TenRun {
	public int[] tenRun(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			if (nums[i] % 10 == 0) {
				int temp = nums[i];
				while (i < nums.length) {
					if (nums[i] % 10 != 0) {
						nums[i] = temp;
						i++;
					} else {
						temp = nums[i];
						i++;
					}
				}
			}
			i++;
		}
		return nums;
	}
}
