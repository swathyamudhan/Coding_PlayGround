package com.codingbat.array1;

public class Make2 {
	public int[] make2(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] mergedArray = new int[length];
		int[] result = new int[2];
		int pos = 0;
		for (int i : a) {
			mergedArray[pos] = i;
			pos++;
		}
		for (int i : b) {
			mergedArray[pos] = i;
			pos++;
		}

		result[0] = mergedArray[0];
		result[1] = mergedArray[1];
		return result;
	}

}

/*
 * int[] join = new int[a.length + b.length]; System.arraycopy(a, 0, join, 0,
 * a.length); System.arraycopy(b, 0, join, a.length, b.length); return join;
 * 
 */