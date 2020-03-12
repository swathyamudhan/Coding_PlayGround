package com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
	public String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Boolean> mapFlag = new HashMap<String, Boolean>();
		int tempOldIndex = 0;
		for (int i = 0; i <= strings.length - 1; i++) {
			String key = strings[i].substring(0, 1);
			if (!map.containsKey(key)) {
				map.put(key, i);

			} else {
				if (mapFlag.containsKey(key)) {
					continue;
				}

				tempOldIndex = map.get(key);
				map.put(key, i);
				String temp = strings[i];
				strings[i] = strings[tempOldIndex];
				strings[tempOldIndex] = temp;
				mapFlag.put(key, true);
				map.remove(key);

			}
		}
		return strings;
	}

}
