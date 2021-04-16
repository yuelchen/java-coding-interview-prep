package com.yuelchen.ds;

import java.util.EmptyStackException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackArrayTest {

	private StackArray<Integer> stack;
	
	@Before
	public void SetUp() {
		this.stack = new StackArray<Integer>(3);
	}
	
	@Test
	public void EmptyStackSize() {
		Assert.assertEquals(0, this.stack.size());
	}


	@Test
	public void EmptyStackCheck() {
		Assert.assertTrue(this.stack.empty());
	}

	
	@Test(expected = EmptyStackException.class)
	public void EmptyStackPeek() {
		this.stack.peek();
	}
	
	@Test(expected = EmptyStackException.class)
	public void EmptyStackPop() {
		this.stack.pop();
	}
	
	@Test
	public void EmptyStackSearch() {
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(0)));
	}

	@Test
	public void EmptyStackClear() {		
		this.stack.clear();
		Assert.assertEquals(0, this.stack.size());
	}
	
	@Test 
	public void PushOneSize() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(1, this.stack.size());
	}

	@Test 
	public void PushOneCheck() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertFalse(this.stack.empty());
	}
	
	@Test 
	public void PushOnePeek() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.stack.peek());
		Assert.assertEquals(1, this.stack.size());
	}
	
	@Test 
	public void PushOnePop() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.stack.pop());
		Assert.assertEquals(0, this.stack.size());
	}
	
	@Test
	public void PushOneSearchExist() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(0, this.stack.search(Integer.valueOf(1)));
	}
	
	@Test
	public void PushOneSearchNotExist() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(3)));
	}
	
	@Test 
	public void PushArrayAmountSize() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		Assert.assertEquals(3, this.stack.size());
	}
	
	@Test 
	public void PushArrayAmountCheck() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		Assert.assertFalse(this.stack.empty());
	}
	
	@Test 
	public void PushArrayAmountPeek() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		
		Assert.assertEquals(Integer.valueOf(5), this.stack.peek());
		Assert.assertEquals(Integer.valueOf(5), this.stack.peek());
		Assert.assertEquals(3, this.stack.size());
	}
	
	@Test 
	public void PushArrayAmountPop() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		Assert.assertEquals(3, this.stack.size());
		
		Assert.assertEquals(Integer.valueOf(5), this.stack.pop());
		Assert.assertEquals(2, this.stack.size());
		
		Assert.assertEquals(Integer.valueOf(3), this.stack.pop());
		Assert.assertEquals(1, this.stack.size());
		
		Assert.assertEquals(Integer.valueOf(1), this.stack.pop());
		Assert.assertEquals(0, this.stack.size());
	}
	
	@Test
	public void PushArrayAmountSearchExist() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		
		Assert.assertEquals(2, this.stack.search(Integer.valueOf(5)));
		Assert.assertEquals(1, this.stack.search(Integer.valueOf(3)));
		Assert.assertEquals(0, this.stack.search(Integer.valueOf(1)));
	}
	
	@Test
	public void PushArrayAmountSearchNotExist() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(7)));
	}
	
	@Test
	public void PushSizeClearSize() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		Assert.assertEquals(3, this.stack.size());
		
		Assert.assertEquals(Integer.valueOf(5), this.stack.pop());
		Assert.assertEquals(2, this.stack.size());
		
		this.stack.clear();
		Assert.assertEquals(0, this.stack.size());
	}
	
	@Test
	public void PushSizeClearEmpty() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		Assert.assertEquals(3, this.stack.size());
		
		this.stack.clear();
		Assert.assertTrue(this.stack.empty());
	}
	
	@Test(expected = EmptyStackException.class)
	public void PushClearPeek() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(1, this.stack.size());
		
		this.stack.clear();
		Assert.assertEquals(0, this.stack.size());
		this.stack.peek();
	}
	
	@Test(expected = EmptyStackException.class)
	public void PushClearPop() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(1, this.stack.size());
		
		this.stack.clear();
		Assert.assertEquals(0, this.stack.size());
		this.stack.pop();
	}
	
	@Test
	public void PushClearSearchExist() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(0, this.stack.search(Integer.valueOf(1)));
		
		this.stack.clear();
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(1)));
	}
	
	@Test
	public void PushClearSearchNotExist() {
		this.stack.push(Integer.valueOf(1));
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(2)));
		
		this.stack.clear();
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(2)));
	}
	
	@Test
	public void PushExceedArrayAmountSize() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		this.stack.push(Integer.valueOf(7));
		Assert.assertEquals(4, this.stack.size());
	}
	
	@Test
	public void PushExceedArrayAmountCheck() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		this.stack.push(Integer.valueOf(7));
		Assert.assertFalse(this.stack.empty());
	}
		
	@Test
	public void PushExceedArrayAmountPeek() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		this.stack.push(Integer.valueOf(7));
		
		Assert.assertEquals(Integer.valueOf(7), this.stack.peek());
		Assert.assertEquals(4, this.stack.size());
	}
	
	@Test
	public void PushExceedArrayAmountPop() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		this.stack.push(Integer.valueOf(7));
		
		Assert.assertEquals(Integer.valueOf(7), this.stack.pop());
		Assert.assertEquals(3, this.stack.size());
	}
	
	@Test
	public void PushExceedArrayAmountSearchExist() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		this.stack.push(Integer.valueOf(7));
		
		Assert.assertEquals(3, this.stack.search(Integer.valueOf(7)));
	}
	
	@Test
	public void PushExceedArrayAmountSearchNotExist() {
		this.stack.push(Integer.valueOf(1));
		this.stack.push(Integer.valueOf(3));
		this.stack.push(Integer.valueOf(5));
		this.stack.push(Integer.valueOf(7));
		
		Assert.assertEquals(-1, this.stack.search(Integer.valueOf(9)));
	}
}