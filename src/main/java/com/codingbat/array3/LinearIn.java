package com.codingbat.array3;

public class LinearIn {
	public boolean linearIn(int[] outer, int[] inner) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < inner.length; i++) {
			int j = 0;
			while (j < outer.length) {
				if (inner[i] == outer[j]) {
					flag = true;
					count++;
					break;
				}
				j++;
			}
		}
		if ((flag && count == inner.length) || inner.length == 0) {
			return true;
		}
		return false;
	}
}
