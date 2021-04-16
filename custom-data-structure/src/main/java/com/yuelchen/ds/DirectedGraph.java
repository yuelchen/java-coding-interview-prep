package com.yuelchen.ds;

import java.util.HashMap;
import java.util.Map;
import com.yuelchen.node.GraphNode;

public class DirectedGraph<T> {

	/**
	 * A map of GraphNode values to objects.
	 */
	private Map<T, GraphNode<T>> adjacentNodes;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public DirectedGraph() {
		// insert code below this line
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given edge. 
	 * 
	 * @param source		The source value of the edge to be added.
	 * @param desintation	The destination value of the edge to be added.
	 */
	public void addEdge(T source, T desintation) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the GraphNode for the given source value if it exists.
	 * 	
	 * @param source		The source value. 
	 * 
	 * @return				A GraphNode object if the given node exists, 
	 * 						otherwise returns null.
	 */
	public GraphNode<T> getNode(T source) {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if an edge with the given source and destination nodes exist. 
	 * 
	 * @param source		The source value. 
	 * @param destination	The destination value. 
	 * 
	 * @return				True if there exists an edge with the given source
	 * 						and destination node, otherwise returns false.
	 */
	public boolean containsEdge(T source, T destination) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if source value exists amongst edges for directed graph. 
	 * 
	 * @param source		The source value.
	 * 
	 * @return				True if the given source value exists amongst edges for directed graph, 
	 * 						otherwise returns false. 
	 */
	public boolean containsNode(T source) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Removes the edge with the given source and destination nodes if it exists.
	 * 
	 * @param source		The source node value.
	 * @param destination	The destination node value.
	 */
	public void removeEdge(T source, T destination) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Removes the node with the given source value if it exists.
	 * 
	 * @param source		The source value.
	 */
	public void removeNode(T source) {
		if(this.adjacentNodes.containsKey(source)) {
			this.adjacentNodes.remove(source);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of edges for the given source value. 
	 * 
	 * @param source		The source value. 
	 * 
	 * @return				The number of edges which include the given source value. 
	 */
	public int getNodeEdgeCount(T source) {
		if(this.adjacentNodes.containsKey(source )) {
			return this.adjacentNodes.get(source).getDestinationNodes().size();
		} else {
			return 0;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the collective number of edges in directed graph. 
	 * 
	 * @return				The collective number of edges in directed graph. 
	 */
	public int getEdgeCount() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of adjacent nodes in directed graph;
	 * can be considered as number of unique node values. 
	 * 
	 * @return				The number of adjacent nodes in directed graph.
	 */
	public int getNodeCount() {
		// insert code below this line
		
		return -1; // placeholder return
	}	
}