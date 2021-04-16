package com.yuelchen.ds;

import com.yuelchen.node.DoublyNode;

public class DoublyLinkedList<T> {

	/**
	 * The current head node for the front of Doubly LinkedList.
	 */
	private DoublyNode<T> head;
	
	//====================================================================================================

	/**
	 * The current tail node for the end of Doubly LinkedList.
	 */
	private DoublyNode<T> tail;
	
	//====================================================================================================

	/**
	 * The number of elements in the Doubly LinkedList.
	 */
	private int size;
	
	//====================================================================================================

	/**
	 * Class constructor (default).
	 */
	public DoublyLinkedList() {
		// insert code below this line
		
	}
	
	//====================================================================================================

	/**
	 * Returns the number of elements in the Doubly LinkedList. 
	 * 
	 * @return				The number of elements in the Doubly LinkedList.
	 */
	public int getSize() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the front of the Doubly LinkedList. 
	 * 
	 * @param t				The element to be added as the new head for Doubly LinkedList.
	 */
	public void addFirst(T t) {
		// insert code below this line
		
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the end of the Doubly LinkedList. 
	 * 
	 * @param t				The element to be added as the new tail for Doubly LinkedList.
	 */
	public void addLast(T t) {
		// insert code below this line
		
	} 
	
	//====================================================================================================

	/**
	 * Retrieves and returns the first element in the Doubly LinkedList, otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The first element in the Doubly LinkedList.
	 */
	public DoublyNode<T> peekFirst() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the last element in the Doubly LinkedList, otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The last element in the Doubly LinkedList.
	 */
	public DoublyNode<T> peekLast() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the first element in the Doubly LinkedList, otherwise will return null.
	 * 
	 * @return				The first element in the Doubly LinkedList.
	 */
	public DoublyNode<T> removeFirst() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the last element in the Doubly LinkedList, otherwise will return null. 
	 * 
	 * @return				The last element in the Doubly LinkedList. 
	 */
	public DoublyNode<T> removeLast() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Doubly LinkedList contains the given element. 
	 * 
	 * @param t				The given element to check for in Doubly LinkedList.
	 * 
	 * @return				True if the given element is found, otherwise returns false.
	 */
	public boolean containsValue(T t) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Doubly LinkedList is empty.
	 * 
	 * @return				True if the Doubly LinkedList is empty, otherwise returns false.
	 */
	public boolean empty() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Clears the Doubly LinkedList of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
}