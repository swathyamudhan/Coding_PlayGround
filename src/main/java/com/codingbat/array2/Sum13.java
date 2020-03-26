package com.codingbat.array2;

public class Sum13 {
	public int sum13(int[] nums) {
		int sum = 0;
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != 13) {
				sum += nums[i];
				i++;
			} else {
				i = i + 2;
			}
		}
		return sum;
	}
}
