package com.codingbat.string1;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class Testing {
	public void Test() {
		HelloName frt = new HelloName();
		assertEquals(frt.conCat("abc", ""), "abc");
	}
}
