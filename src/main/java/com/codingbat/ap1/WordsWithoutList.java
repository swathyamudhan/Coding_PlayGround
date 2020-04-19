package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
	public List wordsWithoutList(String[] words, int len) {
		ArrayList<String> st = new ArrayList<String>();
		for (String ww : words) {
			if (ww.length() != len) {
				st.add(ww);
			}
		}
		return st;
	}
}
