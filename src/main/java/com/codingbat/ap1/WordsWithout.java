package com.codingbat.ap1;

import java.util.ArrayList;

public class WordsWithout {
	public String[] wordsWithout(String[] words, String target) {
		ArrayList<String> ar = new ArrayList<String>();
		for (String string : words) {
			if (!string.equals(target)) {
				ar.add(string);
			}
		}

		return ar.stream().toArray(String[]::new);

	}

}
