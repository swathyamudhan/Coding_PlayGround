package com.codingbat.functional2;

import java.util.List;

public class NoZ {
	public List<String> noZ(List<String> strings) {
		strings.removeIf(n -> n.contains("z"));
		return strings;
	}

}
