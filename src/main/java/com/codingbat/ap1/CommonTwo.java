package com.codingbat.ap1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonTwo {
	public int commonTwo(String[] a, String[] b) {
		Set<String> setA = new HashSet<String>(Arrays.asList(a));
		Set<String> setB = new HashSet<String>(Arrays.asList(b));
		int count = 0;
		for (String aString : setA) {
			for (String bString : setB) {
				if (aString.equals(bString)) {
					count++;
				}
			}
		}
		return count;
	}
}
