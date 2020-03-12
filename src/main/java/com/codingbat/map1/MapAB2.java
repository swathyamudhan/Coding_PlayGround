package com.codingbat.map1;

import java.util.Map;

public class MapAB2 {
	public Map<String, String> mapAB2(Map<String, String> map) {
		boolean flag = false;
		if (map.containsKey("a") && map.containsKey("b")) {
			flag = map.get("a").equals(map.get("b"));
		}

		if (flag == true) {
			map.remove("a");
			map.remove("b");
			return map;
		} else {
			return map;
		}

	}

}
