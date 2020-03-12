package com.codingbat.string3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MaxBlockTest {
	@Test
	public void test() {
		MaxBlock obj = new MaxBlock();
		// assertEquals(obj.sameEnds("abcb"), "");
		assertEquals(obj.maxBlock("hoopla"), 2);
	}
}
