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
		this.unique = false;
		this.root = null;
		this.size = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor (default). 
	 * 
	 * @param unique			True if only unique values are allowed for insertion,
	 * 							false to allow duplicate entries. 
	 */
	public BinarySearchTree(boolean unique) {
		this.unique = unique;
		this.root = null;
		this.size = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the root node. 
	 * 
	 * @return					The root node. 
	 */
	public DoublyNode<T> getRoot() {
		return this.root;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of nodes which have been inserted. 
	 * 
	 * @return					The number of nodes in Binary Search Tree. 
	 */
	public int getSize() {
		return this.size;
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the max depth of the Binary Search Tree. 
	 * 
	 * @return					The max depth from root node. 
	 */
	public int getMaxDepth() {
		return this.getMaxDepth(this.root);
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
		if(node == null) {
			return 0;
		} else {
			int left = 0;
			if(node.getPrevLeft() != null) {
				left = this.getMaxDepth(node.getPrevLeft());
			}
			
			int right = 0;
			if(node.getNextRight() != null) {
				right = this.getMaxDepth(node.getNextRight());
			}
			
			return Math.max(left, right) + 1;
		}
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
		if(this.root == null) {
			this.root = new DoublyNode<T>(t);
			
		} else {
			DoublyNode<T> parentNode = null;
			DoublyNode<T> currentNode = this.root;
			
			boolean isLeftChild = false;
			while(currentNode != null) {
				parentNode = currentNode;

				int result = t.compareTo(currentNode.getValue());
				if(result == 1) {
					// t is greater than currentNode value, go to parent right node
					isLeftChild = false;
					currentNode = currentNode.getNextRight();
					
				} else if(result == 0 && this.unique) {
					// do nothing, value already exists and this binary search tree is unique
					return;
					
				} else {
					// t is less than currentNode value, go to parent left node
					isLeftChild = true;
					currentNode = currentNode.getPrevLeft();
				}
			}
			
			if(isLeftChild) {
				parentNode.setPrevLeft(new DoublyNode<T>(t));
			} else {
				parentNode.setNextRight(new DoublyNode<T>(t));
			}
		}
		
		this.size++;
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
		DoublyNode<T> currentNode = this.root;
		
		while(currentNode != null) {			
			int result = t.compareTo(currentNode.getValue());
			if(result == 0) {
				return true;
			} else if(result == 1) {
				currentNode = currentNode.getNextRight();				
			} else {
				currentNode = currentNode.getPrevLeft();
			}
		}
		
		return false;
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
		DoublyNode<T> currentNode = this.root;
		
		while(currentNode != null) {
			int result = t.compareTo(currentNode.getValue());
			if(result == 0) {
				return currentNode;
			} else if(result == 1) {
				currentNode = currentNode.getNextRight();				
			} else {
				currentNode = currentNode.getPrevLeft();
			}
		}
		
		return null;
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the left most node in a Binary Search Tree. 
	 * 
	 * @return					The node with the smallest value. 
	 */
	public DoublyNode<T> getMinNode() {
		if(this.root == null) {
			return this.root;
		}
		
		DoublyNode<T> currentNode = this.root;
		while(currentNode.getPrevLeft() != null) {
			currentNode = currentNode.getPrevLeft();
		}
		
		return currentNode;
	}

	//====================================================================================================
	
	/**
	 * Retrieves and returns the right most node in a Binary Search Tree. 
	 * 
	 * @return					The node with the largest value.
	 */
	public DoublyNode<T> getMaxNode() {
		if(this.root == null) {
			return this.root;
		}
		
		DoublyNode<T> currentNode = this.root;
		while(currentNode.getNextRight() != null) {
			currentNode = currentNode.getNextRight();
		}
		
		return currentNode;
	}

	//====================================================================================================
	
	/**
	 * Removes the node with the given value in Binary Search Tree if it exists. 
	 * 
	 * @param t					The value of the node to be removed if it exists.
	 */
	public void remove(T t) {	
		DoublyNode<T> parentNode = null;
		DoublyNode<T> currentNode = this.root;
		
		boolean isLeftChild = false;
		while(currentNode != null) {
			int result = t.compareTo(currentNode.getValue());
			if(result == 0) {
				// no children (leaf node)
				if(currentNode.getPrevLeft() == null && currentNode.getNextRight() == null) {
					this.setRemove(parentNode, isLeftChild, null);
				} 
				
				// two children
				else if(currentNode.getPrevLeft() != null && currentNode.getNextRight() != null) {
					DoublyNode<T> successor = this.getRemoveSuccessor(currentNode.getNextRight());
					successor.setPrevLeft(currentNode.getPrevLeft());
					this.setRemove(parentNode, isLeftChild, successor);
				}
				
				// one child
				else {
					DoublyNode<T> successor = currentNode.getPrevLeft() != null ? 
							currentNode.getPrevLeft() : currentNode.getNextRight();
					this.setRemove(parentNode, isLeftChild, successor);
				}
				
				this.size--;
				return;
				
			} else if(result == 1) {
				parentNode = currentNode;
				currentNode = currentNode.getNextRight();
				isLeftChild = false;
			} else {
				parentNode = currentNode;
				currentNode = currentNode.getPrevLeft();
				isLeftChild = true;
			}
		}
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
		DoublyNode<T> parent = null;
		DoublyNode<T> successor = rightNode;
		
		while(successor.getPrevLeft() != null) {
			parent = successor;
			successor = successor.getPrevLeft();
		}
		
		if(parent == null) {
			// immediate right node to be removed has no left node
			successor.setNextRight(rightNode.getNextRight());
		} else {
			// immediate right node to be removed has left node
			parent.setPrevLeft(successor.getNextRight());
			successor.setNextRight(rightNode);
		}
		
		return successor;
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
		if(parentNode == null) {
			this.root = successor;
		} else if(isLeftChild) {
			parentNode.setPrevLeft(successor);
		} else {
			parentNode.setNextRight(successor);
		}
	} 

	//====================================================================================================
	
	/**
	 * Clears the Binary Search Tree of all elements. 
	 */
	public void clear() {
		this.root = null;
		this.size = 0;
	}
}