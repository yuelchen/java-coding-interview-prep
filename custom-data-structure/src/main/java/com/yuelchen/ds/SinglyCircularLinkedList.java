package com.yuelchen.ds;

import com.yuelchen.node.SinglyNode;

public class SinglyCircularLinkedList<T> {

	/**
	 * The current head node for the front of Singly Circular LinkedList.
	 */
	private SinglyNode<T> head;
	
	//====================================================================================================

	/**
	 * The current tail node for the end of Singly Circular LinkedList.
	 */
	private SinglyNode<T> tail;
	
	//====================================================================================================

	/**
	 * The number of elements in the Singly Circular LinkedList.
	 */
	private int size;
	
	//====================================================================================================

	/**
	 * Class constructor (default).
	 */
	public SinglyCircularLinkedList() {
		// insert code below this line
		
	}
	
	//====================================================================================================

	/**
	 * Returns the number of elements in the Singly Circular LinkedList. 
	 * 
	 * @return				The number of elements in the Singly Circular LinkedList.
	 */
	public int getSize() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the front of the Singly Circular LinkedList. 
	 * 
	 * @param t				The element to be added as the new head for Singly Circular LinkedList.
	 */
	public void addFirst(T t) {
		// insert code below this line
		
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the end of the Singly Circular LinkedList. 
	 * 
	 * @param t				The element to be added as the new tail for Singly Circular LinkedList.
	 */
	public void addLast(T t) {
		// insert code below this line
		
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the first element in the Singly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The first element in the Singly Circular LinkedList.
	 */
	public SinglyNode<T> peekFirst() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the last element in the Singly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The last element in the Singly Circular LinkedList.
	 */
	public SinglyNode<T> peekLast() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the first element in the Singly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * @return				The first element in the Singly Circular LinkedList.
	 */
	public SinglyNode<T> removeFirst() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the last element in the Singly Circular LinkedList, 
	 * otherwise will return null. 
	 * 
	 * @return				The last element in the Singly Circular LinkedList. 
	 */
	public SinglyNode<T> removeLast() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Singly Circular LinkedList contains the given element. 
	 * 
	 * @param t				The given element to check for in Singly Circular LinkedList.
	 * 
	 * @return				True if the given element is found, otherwise returns false.
	 */
	public boolean containsValue(T t) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Singly Circular LinkedList is empty.
	 * 
	 * @return				True if the Singly Circular LinkedList is empty, otherwise returns false.
	 */
	public boolean empty() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Clears the Singly Circular LinkedList of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
}