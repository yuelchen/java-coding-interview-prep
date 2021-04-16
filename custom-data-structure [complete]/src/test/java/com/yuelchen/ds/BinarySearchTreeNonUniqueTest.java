package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeNonUniqueTest {

	private BinarySearchTree<Integer> bst;
	
	@Before
	public void SetUp() {
		this.bst = new BinarySearchTree<Integer>();
	} 
	
	@Test
	public void EmptySize() {
		Assert.assertEquals(0, this.bst.getSize());
	}
	
	@Test
	public void EmptyDepth() {
		Assert.assertEquals(0, this.bst.getMaxDepth());
	}
	
	@Test
	public void EmptyClear() {
		this.bst.clear();
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}

	@Test
	public void EmptyContainsValueNotExist() {
		Assert.assertFalse(this.bst.containsValue(Integer.valueOf(1)));
	}

	@Test
	public void EmptyGetNodeNotExist() {
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)));
	}

	@Test
	public void EmptyGetMinNode() {
		Assert.assertNull(this.bst.getMinNode());
	}

	@Test
	public void EmptyGetMaxNode() {
		Assert.assertNull(this.bst.getMaxNode());
	}
	
	@Test
	public void EmptyRemoveNotExist() {
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(0, this.bst.getSize());
	}
	
	@Test
	public void InsertOne() {
		this.bst.insert(Integer.valueOf(1));
	}
	
	@Test
	public void InsertOneSize() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(1, this.bst.getSize());
	}
	
	@Test
	public void InsertOneDepth() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(1, this.bst.getMaxDepth());
	}
	
	@Test
	public void InsertOneClear() {
		this.bst.insert(Integer.valueOf(1));
		
		this.bst.clear();
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertOneContainsValueExist() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(1)));
	}

	@Test
	public void InsertOneContainsValueNotExist() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertFalse(this.bst.containsValue(Integer.valueOf(0)));
	}

	@Test
	public void InsertOneGetNodeExist() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)));
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(1)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());
	}
	
	@Test
	public void InsertOneGetNodeNotExist() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertNull(this.bst.getNode(Integer.valueOf(0)));
	}

	@Test
	public void InsertOneGetMinNode() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertNotNull(this.bst.getMinNode());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getMinNode().getValue());
	}

	@Test
	public void InsertOneGetMaxNode() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertNotNull(this.bst.getMaxNode());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getMaxNode().getValue());
	}
	
	@Test
	public void InsertOneRemoveExist() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(1, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(0, this.bst.getSize());
		
	}
	
	@Test
	public void InsertOneRemoveNotExist() {
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(1, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(0));
		Assert.assertEquals(1, this.bst.getSize());
		
	}
	
	@Test
	public void InsertTwoWithDuplicateLeft() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftSize() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftDepth() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getMaxDepth());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftClear() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		
		this.bst.clear();
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftContainsValueExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(1)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(2)));
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftContainsValueNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertFalse(this.bst.containsValue(Integer.valueOf(0)));
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftGetNodeExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)));
		Assert.assertEquals(Integer.valueOf(2), this.bst.getNode(Integer.valueOf(2)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)));
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(1)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftGetNodeNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNull(this.bst.getNode(Integer.valueOf(0)));
	}

	@Test
	public void InsertTwoWithDuplicateLeftGetMinNode() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));

		Assert.assertNotNull(this.bst.getMinNode());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getMinNode().getValue());
	}

	@Test
	public void InsertTwoWithDuplicateLeftGetMaxNode() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNotNull(this.bst.getMaxNode());
		Assert.assertEquals(Integer.valueOf(2), this.bst.getMaxNode().getValue());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftRemoveExistRoot() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());

		this.bst.remove(Integer.valueOf(2));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getRoot().getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());	
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(1, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getRoot().getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());	
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftRemoveExistLeaf() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.bst.getRoot().getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());
	}
	
	@Test
	public void InsertTwoWithDuplicateLeftRemoveNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(3, this.bst.getSize());
	}
	
	@Test
	public void InsertTwoWithDuplicateRight() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
	}
	
	@Test
	public void InsertTwoWithDuplicateRightSize() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		Assert.assertEquals(3, this.bst.getSize());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightDepth() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		Assert.assertEquals(2, this.bst.getMaxDepth());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightClear() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		this.bst.clear();
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightContainsValueExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(2)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(3)));
	}
	
	@Test
	public void InsertTwoWithDuplicateRightContainsValueNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		Assert.assertFalse(this.bst.containsValue(Integer.valueOf(0)));
	}
	
	@Test
	public void InsertTwoWithDuplicateRightGetNodeExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)));
		Assert.assertEquals(Integer.valueOf(2), this.bst.getNode(Integer.valueOf(2)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(3)));
		Assert.assertEquals(Integer.valueOf(3), this.bst.getNode(Integer.valueOf(3)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(3)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(3)).getNextRight());
		
	}
	
	@Test
	public void InsertTwoWithDuplicateRightGetNodeNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		Assert.assertNull(this.bst.getNode(Integer.valueOf(0)));
	}
	
	@Test
	public void InsertTwoWithDuplicateRightGetMinNode() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		Assert.assertNotNull(this.bst.getMinNode());
		Assert.assertEquals(Integer.valueOf(2), this.bst.getMinNode().getValue());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightGetMaxNode() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		Assert.assertNotNull(this.bst.getMaxNode());
		Assert.assertEquals(Integer.valueOf(3), this.bst.getMaxNode().getValue());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightRemoveExistRoot() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(2));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(3), this.bst.getRoot().getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(3)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(3)).getNextRight());	
		
		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(1, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.bst.getRoot().getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());	
		
		this.bst.remove(Integer.valueOf(2));
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightRemoveExistLeaf() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		
		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(2), this.bst.getRoot().getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());
	}
	
	@Test
	public void InsertTwoWithDuplicateRightRemoveNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));

		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
	}
	

	@Test
	public void InsertThree() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(2)).getPrevLeft().getValue());
		Assert.assertEquals(Integer.valueOf(3), this.bst.getNode(Integer.valueOf(2)).getNextRight().getValue());
	}

	@Test
	public void InsertThreeSize() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
	}

	@Test
	public void InsertThreeDepth() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(2, this.bst.getMaxDepth());
	}

	@Test
	public void InsertThreeClear() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		this.bst.clear();
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertThreeContainsValueExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(1)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(2)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(3)));
	}
	
	@Test
	public void InsertThreeContainsValueNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));

		Assert.assertFalse(this.bst.containsValue(Integer.valueOf(0)));
	}
	
	@Test
	public void InsertThreeGetNodeExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)));
		Assert.assertEquals(Integer.valueOf(2), this.bst.getNode(Integer.valueOf(2)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(3)));
		Assert.assertEquals(Integer.valueOf(3), this.bst.getNode(Integer.valueOf(3)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(3)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(3)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)));
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(1)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());
	}
	
	@Test
	public void InsertThreeGetNodeNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNull(this.bst.getNode(Integer.valueOf(0)));
	}
	
	@Test
	public void InsertThreeGetMinNode() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNotNull(this.bst.getMinNode());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getMinNode().getValue());
	}
	
	@Test
	public void InsertThreeGetMaxNode() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		
		Assert.assertNotNull(this.bst.getMaxNode());
		Assert.assertEquals(Integer.valueOf(3), this.bst.getMaxNode().getValue());
	}

	@Test
	public void InsertThreeRemoveExistRoot() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(2));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(3), this.bst.getRoot().getValue());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(3)).getPrevLeft().getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(3)).getNextRight());	
		
		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(1, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getRoot().getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}

	@Test
	public void InsertThreeRemoveExistLeftLeaf() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getPrevLeft());
		Assert.assertEquals(Integer.valueOf(3), this.bst.getNode(Integer.valueOf(2)).getNextRight().getValue());
	}

	@Test
	public void InsertThreeRemoveExistRightLeaf() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(2)).getPrevLeft().getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)).getNextRight());		
	}
	
	@Test
	public void InsertThreeRemoveNotExist() {
		this.bst.insert(Integer.valueOf(2));
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(1));
		Assert.assertEquals(3, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(4));
		Assert.assertEquals(3, this.bst.getSize());
	}
	
	@Test
	public void InsertCombo() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
	}

	@Test
	public void InsertComboSize() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		Assert.assertEquals(6, this.bst.getSize());
	}

	@Test
	public void InsertComboDepth() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		Assert.assertEquals(3, this.bst.getMaxDepth());
	}

	@Test
	public void InsertComboClear() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		
		this.bst.clear();
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertComboContainsValueExist() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));		

		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(0)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(1)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(3)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(4)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(5)));
		Assert.assertTrue(this.bst.containsValue(Integer.valueOf(6)));
	}
	
	@Test
	public void InsertComboContainsValueNotExist() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));

		Assert.assertFalse(this.bst.containsValue(Integer.valueOf(2)));
	}
	
	@Test
	public void InsertComboGetNodeExist() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(3)));
		Assert.assertEquals(Integer.valueOf(3), this.bst.getNode(Integer.valueOf(3)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(3)).getPrevLeft());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(3)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(5)));
		Assert.assertEquals(Integer.valueOf(5), this.bst.getNode(Integer.valueOf(5)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(5)).getPrevLeft());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(5)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)));
		Assert.assertEquals(Integer.valueOf(1), this.bst.getNode(Integer.valueOf(1)).getValue());
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(1)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(1)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(4)));
		Assert.assertEquals(Integer.valueOf(4), this.bst.getNode(Integer.valueOf(4)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(4)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(4)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(6)));
		Assert.assertEquals(Integer.valueOf(6), this.bst.getNode(Integer.valueOf(6)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(6)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(6)).getNextRight());
		
		Assert.assertNotNull(this.bst.getNode(Integer.valueOf(0)));
		Assert.assertEquals(Integer.valueOf(0), this.bst.getNode(Integer.valueOf(0)).getValue());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(0)).getPrevLeft());
		Assert.assertNull(this.bst.getNode(Integer.valueOf(0)).getNextRight());
	}
	
	@Test
	public void InsertComboGetNodeNotExist() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		
		Assert.assertNull(this.bst.getNode(Integer.valueOf(2)));
	}
	
	@Test
	public void InsertComboGetMinNode() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		
		Assert.assertNotNull(this.bst.getMinNode());
		Assert.assertEquals(Integer.valueOf(0), this.bst.getMinNode().getValue());
	}
	
	@Test
	public void InsertComboGetMaxNode() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		
		Assert.assertNotNull(this.bst.getMaxNode());
		Assert.assertEquals(Integer.valueOf(6), this.bst.getMaxNode().getValue());
	}
	
	@Test
	public void InsertComboRemoveExistRootToLeaf() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		Assert.assertEquals(6, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(5, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(4), this.bst.getRoot().getValue());

		this.bst.remove(Integer.valueOf(4));
		Assert.assertEquals(4, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(5), this.bst.getRoot().getValue());
		
		this.bst.remove(Integer.valueOf(5));
		Assert.assertEquals(3, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(6), this.bst.getRoot().getValue());
		
		this.bst.remove(Integer.valueOf(6));
		Assert.assertEquals(2, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(1), this.bst.getRoot().getValue());
		
		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(1, this.bst.getSize());
		Assert.assertEquals(Integer.valueOf(0), this.bst.getRoot().getValue());
		
		this.bst.remove(Integer.valueOf(0));
		Assert.assertEquals(0, this.bst.getSize());
		Assert.assertNull(this.bst.getRoot());
	}
	
	@Test
	public void InsertComboRemoveExistLeafToRoot() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		Assert.assertEquals(6, this.bst.getSize());

		this.bst.remove(Integer.valueOf(0));
		Assert.assertEquals(5, this.bst.getSize());

		this.bst.remove(Integer.valueOf(6));
		Assert.assertEquals(4, this.bst.getSize());

		this.bst.remove(Integer.valueOf(4));
		Assert.assertEquals(3, this.bst.getSize());

		this.bst.remove(Integer.valueOf(1));
		Assert.assertEquals(2, this.bst.getSize());

		this.bst.remove(Integer.valueOf(5));
		Assert.assertEquals(1, this.bst.getSize());

		this.bst.remove(Integer.valueOf(3));
		Assert.assertEquals(0, this.bst.getSize());
	}
	
	@Test
	public void InsertComboRemoveNotExist() {
		this.bst.insert(Integer.valueOf(3));
		this.bst.insert(Integer.valueOf(5));
		this.bst.insert(Integer.valueOf(1));
		this.bst.insert(Integer.valueOf(4));
		this.bst.insert(Integer.valueOf(6));
		this.bst.insert(Integer.valueOf(0));
		Assert.assertEquals(6, this.bst.getSize());
		
		this.bst.remove(Integer.valueOf(2));
		Assert.assertEquals(6, this.bst.getSize());
	}
}