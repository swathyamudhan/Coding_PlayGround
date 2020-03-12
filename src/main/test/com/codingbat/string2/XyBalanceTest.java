package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

public class XyBalanceTest {
	public void Test() {
		XyBalance frt = new XyBalance();
		assertEquals(frt.xyBalance("bac"), false);
	}
}
