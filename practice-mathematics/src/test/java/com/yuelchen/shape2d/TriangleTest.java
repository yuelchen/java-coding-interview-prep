package com.yuelchen.shape2d;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void getPerimeterTest() {
		Assert.assertEquals(90, Triangle.getPerimeter(20, 40, 30), 0);
	}

	@Test
	public void getAreaTest() {
		Assert.assertEquals(150, Triangle.getArea(10, 30), 0);
	}

	@Test
	public void getHeightTest() {
		Assert.assertEquals(10, Triangle.getHeight(150, 30), 0);
	}

	@Test
	public void getSideTest() {
		Assert.assertEquals(40, Triangle.getSide(90, 20, 30), 0);
	}
}
