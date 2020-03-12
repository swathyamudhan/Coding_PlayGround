package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
	public String[] allSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int tempOldIndex = 0;
		for (int i = 0; i <= strings.length - 1; i++) {
			if (!map.containsKey(strings[i].charAt(0))) {
				map.put(strings[i].charAt(0), i);
				tempOldIndex = map.get(strings[i].charAt(0));

			} else {
				tempOldIndex = map.get(strings[i].charAt(0));
				map.put(strings[i].charAt(0), i);
				String temp = strings[i];
				strings[i] = strings[tempOldIndex];
				strings[tempOldIndex] = temp;
				map.remove(strings[i].charAt(0));
			}
		}
		return strings;
	}

}
