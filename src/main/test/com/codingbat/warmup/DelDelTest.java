package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class DelDelTest {
	public void Test() {
		DelDel front = new DelDel();
		assertEquals(front.delDel(""), "");
		assertEquals(front.delDel("adelHello"), "aHello");
		assertEquals(front.delDel("adedbc"), "adedbc");
	}
}
