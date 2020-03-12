package com.codingbat.array1;

import static org.testng.Assert.assertEquals;

@org.testng.annotations.Test
public class Start1Test {
	public void Test() {
		Start1 frt = new Start1();
		assertEquals(frt.start1(new int[] {}, new int[] { 1, 2 }), 1);
	}
}
