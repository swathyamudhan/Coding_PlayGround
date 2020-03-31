package com.codingbat.array2;

public class HaveThree {
	public boolean haveThree(int[] nums) {
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length - 4; i++) {
			if (nums[i] == 3 && nums[i + 2] == 3 && nums[i + 4] == 3) {
				flag = true;
			}
		}
		int i = 0;
		while (i < nums.length) {
			if (nums[i] == 3) {
				count++;
			}

			i++;
		}
		if (count == 3 && flag == true) {
			return true;
		}
		return false;
	}
}
