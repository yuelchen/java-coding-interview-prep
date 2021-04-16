package com.yuelchen.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	
	private BinarySearch<Integer> search;
	
	private Object[] data;
	
	@Before
	public void SetUp() {
		this.search = new BinarySearch<>();
		this.data = new Object[] { 
				Integer.valueOf(1), 
				Integer.valueOf(2), 
				Integer.valueOf(3), 
				Integer.valueOf(4), 
				Integer.valueOf(5) 
			};
	}
	
	@Test
	public void DataSize() {
		Assert.assertEquals(5, this.data.length);
	}
	
	@Test
	public void DataContainsExist() {
		Assert.assertTrue(this.search.containsValue(data, Integer.valueOf(1)));
		Assert.assertTrue(this.search.containsValue(data, Integer.valueOf(2)));
		Assert.assertTrue(this.search.containsValue(data, Integer.valueOf(3)));
		Assert.assertTrue(this.search.containsValue(data, Integer.valueOf(4)));
		Assert.assertTrue(this.search.containsValue(data, Integer.valueOf(5)));
	}
	
	@Test
	public void DataContainsNotExist() {
		Assert.assertFalse(this.search.containsValue(data, Integer.valueOf(-1)));
		Assert.assertFalse(this.search.containsValue(data, Integer.valueOf(0)));
		Assert.assertFalse(this.search.containsValue(data, Integer.valueOf(6)));
	}

	@Test
	public void DataGetIndexExist() {
		Assert.assertEquals(0,  this.search.getIndex(data, Integer.valueOf(1)));
		Assert.assertEquals(1,  this.search.getIndex(data, Integer.valueOf(2)));
		Assert.assertEquals(2,  this.search.getIndex(data, Integer.valueOf(3)));
		Assert.assertEquals(3,  this.search.getIndex(data, Integer.valueOf(4)));
		Assert.assertEquals(4,  this.search.getIndex(data, Integer.valueOf(5)));
	}

	@Test
	public void DataGetIndexNotExist() {
		Assert.assertEquals(-1,  this.search.getIndex(data, Integer.valueOf(-1)));
		Assert.assertEquals(-1,  this.search.getIndex(data, Integer.valueOf(0)));
		Assert.assertEquals(-1,  this.search.getIndex(data, Integer.valueOf(6)));
	}
}