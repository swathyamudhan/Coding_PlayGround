package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
	public String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : strings) {
			if (!map.containsKey(string)) {
				map.put(string, 1);
			} else {
				map.put(string, map.get(string) + 1);
				result += string;
				map.remove(string);
			}
		}

		return result;
	}

}
