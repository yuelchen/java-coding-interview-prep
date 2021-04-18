package com.yuelchen.shape3d;

import org.junit.Assert;
import org.junit.Test;

public class PyramidTest {

	@Test
	public void getSurfaceAreaTest() {
		Assert.assertEquals(142.74, Pyramid.getSurfaceArea(4.3, 5.2, 12.45), 2);
	}
	
	@Test
	public void getVolumeTest() {
		Assert.assertEquals(92.79, Pyramid.getVolume(4.3, 5.2, 12.45), 2);
	}

	@Test
	public void getLateralSurfaceAreaTest() {
		Assert.assertEquals(120.38, Pyramid.getLateralSurfaceArea(4.3, 5.2, 12.45), 2);
	}
	
	@Test 
	public void getBaseArea() {
		Assert.assertEquals(22.36, Pyramid.getBaseArea(4.3, 5.2), 2);
	}

	@Test 
	public void getBaseWidthTest() {
		Assert.assertEquals(5.2, Pyramid.getBaseWidth(4.3, 22.36), 2);
	}

	@Test 
	public void getBaseLengthTest() {
		Assert.assertEquals(4.3, Pyramid.getBaseLength(5.2, 22.36), 2);
	}

	@Test
	public void getHeightTest() {
		Assert.assertEquals(12.45, Pyramid.getHeight(4.3, 5.2, 92.79), 2);
	}
}
