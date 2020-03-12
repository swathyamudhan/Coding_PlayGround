package com.codingbat.map1;

import java.util.Map;

public class MapBully {
	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("a", "");
			map.put("b", map.get("a"));
		}
		return map;
	}

}
