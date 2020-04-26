package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MergeTwo {
	public String[] mergeTwo(String[] a, String[] b, int n) {
		HashSet<String> lst = new HashSet<String>();
		for (String string : a) {
			lst.add(string);
		}
		for (String string : b) {
			lst.add(string);
		}

		List<String> ll = new ArrayList<String>(lst);
		String[] ar = new String[n];
		for (int i = 0; i < n; i++) {
			ar[i] = ll.get(i);
		}
		return ar;
	}
}
