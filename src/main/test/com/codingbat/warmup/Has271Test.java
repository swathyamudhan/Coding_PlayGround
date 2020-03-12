package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class Has271Test {
	public void Test() {
		Has271 obj = new Has271();
		assertEquals(obj.has271(new int[] { 1, 2, 7, 1 }), true);
		// assertEquals(obj.last2("xaxxaxaxx"), 1);
		// assertEquals(obj.last2("axxxaaxx"), 2);
	}
}
