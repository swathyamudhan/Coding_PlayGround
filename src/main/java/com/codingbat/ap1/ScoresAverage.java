package com.codingbat.ap1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ScoresAverage {
	public int scoresAverage(int[] scores) {
		int first = average(scores, 0, (scores.length / 2) - 1);
		int second = average(scores, (scores.length / 2), (scores.length) - 1);
		if (first > second) {
			return first;
		} else {
			return second;
		}
	}

	public int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += scores[i];
		}
		int avg = sum / ((end - start) + 1);
		return avg;
	}

	@Test
	public void testMe() {
		ScoresAverage obj = new ScoresAverage();
		assertEquals(obj.scoresAverage(new int[] { 2, 2, 4, 4 }), 4);
	}
}
