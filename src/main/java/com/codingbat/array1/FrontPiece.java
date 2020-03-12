package com.codingbat.array1;

public class FrontPiece {
	public int[] frontPiece(int[] nums) {
		if (nums.length > 2) {
			int[] vv = new int[2];
			vv[0] = nums[0];
			vv[1] = nums[1];
			return vv;
		}
		return nums;

	}

}
