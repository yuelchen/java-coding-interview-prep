package com.yuelchen.ds;

import java.util.ArrayList;
import java.util.List;

import com.yuelchen.util.Hash;

public class HashMapArray<T, E> {

	/**
	 * An array of keys. 
	 */
	private Object[] key;
	
	//====================================================================================================
	
	/**
	 * An array of values. 
	 */
	private Object[] value;
	
	//====================================================================================================

	/**
	 * The map array size limit. 
	 */
	private int arraySize;
	
	//====================================================================================================

	/**
	 * The number of elements in the map array.
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default). 
	 */
	public HashMapArray() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of element in the map array.
	 * 
	 * @return				The number of elements in the map array. 
	 */
	public int getSize() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given key value pair to map and returns if it was successful.
	 * 
	 * If the key already exists, the associated value will be overwritten. 
	 * 
	 * @param t				The key to be used for storing the value.
	 * @param e				The value to be stored. 
	 * 
	 * @return				True if the key value pair is successfully added.
	 */
	public boolean put(T t, E e) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * A private method specifically for doubling the size of the current map array. 
	 * 
	 * Returns whether or not the array size was doubled. 
	 * 
	 * @return				True if the array size was doubled, otherwise returns false. 
	 */
	@SuppressWarnings("unchecked")
	private boolean doubleHashMapArray() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the value for the given element key, if it exists. 
	 * 
	 * Returns null otherwise if given key does not exist. 
	 * 
	 * @param t				The element key of the value to be returned. 
	 * 
	 * @return				The value for the given element key. 
	 */
	@SuppressWarnings("unchecked")
	public E getValue(T t) {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Removes the given element from map array; if the element does not exist, simply does nothing. 
	 * 
	 * @param t				The element to be removed from map array. 
	 */
	public void remove(T t) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns whether or not the map array contains the given element
	 * 
	 * @param t				The given element to check for in key array. 
	 * 
	 * @return				True if the given element is found in key array, otherwise returns false. 
	 */
	public boolean containsKey(T t) {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Determines and returns whether or not the map array is empty (has elements - not size of array).
	 * 
	 * @return				True if the map array is empty.
	 */
	public boolean empty() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================

	/**
	 * Clears the kay and value array of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
}