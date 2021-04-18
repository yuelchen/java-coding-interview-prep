package com.yuelchen.stats;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {
	
	private int[] emptySizedData;
	
	private int[] evenSizedData;
	
	private int[] oddSizedData;
	
	@Before
	public void setUp() {
		this.emptySizedData = new int[0];
		this.evenSizedData = new int[] { 10, 23, 15, 18, 20, 4};
		this.oddSizedData = new int[] { 0, 1, 5, 8, 2, 0, 0 };
	}
	
	@Test 
	public void getMeanEmpty() {
		Assert.assertEquals(-1, Statistics.getMean(this.emptySizedData), 0);
	}
	
	@Test
	public void getMeanEven() {
		Assert.assertEquals(15, Statistics.getMean(this.evenSizedData), 0);
	}

	@Test
	public void getMeanOdd() {
		Assert.assertEquals(2.28, Statistics.getMean(this.oddSizedData), 2);
	}

	@Test 
	public void getMedianEmpty() {
		Assert.assertEquals(-1, Statistics.getMedian(this.emptySizedData), 0);
	}
	
	@Test
	public void getMedianEven() {
		Assert.assertEquals(16.5, Statistics.getMedian(this.evenSizedData), 1);
	}

	@Test
	public void getMedianOdd() {
		Assert.assertEquals(1, Statistics.getMedian(this.oddSizedData), 0);
	}

	@Test 
	public void getModeEmpty() {
		Assert.assertEquals(-1, Statistics.getMode(this.emptySizedData));
	}

	@Test
	public void getModeEven() {
		Assert.assertEquals(4, Statistics.getMode(this.evenSizedData));
	}

	@Test
	public void getModeOdd() {
		Assert.assertEquals(0, Statistics.getMode(this.oddSizedData));
	}

	@Test 
	public void getMinEmpty() {
		Assert.assertEquals(-1, Statistics.getMin(this.emptySizedData));
	}
	
	@Test
	public void getMinEven() {
		Assert.assertEquals(4, Statistics.getMin(this.evenSizedData));
	}

	@Test
	public void getMinOdd() {
		Assert.assertEquals(0, Statistics.getMin(this.oddSizedData));
	}
	
	@Test 
	public void getMaxEmpty() {
		Assert.assertEquals(-1, Statistics.getMax(this.emptySizedData));
	}

	@Test
	public void getMaxEven() {
		Assert.assertEquals(23, Statistics.getMax(this.evenSizedData));
	}

	@Test
	public void getMaxOdd() {
		Assert.assertEquals(8, Statistics.getMax(this.oddSizedData));
	}
}
