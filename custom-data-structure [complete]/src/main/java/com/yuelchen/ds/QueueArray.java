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
		this.queue = new Object[7];
		this.head = -1;
		this.tail = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param size								The initial queue size. 
	 */
	public QueueArray(int size) {
		this.queue = new Object[size];
		this.head = -1;
		this.tail = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the number of elements added into queue array. 
	 * 
	 * @return									The number of elements added into queue array. 
	 */
	public int size() {
		if(this.tail >=0 && this.head >= 0 && this.tail >= this.head) {
			return (this.tail - this.head) + 1;
		}
		
		return 0;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the queue array of all elements. 
	 */
	public void clear() {
		int size = this.queue.length;
		this.queue = new Object[size];
		this.head = -1;
		this.tail = -1;
	}
	
	//====================================================================================================
	
	/**
	 * Returns true if the queue array is empty, otherwise returns false. 
	 * 
	 * @return									True if queue array is empty, otherwise returns false.
	 */
	public boolean empty() {
		return this.size() == 0;
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
		if(this.tail >= this.queue.length - 1) {
			if(this.size() * 2 < this.queue.length) {
				this.reIndexQueue();
			} else {
				this.doubleQueueSize();
			}
		} 
		
		this.queue[++this.tail] = t;
		if(this.head == -1) {
			this.head++;
		}
		
		return true;
		
	} 
	
	//====================================================================================================
	
	/**
	 * Re-indexes the current queue array from current head position to index 0. 
	 */
	private void reIndexQueue() {
		int size = this.queue.length;
		Object[] temp = new Object[size];
		
		for(int i=this.head; i<=this.tail; i++) {
			temp[i-this.head] = this.queue[i];
			
		}
		
		this.queue = temp;
		this.tail -= this.head;
		this.head = 0;
		
	}
	
	//====================================================================================================
	
	/**
	 * Immediately attempts to double the size of the stack array. 
	 *  
	 * @throws IllegalStateException			Thrown when unable to increase the size of the existing queue array.
	 */
	private void doubleQueueSize() throws IllegalStateException {
		int newSize = this.queue.length * 2;
		int maxSize = Integer.MAX_VALUE - 5;
		
		/* Unable to increase if new size is greater than max size and
		 * current size is already max size. 
		 */
		if(newSize > maxSize && this.queue.length == maxSize) {
			throw new IllegalStateException();
			
		} else {
			newSize = Math.min(newSize, maxSize);
			Object[] temp = new Object[newSize];
			
			for(int i=this.head; i<=this.tail; i++) {
				temp[i-this.head] = this.queue[i];
			}
			
			this.queue = temp;
			this.tail -= this.head;
			this.head = 0;
		}
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
		if(this.head == -1 || this.head > this.tail) {
			return null;
		}  else {
			return (T) this.queue[this.head];
		}
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
		if(this.head == -1 || this.head > this.tail) {
			return null;
		} else {
			return (T) this.queue[this.head++];
		}
	}
}