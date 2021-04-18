package com.yuelchen.shape3d;

import org.junit.Assert;
import org.junit.Test;

public class CylinderTest {

	@Test
	public void getSurfaceAreaTest1() {
		Assert.assertEquals(536.10, Cylinder.getSurfaceArea(8.3, 1.98), 2);
	}
	
	@Test
	public void getSurfaceAreaTest2() {
		Assert.assertEquals(157.77, Cylinder.getSurfaceArea(2.7, 6.6), 2);
	}
	
	@Test
	public void getVolumnTest1() {
		Assert.assertEquals(428.52, Cylinder.getVolume(8.3, 1.98), 2);
	}
	
	@Test
	public void getVolumeTest2() {
		Assert.assertEquals(151.15, Cylinder.getVolume(2.7, 6.6), 2);
	}
	
	@Test
	public void getLateralSurfaceAreaTest1() {
		Assert.assertEquals(103.25, Cylinder.getLateralSurfaceArea(8.3, 1.98), 2);
	}
	
	@Test
	public void getLateralSurfaceAreaTest2() {
		Assert.assertEquals(111.96, Cylinder.getLateralSurfaceArea(2.7, 6.6), 2);
	}

	@Test
	public void getBaseAreaTest1() {
		Assert.assertEquals(216.42, Cylinder.getBaseArea(8.3), 2);
	}

	@Test
	public void getBaseAreaTest2() {
		Assert.assertEquals(22.90, Cylinder.getBaseArea(2.7), 2);
	}

	@Test
	public void getDiameterTest1() {
		Assert.assertEquals(16.6, Cylinder.getDiameter(1.98, 428.52), 2);
	}

	@Test
	public void getDiameterTest2() {
		Assert.assertEquals(5.39, Cylinder.getDiameter(6.6, 151.15), 2);
	}

	@Test
	public void getHeightTest1() {
		Assert.assertEquals(1.98, Cylinder.getHeight(16.6, 428.52), 2);
	}

	@Test
	public void getHeightTest2() {
		Assert.assertEquals(6.6, Cylinder.getHeight(5.39, 151.15), 2);
	}
}
