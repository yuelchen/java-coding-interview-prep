package com.yuelchen.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickSortTest {

	private QuickSort<Integer> sort;
	
	private Object[] data;
	
	@Before
	public void SetUp() {
		this.sort = new QuickSort<>();
		this.data = new Object[] { 
				Integer.valueOf(5), 
				Integer.valueOf(3), 
				Integer.valueOf(1), 
				Integer.valueOf(2), 
				Integer.valueOf(4) 
			};
	}
	
	@Test
	public void DataSize() {
		Assert.assertEquals(5, this.data.length);
	}
	
	@Test
	public void AscendingSortSize() {
		this.sort.ascendingOrder(this.data);
		Assert.assertEquals(5, this.data.length);
	}
	
	@Test
	public void AscendingSortContent() {
		Assert.assertEquals(Integer.valueOf(5), (Integer) this.data[0]);
		Assert.assertEquals(Integer.valueOf(3), (Integer) this.data[1]);
		Assert.assertEquals(Integer.valueOf(1), (Integer) this.data[2]);
		Assert.assertEquals(Integer.valueOf(2), (Integer) this.data[3]);
		Assert.assertEquals(Integer.valueOf(4), (Integer) this.data[4]);
		
		this.sort.ascendingOrder(this.data);		
		Assert.assertEquals(Integer.valueOf(1), (Integer) this.data[0]);
		Assert.assertEquals(Integer.valueOf(2), (Integer) this.data[1]);
		Assert.assertEquals(Integer.valueOf(3), (Integer) this.data[2]);
		Assert.assertEquals(Integer.valueOf(4), (Integer) this.data[3]);
		Assert.assertEquals(Integer.valueOf(5), (Integer) this.data[4]);
	}
	
	@Test
	public void DescendingSortSize() {
		this.sort.descendingOrder(this.data);
		Assert.assertEquals(5, this.data.length);
	}
	
	@Test
	public void DescendingSortContent() {
		Assert.assertEquals(Integer.valueOf(5), (Integer) this.data[0]);
		Assert.assertEquals(Integer.valueOf(3), (Integer) this.data[1]);
		Assert.assertEquals(Integer.valueOf(1), (Integer) this.data[2]);
		Assert.assertEquals(Integer.valueOf(2), (Integer) this.data[3]);
		Assert.assertEquals(Integer.valueOf(4), (Integer) this.data[4]);
		
		this.sort.descendingOrder(this.data);		
		Assert.assertEquals(Integer.valueOf(5), (Integer) this.data[0]);
		Assert.assertEquals(Integer.valueOf(4), (Integer) this.data[1]);
		Assert.assertEquals(Integer.valueOf(3), (Integer) this.data[2]);
		Assert.assertEquals(Integer.valueOf(2), (Integer) this.data[3]);
		Assert.assertEquals(Integer.valueOf(1), (Integer) this.data[4]);
	}
}
