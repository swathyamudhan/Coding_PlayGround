package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class XyzThereTest {
	public void Test() {
		XyzThere frt = new XyzThere();
		assertEquals(frt.xyzThere("abc.xyzxyz"), true);
	}
}
