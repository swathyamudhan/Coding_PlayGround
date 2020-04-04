package com.codingbat.array2;

import org.testng.Assert;

public class CenteredAverageTest {
	@org.testng.annotations.Test
	public void Test() {
		CenteredAverage cen = new CenteredAverage();
		Assert.assertEquals(cen.centeredAverage(new int[] { 1, 2, 3, 4, 100 }), 3);
	}
}
