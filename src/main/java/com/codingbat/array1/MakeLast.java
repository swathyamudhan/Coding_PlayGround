package com.codingbat.array1;

public class MakeLast {
	public int[] makeLast(int[] nums) {
		int len = 2 * (nums.length);
		int[] vv = new int[len];

		vv[vv.length - 1] = nums[nums.length - 1];
		return vv;
	}
}
