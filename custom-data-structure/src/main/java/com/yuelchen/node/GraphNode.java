package com.yuelchen.node;

import java.util.HashMap;
import java.util.Map;

public class GraphNode<T> {

	/**
	 * The GraphNode object value. 
	 */
	private final Object value;
	
	//====================================================================================================
	
	/**
	 * A mapping of GraphNode destination nodes from this current GraphNode object.
	 */
	private Map<T, GraphNode<T>> destinationNodes;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 * 
	 * @param value		The value of the GraphNode object.
	 */
	public GraphNode(Object value) {
		this.value = value;
		this.destinationNodes = new HashMap<>();
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the value of the GraphNode object.
	 * 
	 * @return			The value of the GraphNode object.
	 */
	@SuppressWarnings("unchecked")
	public T getValue() {
		return (T) this.value;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the mapping of GraphNode destination nodes 
	 * from current GraphNode object.
	 * 
	 * @return			A mapping of GraphNode destination nodes.
	 */
	public Map<T, GraphNode<T>> getDestinationNodes() {
		return this.destinationNodes;
	}
	
	//====================================================================================================
	
	/**
	 * Adds a GraphNode to the mapping of GraphNode destination nodes. 
	 * 
	 * Added GraphNode values must be unique, duplicates will not exist.
	 * 
	 * @param t			The GraphNode value to be added to destination nodes mapping. 
	 */
	public void addDestination(T t) {
		if(!this.containsDestination(t)) {
			GraphNode<T> adjacentNode = new GraphNode<T>(t);
			this.destinationNodes.put(t, adjacentNode);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if the given value exists amongst GraphNode destination nodes. 
	 * 
	 * @param t			The GraphNode value to check if exists amongst destination nodes. 
	 * 
	 * @return			True if the given value exists amongst GraphNode destination nodes,
	 * 					otherwise returns false. 
	 */
	public boolean containsDestination(T t) {
		return this.destinationNodes.containsKey(t);
	} 
	
	//====================================================================================================
	
	/**
	 * Returns the GraphNode object corresponding to the given GraphNode value if it exists. 
	 * 
	 * @param t			The GraphNode value. 
	 * 
	 * @return			The GraphNode object if it exists, otherwise returns null.
	 */
	public GraphNode<T> getDestinationNode(T t) {
		if(this.containsDestination(t)) {
			return this.destinationNodes.get(t);
		} else {
			return null;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Removes the GraphNode object corresponding to the given GraphNode value if it exists. 
	 * 
	 * @param t			The GraphNode value.
	 */
	public void removeDestinationNode(T t) {
		if(this.containsDestination(t)) {
			this.destinationNodes.remove(t);
		}
	} 
}
