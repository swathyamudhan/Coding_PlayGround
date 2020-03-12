package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
	public List<Integer> noNeg(List<Integer> nums) {
		nums = nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
		return nums;
	}

}
