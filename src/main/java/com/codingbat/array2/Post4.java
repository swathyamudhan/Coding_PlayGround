package com.codingbat.array2;

public class Post4 {
	public int[] post4(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				int[] arr = new int[(nums.length - i) - 1];
				int j = i + 1;
				i = 0;
				while (j < nums.length) {
					arr[i] = nums[j];
					j++;
					i++;
				}
				return arr;
			}
		}
		return new int[] { 0 };
	}

}
