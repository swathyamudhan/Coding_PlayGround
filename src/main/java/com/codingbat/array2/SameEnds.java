package com.codingbat.array2;

public class SameEnds {
	public boolean sameEnds(int[] nums, int len) {
		int i = 0;
		if (len == 0) {
			return true;
		}
		while (i < nums.length && len > 0) {
			if (nums[i] != nums[nums.length - len]) {
				return false;
			}
			i++;
			len--;
		}
		return true;
	}
}
