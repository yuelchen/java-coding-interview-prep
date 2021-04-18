package com.yuelchen.shape3d;

import org.junit.Assert;
import org.junit.Test;

public class SphereTest {
	
	@Test
	public void getSurfaceAreaTest() {
		Assert.assertEquals(346.36, Sphere.getSurfaceArea(5.25), 2);
	}
	
	@Test
	public void getVolumeTest() {
		Assert.assertEquals(606.13, Sphere.getVolume(5.25), 2);
	}

	@Test
	public void getDiameterTest() {
		Assert.assertEquals(10.5, Sphere.getDiameter(5.25), 1);
	}
}