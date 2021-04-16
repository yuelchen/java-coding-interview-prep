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
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	//====================================================================================================

	/**
	 * Returns the number of elements in the Doubly LinkedList. 
	 * 
	 * @return				The number of elements in the Doubly LinkedList.
	 */
	public int getSize() {
		return this.size;
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the front of the Doubly LinkedList. 
	 * 
	 * @param t				The element to be added as the new head for Doubly LinkedList.
	 */
	public void addFirst(T t) {
		DoublyNode<T> node = new DoublyNode<T>(t);
		
		if(this.head == null) {
			this.head = node;
		} else {
			this.head.setPrevLeft(node);
			node.setNextRight(this.head);
			this.head = node;
		}
		
		if(this.tail == null) {
			this.tail = node;
		}
		
		this.size++;
	}
	
	//====================================================================================================

	/**
	 * Adds the given element to the end of the Doubly LinkedList. 
	 * 
	 * @param t				The element to be added as the new tail for Doubly LinkedList.
	 */
	public void addLast(T t) {
		DoublyNode<T> node = new DoublyNode<T>(t);
		
		if(this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNextRight(node);
			node.setPrevLeft(this.tail);
			this.tail = node;
		}
		
		if(this.head == null) {
			this.head = node;
		}
		
		this.size++;
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
		return this.head;
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
		return this.tail;
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the first element in the Doubly LinkedList, otherwise will return null.
	 * 
	 * @return				The first element in the Doubly LinkedList.
	 */
	public DoublyNode<T> removeFirst() {
		if(this.head == null) {
			return this.head;
			
		} else if(this.head == this.tail) {
			DoublyNode<T> node = this.head;
			this.head = null;
			this.tail = null;
			this.size = 0;
			
			return node;
		} else {
			DoublyNode<T> node = this.head;
			this.head = this.head.getNextRight();
			this.head.setPrevLeft(null);
			this.size--;
			
			return node;
		}
	}
	
	//====================================================================================================

	/**
	 * Removes and returns the last element in the Doubly LinkedList, otherwise will return null. 
	 * 
	 * @return				The last element in the Doubly LinkedList. 
	 */
	public DoublyNode<T> removeLast() {
		if(this.tail == null) {
			return this.tail;
			
		} else if(this.head == this.tail){
			DoublyNode<T> node = this.tail;
			this.head = null;
			this.tail = null;
			this.size = 0;
			
			return node;
		} else {
			DoublyNode<T> node = this.tail;
			this.tail = this.tail.getPrevLeft();
			this.tail.setNextRight(null);
			this.size--;
			
			return node;
		}
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
		if(this.head != null) {
			DoublyNode<T> currentNode = this.head;
			while(currentNode != null) {
				if(currentNode.getValue() == t) {
					return true;
				}
				
				currentNode = currentNode.getNextRight();
			}
		}
		
		return false;
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the Doubly LinkedList is empty.
	 * 
	 * @return				True if the Doubly LinkedList is empty, otherwise returns false.
	 */
	public boolean empty() {
		return this.head == null && this.tail == null;
	}
	
	//====================================================================================================

	/**
	 * Clears the Doubly LinkedList of all elements. 
	 */
	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
}