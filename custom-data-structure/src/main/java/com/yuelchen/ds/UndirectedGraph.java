package com.yuelchen.ds;

import java.util.Map;

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
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given edge. 
	 * 
	 * @param node1			One of two nodes for an undirected edge.
	 * @param node2			One of two nodes for an undirected edge.
	 */
	public void addEdge(T node1, T node2) {
		// insert code below this line
		
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
		// insert code below this line
		
		return null; // placeholder return
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
		// insert code below this line
		
		return false; // placeholder return
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
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Removes the edge with the given two nodes if it exists. 
	 * 
	 * @param node1 		One of two nodes for an undirected edge.
	 * @param node2			One of two nodes for an undirected edge.
	 */
	public void removeEdge(T node1, T node2) {
		// insert code below this line

	}
	
	//====================================================================================================
	
	/**
	 * Removes the node with the given node value if it exists. 
	 * 
	 * @param node			The node value.
	 */
	public void removeNode(T node) {
		// insert code below this line
		
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
		// insert code below this line

		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the collective number of edges in undirected graph. 
	 * 
	 * @return				The collective number of edges in undirected graph. 
	 */
	public int getEdgeCount() {
		// insert code below this line

		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of adjacent nodes in undirected graph;
	 * can be considered as number of unique node values. 
	 * 
	 * @return				The number of adjacent nodes in undirected graph.
	 */
	public int getNodeCount() {
		// insert code below this line

		return -1; // placeholder return
	}
}
