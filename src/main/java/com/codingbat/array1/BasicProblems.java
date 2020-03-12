package com.codingbat.array1;

public class BasicProblems {
	public boolean firstLast6(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[0] == 6 || nums[nums.length - 1] == 6) {
				return true;
			}
		}
		return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length == 0) {
			return false;
		}
		if (nums[0] == nums[nums.length - 1]) {
			return true;
		}
		return false;
	}

	public int[] makePi() {
		int[] values = new int[3];
		values[0] = 3;
		values[1] = 1;
		values[2] = 4;
		return values;
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
