package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (String string : strings) {
			if (!map.containsKey(string)) {
				map.put(string, false);
			} else {
				map.put(string, true);
			}
		}
		return map;
	}
}
