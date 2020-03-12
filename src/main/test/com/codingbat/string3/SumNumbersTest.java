package com.codingbat.string3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SumNumbersTest {
	@Test
	public void test() {
		SumNumbers obj = new SumNumbers();
		// assertEquals(obj.sameEnds("abcb"), "");
		assertEquals(obj.sumNumbers("aa11b33"), 44);
	}
}
