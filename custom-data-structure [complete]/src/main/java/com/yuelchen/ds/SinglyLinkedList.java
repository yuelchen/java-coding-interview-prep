package com.yuelchen.ds;

import com.yuelchen.node.SinglyNode;

public class SinglyLinkedList<T> {
	
	/**
	 * The current head node for the front of Singly LinkedList.
	 */
	private SinglyNode<T> head;
	
	//====================================================================================================
	
	/**
	 * The current tail node for the end of Singly LinkedList.
	 */
	private SinglyNode<T> tail;
	
	//====================================================================================================
	
	/**
	 * The number of elements in the Singly LinkedList.
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of elements in the Singly LinkedList. 
	 * 
	 * @return				The number of elements in the Singly LinkedList.
	 */
	public int getSize() {
		return this.size;
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given element to the front of the Singly LinkedList. 
	 * 
	 * @param t				The element to be added as the new head for Singly LinkedList.
	 */
	public void addFirst(T t) {
		SinglyNode<T> node = new SinglyNode<T>(t);
		
		if(this.head == null) {
			this.head = node;
		} else {
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
	 * Adds the given element to the end of the Singly LinkedList. 
	 * 
	 * @param t				The element to be added as the new tail for Singly LinkedList.
	 */
	public void addLast(T t) {
		SinglyNode<T> node = new SinglyNode<T>(t);
		
		if(this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNextRight(node);
			this.tail = this.tail.getNextRight();
		}
		
		if(this.head == null) {
			this.head = node;
		}
		
		this.size++;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the first element in the Singly LinkedList, otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The first element in the Singly LinkedList.
	 */
	public SinglyNode<T> peekFirst() {
		return this.head;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the last element in the Singly LinkedList, otherwise will return null.
	 * 
	 * This method call does not remove the returned element.
	 * 
	 * @return				The last element in the Singly LinkedList.
	 */
	public SinglyNode<T> peekLast() {
		return this.tail;
	}
	
	//====================================================================================================
	
	/**
	 * Removes and returns the first element in the Singly LinkedList, otherwise will return null.
	 * 
	 * @return				The first element in the Singly LinkedList.
	 */
	public SinglyNode<T> removeFirst() {
		if(this.head == null) {
			return this.head;
			
		} else if(this.head == this.tail){
			SinglyNode<T> node = this.head;
			this.head = null;
			this.tail = null;
			this.size = 0;
			
			return node;
		} else {
			SinglyNode<T> node = this.head;
			this.head = this.head.getNextRight();
			this.size--;
			
			return node;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Removes and returns the last element in the Singly LinkedList, otherwise will return null. 
	 * 
	 * @return				The last element in the Singly LinkedList. 
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
			this.tail = currentNode;
			this.tail.setNextRight(null);
			this.size--;
			
			return node;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the Singly LinkedList contains the given element. 
	 * 
	 * @param t				The given element to check for in Singly LinkedList.
	 * 
	 * @return				True if the given element is found, otherwise returns false.
	 */
	public boolean containsValue(T t) {
		if(this.head != null) {
			SinglyNode<T> currentNode = this.head;
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
	 * Determines and returns whether or not the Singly LinkedList is empty.
	 * 
	 * @return				True if the Singly LinkedList is empty, otherwise returns false.
	 */
	public boolean empty() {
		return this.head == null && this.tail == null;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the Singly LinkedList of all elements. 
	 */
	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
}