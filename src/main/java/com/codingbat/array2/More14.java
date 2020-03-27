package com.codingbat.array2;

public class More14 {
	public boolean more14(int[] nums) {
		int oneCount = 0;
		int fourCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				oneCount += 1;
			}
			if (nums[i] == 4) {
				fourCount += 1;
			}
		}
		if (oneCount > fourCount) {
			return true;
		}
		return false;
	}
}
