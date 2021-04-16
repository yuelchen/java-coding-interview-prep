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
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	//====================================================================================================

	/**
	 * Returns the number of elements in the Singly Circular LinkedList. 
	 * 
	 * @return				The number of elements in the Singly Circular LinkedList.
	 */
	public int getSize() {
		return this.size;
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the front of the Singly Circular LinkedList. 
	 * 
	 * @param t				The element to be added as the new head for Singly Circular LinkedList.
	 */
	public void addFirst(T t) {
		SinglyNode<T> node = new SinglyNode<T>(t);
		
		if(this.head == null) {
			node.setNextRight(node);
			this.head = node;
		} else {
			node.setNextRight(this.head);
			this.tail.setNextRight(node);
			this.head = node;
		}
		
		if(this.tail == null) {
			this.tail = this.head;
		}
		
		this.size++;
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the end of the Singly Circular LinkedList. 
	 * 
	 * @param t				The element to be added as the new tail for Singly Circular LinkedList.
	 */
	public void addLast(T t) {
		SinglyNode<T> node = new SinglyNode<T>(t);
		
		if(this.tail == null) {
			node.setNextRight(node);
			this.tail = node;
		} else {
			node.setNextRight(this.head);
			this.tail.setNextRight(node);
			this.tail = node;
		}
		
		if(this.head == null) {
			this.head = this.tail;
		}
		
		this.size++;
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
		return this.head;
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
		return this.tail;
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the first element in the Singly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * @return				The first element in the Singly Circular LinkedList.
	 */
	public SinglyNode<T> removeFirst() {
		if(this.head == null) {
			return this.head;
		} else if(this.head == this.tail) {
			SinglyNode<T> node = this.head;
			this.head = null;
			this.tail = null;
			this.size = 0;
			
			return node;
		} else {
			SinglyNode<T> node = this.head;
			this.head = this.head.getNextRight();
			this.tail.setNextRight(this.head);
			this.size--;
			
			return node;
		}
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the last element in the Singly Circular LinkedList, 
	 * otherwise will return null. 
	 * 
	 * @return				The last element in the Singly Circular LinkedList. 
	 */
	public SinglyNode<T> removeLast() {
		if(this.tail == null) {
			return this.tail;
		} else if(this.head == this.tail) {
			SinglyNode<T> node = this.tail;
			this.head = null;
			this.tail = null;
			this.size = 0;

			return node;
		} else { 
			SinglyNode<T> currentNode = this.head;
			while(currentNode.getNextRight() != this.tail) {
				currentNode = currentNode.getNextRight();
			}

			SinglyNode<T> node = this.tail;
			currentNode.setNextRight(this.tail);
			this.tail = currentNode;
			this.size--;
			
			return node;
		}
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
		if(this.head != null) {
			SinglyNode<T> currentNode = this.head;
			do {
				if(currentNode.getValue() == t) {
					return true;
				}
				
				currentNode = currentNode.getNextRight();
			} while(currentNode != this.head);
		}
		
		return false;
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Singly Circular LinkedList is empty.
	 * 
	 * @return				True if the Singly Circular LinkedList is empty, otherwise returns false.
	 */
	public boolean empty() {
		return this.head == null && this.tail == null;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the Singly Circular LinkedList of all elements. 
	 */
	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
}