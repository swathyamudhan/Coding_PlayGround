package com.codingbat.ap1;

public class ScoresIncreasing {
	public boolean scoresIncreasing(int[] scores) {
		boolean flag = true;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < scores[i - 1]) {
				flag = false;
			}
		}
		return flag;
	}
}
