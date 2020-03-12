package com.codingbat.array1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		int[] n = new int[2];

		n[0] = nums[nums.length / 2 - 1];
		n[1] = nums[nums.length / 2];

		return n;
	}

}
