package com.codingbat.array2;

public class WithoutTen {
	public int[] withoutTen(int[] nums) {
		int index = 0;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				arr[index] = nums[i];
				index++;
			}
		}
		return arr;
	}
}
