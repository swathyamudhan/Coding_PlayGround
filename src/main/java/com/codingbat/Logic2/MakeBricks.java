package com.codingbat.Logic2;

public class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {

		int totalBricks = big * 5 + small;
		int bigBricks = big * 5;

		if (totalBricks == goal || bigBricks == goal || small == goal) {
			return true;
		} else if (totalBricks > goal) {
			int mod = goal % 5;
			if (mod <= small) {
				return true;
			}
		}
		return false;
	}
}
