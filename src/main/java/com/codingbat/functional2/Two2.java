package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
	public List<Integer> two2(List<Integer> nums) {
		nums = nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
		return nums;
	}

}
