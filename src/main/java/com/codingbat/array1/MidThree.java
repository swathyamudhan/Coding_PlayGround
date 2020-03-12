package com.codingbat.array1;

public class MidThree {
	public int[] midThree(int[] nums) {
		int[] vv = new int[3];

		vv[0] = nums[nums.length / 2 - 1];
		vv[1] = nums[nums.length / 2];
		vv[2] = nums[nums.length / 2 + 1];

		return vv;
	}

}
