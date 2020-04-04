package com.codingbat.array2;

public class ZeroMax {
	public int[] zeroMax(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				int j = i;
				max = nums[i];
				while (j < nums.length) {
					if (nums[j] % 2 != 0) {
						max = Integer.max(max, nums[j]);
					}
					j++;
				}
				nums[i] = max;
			}

		}
		return nums;
	}
}
