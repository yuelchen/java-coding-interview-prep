package com.yuelchen.ds;

import com.yuelchen.util.HeapIndex;

public class BinaryMaxHeap<T extends Comparable<T>> {

	/**
	 * An array of objects to store heap values in descending order. 
	 */
	private Object[] heap;
	
	//====================================================================================================
	
	/**
	 * The number of elements in heap array. 
	 */
	private int size;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 * 
	 * The heap array starting size is 3 by default. 
	 */
	public BinaryMaxHeap() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of elements in heap array. 
	 * 
	 * @return					The number of elements in heap array. 
	 */
	public int getSize() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Inserts the given value into the heap array. 
	 * 
	 * @param t					The value to be inserted. 
	 */
	public void insert(T t) {		
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Increase the heap array to the next possible size, and returns true if successful. 
	 * 
	 * Will return false if unable to increase heap size due to already being may array size. 
	 * 
	 * @return					True if heap array was successfully increased, 
	 * 							otherwise return false. 
	 */
	private boolean increaseHeap() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the element at the first index of heap array; 
	 * will return null if the heap array is empty. 
	 * 
	 * The returned element is not removed from heap array. 
	 * 
	 * @return					The max heap value, or null if heap array is empty. 
	 */
	@SuppressWarnings("unchecked")
	public T get() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the element at the first index of heap array;
	 * will return null if the heap array is empty. 
	 * 
	 * The returned element is removed from heap array.
	 * 
	 * When the heap array has more than one element, 
	 * move the latest populated element to first index and then heapify down. 
	 * 
	 * @return					The max heap value, or null if heap array is empty. 
	 */
	@SuppressWarnings("unchecked")
	public T remove() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Traverses the heap from the given index to the first element 
	 * and swaps elements values to ensure that the parent value is always 
	 * greater than child value.
	 * 
	 * @param currentIndex		The starting index to traverse from. 
	 */
	@SuppressWarnings("unchecked")
	private void heapifyUp(int currentIndex) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Traverses the heap from first element to the last populated index 
	 * and swaps element values to ensure that the parent value is always
	 * greater than child value.
	 */
	@SuppressWarnings("unchecked")
	private void heapifyDown() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Swaps the values at the given indexes. 
	 * 
	 * @param index1			One of the two indexes needed to swap values in heap array. 
	 * @param index2			One of the two indexes needed to swap values in heap array. 
	 */
	@SuppressWarnings("unchecked")
	private void heapifyFlip(int index1, int index2) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Clears the heap of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
}