package com.codingbat.Logic2;

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		int bigChoca = big * 5;
		int total = big * 5 + small;

		if (total == goal) {
			return small;
		}
		if (bigChoca == goal) {
			return 0;
		}
		if (goal > total) {
			return -1;
		}

		while (big > 0 && goal >= 5) {
			goal = goal - 5;
			big--;
		}
		if (goal <= small) {
			return goal;
		} else {
			return small - goal;
		}

	}
}
