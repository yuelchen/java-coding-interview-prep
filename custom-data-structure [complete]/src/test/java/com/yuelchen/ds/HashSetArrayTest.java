package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashSetArrayTest {
	
	private HashSetArray<Integer> set;
	
	@Before
	public void SetUp() {
		this.set = new HashSetArray<Integer>();
	}
	
	@Test
	public void EmptySize() {
		Assert.assertEquals(0, this.set.size());
	}
	
	@Test
	public void EmptyCheck() {
		Assert.assertTrue(this.set.empty());
	}
	
	@Test
	public void EmptyRemove() {
		Assert.assertEquals(0, this.set.size());
		Assert.assertTrue(this.set.empty());
		
		this.set.remove(Integer.valueOf(0));
		Assert.assertEquals(0, this.set.size());
		Assert.assertTrue(this.set.empty());
	}
	
	@Test
	public void EmptyContains() {
		Assert.assertTrue(this.set.empty());
		Assert.assertFalse(this.set.contains(Integer.valueOf(0)));
	}
	
	@Test
	public void EmptyClear() {
		Assert.assertEquals(0, this.set.size());
		Assert.assertTrue(this.set.empty());
		
		this.set.clear();
		Assert.assertEquals(0, this.set.size());
		Assert.assertTrue(this.set.empty());
	}
	
	@Test
	public void AddOneSize() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertEquals(1, this.set.size());
	}

	@Test
	public void AddOneCheck() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertFalse(this.set.empty());
	}
	
	@Test
	public void AddOneRemoveExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertEquals(1, this.set.size());
		
		this.set.remove(Integer.valueOf(0));
		Assert.assertEquals(0, this.set.size());
	}
	
	@Test
	public void AddOneRemoveNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertEquals(1, this.set.size());
		
		this.set.remove(Integer.valueOf(1));
		Assert.assertEquals(1, this.set.size());
	}
	
	@Test
	public void AddOneContainsExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertEquals(1, this.set.size()); 
		
		Assert.assertTrue(this.set.contains(Integer.valueOf(0)));
	}
	
	@Test
	public void AddOneContainsNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertEquals(1, this.set.size()); 
		
		Assert.assertFalse(this.set.contains(Integer.valueOf(1)));
	}
	
	@Test
	public void AddOneClear() {
		Assert.assertTrue(this.set.add(Integer.valueOf(0)));
		Assert.assertEquals(1, this.set.size()); 
		
		this.set.clear();
		Assert.assertEquals(0, this.set.size());
	}

	@Test
	public void AddArrayLimitSize() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
	}

	@Test
	public void AddArrayLimitCheck() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertFalse(this.set.empty());
	}

	@Test
	public void AddArrayLimitRemoveExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		this.set.remove(Integer.valueOf(1));
		Assert.assertEquals(2, this.set.size()); 
		this.set.remove(Integer.valueOf(3));
		Assert.assertEquals(1, this.set.size()); 
		this.set.remove(Integer.valueOf(2));
		Assert.assertEquals(0, this.set.size()); 
	}

	@Test
	public void AddArrayLimitRemoveNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		this.set.remove(Integer.valueOf(0));
		Assert.assertEquals(3, this.set.size()); 
	}

	@Test
	public void AddArrayLimitContainsExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		
		Assert.assertTrue(this.set.contains(Integer.valueOf(1)));
		Assert.assertTrue(this.set.contains(Integer.valueOf(2)));
		Assert.assertTrue(this.set.contains(Integer.valueOf(3)));
	}

	@Test
	public void AddArrayLimitContainsNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		
		Assert.assertFalse(this.set.contains(Integer.valueOf(0)));
	}
	
	@Test
	public void AddArrayLimitClear() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		this.set.clear();
		Assert.assertEquals(0, this.set.size()); 
	}

	@Test
	public void AddExceedArrayLimitSize() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		Assert.assertEquals(5, this.set.size()); 
	}

	@Test
	public void AddExceedArrayLimitCheck() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		Assert.assertFalse(this.set.empty());
	}

	@Test
	public void AddExceedArrayLimitRemoveExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		Assert.assertEquals(5, this.set.size()); 
		
		this.set.remove(Integer.valueOf(1));
		Assert.assertEquals(4, this.set.size()); 
		this.set.remove(Integer.valueOf(3));
		Assert.assertEquals(3, this.set.size()); 
		this.set.remove(Integer.valueOf(5));
		Assert.assertEquals(2, this.set.size()); 
		this.set.remove(Integer.valueOf(4));
		Assert.assertEquals(1, this.set.size()); 
		this.set.remove(Integer.valueOf(2));
		Assert.assertEquals(0, this.set.size()); 
	}

	@Test
	public void AddExceedArrayLimitRemoveNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		Assert.assertEquals(5, this.set.size()); 

		this.set.remove(Integer.valueOf(0));
		Assert.assertEquals(5, this.set.size()); 
	}

	@Test
	public void AddExceedArrayLimitContainsExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		
		Assert.assertTrue(this.set.contains(Integer.valueOf(1)));
		Assert.assertTrue(this.set.contains(Integer.valueOf(3)));
		Assert.assertTrue(this.set.contains(Integer.valueOf(5)));
		Assert.assertTrue(this.set.contains(Integer.valueOf(4)));
		Assert.assertTrue(this.set.contains(Integer.valueOf(2)));
	}

	@Test
	public void AddExceedArrayLimitContainsNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		
		Assert.assertFalse(this.set.contains(Integer.valueOf(0)));		
	}

	@Test
	public void AddExceedArrayLimitClear() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(4)));
		Assert.assertTrue(this.set.add(Integer.valueOf(5)));
		Assert.assertEquals(5, this.set.size()); 
		
		this.set.clear();
		Assert.assertEquals(0, this.set.size()); 
	}
	
	@Test
	public void AddSameValueSize() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
	}
	
	@Test
	public void AddSameValueCheck() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertFalse(this.set.empty()); 
	}
	
	@Test
	public void AddSameValueRemoveExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		this.set.remove(Integer.valueOf(3));
		Assert.assertEquals(2, this.set.size()); 
	}

	@Test
	public void AddSameValueRemoveNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		this.set.remove(Integer.valueOf(4));
		Assert.assertEquals(3, this.set.size()); 
	}

	@Test
	public void AddSameValueContainsExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		Assert.assertTrue(this.set.contains(Integer.valueOf(3)));
	}

	@Test
	public void AddSameValueContainsNotExist() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		Assert.assertTrue(this.set.contains(Integer.valueOf(3)));
	}

	@Test
	public void AddSameValueClear() {
		Assert.assertTrue(this.set.add(Integer.valueOf(1)));
		Assert.assertTrue(this.set.add(Integer.valueOf(2)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertTrue(this.set.add(Integer.valueOf(3)));
		Assert.assertEquals(3, this.set.size()); 
		
		this.set.clear();
		Assert.assertEquals(0, this.set.size()); 		
	}
}