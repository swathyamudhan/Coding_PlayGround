package com.codingbat.string3;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CountYZTest {

	@Test
	public void test() {
		CountYZ obj = new CountYZ();
		assertEquals(obj.countYZ("zxyx"), 0);
	}
}
