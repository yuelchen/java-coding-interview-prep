package com.yuelchen.shape3d;

import org.junit.Assert;
import org.junit.Test;

public class RectangularPrismTest {

	@Test
	public void getSurfaceAreaTest() {
		Assert.assertEquals(620.82, RectangularPrism.getSurfaceArea(8.9, 7.2, 15.3), 2);
	}

	@Test
	public void getVolumeTest() {
		Assert.assertEquals(980.42, RectangularPrism.getVolume(8.9, 7.2, 15.3), 2);
	}

	@Test
	public void getSpaceDiagonalTest() {
		Assert.assertEquals(19.10, RectangularPrism.getSpaceDiagonal(8.9, 7.2, 15.3), 2);
	}

	@Test
	public void getLengthTest() {
		Assert.assertEquals(8.9, RectangularPrism.getLength(7.2, 15.3, 19.10), 2);
	}

	@Test
	public void getWidthTest() {
		Assert.assertEquals(7.2, RectangularPrism.getWidth(8.9, 15.3, 19.10), 2);
	}

	@Test
	public void getHeightTest() {
		Assert.assertEquals(15.3, RectangularPrism.getWidth(8.9, 7.2, 19.10), 2);
	}
}