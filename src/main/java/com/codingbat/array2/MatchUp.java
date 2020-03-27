package com.codingbat.array2;

public class MatchUp {
	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		int i = 0;
		while (i < nums1.length && i < nums2.length) {
			if (Math.abs(nums2[i] - nums1[i]) == 1 || Math.abs(nums2[i] - nums1[i]) == 2) {
				count++;
			}
			i++;
		}

		return count;
	}
}
