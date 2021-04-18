package com.yuelchen.shape2d;

import org.junit.Assert;
import org.junit.Test;

public class TrapezoidTest {

	@Test
	public void getPerimeterTest() {
		Assert.assertEquals(24, Trapezoid.getPerimeter(5, 4, 6, 9), 0);
	}

	@Test
	public void getAreaTest() {
		Assert.assertEquals(70, Trapezoid.getArea(5, 9, 10), 0);
	}

	@Test
	public void getHeightTest() {
		Assert.assertEquals(10, Trapezoid.getHeight(5, 9, 70), 0);
	}

	@Test
	public void getSide1Test() {
		Assert.assertEquals(6, Trapezoid.getSide(4, 9, 5, 24), 0);
	}

	@Test
	public void getSide2Test() {
		Assert.assertEquals(5, Trapezoid.getSide(4, 9, 6, 24), 0);
	}
}
