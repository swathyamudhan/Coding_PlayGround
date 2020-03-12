package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (String string : strings) {
			map.put(string.substring(0, 1), string.substring(string.length() - 1));
		}
		return map;
	}

}
