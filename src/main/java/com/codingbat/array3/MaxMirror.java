package com.codingbat.array3;

public class MaxMirror {
	public int maxMirror(int[] nums) {
		int j = 0;
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			j = i + 1;
			while (j < nums.length) {
				if (nums[i] == nums[j]) {
					int start = i;
					int next = j;
					for (int k = start; k <= next; k++, next--) {
						if (nums[k] == nums[next]) {
							len++;
						}
					}
				}
				j++;
			}
		}
		return len;
	}
}
