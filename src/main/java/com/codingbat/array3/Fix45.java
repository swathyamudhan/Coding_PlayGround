package com.codingbat.array3;

public class Fix45 {
	public int[] fix45(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				int j = 0;
				int k = i + 1;
				if (nums[k] != 5) {
					while (j < nums.length) {
						if ((nums[j] == 5 && j == 0) || (nums[j] == 5 && nums[j - 1] != 4)) {
							int temp = nums[j];
							nums[j] = nums[k];
							nums[k] = temp;

						}

						j++;
					}
				}
			}
		}
		return nums;
	}
}
