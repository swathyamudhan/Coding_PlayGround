package com.codingbat.warmup;

public class Close10 {
	public int close10(int a, int b) {
		int val = 10;
		int aa = val - a;
		int bb = val - b;
		if (Math.abs(aa) < Math.abs(bb)) {
			return a;
		} else if (Math.abs(bb) < Math.abs(aa)) {
			return b;
		}
		return 0;

	}
}
