package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

public class ScoresClump {
	public boolean scoresClump(int[] scores) {
		List<Integer> al = new ArrayList<>();
		al.add(scores[0]);
		for (int i = 1; i < scores.length; i++) {
			for (int j = 0; j < al.size(); j++) {
				int diff = Math.abs(scores[i] - al.get(j));
				if (diff > 2) {
					al.remove(j);
				}
			}
			al.add(scores[i]);
			if (al.size() == 3) {
				return true;
			}
		}
		return false;
	}
}
