package com.codingbat.ap1;

public class WordsFront {
	public String[] wordsFront(String[] words, int n) {
		String[] st = new String[n];
		for (int i = 0; i < n; i++) {
			st[i] = words[i];
		}
		return st;
	}
}
