package com.codingbat.array2;

public class TwoTwo {
	public boolean twoTwo(int[] nums) {
		int i = 0;
		boolean flag = true;
		while (i < nums.length) {
			if (nums[i] == 2) {
				// check if there is a 2 before or check if there is a 2 after
				if ((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2)) {
					flag = true;
				} else {
					flag = false;
				}
			}
			i++;
		}
		return flag;
	}

}
