package com.yuelchen.shape2d;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

	@Test
	public void getCircumferenceTest() {
		Assert.assertEquals(56.54, Circle.getCircumference(9), 2);
	}

	@Test
	public void getAreaTest() {
		Assert.assertEquals(254.46, Circle.getArea(9), 2);
	}

	@Test
	public void getDiameterTest() {
		Assert.assertEquals(18, Circle.getDiameter(9), 0);
	}
}