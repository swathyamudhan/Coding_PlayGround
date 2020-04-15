package com.codingbat.array3;

public class MaxSpan {
	public int maxSpan(int[] nums) {
		int maxSpan = 0;
		int index = 0;
		int spanValue = 0;
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while (j < nums.length) {
				if (nums[i] == nums[j]) {
					index = j;
				}
				j++;
			}
			spanValue = (index - i) + 1;
			maxSpan = Integer.max(maxSpan, spanValue);
		}
		return maxSpan;
	}
}
