package com.codingbat.array2;

public class Has77 {
	public boolean has77(int[] nums) {
		boolean joinFlag = false;
		boolean seperateFlag = false;
		int i = 0;
		while (i < nums.length - 1) {
			if (nums[i] == 7) {
				i++;
				if (nums[i] == 7) {
					joinFlag = true;
				}
			}
			i++;
		}
		i = 0;
		while (i < nums.length - 2) {
			if (nums[i] == 7) {
				i = i + 2;
				if (nums[i] == 7) {
					seperateFlag = true;
				}
			}
			i++;
		}
		if (joinFlag) {
			return true;
		} else if (seperateFlag) {
			return true;
		}
		return false;
	}
}
