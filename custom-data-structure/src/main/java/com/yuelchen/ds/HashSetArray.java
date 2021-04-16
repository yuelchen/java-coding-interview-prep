package com.yuelchen.ds;

public class HashSetArray<T> {

	/**
	 * The set array to store elements. 
	 */
	private Object[] set;
	
	//====================================================================================================
	
	/**
	 * The set array size limit. 
	 */
	private int arraySize;
	
	//====================================================================================================
	
	/**
	 * The number of elements in the set array.
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public HashSetArray() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of elements in the set array. 
	 * 
	 * @return				The number of elements in the set array.
	 */
	public int size() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given elements to set array and returns if it was successfully added.
	 * 
	 * @param t				The element to be added to set array.
	 * 
	 * @return				True if the given element was added to set array, otherwise return false.
	 */	
	public boolean add(T t) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * A private method specifically for doubling the size of the current set array. 
	 * 
	 * Returns whether or not the array size was doubled.
	 * 
	 * @return				True if the array size was doubled, otherwise returns false.
	 */
	@SuppressWarnings("unchecked")
	private boolean doubleHashSetArray() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Removes the given element from set array; if the element does not exist, simply does nothing.
	 * 
	 * @param t				The element to be removed from set array.
	 */
	public void remove(T t) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the set array contains the given element.
	 * 
	 * @param t				The given element to check for in set array. 
	 * 
	 * @return				True if the given element is found in set array, otherwise returns false.
	 */
	public boolean contains(T t) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the set array is empty (has elements - not size of array).
	 * 
	 * @return				True if the set array is empty.
	 */
	public boolean empty() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Clears the set array of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
}