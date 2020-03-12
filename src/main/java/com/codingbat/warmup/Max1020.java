package com.codingbat.warmup;

public class Max1020 {
	public int max1020(int a, int b) {
		Boolean aflag = a >= 10 && a <= 20;
		Boolean bflag = b >= 10 && b <= 20;
		if (aflag == true && bflag == true) {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		} else if (aflag == true && bflag == false) {
			return a;
		} else if (aflag == false && bflag == true) {
			return b;
		} else {
			return 0;
		}
	}
}

/*
 * Solution:
 * 
 * public int max1020(int a, int b) { // First make it so the bigger value is in
 * a if (b > a) { int temp = a; a = b; b = temp; }
 * 
 * // Knowing a is bigger, just check a first if (a >= 10 && a <= 20) return a;
 * if (b >= 10 && b <= 20) return b; return 0; }
 * 
 * 
 */