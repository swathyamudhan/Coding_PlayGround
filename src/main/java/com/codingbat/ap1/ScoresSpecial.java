package com.codingbat.ap1;

public class ScoresSpecial {
	public int scoresSpecial(int[] a, int[] b) {
		int val1 = largestValue(a);
		int val2 = largestValue(b);
		return val1 + val2;
	}

	public int largestValue(int[] data) {
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 10 == 0) {
				max = Integer.max(max, data[i]);
			}
		}

		return max;
	}
}
