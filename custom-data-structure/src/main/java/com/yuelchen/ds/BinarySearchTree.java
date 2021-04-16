package com.yuelchen.ds;

import com.yuelchen.node.DoublyNode;

public class BinarySearchTree<T extends Comparable<T>> {

	/**
	 * Boolean representation to only allow unique values. 
	 */
	private boolean unique;
	
	//====================================================================================================
	
	/**
	 * The top level node for Binary Search Tree. 
	 */
	private DoublyNode<T> root;
	
	//====================================================================================================
	
	/**
	 * The number of nodes in Binary Search Tree. 
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 * 
	 * Unique is set to false by default - allows for duplicates.
	 */
	public BinarySearchTree() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor (default). 
	 * 
	 * @param unique			True if only unique values are allowed for insertion,
	 * 							false to allow duplicate entries. 
	 */
	public BinarySearchTree(boolean unique) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns the root node. 
	 * 
	 * @return					The root node. 
	 */
	public DoublyNode<T> getRoot() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of nodes which have been inserted. 
	 * 
	 * @return					The number of nodes in Binary Search Tree. 
	 */
	public int getSize() {
		// insert code below this line
		
		return -1; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the max depth of the Binary Search Tree. 
	 * 
	 * @return					The max depth from root node. 
	 */
	public int getMaxDepth() {
		// insert code below this line
		
		return -1; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the max depth from the given node. 
	 * 
	 * @param node				The node to check depth from. 
	 * 
	 * @return					The max depth from the given node. 
	 */
	private int getMaxDepth(DoublyNode<T> node) {
		// insert code below this line
		
		return -1; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Insert the given value into Binary Search Tree as a new node. 
	 * 
	 * If this Binary Search Tree allows only unique values,
	 * no insertion will occur and size will remain the same. 
	 * 
	 * Unique is set at initialization of this Data Structure, 
	 * default value is false - allows duplicates. 
	 * 
	 * @param t					The value of the node to be inserted. 
	 */
	public void insert(T t) {
		// insert code below this line
		
	}

	//====================================================================================================
	
	/**
	 * Returns whether or not the node with the given value if it exists. 
	 * 
	 * @param t					The value of the node to check. 
	 * 
	 * @return					True if the node with the given value exists,
	 * 							otherwise returns false. 
	 */
	public boolean containsValue(T t) {
		// insert code below this line
		
		return false; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the node with the given value if it exists. 
	 * 
	 * @param t					The value of the node to be retrieved. 
	 * 
	 * @return					The node with the given value if it exists, 
	 * 							otherwise returns null.
	 */
	public DoublyNode<T> getNode(T t) {
		// insert code below this line
		
		return null; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the left most node in a Binary Search Tree. 
	 * 
	 * @return					The node with the smallest value. 
	 */
	public DoublyNode<T> getMinNode() {
		// insert code below this line
		
		return null; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the right most node in a Binary Search Tree. 
	 * 
	 * @return					The node with the largest value.
	 */
	public DoublyNode<T> getMaxNode() {
		// insert code below this line
		
		return null; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Removes the node with the given value in Binary Search Tree if it exists. 
	 * 
	 * @param t					The value of the node to be removed if it exists.
	 */
	public void remove(T t) {
		// insert code below this line
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the successor which will replace the node to be removed. 
	 * 
	 * The successor is either the left most node from the given rightNode,
	 * or the rightNode itself. 
	 * 
	 * @param rightNode			The right node of the node to be removed. 
	 * 
	 * @return					The successor which will replace the node to be removed. 
	 */
	private DoublyNode<T> getRemoveSuccessor(DoublyNode<T> rightNode) {
		// insert code below this line
		
		return null; // placeholder return
	}

	//====================================================================================================
	
	/**
	 * Assigns root node or the child node for given parent node. 
	 * 
	 * @param parentNode		The parent node which will be assigned a child successor;
	 * 							if parent node is null, will set root node to successor. 
	 * @param isLeftChild		Boolean representation to either set successor as left child
	 * 							or right child. 
	 * @param successor			The child successor to be assigned; this value can be null.
	 */
	private void setRemove(DoublyNode<T> parentNode, boolean isLeftChild, DoublyNode<T> successor) {
		// insert code below this line
		
	} 

	//====================================================================================================
	
	/**
	 * Clears the Binary Search Tree of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
}