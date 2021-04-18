package com.yuelchen.shape3d;

import org.junit.Assert;
import org.junit.Test;

public class ConeTest {
	
	@Test
	public void getSurfaceAreaTest1() {
		Assert.assertEquals(294.11, Cone.getSurfaceArea(5.2, 11.7), 2);
	}
	
	@Test
	public void getSurfaceAreaTest2() {
		Assert.assertEquals(362.89, Cone.getSurfaceArea(7.3, 4.4), 2);
	}
	
	@Test
	public void getVolumeTest1() {
		Assert.assertEquals(331.29, Cone.getVolume(5.2, 11.7), 2);
	}
	
	@Test
	public void getVolumeTest2() {
		Assert.assertEquals(245.54, Cone.getVolume(7.3, 4.4), 2);
	}

	@Test
	public void getLateralSurfaceAreaTest1() {
		Assert.assertEquals(209.16, Cone.getLateralSurfaceArea(5.2, 11.7), 2);
	}

	@Test
	public void getLateralSurfaceAreaTest2() {
		Assert.assertEquals(195.47, Cone.getLateralSurfaceArea(7.3, 4.4), 2);
	}
	
	@Test
	public void getSlantHeightTest1() {
		Assert.assertEquals(12.80, Cone.getSlantHeight(5.2, 11.7), 2);
	}

	@Test
	public void getSlantHeightTest2() {
		Assert.assertEquals(8.52, Cone.getSlantHeight(7.3, 4.4), 2);
	}
	
	@Test
	public void getBaseAreaTest1() {
		Assert.assertEquals(84.94, Cone.getBaseArea(5.2), 2);
	}
	
	@Test
	public void getBaseAreaTest2() {
		Assert.assertEquals(167.41, Cone.getBaseArea(7.3), 2);
	}
	
	@Test
	public void getHeightTest1() {
		Assert.assertEquals(11.7, Cone.getHeight(5.2, 331.29), 1);
	}
	
	@Test
	public void getHeightTest2() {
		Assert.assertEquals(4.4, Cone.getHeight(7.3, 245.54), 1);
	}
}