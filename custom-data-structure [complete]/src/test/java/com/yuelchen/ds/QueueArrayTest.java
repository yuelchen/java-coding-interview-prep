package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueArrayTest {

	private QueueArray<Integer> queue;
	
	@Before
	public void SetUp() {
		this.queue = new QueueArray<Integer>(3);
	}
	
	@Test
	public void EmptyQueueSize() {
		Assert.assertEquals(0, this.queue.size());
	}
	
	@Test
	public void EmptyQueueCheck() {
		Assert.assertTrue(this.queue.empty());
	}
	
	@Test
	public void EmptyQueuePeek() {
		Assert.assertNull(this.queue.peek());
	}
	
	@Test
	public void EmptyQueuePoll() {
		Assert.assertNull(this.queue.poll());
	}
	
	@Test 
	public void EmptyQueueClear() {
		this.queue.clear();
		Assert.assertEquals(0, this.queue.size());
	}
	
	@Test
	public void AddOneSize() {
		this.queue.add(Integer.valueOf(1));
		Assert.assertEquals(1, this.queue.size());
	}
	
	@Test
	public void AddOneCheck() {
		this.queue.add(Integer.valueOf(1));
		Assert.assertFalse(this.queue.empty());
	}
	
	@Test
	public void AddOnePeek() {
		this.queue.add(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.queue.peek());
		Assert.assertEquals(1, this.queue.size());
	}
	
	@Test
	public void AddOnePoll() {
		this.queue.add(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.queue.poll());
		Assert.assertEquals(0, this.queue.size());
	}
	
	@Test
	public void AddOneClear() {
		this.queue.add(Integer.valueOf(1));
		Assert.assertEquals(1, this.queue.size());
		
		this.queue.clear();
		Assert.assertEquals(0, this.queue.size());
	}
	
	@Test
	public void PushArrayAmountSize() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		Assert.assertEquals(3, this.queue.size());
	}
	
	@Test
	public void PushArrayAmountCheck() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		Assert.assertFalse(this.queue.empty());
	}
	
	@Test
	public void PushArrayAmountPeek() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		Assert.assertEquals(3, this.queue.size());

		Assert.assertEquals(Integer.valueOf(1), this.queue.peek());
		Assert.assertEquals(Integer.valueOf(1), this.queue.peek());
		Assert.assertEquals(3, this.queue.size());
	}
	
	@Test
	public void PushArrayAmountPoll() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		Assert.assertEquals(3, this.queue.size());

		Assert.assertEquals(Integer.valueOf(1), this.queue.poll());
		Assert.assertEquals(2, this.queue.size());
		Assert.assertEquals(Integer.valueOf(2), this.queue.poll());
		Assert.assertEquals(1, this.queue.size());
		Assert.assertEquals(Integer.valueOf(3), this.queue.poll());
		Assert.assertEquals(0, this.queue.size());
		
		Assert.assertNull(this.queue.poll());
	}
	
	@Test
	public void PushArrayAmountClear() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		Assert.assertEquals(3, this.queue.size());

		this.queue.clear();
		Assert.assertEquals(0, this.queue.size());
	}
	
	@Test
	public void PushExceedArrayAmountSize() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		this.queue.add(Integer.valueOf(4));
		Assert.assertEquals(4, this.queue.size());
	}
	
	@Test
	public void PushExceedArrayAmountCheck() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		this.queue.add(Integer.valueOf(4));
		Assert.assertFalse(this.queue.empty());
	}
	
	@Test
	public void PushExceedArrayAmountPeek() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		this.queue.add(Integer.valueOf(4));
		
		Assert.assertEquals(Integer.valueOf(1), this.queue.peek());
		Assert.assertEquals(Integer.valueOf(1), this.queue.peek());
		Assert.assertEquals(4, this.queue.size());
	}
	
	@Test
	public void PushExceedArrayAmountPoll() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		this.queue.add(Integer.valueOf(4));
		Assert.assertEquals(4, this.queue.size());

		Assert.assertEquals(Integer.valueOf(1), this.queue.poll());
		Assert.assertEquals(3, this.queue.size());
		Assert.assertEquals(Integer.valueOf(2), this.queue.poll());
		Assert.assertEquals(2, this.queue.size());
		Assert.assertEquals(Integer.valueOf(3), this.queue.poll());
		Assert.assertEquals(1, this.queue.size());
		Assert.assertEquals(Integer.valueOf(4), this.queue.poll());
		Assert.assertEquals(0, this.queue.size());		

		Assert.assertNull(this.queue.poll());
	}
	
	@Test
	public void PushExceedArrayAmountClear() {
		this.queue.add(Integer.valueOf(1));
		this.queue.add(Integer.valueOf(2));
		this.queue.add(Integer.valueOf(3));
		this.queue.add(Integer.valueOf(4));
		Assert.assertEquals(4, this.queue.size());
		
		this.queue.clear();
		Assert.assertEquals(0, this.queue.size());
		
	}
}