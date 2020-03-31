package com.codingbat.array2;

public class Pre4 {
	public int[] pre4(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 4 == 0) {
				int[] arr = new int[i];
				int j = 0;
				while (j < i) {
					arr[j] = nums[j];
					j++;
				}
				return arr;
			}
		}
		return new int[] { 0 };
	}
}
