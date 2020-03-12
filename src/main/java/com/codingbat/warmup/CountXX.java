package com.codingbat.warmup;

public class CountXX {
	int countXX(String str) {
		int count = 0;
		String[] split = str.split(" ");
		for (String each : split) {
			{
				for (int j = 0; j < each.length(); j++) {
					if (each.charAt(j) == 'x') {
						count++;
					}
				}
			}
		}

		if (str.contains(" ") && count >= 1) {
			count = count - 2;
		} else if (count >= 1) {
			count = count - 1;
		}
		return count;
	}
}

/*
 * for (int i = 0; i < str.length() - 1; i++) { for (int j = i + 1; j <
 * str.length(); j++) { if ((str.charAt(i) == 'x' && str.charAt(j) == 'x')) {
 * count++; } else if (condition) {
 * 
 * } } }
 * 
 */