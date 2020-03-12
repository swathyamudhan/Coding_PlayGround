package com.codingbat.warmup;

public class HasTeen {
	public boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean loneTeen(int a, int b) {
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);
		if ((aTeen && !bTeen) || (!aTeen && bTeen)) {
			return true;
		} else {
			return false;
		}
	}
}
