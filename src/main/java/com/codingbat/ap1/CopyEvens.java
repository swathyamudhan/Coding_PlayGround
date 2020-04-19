package com.codingbat.ap1;

public class CopyEvens {
	public int[] copyEvens(int[] nums, int count) {
		int j = 0;
		int[] arr = new int[count];
		for (int i = 0; i < nums.length; i++) {
			if (j < count) {
				if (nums[i] % 2 == 0) {
					arr[j] = nums[i];
					j++;
				}
			}
		}
		return arr;
	}
}
