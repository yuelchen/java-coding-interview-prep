package com.yuelchen.node;

public class DoublyNode<T> {
	
	/**
	 * The DoublyNode object value.
	 */
	private final Object value;
	
	//====================================================================================================	
	
	/**
	 * The previous/left DoublyNode object. 
	 */
	private DoublyNode<T> prevLeft;
	
	//====================================================================================================
	
	/**
	 * The next/right DoublyNode object. 
	 */
	private DoublyNode<T> nextRight;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 * 
	 * @param value		The value of the DoublyNode object.
	 */
	public DoublyNode(Object value) {
		this.value = value;
		this.prevLeft = null;
		this.nextRight = null;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the value of the DoublyNode object. 
	 * 	
	 * @return			The value of the DoublyNode object.
	 */
	@SuppressWarnings("unchecked")
	public T getValue() {
		return (T) this.value;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the previous/left DoublyNode object. 
	 * 
	 * @param node		The previous/left DoublyNodeObject.
	 */
	public void setPrevLeft(DoublyNode<T> node) {
		this.prevLeft = node;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the previous/left DoublyNode object if it exists. 
	 * 
	 * @return			The previous/left DoublyNode object if it exists, 
	 * 					otherwise returns null. 
	 */
	public DoublyNode<T> getPrevLeft() {
		return this.prevLeft;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the next/right DoublyNode object. 
	 * 
	 * @param node		The next/right DoublyNode object.
	 */
	public void setNextRight(DoublyNode<T> node) {
		this.nextRight = node;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the next/right DoublyNode object if it exists. 
	 * 
	 * @return			The next/right DoublyNode object if it exists, 
	 * 					otherwise returns null.	
	 */
	public DoublyNode<T> getNextRight() {
		return this.nextRight;
	}
}