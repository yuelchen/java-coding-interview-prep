package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinglyCircularLinkedListTest {
	
	private SinglyCircularLinkedList<Integer> linkedList;
	
	@Before
	public void SetUp() {
		this.linkedList = new SinglyCircularLinkedList<Integer>();
	}
	
	@Test
	public void EmptyLinkedListSize() {
		Assert.assertEquals(0, this.linkedList.getSize());
	}

	@Test
	public void EmptyLinkedListCheck() {
		Assert.assertTrue(this.linkedList.empty());
	}

	@Test
	public void EmptyLinkedListPeekFirst() {
		Assert.assertNull(this.linkedList.peekFirst());
	}

	@Test
	public void EmptyLinkedListPeekLast() {
		Assert.assertNull(this.linkedList.peekLast());
	}

	@Test
	public void EmptyLinkedListRemoveFirst() {
		Assert.assertNull(this.linkedList.removeFirst());
	}

	@Test
	public void EmptyLinkedListRemoveLast() {
		Assert.assertNull(this.linkedList.removeLast());
	}

	@Test
	public void EmptyLinkedListContainsValue() {
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(0)));
	}
	
	@Test
	public void EmptyLinkedListClear() {
		this.linkedList.clear();
		Assert.assertEquals(0, this.linkedList.getSize());
	}

	@Test
	public void AddOneFirstSize() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertEquals(1, this.linkedList.getSize());
	}

	@Test
	public void AddOneFirstCheck() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertFalse(this.linkedList.empty());
	}

	@Test
	public void AddOneFirstPeekFirst() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
	}

	@Test
	public void AddOneFirstPeekLast() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekLast().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
	}

	@Test
	public void AddOneFirstRemoveFirst() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeFirst().getValue());
		Assert.assertNull(this.linkedList.removeFirst());
	}

	@Test
	public void AddOneFirstRemoveLast() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeLast().getValue());
		Assert.assertNull(this.linkedList.removeLast());
	}

	@Test
	public void AddOneFirstContainsValue() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(1)));
	}

	@Test
	public void AddOneFirstNotContainsValue() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(2)));
	}

	@Test
	public void AddOneFirstClear() {
		this.linkedList.addFirst(Integer.valueOf(1));
		Assert.assertEquals(1, this.linkedList.getSize());
		
		this.linkedList.clear();
		Assert.assertEquals(0, this.linkedList.getSize());
	}

	@Test
	public void AddOneLastSize() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertEquals(1, this.linkedList.getSize());
	}

	@Test
	public void AddOneLastCheck() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertFalse(this.linkedList.empty());
	}

	@Test
	public void AddOneLastPeekFirst() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
	}

	@Test
	public void AddOneLastPeekLast() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekLast().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
	}

	@Test
	public void AddOneLastRemoveFirst() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeFirst().getValue());
		Assert.assertNull(this.linkedList.removeFirst());
	}

	@Test
	public void AddOneLastRemoveLast() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeLast().getValue());
		Assert.assertNull(this.linkedList.removeLast());
	}

	@Test
	public void AddOneLastContainsValue() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(1)));
	}

	@Test
	public void AddOneLastNotContainsValue() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(2)));
	}
	
	@Test
	public void AddOneLastClear() {
		this.linkedList.addLast(Integer.valueOf(1));
		Assert.assertEquals(1, this.linkedList.getSize());
		
		this.linkedList.clear();
		Assert.assertEquals(0, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleFirstSize() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleFirstCheck() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		Assert.assertFalse(this.linkedList.empty());
	}
	
	@Test
	public void AddMultipleFirstPeekFirst() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleFirstPeekLast() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekLast().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekLast().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleFirstRemoveFirst() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(2, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(0, this.linkedList.getSize());
		
		Assert.assertNull(this.linkedList.removeFirst());
	}
	
	@Test
	public void AddMultipleFirstRemoveLast() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeLast().getValue());
		Assert.assertEquals(2, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.linkedList.removeLast().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.removeLast().getValue());
		Assert.assertEquals(0, this.linkedList.getSize());
		
		Assert.assertNull(this.linkedList.removeFirst());
	}
	
	@Test
	public void AddMultipleFirstContainsValue() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(1)));
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(2)));
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(3)));
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleFirstNotContainsValue() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(4)));
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleFirstClear() {
		// order should be 3 -> 2 -> 1
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addFirst(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
		
		this.linkedList.clear();
		Assert.assertEquals(0, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleLastSize() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleLastCheck() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		Assert.assertFalse(this.linkedList.empty());
	}
	
	@Test
	public void AddMultipleLastPeekFirst() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleLastPeekLast() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.peekLast().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.peekLast().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleLastRemoveFirst() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(2, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(0, this.linkedList.getSize());
		
		Assert.assertNull(this.linkedList.removeFirst());
	}
	
	@Test
	public void AddMultipleLastRemoveLast() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.removeLast().getValue());
		Assert.assertEquals(2, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.linkedList.removeLast().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.linkedList.removeLast().getValue());
		Assert.assertEquals(0, this.linkedList.getSize());
		
		Assert.assertNull(this.linkedList.removeLast());
	}
	
	@Test
	public void AddMultipleLastContainsValue() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));

		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(1)));
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(2)));
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(3)));
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleLastNotContainsValue() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));

		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(4)));
		Assert.assertEquals(3, this.linkedList.getSize());
	}
	
	@Test
	public void AddMultipleLastClear() {
		// order should be 1 -> 2 -> 3
		this.linkedList.addLast(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addLast(Integer.valueOf(3));
		Assert.assertEquals(3, this.linkedList.getSize());
		
		this.linkedList.clear();
		Assert.assertEquals(0, this.linkedList.getSize());		
	}
	
	@Test
	public void MixAndMatch() {
		Assert.assertTrue(this.linkedList.empty());
		
		// order should be 5 -> 3 -> 1 -> 2 -> 4 -> 6
		this.linkedList.addFirst(Integer.valueOf(1));
		this.linkedList.addLast(Integer.valueOf(2));
		this.linkedList.addFirst(Integer.valueOf(3));
		this.linkedList.addLast(Integer.valueOf(4));
		this.linkedList.addFirst(Integer.valueOf(5));
		this.linkedList.addLast(Integer.valueOf(6));
		Assert.assertFalse(this.linkedList.empty());
		
		Assert.assertEquals(Integer.valueOf(6), this.linkedList.peekLast().getValue());
		Assert.assertEquals(6, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(6), this.linkedList.removeLast().getValue());
		Assert.assertEquals(5, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(4), this.linkedList.removeLast().getValue());
		Assert.assertEquals(Integer.valueOf(2), this.linkedList.removeLast().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(5), this.linkedList.peekFirst().getValue());
		Assert.assertEquals(3, this.linkedList.getSize());
		
		Assert.assertEquals(Integer.valueOf(5), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(Integer.valueOf(3), this.linkedList.removeFirst().getValue());
		Assert.assertEquals(1, this.linkedList.getSize());
		
		Assert.assertTrue(this.linkedList.containsValue(Integer.valueOf(1)));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(2)));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(3)));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(4)));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(5)));
		Assert.assertFalse(this.linkedList.containsValue(Integer.valueOf(6)));
		
		this.linkedList.clear();
		Assert.assertEquals(0, this.linkedList.getSize());
		Assert.assertTrue(this.linkedList.empty());
	}
}
