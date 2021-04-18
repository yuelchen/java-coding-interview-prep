package com.yuelchen.shape2d;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void getPerimeterTest() {
		Assert.assertEquals(28, Rectangle.getPerimeter(5, 9), 0);
	}
	
	@Test
	public void getAreaTest() {
		Assert.assertEquals(45, Rectangle.getArea(5, 9), 0);
	}
	
	@Test
	public void getDiagonalTest() {
		Assert.assertEquals(10.29, Rectangle.getDiagonal(5, 9), 2);
	}
	
	@Test
	public void getLengthTest() {
		Assert.assertEquals(8.99, Rectangle.getLength(10.29, 5), 2);
	}
	
	@Test
	public void getWidthTest() {
		Assert.assertEquals(4.98, Rectangle.getLength(10.29, 9), 2);
	}
}