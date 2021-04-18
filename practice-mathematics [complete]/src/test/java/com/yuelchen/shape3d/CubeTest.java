package com.yuelchen.shape3d;

import org.junit.Assert;
import org.junit.Test;

public class CubeTest {
	
	@Test
	public void getSurfaceAreaTest1() {
		Assert.assertEquals(337.5, Cube.getSurfaceArea(7.5), 1);
	}
	
	@Test
	public void getSurfaceAreaTest2() {
		Assert.assertEquals(65.34, Cube.getSurfaceArea(3.3), 2);
	}
	
	@Test
	public void getVolumeTest1() {
		Assert.assertEquals(421.87, Cube.getVolume(7.5), 2);
	}
	
	@Test
	public void getVolumeTest2() {
		Assert.assertEquals(35.93, Cube.getVolume(3.3), 2);
	}
	
	@Test
	public void getSpaceDiagonal1() {
		Assert.assertEquals(12.99, Cube.getSpaceDiagonal(7.5), 2);
	}
	
	@Test
	public void getSpaceDiagonal2() {
		Assert.assertEquals(5.71, Cube.getSpaceDiagonal(3.3), 2);
	}
}