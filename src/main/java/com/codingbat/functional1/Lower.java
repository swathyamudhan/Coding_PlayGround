package com.codingbat.functional1;

import java.util.List;

public class Lower {
	public List<String> lower(List<String> strings) {
		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}

}
