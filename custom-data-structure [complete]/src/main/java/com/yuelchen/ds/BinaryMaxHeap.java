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
		this.heap = new Object[3];
		this.size = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of elements in heap array. 
	 * 
	 * @return					The number of elements in heap array. 
	 */
	public int getSize() {
		return this.size;
	}
	
	//====================================================================================================
	
	/**
	 * Inserts the given value into the heap array. 
	 * 
	 * @param t					The value to be inserted. 
	 */
	public void insert(T t) {		
		if(this.size == this.heap.length) {
			if(!this.increaseHeap()) {
				return;
			}
		}
		
		this.heap[this.size] = t;
		this.heapifyUp(this.size);
		this.size++;
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
		if(this.heap.length < Integer.MAX_VALUE) {
			int heapSize = Math.min(this.heap.length * 2, Integer.MAX_VALUE);
			Object[] temp = new Object[heapSize];
			
			for(int i=0; i<this.heap.length; i++) {
				temp[i] = this.heap[i];
			}
			
			this.heap = temp;
			return true;
		}
		
		return false;		
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
		if(this.size == 0) {
			return null;
		} else {
			return (T) this.heap[0];
		}
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
		T removed = null;
		if(this.size == 1) {
			removed = (T) this.heap[0];
			this.size = 0;
			return removed;
		} else if(this.size > 1) {
			removed = (T) this.heap[0];
			this.heap[0] = this.heap[--this.size];
			this.heapifyDown();
		}
		
		return removed;
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
		while(currentIndex > 0) {
			T currentValue = (T) this.heap[currentIndex];
			
			int parentIndex = HeapIndex.getParentIndex(currentIndex);
			T parentValue = (T) this.heap[parentIndex];
			
			if(currentValue.compareTo(parentValue) == 1) {
				this.heapifyFlip(currentIndex, parentIndex);
				currentIndex = parentIndex;
			} else {
				return;
			}
		}
	}
	
	//====================================================================================================
	
	/**
	 * Traverses the heap from first element to the last populated index 
	 * and swaps element values to ensure that the parent value is always
	 * greater than child value.
	 */
	@SuppressWarnings("unchecked")
	private void heapifyDown() {
		int currentIndex = 0;
		while(currentIndex < this.size) {
			T currentValue = (T) this.heap[currentIndex];
			
			int leftChildIndex = HeapIndex.getLeftChildIndex(currentIndex);
			T leftValue = leftChildIndex < this.size ? (T) this.heap[leftChildIndex] : null;
			
			int rightChildIndex = HeapIndex.getRightChildIndex(currentIndex);
			T rightValue = rightChildIndex < this.size ? (T) this.heap[rightChildIndex] : null;
			
			if((leftValue != null && rightValue != null && leftValue.compareTo(rightValue) == -1)
					&& (currentValue.compareTo(rightValue) < 1)) {
				// right value is larger than left value and current value
				this.heapifyFlip(currentIndex, rightChildIndex);
				currentIndex = rightChildIndex;
				
			} else if(((leftValue != null && rightValue != null && leftValue.compareTo(rightValue) == 1)
						|| (leftValue != null && rightValue == null)) 
					&& (currentValue.compareTo(leftValue) < 1)) {
				// left value is larger than right value (or null) and current value 
				this.heapifyFlip(currentIndex, leftChildIndex);
				currentIndex = leftChildIndex;
				
			} else {
				return;
			}
		}
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
		T temp = (T) this.heap[index1];
		this.heap[index1] = this.heap[index2];
		this.heap[index2] = temp;
	}
	
	//====================================================================================================
	
	/**
	 * Clears the heap of all elements. 
	 */
	public void clear() {
		int heapLength = this.heap.length;
		this.heap = new Object[heapLength];
		this.size = 0;
	}
}