package com.yuelchen.ds;

import com.yuelchen.node.DoublyNode;

public class DoublyCircularLinkedList<T> {

	/**
	 * The current head node for the front of Doubly Circular LinkedList.
	 */
	private DoublyNode<T> head;
	
	//====================================================================================================

	/**
	 * The number of elements in the Doubly Circular LinkedList.
	 */
	private int size;
	
	//====================================================================================================

	/**
	 * Class constructor (default).
	 */
	public DoublyCircularLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	//====================================================================================================

	/**
	 * Returns the number of elements in the Doubly Circular LinkedList. 
	 * 
	 * @return				The number of elements in the Doubly Circular LinkedList.
	 */
	public int getSize() {
		return this.size;
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the front of the Doubly Circular LinkedList. 
	 * 
	 * @param t				The element to be added as the new head for Doubly Circular LinkedList.
	 */
	public void addFirst(T t) {
		DoublyNode<T> node = new DoublyNode<T>(t);
		
		if(this.head == null) {
			node.setPrevLeft(node);
			node.setNextRight(node);
			this.head = node;
			
		} else {
			DoublyNode<T> tail = this.head.getPrevLeft();
			tail.setNextRight(node);
			
			node.setPrevLeft(tail);
			node.setNextRight(this.head);
			
			this.head.setPrevLeft(node);
			this.head = node;
		}
		
		this.size++;
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the end of the Doubly Circular LinkedList. 
	 * 
	 * @param t				The element to be added as the new tail for Doubly Circular LinkedList.
	 */
	public void addLast(T t) {
		DoublyNode<T> node = new DoublyNode<T>(t);
		
		if(this.head == null) {
			node.setPrevLeft(node);
			node.setNextRight(node);
			this.head = node;
			
		} else {
			DoublyNode<T> tail = this.head.getPrevLeft();
			tail.setNextRight(node);
			
			node.setPrevLeft(tail);
			node.setNextRight(this.head);
			
			this.head.setPrevLeft(node);
		}
		
		this.size++;
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the first element in the Doubly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The first element in the Doubly Circular LinkedList.
	 */
	public DoublyNode<T> peekFirst() {
		return this.head;
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the last element in the Doubly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The last element in the Doubly Circular LinkedList.
	 */
	public DoublyNode<T> peekLast() {
		if(this.head == null) {
			return this.head;
		} else {
			return this.head.getPrevLeft();
		}
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the first element in the Doubly Circular LinkedList, 
	 * otherwise will return null.
	 * 
	 * @return				The first element in the Doubly Circular LinkedList.
	 */
	public DoublyNode<T> removeFirst() {
		if(this.head == null) {
			return this.head;
			
		} else if(this.head == this.head.getPrevLeft()) {
			DoublyNode<T> node = this.head;
			this.head = null;
			this.size = 0;
			
			return node;
			
		} else {			
			DoublyNode<T> node = this.head;
			
			DoublyNode<T> tail = this.head.getPrevLeft();
			tail.setNextRight(this.head.getNextRight());
			this.head = this.head.getNextRight();
			this.head.setPrevLeft(tail);
			this.size--;
			
			return node;
		}
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the last element in the Doubly Circular LinkedList, 
	 * otherwise will return null. 
	 * 
	 * @return				The last element in the Doubly Circular LinkedList. 
	 */
	public DoublyNode<T> removeLast() {
		if(this.head == null) {
			return this.head;
			
		} else if(this.head == this.head.getPrevLeft()) {
			DoublyNode<T> node = this.head;
			this.head = null;
			this.size = 0;
			
			return node;
		} else {
			DoublyNode<T> node = this.head.getPrevLeft();
			
			DoublyNode<T> newTail = node.getPrevLeft();
			newTail.setNextRight(this.head);
			this.head.setPrevLeft(newTail);
			this.size--;
			
			return node;
		}
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Doubly Circular LinkedList contains the given element. 
	 * 
	 * @param t				The given element to check for in Doubly Circular LinkedList.
	 * 
	 * @return				True if the given element is found, otherwise returns false.
	 */
	public boolean containsValue(T t) {
		if(this.head != null) {
			DoublyNode<T> currentNode = this.head;
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
	 * Determines and returns whether or not the Doubly Circular LinkedList is empty.
	 * 
	 * @return				True if the Doubly Circular LinkedList is empty, otherwise returns false.
	 */
	public boolean empty() {
		return this.head == null;
	}
	
	//====================================================================================================

	/**
	 * Clears the Doubly Circular LinkedList of all elements. 
	 */
	public void clear() {
		this.head = null;
		this.size = 0;
	}
}