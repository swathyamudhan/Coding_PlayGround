package com.codingbat.array3;

public class SquareUp {
	public int[] squareUp(int n) {
		int start = (n * n) - 1;
		int[] arr = new int[n * n];
		int val = n;
		int index = start - (n - 1);

		for (int i = start; i >= 0; i--) {
			if (i == index) {
				int j = i;
				int num = val;
				while (val >= 1) {
					arr[j] = val;
					val--;
					j++;
				}
				val = num - 1;
				index = index - (n - 1);
			}
		}
		return arr;
	}
}