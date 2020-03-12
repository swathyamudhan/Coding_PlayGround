package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class XyzMiddleTest {
	public void Test() {
		XyzMiddle frt = new XyzMiddle();
		assertEquals(frt.xyzMiddle("axyzb"), true);
	}
}
