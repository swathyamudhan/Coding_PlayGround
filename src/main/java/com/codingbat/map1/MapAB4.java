package com.codingbat.map1;

import java.util.Map;

public class MapAB4 {
	public Map<String, String> mapAB4(Map<String, String> map) {
		// int aLen = map.get("a").length();
		// int bLen = map.get("b").length();
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() > map.get("b").length()) {
			map.put("c", map.get("a"));
		} else if (map.containsKey("a") && map.containsKey("b") && map.get("b").length() > map.get("a").length()) {
			map.put("c", map.get("b"));
		}
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() == map.get("b").length()) {
			map.put("a", "");
			map.put("b", "");
		}
		return map;
	}

}
