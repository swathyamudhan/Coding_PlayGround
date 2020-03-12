package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
	public List<Integer> square56(List<Integer> nums) {
		nums = nums.stream().map(n -> (n * n) + 10).filter(n -> (n % 10 != 5 && n % 10 != 6))
				.collect(Collectors.toList());
		return nums;

	}

}
