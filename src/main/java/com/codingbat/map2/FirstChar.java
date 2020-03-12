package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (String string : strings) {
			String start = string.substring(0, 1);
			if (!map.containsKey(start)) {
				map.put(start, string);
			} else {
				map.put(start, map.get(start) + string);
			}

		}
		return map;
	}

}
