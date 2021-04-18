package com.yuelchen.shape2d;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

	@Test
	public void getPerimeterTest() {
		Assert.assertEquals(20, Square.getPerimeter(5), 0);
	}

	@Test
	public void getAreaTest() {
		Assert.assertEquals(25, Square.getArea(5), 0);
	}

	@Test
	public void getDiagonalTest() {
		Assert.assertEquals(7.07, Square.getDiagonal(5), 2);
	}	
}