package com.codingbat.warmup;

public class IcyHot {
	public boolean icyHot(int temp1, int temp2) {
		int var1 = 0, var2 = 100;
		if ((temp1 > var1 && temp2 < var2) || (temp1 < var1 && temp2 > var2)) {
			return true;
		} else {
			return false;
		}
	}
}
