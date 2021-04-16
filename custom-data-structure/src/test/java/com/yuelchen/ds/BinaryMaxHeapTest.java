package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryMaxHeapTest {

	private BinaryMaxHeap<Integer> heap;
	
	@Before
	public void SetUp() {
		this.heap = new BinaryMaxHeap<Integer>();
	}
	
	@Test
	public void EmptySize() {
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void EmptyClear() {
		this.heap.clear();
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void EmptyGet() {
		Assert.assertNull(this.heap.get());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void EmptyRemove() {
		Assert.assertNull(this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertOne() {
		this.heap.insert(Integer.valueOf(1));
	}
	
	@Test
	public void InsertOneSize() {
		this.heap.insert(Integer.valueOf(1));
		Assert.assertEquals(1, this.heap.getSize());
	}
	
	@Test
	public void InsertOneClear() {
		this.heap.insert(Integer.valueOf(1));
		Assert.assertEquals(1, this.heap.getSize());
		
		this.heap.clear();
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertOneGet() {
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(1, this.heap.getSize());
	}
	
	@Test
	public void InsertOneRemove() {
		this.heap.insert(Integer.valueOf(1));
	
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertOneGetRemove() {
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertDuplicate() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(1));
	}
	
	@Test
	public void InsertDuplicateSize() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(1));
		Assert.assertEquals(2, this.heap.getSize());
	}
	
	@Test
	public void InsertDuplicateClear() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(1));
		Assert.assertEquals(2, this.heap.getSize());
		
		this.heap.clear();
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertDuplicateGet() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(2, this.heap.getSize());
	}
	
	@Test
	public void InsertDuplicateRemove() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(1));
	
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertDuplicateGetRemove() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiOrdered() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(3));
	}
	
	@Test
	public void InsertMultiOrderedSize() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(3));
		Assert.assertEquals(3, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiOrderedClear() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(3));
		Assert.assertEquals(3, this.heap.getSize());
		
		this.heap.clear();
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiOrderedGet() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.get());
		Assert.assertEquals(3, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiOrderedRemove() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.remove());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(2), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiOrderedGetRemove() {
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.get());
		Assert.assertEquals(3, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.remove());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(2), this.heap.get());
		Assert.assertEquals(Integer.valueOf(2), this.heap.get());
		Assert.assertEquals(Integer.valueOf(2), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiReverseOrder() {
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(1));
	}
	
	@Test
	public void InsertMultiReverseOrderSize() {
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiReverseOrderClear() {
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.heap.getSize());
		
		this.heap.clear();
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiReverseOrderGet() {
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.get());
		Assert.assertEquals(3, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiReverseOrderRemove() {
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.remove());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(2), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertMultiReverseOrderGetRemove() {
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.get());
		Assert.assertEquals(3, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.remove());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(2), this.heap.get());
		Assert.assertEquals(Integer.valueOf(2), this.heap.get());
		Assert.assertEquals(Integer.valueOf(2), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertComboUnordered() {
		this.heap.insert(Integer.valueOf(4));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(5));
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(0));
	}
	
	@Test
	public void InsertComboUnorderedSize() {
		this.heap.insert(Integer.valueOf(4));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(5));
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(0));
		Assert.assertEquals(6, this.heap.getSize());
	}
	
	@Test
	public void InsertComboUnorderedClear() {
		this.heap.insert(Integer.valueOf(4));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(5));
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(0));
		Assert.assertEquals(6, this.heap.getSize());
		
		this.heap.clear();
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertComboUnorderedGet() {
		this.heap.insert(Integer.valueOf(4));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(5));
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(0));
		
		Assert.assertEquals(Integer.valueOf(5), this.heap.get());
		Assert.assertEquals(6, this.heap.getSize());
	}
	
	@Test
	public void InsertComboUnorderedRemove() {
		this.heap.insert(Integer.valueOf(4));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(5));
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(0));
		
		Assert.assertEquals(Integer.valueOf(5), this.heap.remove());
		Assert.assertEquals(5, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(4), this.heap.remove());
		Assert.assertEquals(4, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(3), this.heap.remove());
		Assert.assertEquals(3, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(2), this.heap.remove());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(1, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(0), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
	
	@Test
	public void InsertComboUnorderedGetRemove() {
		this.heap.insert(Integer.valueOf(4));
		this.heap.insert(Integer.valueOf(2));
		this.heap.insert(Integer.valueOf(5));
		this.heap.insert(Integer.valueOf(1));
		this.heap.insert(Integer.valueOf(3));
		this.heap.insert(Integer.valueOf(0));
		
		Assert.assertEquals(Integer.valueOf(5), this.heap.get());
		Assert.assertEquals(6, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(5), this.heap.remove());
		Assert.assertEquals(5, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(4), this.heap.get());
		Assert.assertEquals(Integer.valueOf(4), this.heap.remove());
		Assert.assertEquals(Integer.valueOf(3), this.heap.remove());
		Assert.assertEquals(Integer.valueOf(2), this.heap.remove());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(Integer.valueOf(1), this.heap.get());
		Assert.assertEquals(2, this.heap.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.heap.remove());
		Assert.assertEquals(Integer.valueOf(0), this.heap.remove());
		Assert.assertEquals(0, this.heap.getSize());
	}
}