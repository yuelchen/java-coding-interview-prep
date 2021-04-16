package com.yuelchen.ds;

public class QueueArray<T> {

	/**
	 * An array for managing element added to queue array. 
	 */
	private Object[] queue;
	
	//====================================================================================================
	
	/**
	 * The index of the first / next element in the queue array.  
	 */
	private int head;
	
	//====================================================================================================
	
	/**
	 * The index of the last element in the queue array.
	 */
	private int tail;
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * The initial queue array size will be 7. 
	 */
	public QueueArray() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param size								The initial queue size. 
	 */
	public QueueArray(int size) {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of elements added into queue array. 
	 * 
	 * @return									The number of elements added into queue array. 
	 */
	public int size() {
		// insert code below this line
		
		return -1; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Clears the queue array of all elements. 
	 */
	public void clear() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if the queue array is empty, otherwise returns false. 
	 * 
	 * @return									True if queue array is empty, otherwise returns false.
	 */
	public boolean empty() {
		// insert code below this line
		
		return false; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given element to the end of the queue array, if permissible. 
	 * 
	 * If the end of array is reached and less than half of the array is in use, 
	 * the queue array elements will be re-indexed with the same array size. 
	 * 
	 * If the end of array is reached and more than half of the array is in use,
	 * the queue array elements will be re-indexed with a doubled array size.
	 * 
	 * @param t									The element to be added to the end of the queue. 
	 * 
	 * @return									Returns true upon element being added successfully. 
	 * 
	 * @throws IllegalStateException			Thrown when unable to increase queue array size. 
	 */
	public boolean add(T t) throws IllegalStateException {
		// insert code below this line
		
		return false; // placeholder return
	} 
	
	//====================================================================================================
	
	/**
	 * Re-indexes the current queue array from current head position to index 0. 
	 */
	private void reIndexQueue() {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Immediately attempts to double the size of the stack array. 
	 *  
	 * @throws IllegalStateException			Thrown when unable to increase the size of the existing queue array.
	 */
	private void doubleQueueSize() throws IllegalStateException {
		// insert code below this line
		
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the first element in the queue array, if permissible. 
	 * 
	 * If no element is in the queue array, will return null.
	 * 
	 * The element that is returned will NOT be removed from the queue array. 
	 * 
	 * @return									The first element in the queue array.
	 */
	@SuppressWarnings("unchecked")
	public T peek() {
		// insert code below this line
		
		return null; // placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the first element in the queue array, if permissible. 
	 * 
	 * If no element is in the queue array, will return null.
	 * 
	 * The element that is returned will be removed from the queue array. 
	 * 
	 * @return									The first element in the queue array.
	 */
	@SuppressWarnings("unchecked")
	public T poll() {
		// insert code below this line
		
		return null; // placeholder return
	}
}