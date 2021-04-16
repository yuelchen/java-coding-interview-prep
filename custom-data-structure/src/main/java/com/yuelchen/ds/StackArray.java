package com.yuelchen.ds;

import java.util.EmptyStackException;

public class StackArray<T> {
	
	/**
	 * An array for managing element pushed onto stack array. 
	 */
	private Object[] stack;
	
	//====================================================================================================
	
	/**
	 * The index of the last element pushed onto stack array. 
	 */
	private int top;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 * 
	 * The initial stack array size will be 7. 
	 */
	public StackArray() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor.
	 * 
	 * @param size								The initial stack size. 
	 */
	public StackArray(int size) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns number of elements pushed onto stack array. 
	 * 
	 * @return									The number of elements pushed onto stack array.
	 */
	public int size() {
		// insert code below this line

		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Clears the stack array of all elements.
	 */
	public void clear() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if the stack array is empty, otherwise returns false. 
	 * 
	 * @return									True if stack array is empty, otherwise returns false.
	 */
	public boolean empty() {
		// insert code below this line
		
		return false; // placeholder return 
	}

	//====================================================================================================
	
	/**
	 * Inserts the given element at the top of the stack array, if permissible. 
	 * 
	 * @param t									The element to be inserted at the top of the stack. 
	 * 
	 * @throws ArrayIndexOutOfBoundsException	Thrown when unable to increase the size of the existing stack array. 
	 */
	public void push(T t) throws ArrayIndexOutOfBoundsException {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Immediately attempts to double the size of the stack array.
	 * 
	 * @throws ArrayIndexOutOfBoundsException	Thrown when unable to increase the size of the existing stack array.
	 */
	private void doubleStackSize() throws ArrayIndexOutOfBoundsException {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the top element at the top of the stack array, if permissible. 
	 * 
	 * The element that is returned will NOT be removed from the stack array. 
	 * 
	 * @return									The top element at the top of the stack array. 
	 * 
	 * @throws EmptyStackException				Thrown when stack array is empty.
	 */
	@SuppressWarnings("unchecked")
	public T peek() throws EmptyStackException {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the top element at the top of the stack array, if permissible. 
	 * 
	 * The element that is returned will be removed from the stack array. 
	 * 
	 * @return									The top element at the top of the stack array. 
	 * 
	 * @throws EmptyStackException				Thrown when stack array is empty.
	 */
	@SuppressWarnings("unchecked")
	public T pop() throws EmptyStackException {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Returns the top most position which matches the given object, if permissible. 
	 * 
	 * If not found, will return index position -1. 
	 * 
	 * @param o									The object to match in stack array. 
	 * 
	 * @return									Returns the top most position in stack array if found,
	 * 											otherwise returns -1. 
	 */
	public int search(Object o) {
		// insert code below this line
		
		return -1; 	// default return
	}
}