package com.codingbat.ap1;

public class ScoreUp {
	public int scoreUp(String[] key, String[] answers) {
		int correct = 4;
		int wrong = -1;
		int blank = 0;
		int count = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i].equals(key[i])) {
				count += correct;
			} else if (!answers[i].equals(key[i]) && !answers[i].equals("?")) {
				count += wrong;
			} else {
				count += blank;
			}
		}
		return count;
	}
}
