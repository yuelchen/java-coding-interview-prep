package com.yuelchen.node;

public class SinglyNode<T> {
	
	/**
	 * The SinglyNode object value.
	 */
	private final Object value;
	
	//====================================================================================================
	
	/**
	 * The next/right SinglyNode Object.
	 */
	private SinglyNode<T> nextRight;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 * 
	 * @param value		The value of the SinglyNode object.
	 */
	public SinglyNode(Object value) {
		this.value = value;
		this.nextRight = null;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the value of the SinglyNode object. 
	 * 
	 * @return			The value of the SinglyNode object.
	 */
	@SuppressWarnings("unchecked")
	public T getValue() {
		return (T) this.value;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the next/right SinglyNode object.
	 * 
	 * @param node		The next/right SinglyNode object.
	 */
	public void setNextRight(SinglyNode<T> node) {
		this.nextRight = node;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the next/right SinglyNode object if it exists. 
	 * 
	 * @return			The next/right SinglyNode object if it exists, 
	 * 					otherwise returns null.
	 */
	public SinglyNode<T> getNextRight() {
		return this.nextRight;
	}
}
