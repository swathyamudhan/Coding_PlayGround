package com.codingbat.functional2;

import java.util.List;

public class NoYY {
	public List<String> noYY(List<String> strings) {
		strings.replaceAll(n -> n + "y");
		strings.removeIf(n -> n.contains("yy"));
		return strings;
	}

}
