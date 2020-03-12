package com.codingbat.array1;

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		boolean aFlag = a.length >= 1 && b.length >= 1;

		if (aFlag == true && (a.length > b.length || a.length < b.length || a.length == b.length)) {
			return new int[] { a[0], b[0] };
		}

		if (a.length == 0 && b.length > 1) {
			return new int[] { b[0] };
		} else if (b.length == 0 && a.length > 1) {
			return new int[] { a[0] };
		}
		return new int[] {};
	}

}
