package com.yuelchen.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DirectedGraphTest {

	private DirectedGraph<String> graph;
	
	@Before
	public void SetUp() {
		this.graph = new DirectedGraph<String>();
	}

	@Test
	public void EmptyEdgeCount() {
		Assert.assertEquals(0, this.graph.getEdgeCount());
	}

	@Test
	public void EmptyNodeCount() {
		Assert.assertEquals(0, this.graph.getNodeCount());
	}

	@Test
	public void EmptyNodeEdgeCountNotExist() {
		Assert.assertEquals(0, this.graph.getNodeEdgeCount("A"));
	}

	@Test
	public void EmptyContainsEdgeNotExist() {
		Assert.assertFalse(this.graph.containsEdge("A", "B"));
	}

	@Test
	public void EmptyContainsNodeNotExist() {
		Assert.assertFalse(this.graph.containsNode("A"));
	}

	@Test
	public void EmptyGetNodeNotExist() {
		Assert.assertNull(this.graph.getNode("A"));
	}

	@Test
	public void EmptyRemoveEdgeNotExist() {
		Assert.assertEquals(0, this.graph.getEdgeCount());
		Assert.assertFalse(this.graph.containsEdge("A", "B"));
		
		this.graph.removeEdge("A", "B");
		Assert.assertEquals(0, this.graph.getEdgeCount());
		Assert.assertFalse(this.graph.containsEdge("A", "B"));
	}

	@Test
	public void EmptyRemoveNodeNotExist() {
		Assert.assertEquals(0, this.graph.getEdgeCount());
		Assert.assertFalse(this.graph.containsNode("A"));
		
		this.graph.removeNode("A");
		Assert.assertEquals(0, this.graph.getEdgeCount());
		Assert.assertFalse(this.graph.containsNode("A"));
	}
	
	@Test
	public void AddOne() {
		this.graph.addEdge("A", "B");		
	}

	@Test
	public void AddOneEdgeCount() {
		this.graph.addEdge("A", "B");	
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}

	@Test
	public void AddOneNodeCount() {
		this.graph.addEdge("A", "B");
		Assert.assertEquals(1, this.graph.getNodeCount());
	}

	@Test
	public void AddOneNodeEdgeCountExist() {
		this.graph.addEdge("A", "B");
		Assert.assertEquals(1, this.graph.getNodeEdgeCount("A"));
	}

	@Test
	public void AddOneNodeEdgeCountNotExist() {
		this.graph.addEdge("A", "B");
		Assert.assertEquals(0, this.graph.getNodeEdgeCount("B"));
	}

	@Test
	public void AddOneContainsEdgeExist() {
		this.graph.addEdge("A", "B");
		Assert.assertTrue(this.graph.containsEdge("A", "B"));
	}
	
	@Test
	public void AddOneContainsEdgeNotExist() {
		this.graph.addEdge("A", "B");
		Assert.assertFalse(this.graph.containsEdge("B", "A"));
	}
	
	@Test
	public void AddOneContainsNodeExist() {
		this.graph.addEdge("A", "B");
		Assert.assertTrue(this.graph.containsNode("A"));
	}
	
	@Test
	public void AddOneContainsNodeNotExist() {
		this.graph.addEdge("A", "B");
		Assert.assertFalse(this.graph.containsNode("B"));
	}

	@Test
	public void AddOneGetNodeExist() {
		this.graph.addEdge("A", "B");
		Assert.assertNotNull(this.graph.getNode("A"));
		Assert.assertEquals("A", this.graph.getNode("A").getValue());
		Assert.assertEquals(1, this.graph.getNode("A").getDestinationNodes().size());
	}
	
	@Test
	public void AddOneGetNodeNotExist() {
		this.graph.addEdge("A", "B");
		Assert.assertNull(this.graph.getNode("B"));
	}
	
	@Test
	public void AddOneRemoveEdgeExist() {
		this.graph.addEdge("A", "B");		
		this.graph.removeEdge("A", "B");
		Assert.assertEquals(0, this.graph.getEdgeCount());
	}

	@Test
	public void AddOneRemoveEdgeNotExist() {
		this.graph.addEdge("A", "B");		
		this.graph.removeEdge("B", "A");
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddOneRemoveNodeExist() {
		this.graph.addEdge("A", "B");		
		this.graph.removeNode("A");
		Assert.assertEquals(0, this.graph.getEdgeCount());		
	}
	
	@Test
	public void AddOneRemoveNodeNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.removeNode("B");
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddReverse() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
	}

	@Test
	public void AddReverseEdgeCount() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertEquals(2, this.graph.getEdgeCount());
	}

	@Test
	public void AddReverseNodeCount() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertEquals(2, this.graph.getNodeCount());
	}
	
	@Test
	public void AddReverseNodeEdgeCountExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertEquals(1, this.graph.getNodeEdgeCount("A"));
		Assert.assertEquals(1, this.graph.getNodeEdgeCount("B"));
	}
	
	@Test
	public void AddReverseNodeEdgeCountNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertEquals(0, this.graph.getNodeEdgeCount("C"));
	}

	@Test
	public void AddReverseContainsEdgeExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertTrue(this.graph.containsEdge("A", "B"));
		Assert.assertTrue(this.graph.containsEdge("B", "A"));
	}
	
	@Test
	public void AddReverseContainsEdgeNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertFalse(this.graph.containsEdge("A", "C"));
		Assert.assertFalse(this.graph.containsEdge("B", "C"));
	}

	@Test
	public void AddReverseContainsNodeExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertTrue(this.graph.containsNode("A"));
		Assert.assertTrue(this.graph.containsNode("B"));
	}

	@Test
	public void AddReverseContainsNodeNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertFalse(this.graph.containsNode("C"));
	}
	
	@Test
	public void AddReverseGetNodeExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertNotNull(this.graph.getNode("A"));	
		Assert.assertEquals("A", this.graph.getNode("A").getValue());
		Assert.assertEquals(1, this.graph.getNode("A").getDestinationNodes().size());
		
		Assert.assertNotNull(this.graph.getNode("B"));
		Assert.assertEquals("B", this.graph.getNode("B").getValue());
		Assert.assertEquals(1, this.graph.getNode("B").getDestinationNodes().size());
	}
	
	@Test
	public void AddReverseGetNodeNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		Assert.assertNull(this.graph.getNode("C"));		
	}
	
	@Test
	public void AddReverseRemoveEdgeExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		
		this.graph.removeEdge("A", "B");
		Assert.assertEquals(1, this.graph.getEdgeCount());
		
		this.graph.removeEdge("B", "A");
		Assert.assertEquals(0, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddReverseRemoveEdgeNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		
		this.graph.removeEdge("A", "C");
		this.graph.removeEdge("B", "C");
		Assert.assertEquals(2, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddReverseRemoveNodeExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		
		this.graph.removeNode("A");
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddReverseRemoveNodeNotExist() {
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "A");
		
		this.graph.removeNode("C");
		Assert.assertEquals(2, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddSelf() {
		this.graph.addEdge("A", "A");
	}
	
	@Test
	public void AddSelfEdgeCount() {
		this.graph.addEdge("A", "A");
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddSelfNodeCount() {
		this.graph.addEdge("A", "A");
		Assert.assertEquals(1, this.graph.getNodeCount());
	}

	@Test
	public void AddSelfNodeEdgeCountExist() {
		this.graph.addEdge("A", "A");
		Assert.assertEquals(1, this.graph.getNodeEdgeCount("A"));
	}

	@Test
	public void AddSelfNodeEdgeCountNotExist() {
		this.graph.addEdge("A", "A");
		Assert.assertEquals(0, this.graph.getNodeEdgeCount("B"));
	}
	
	@Test
	public void AddSelfContainsEdgeExist() {
		this.graph.addEdge("A", "A");
		Assert.assertTrue(this.graph.containsEdge("A", "A"));
	}
	
	@Test
	public void AddSelfContainsEdgeNotExist() {
		this.graph.addEdge("A", "A");
		Assert.assertFalse(this.graph.containsEdge("A", "B"));
		Assert.assertFalse(this.graph.containsEdge("B", "A"));
	}
	
	@Test
	public void AddSelfContainsNodeExist() {
		this.graph.addEdge("A", "A");
		Assert.assertTrue(this.graph.containsNode("A"));		
	}
	
	@Test
	public void AddSelfContainsNodeNotExist() {
		this.graph.addEdge("A", "A");
		Assert.assertFalse(this.graph.containsNode("B"));		
	}
	
	@Test
	public void AddSelfGetNodeExist() {
		this.graph.addEdge("A", "A");
		Assert.assertNotNull(this.graph.getNode("A"));
		Assert.assertEquals("A", this.graph.getNode("A").getValue());
		Assert.assertEquals(1, this.graph.getNode("A").getDestinationNodes().size());
	}
	
	@Test
	public void AddSelfGetNodeNotExist() {
		this.graph.addEdge("A", "A");
		Assert.assertNull(this.graph.getNode("B"));
	}

	@Test
	public void AddSelfRemoveEdgeExist() {
		this.graph.addEdge("A", "A");
		
		this.graph.removeEdge("A", "A");
		Assert.assertEquals(0, this.graph.getEdgeCount());
	}

	@Test
	public void AddSelfRemoveEdgeNotExist() {
		this.graph.addEdge("A", "A");
		
		this.graph.removeEdge("A", "B");
		this.graph.removeEdge("B", "A");
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddSelfRemoveNodeExist() {
		this.graph.addEdge("A", "A");

		this.graph.removeNode("A");
		Assert.assertEquals(0, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddSelfRemoveNodeNotExist() {
		this.graph.addEdge("A", "A");

		this.graph.removeNode("B");
		Assert.assertEquals(1, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddMultiCombo() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
	}
	
	@Test
	public void AddMultiComboEdgeCount() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertEquals(4, this.graph.getEdgeCount());
	}
	
	@Test
	public void AddMultiComboNodeCount() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertEquals(3, this.graph.getNodeCount());
	}
	
	@Test
	public void AddMultiComboNodeEdgeCountExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertEquals(2, this.graph.getNodeEdgeCount("A"));
		Assert.assertEquals(1, this.graph.getNodeEdgeCount("B"));
		Assert.assertEquals(1, this.graph.getNodeEdgeCount("C"));
	}
	
	@Test
	public void AddMultiComboNodeEdgeCountNotExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertEquals(0, this.graph.getNodeEdgeCount("D"));
	}
	
	@Test
	public void AddMultiComboContainsEdgeExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertTrue(this.graph.containsEdge("A", "A"));
		Assert.assertTrue(this.graph.containsEdge("A", "B"));
		Assert.assertTrue(this.graph.containsEdge("B", "C"));
		Assert.assertTrue(this.graph.containsEdge("C", "A"));
	}
	
	@Test
	public void AddMultiComboContainsEdgeNotExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertFalse(this.graph.containsEdge("B", "A"));
		Assert.assertFalse(this.graph.containsEdge("C", "B"));
		Assert.assertFalse(this.graph.containsEdge("A", "C"));
	}
	
	@Test
	public void AddMultiComboContainsNodeExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertTrue(this.graph.containsNode("A"));
		Assert.assertTrue(this.graph.containsNode("B"));
		Assert.assertTrue(this.graph.containsNode("C"));
	}
	
	@Test
	public void AddMultiComboContainsNodeNotExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		Assert.assertFalse(this.graph.containsNode("D"));	
	}
	
	@Test
	public void AddMultiComboGetNodeExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");

		Assert.assertNotNull(this.graph.getNode("A"));
		Assert.assertEquals("A", this.graph.getNode("A").getValue());
		Assert.assertEquals(2, this.graph.getNode("A").getDestinationNodes().size());
		
		Assert.assertNotNull(this.graph.getNode("B"));
		Assert.assertEquals("B", this.graph.getNode("B").getValue());
		Assert.assertEquals(1, this.graph.getNode("B").getDestinationNodes().size());
		
		Assert.assertNotNull(this.graph.getNode("C"));
		Assert.assertEquals("C", this.graph.getNode("C").getValue());
		Assert.assertEquals(1, this.graph.getNode("C").getDestinationNodes().size());
	}
	
	@Test
	public void AddMultiComboGetNodeNotExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		
		Assert.assertNull(this.graph.getNode("D"));
	}
	
	@Test
	public void AddMultiComboRemoveEdgeExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		
		this.graph.removeEdge("A", "A");
		Assert.assertEquals(3, this.graph.getEdgeCount());
		Assert.assertEquals(3, this.graph.getNodeCount());
		
		this.graph.removeEdge("A", "B");
		Assert.assertEquals(2, this.graph.getEdgeCount());
		Assert.assertEquals(2, this.graph.getNodeCount());
		
		this.graph.removeEdge("B", "C");
		Assert.assertEquals(1, this.graph.getEdgeCount());
		Assert.assertEquals(1, this.graph.getNodeCount());
		
		this.graph.removeEdge("C", "A");
		Assert.assertEquals(0, this.graph.getEdgeCount());
		Assert.assertEquals(0, this.graph.getNodeCount());
	}
	
	@Test
	public void AddMultiComboRemoveEdgeNotExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		
		this.graph.removeEdge("B", "A");
		this.graph.removeEdge("C", "B");
		this.graph.removeEdge("A", "C");
		Assert.assertEquals(4, this.graph.getEdgeCount());
		Assert.assertEquals(3, this.graph.getNodeCount());
	}

	@Test
	public void AddMultiComboRemoveNodeExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		
		this.graph.removeNode("A");
		Assert.assertEquals(2, this.graph.getEdgeCount());
		Assert.assertEquals(2, this.graph.getNodeCount());
	}
	
	@Test
	public void AddMultiComboRemoveNodeNotExist() {
		this.graph.addEdge("A", "A");
		this.graph.addEdge("A", "B");
		this.graph.addEdge("B", "C");
		this.graph.addEdge("C", "A");
		
		this.graph.removeNode("D");
		Assert.assertEquals(4, this.graph.getEdgeCount());
		Assert.assertEquals(3, this.graph.getNodeCount());
	}
}
