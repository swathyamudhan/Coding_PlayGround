package com.codingbat.array1;

public class No23 {
	public boolean no23(int[] nums) {
		boolean flag = true;
		if ((nums[0] == 2 || nums[1] == 3) || (nums[0] == 3 || nums[1] == 2)) {
			flag = false;
		}

		return flag;
	}

}
