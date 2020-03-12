package com.codingbat.warmup;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class EndUpTest {
	public void Test() {
		EndUp front = new EndUp();
		assertEquals(front.endUp("woo hoo"), "woo HOO");
		// assertEquals(front.endUp("hi there"), "hi thERE");
		// assertEquals(front.endUp("hi"), "HI");
	}
}
