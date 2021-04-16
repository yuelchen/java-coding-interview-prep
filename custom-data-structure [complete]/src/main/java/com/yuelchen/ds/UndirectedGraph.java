package com.yuelchen.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.yuelchen.node.GraphNode;

public class UndirectedGraph<T> {

	/**
	 * A map of GraphNode values to objects. 
	 */
	private Map<T, GraphNode<T>> adjacentNodes;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public UndirectedGraph() {
		this.adjacentNodes = new HashMap<>();
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given edge. 
	 * 
	 * @param node1			One of two nodes for an undirected edge.
	 * @param node2			One of two nodes for an undirected edge.
	 */
	public void addEdge(T node1, T node2) {
		if(!this.adjacentNodes.containsKey(node1)) {
			GraphNode<T> node = new GraphNode<T>(node1);
			this.adjacentNodes.put(node1, node);
		}
		
		if(!this.adjacentNodes.containsKey(node2)) {
			GraphNode<T> node = new GraphNode<T>(node2);
			this.adjacentNodes.put(node2, node);
		}
		
		this.adjacentNodes.get(node1).addDestination(node2);
		this.adjacentNodes.get(node2).addDestination(node1);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the GraphNode for the given value if it exists.	 * 
	 * 
	 * @param node			The node value. 
	 * 
	 * @return				A GraphNode object if the given node exists,
	 * 						otherwise returns null.
	 */
	public GraphNode<T> getNode(T node) {
		if(this.adjacentNodes.containsKey(node)) {
			return this.adjacentNodes.get(node);
		} else {
			return null;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if an edge with the given two nodes exist.
	 * 
	 * @param node1			One of two nodes for an undirected edge.
	 * @param node2			One of two nodes for an undirected edge.
	 * 
	 * @return				True if there exists an edge with the given two nodes,
	 * 						otherwise returns false.
	 */
	public boolean containsEdge (T node1, T node2) {
		if(this.adjacentNodes.containsKey(node1)) {
			return this.adjacentNodes.get(node1).containsDestination(node2);
		} else {
			return false;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if node value exists amongst edges for undirected graph.
	 * 
	 * @param node			The node value.
	 * 
	 * @return				True if the given node exists amongst edges for undirected graph,
	 * 						otherwise returns false. 
	 */	
	public boolean containsNode(T node) {
		return this.adjacentNodes.containsKey(node);
	}
	
	//====================================================================================================
	
	/**
	 * Removes the edge with the given two nodes if it exists. 
	 * 
	 * @param node1 		One of two nodes for an undirected edge.
	 * @param node2			One of two nodes for an undirected edge.
	 */
	public void removeEdge(T node1, T node2) {
		if(this.adjacentNodes.containsKey(node1)) {
			this.adjacentNodes.get(node1).removeDestinationNode(node2);
			
			if(this.adjacentNodes.get(node1).getDestinationNodes().size() == 0) {
				this.adjacentNodes.remove(node1);
			}
		}
		
		if(this.adjacentNodes.containsKey(node2)) {
			this.adjacentNodes.get(node2).removeDestinationNode(node1);
			
			if(this.adjacentNodes.get(node2).getDestinationNodes().size() == 0) {
				this.adjacentNodes.remove(node2);
			}
		}
	}
	
	//====================================================================================================
	
	/**
	 * Removes the node with the given node value if it exists. 
	 * 
	 * @param node			The node value.
	 */
	public void removeNode(T node) {
		if(this.adjacentNodes.containsKey(node)) {
			
			Iterator<Entry<T, GraphNode<T>>> iterator = this.adjacentNodes.entrySet().iterator();
			while(iterator.hasNext()) {
				Map.Entry<T, GraphNode<T>> graphNodeEntry = (Map.Entry<T, GraphNode<T>>) iterator.next();
				if(graphNodeEntry.getValue().containsDestination(node)) {
					graphNodeEntry.getValue().removeDestinationNode(node);
				}
				
				if(graphNodeEntry.getValue().getDestinationNodes().size() == 0) {
					iterator.remove();
				}
			}
			
			this.adjacentNodes.remove(node);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of edges which include the given node value. 
	 * 
	 * @param node			The node value. 
	 * 
	 * @return				The number of edges which include the given node value. 
	 */
	public int getNodeEdgeCount(T node) {
		if(this.adjacentNodes.containsKey(node)) {
			return this.adjacentNodes.get(node).getDestinationNodes().size();
		} else {
			return 0;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the collective number of edges in undirected graph. 
	 * 
	 * @return				The collective number of edges in undirected graph. 
	 */
	public int getEdgeCount() {
		int edgeSum = 0;
		for(Map.Entry<T, GraphNode<T>> adjacentNode : this.adjacentNodes.entrySet()) {
			T node = adjacentNode.getKey();
			GraphNode<T> graphNode = adjacentNode.getValue();
			edgeSum += graphNode.getDestinationNodes().size();
			
			// handles self entries: addEdge("A", "A")
			if(graphNode.containsDestination(node)) {
				edgeSum++;
			}
		}
		
		// Note: edgeSum is divided by 2 since our undirected graph allows for duplicate entries. 
		return edgeSum > 0 ? edgeSum / 2 : edgeSum;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of adjacent nodes in undirected graph;
	 * can be considered as number of unique node values. 
	 * 
	 * @return				The number of adjacent nodes in undirected graph.
	 */
	public int getNodeCount() {
		return this.adjacentNodes.size();
	}
}
