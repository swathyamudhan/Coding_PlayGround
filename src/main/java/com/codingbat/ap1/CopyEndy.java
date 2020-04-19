package com.codingbat.ap1;

public class CopyEndy {
	public int[] copyEndy(int[] nums, int count) {
		int j = 0;
		int[] arr = new int[count];
		for (int i = 0; i < nums.length; i++) {
			if (j < count) {
				if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
					arr[j] = nums[i];
					j++;
				}
			}
		}
		return arr;
	}
}
