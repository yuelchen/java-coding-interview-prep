package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapArrayTest {

	private HashMapArray<Integer, String> map;
	
	@Before
	public void SetUp() {
		this.map = new HashMapArray<Integer, String>();
	}
	
	@Test
	public void EmptySize() {
		Assert.assertEquals(0, this.map.getSize());
	}

	@Test
	public void EmptyCheck() {
		Assert.assertTrue(this.map.empty());
	}

	@Test
	public void EmptyGetValue() {
		Assert.assertEquals(0, this.map.getSize());
		Assert.assertNull(this.map.getValue(Integer.valueOf(0)));
	}
	
	@Test
	public void EmptyRemove() {
		Assert.assertEquals(0, this.map.getSize());
		Assert.assertTrue(this.map.empty());
		
		this.map.remove(Integer.valueOf(1));
		Assert.assertEquals(0, this.map.getSize());
		Assert.assertTrue(this.map.empty());
	}

	@Test
	public void EmptyContainsKey() {
		Assert.assertTrue(this.map.empty());
		Assert.assertFalse(this.map.containsKey(Integer.valueOf(1)));
	}
	
	@Test
	public void EmptyClear() {
		Assert.assertEquals(0, this.map.getSize());
		Assert.assertTrue(this.map.empty());
		
		this.map.clear();
		Assert.assertEquals(0, this.map.getSize());
		Assert.assertTrue(this.map.empty());
	}

	@Test
	public void AddOneSize() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals(1, this.map.getSize());
	}

	@Test
	public void AddOneOverwriteSize() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals(1, this.map.getSize());
		
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "second"));
		Assert.assertEquals(1, this.map.getSize());
	}
	
	@Test
	public void AddOneCheck() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertFalse(this.map.empty());		
	}

	@Test
	public void AddOneOverwriteCheck() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertFalse(this.map.empty());
		
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "second"));
		Assert.assertFalse(this.map.empty());
	}

	@Test
	public void AddOneGetValueExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals("first", this.map.getValue(Integer.valueOf(0)));
	}

	@Test
	public void AddOneGetValueNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNull(this.map.getValue(Integer.valueOf(1)));
	}

	@Test
	public void AddOneOverwriteGetValueExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals("first", this.map.getValue(Integer.valueOf(0)));
		
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "second"));
		Assert.assertEquals("second", this.map.getValue(Integer.valueOf(0)));
	}

	@Test
	public void AddOneOverwriteGetValueNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals("first", this.map.getValue(Integer.valueOf(0)));
		
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "second"));
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNull(this.map.getValue(Integer.valueOf(1)));
	}
	
	@Test	
	public void AddOneContainsKeyExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(0)));
	}

	@Test
	public void AddOneContainsKeyNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertFalse(this.map.containsKey(Integer.valueOf(1)));
	}

	@Test
	public void AddOneRemoveExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals(1, this.map.getSize());
		
		this.map.remove(Integer.valueOf(0));
		Assert.assertEquals(0, this.map.getSize());
		
	}

	@Test
	public void AddOneRemoveNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals(1, this.map.getSize());

		this.map.remove(Integer.valueOf(1));
		Assert.assertEquals(1, this.map.getSize());
	}
	
	@Test
	public void AddOneClear() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertEquals(1, this.map.getSize());
		
		this.map.clear();
		Assert.assertEquals(0, this.map.getSize());
	}

	@Test
	public void AddArrayLimitSize() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertEquals(3, this.map.getSize());		
	}

	@Test
	public void AddArrayLimitOVerwriteSize() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertEquals(3, this.map.getSize());
		
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "fourth"));
		Assert.assertEquals(3, this.map.getSize());
	}

	@Test
	public void AddArrayLimitCheck() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertFalse(this.map.empty());
	}

	@Test
	public void AddArrayLimitOverwriteCheck() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertFalse(this.map.empty());
		
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "fourth"));
		Assert.assertFalse(this.map.empty());	
	}

	@Test
	public void AddArrayLimitGetValueExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		
		Assert.assertEquals("first", this.map.getValue(Integer.valueOf(0)));
		Assert.assertEquals("second", this.map.getValue(Integer.valueOf(1)));
		Assert.assertEquals("third", this.map.getValue(Integer.valueOf(2)));
	}

	@Test
	public void AddArrayLimitGetValueNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(0)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(0)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(1)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(2)));
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(2)));
		
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(3)));
		Assert.assertNull(this.map.getValue(Integer.valueOf(3)));
	}

	@Test
	public void AddArrayLimitOverwriteGetValueExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "fourth"));
		
		Assert.assertEquals("first", this.map.getValue(Integer.valueOf(0)));
		Assert.assertEquals("second", this.map.getValue(Integer.valueOf(1)));
		Assert.assertEquals("fourth", this.map.getValue(Integer.valueOf(2)));
	}

	@Test
	public void AddArrayLimitOverwriteGetValueNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "fourth"));
		
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(0)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(0)));
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(0)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(1)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(2)));
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(2)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(2)));
		
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(3)));
		Assert.assertNull(this.map.getValue(Integer.valueOf(3)));
	}

	@Test
	public void AddArrayLimitRemoveExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertEquals(3, this.map.getSize());
		
		this.map.remove(Integer.valueOf(0));
		Assert.assertEquals(2, this.map.getSize());
		this.map.remove(Integer.valueOf(2));
		Assert.assertEquals(1, this.map.getSize());
		this.map.remove(Integer.valueOf(1));
		Assert.assertEquals(0, this.map.getSize());
	}

	@Test
	public void AddArrayLimitRemoveNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertEquals(3, this.map.getSize());
		
		this.map.remove(Integer.valueOf(3));
		Assert.assertEquals(3, this.map.getSize());
	}

	@Test
	public void AddArrayLimitContainsKeyExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(0)));
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(1)));
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(2)));
	}

	@Test
	public void AddArrayLimitContainsKeyNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		
		Assert.assertFalse(this.map.containsKey(Integer.valueOf(3)));
	}
	
	@Test
	public void AddArrayLimitClear() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertEquals(3, this.map.getSize());

		this.map.clear();
		Assert.assertEquals(0, this.map.getSize());
	}

	@Test
	public void AddExceedArrayLimitSize() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		Assert.assertEquals(4, this.map.getSize());
	}

	@Test
	public void AddExceedArrayLimitCheck() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		Assert.assertFalse(this.map.empty());
	}

	@Test
	public void AddExceedArrayLimitGetValueExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		
		Assert.assertEquals("first", this.map.getValue(Integer.valueOf(0)));
		Assert.assertEquals("second", this.map.getValue(Integer.valueOf(1)));
		Assert.assertEquals("third", this.map.getValue(Integer.valueOf(2)));
		Assert.assertEquals("fourth", this.map.getValue(Integer.valueOf(3)));
	}

	@Test
	public void AddExceedArrayLimitGetValueNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(0)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(0)));
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(0)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(1)));
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(1)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(2)));
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(2)));
		Assert.assertNotEquals("fourth", this.map.getValue(Integer.valueOf(2)));
		
		Assert.assertNotEquals("first", this.map.getValue(Integer.valueOf(3)));
		Assert.assertNotEquals("second", this.map.getValue(Integer.valueOf(3)));
		Assert.assertNotEquals("third", this.map.getValue(Integer.valueOf(3)));
		
		Assert.assertNotEquals("fifth", this.map.getValue(Integer.valueOf(5)));
		Assert.assertNull(this.map.getValue(Integer.valueOf(5)));
	}

	@Test
	public void AddExceedArrayLimitRemoveExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		Assert.assertEquals(4, this.map.getSize());
		
		this.map.remove(Integer.valueOf(0));
		Assert.assertEquals(3, this.map.getSize());
		this.map.remove(Integer.valueOf(1));
		Assert.assertEquals(2, this.map.getSize());
		this.map.remove(Integer.valueOf(2));
		Assert.assertEquals(1, this.map.getSize());
		this.map.remove(Integer.valueOf(3));
		Assert.assertEquals(0, this.map.getSize());
	}

	@Test
	public void AddExceedArrayLimitRemoveNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		Assert.assertEquals(4, this.map.getSize());
		
		this.map.remove(Integer.valueOf(4));
		Assert.assertEquals(4, this.map.getSize());
	}

	@Test
	public void AddExceedArrayLimitContainsKeyExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(0)));
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(1)));
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(2)));
		Assert.assertTrue(this.map.containsKey(Integer.valueOf(3)));
	}

	@Test
	public void AddExceedArrayLimitContainsKeyNotExist() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		
		Assert.assertFalse(this.map.containsKey(Integer.valueOf(4)));		
	}

	@Test
	public void AddExceedArrayLimitClear() {
		Assert.assertTrue(this.map.put(Integer.valueOf(0), "first"));
		Assert.assertTrue(this.map.put(Integer.valueOf(1), "second"));
		Assert.assertTrue(this.map.put(Integer.valueOf(2), "third"));
		Assert.assertTrue(this.map.put(Integer.valueOf(3), "fourth"));
		Assert.assertEquals(4, this.map.getSize());
		
		this.map.clear();
		Assert.assertEquals(0, this.map.getSize());
	}
}