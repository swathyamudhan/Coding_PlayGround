package com.codingbat.array3;

public class CanBalance {
	public boolean canBalance(int[] nums) {
		int totalSum = 0;
		int firstSum = 0;
		int i = 0;
		int curIndex = 0;
		while (i >= curIndex) {
			int j = curIndex + 1;
			firstSum += nums[curIndex];
			while (j < nums.length) {
				totalSum += nums[j];
				j++;
			}
			if (firstSum == totalSum) {
				return true;
			}
			curIndex++;
		}
		return false;
	}
}
