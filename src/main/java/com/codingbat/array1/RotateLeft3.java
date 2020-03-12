package com.codingbat.array1;

public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		int[] v = new int[3];
		v[0] = nums[1];
		v[1] = nums[2];
		v[2] = nums[0];
		return v;
	}

}
