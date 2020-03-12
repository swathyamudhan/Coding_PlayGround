package com.codingbat.map2;

import static org.testng.Assert.assertEquals;

public class FirstSwapTest {
	@org.testng.annotations.Test
	public void Test() {
		FirstSwap swap = new FirstSwap();
		assertEquals(swap.firstSwap(new String[] { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }),
				new String[] { "ay", "bx", "cy", "ax", "cx", "aaa", "abb" });
	}
}
