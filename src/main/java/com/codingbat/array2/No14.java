package com.codingbat.array2;

public class No14 {
	public boolean no14(int[] nums) {
		boolean oneFlag = false;
		boolean fourFlag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				oneFlag = true;
			} else if (nums[i] == 4) {
				fourFlag = true;
			}
		}
		if (oneFlag == true && fourFlag == true) {
			return false;
		}
		return true;
	}

}
