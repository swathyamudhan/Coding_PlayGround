package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		// strings = strings.stream().map(n -> n + "*").collect(Collectors.toList());
		return strings;
	}

}
