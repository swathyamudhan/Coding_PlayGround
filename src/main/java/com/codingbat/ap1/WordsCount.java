package com.codingbat.ap1;

public class WordsCount {
	public int wordsCount(String[] words, int len) {
		int count = 0;
		for (String string : words) {
			if (string.length() == len) {
				count++;
			}
		}
		return count;
	}
}
