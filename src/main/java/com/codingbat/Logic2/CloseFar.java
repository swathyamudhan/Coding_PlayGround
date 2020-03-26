package com.codingbat.Logic2;

public class CloseFar {
	public boolean closeFar(int a, int b, int c) {
		int bVal = Math.abs(a - b);
		int cVal = Math.abs(a - c);
		int bcVal = Math.abs(b - c);

		if (bVal <= 1) {
			if (cVal >= 2 && bcVal >= 2) {
				return true;
			}
		}
		if (cVal <= 1) {
			if (bVal >= 2 && bcVal >= 2) {
				return true;
			}
		}

		return false;
	}
}
