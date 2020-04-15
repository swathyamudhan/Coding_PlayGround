package com.codingbat.array3;

public class CountClumps {
	public int countClumps(int[] nums) {
		int count = 0;
		boolean flag = false;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				if (flag == false) {
					count++;
				}
				flag = true;
			} else {
				flag = false;
			}
		}
		return count;
	}
}
