package com.codingbat.ap1;

public class Scores100 {
	public boolean scores100(int[] scores) {
		if (scores.length >= 2) {
			for (int i = 0; i < scores.length - 1; i++) {
				if (scores[i] == 100 && scores[i + 1] == 100) {
					return true;
				}
			}
		}
		return false;
	}
}
