package com.codingbat.array1;

public class Has23 {
	public boolean has23(int[] nums) {
		boolean flag = (nums[0] == 2 || nums[1] == 3) || (nums[0] == 3 || nums[1] == 2);
		return flag;
	}

}
