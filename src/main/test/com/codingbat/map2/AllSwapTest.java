package com.codingbat.map2;

import static org.testng.Assert.assertEquals;

public class AllSwapTest {
	@org.testng.annotations.Test
	public void Test() {
		AllSwap map = new AllSwap();
		assertEquals(map.allSwap(new String[] { "4", "8", "15", "16", "23", "42" }),
				new String[] { "42", "8", "16", "15", "23", "4" });

	}
}
