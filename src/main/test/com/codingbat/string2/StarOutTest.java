package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class StarOutTest {
	public void Test() {
		StarOut frt = new StarOut();
		// assertEquals(frt.starOut("ab**cd"), "ad");
		assertEquals(frt.starOut("*stringy"), "tringy");
	}
}
