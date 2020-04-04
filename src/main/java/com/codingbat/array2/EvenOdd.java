package com.codingbat.array2;

public class EvenOdd {
	public int[] evenOdd(int[] nums) {
		int start = 0;
		int j = 0;

		while (start < nums.length) {
			if (nums[start] % 2 == 0) {
				int temp = nums[start];
				nums[start] = nums[j];
				nums[j] = temp;
				j++;
			}
			start++;
		}
		return nums;
	}
}
