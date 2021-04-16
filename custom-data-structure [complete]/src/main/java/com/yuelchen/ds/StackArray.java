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
		this.stack = new Object[7];
		this.top = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor.
	 * 
	 * @param size								The initial stack size. 
	 */
	public StackArray(int size) {
		this.stack = new Object[size];
		this.top = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Returns number of elements pushed onto stack array. 
	 * 
	 * @return									The number of elements pushed onto stack array.
	 */
	public int size() {
		return this.top + 1;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the stack array of all elements.
	 */
	public void clear() {
		int size = this.stack.length;
		this.stack = new Object[size];
		this.top = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if the stack array is empty, otherwise returns false. 
	 * 
	 * @return									True if stack array is empty, otherwise returns false.
	 */
	public boolean empty() {
		return this.top < 0;
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
		if(this.top >= this.stack.length - 1) {
			this.doubleStackSize();
		}
		
		this.stack[++this.top] = t;
	}
	
	//====================================================================================================
	
	/**
	 * Immediately attempts to double the size of the stack array.
	 * 
	 * @throws ArrayIndexOutOfBoundsException	Thrown when unable to increase the size of the existing stack array.
	 */
	private void doubleStackSize() throws ArrayIndexOutOfBoundsException {
		int newSize = this.stack.length * 2;
		int maxSize = Integer.MAX_VALUE - 5;
		
		/* Unable to increase if new size is greater than max size and
		 * current size is already max size. 
		 */
		if(newSize > maxSize && this.stack.length == maxSize) {
			throw new ArrayIndexOutOfBoundsException();
			
		} else {
			newSize = Math.min(newSize, maxSize);
			Object[] temp = new Object[newSize];
			
			for(int i=0; i<=this.top; i++) {
				temp[i] = this.stack[i];
			}
			
			this.stack = temp;
		}
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
		if(this.top < 0) {
			throw new EmptyStackException();
		} else {
			return (T) this.stack[this.top];
		}
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
		if(this.top < 0) {
			throw new EmptyStackException();
			
		} else {
			Object popped = this.stack[this.top];
			this.stack[this.top--] = null;
			
			return (T) popped;
		}
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
		for(int i = this.top; i >= 0; i--) {
			if(this.stack[i] == o) {
				return i;
			}
		}
		
		return -1;
	}
}