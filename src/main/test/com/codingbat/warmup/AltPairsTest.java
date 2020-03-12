package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class AltPairsTest {
	public void Test() {
		AltPairs back = new AltPairs();
		// assertEquals(back.altPairs("yak"), "ya");
		assertEquals(back.altPairs("Chocolate"), "Chole");
	}
}
