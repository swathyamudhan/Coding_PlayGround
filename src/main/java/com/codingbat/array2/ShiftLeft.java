package com.codingbat.array2;

public class ShiftLeft {
	public int[] shiftLeft(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = nums[i + 1];
		}
		if (nums.length > 0) {
			arr[nums.length - 1] = nums[0];
		}

		return arr;
	}
}
