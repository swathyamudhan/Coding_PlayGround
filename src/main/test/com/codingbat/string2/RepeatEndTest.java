package com.codingbat.string2;

import static org.testng.Assert.assertEquals;

public class RepeatEndTest {
	public void Test() {
		RepeatEnd frt = new RepeatEnd();
		assertEquals(frt.repeatEnd("Hello", 3), "llollollo");
	}
}
