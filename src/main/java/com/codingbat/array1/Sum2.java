package com.codingbat.array1;

public class Sum2 {
	public int sum2(int[] nums) {

		int sum = 0;

		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length > 1) {

			sum = nums[0] + nums[1];

		}

		return sum;

	}

}
