package com.yuelchen.sort;

public class MergeSort<T extends Comparable<T>> {

	/**
	 * Sorts the given data in ascending order (smallest to largest). 
	 * 
	 * @param data			The given array to sort.
	 */
	public void ascendingOrder(Object[] data) {
		this.ascendingOrderRecursive(data, 0, data.length-1);
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Recursively merge sorts the given array from starting index to ending index
	 * in ascending order. 
	 * 
	 * @param data			The given array to sort. 
	 * @param start			The starting index to sort from. 
	 * @param end			The ending index to sort till.
	 */
	private void ascendingOrderRecursive(Object[] data, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			ascendingOrderRecursive(data, start, middle);
			ascendingOrderRecursive(data, middle+1, end);
			mergeAscending(data, start, middle, end);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Merges the left range of array values with the right range of array values. 
	 * 
	 * The merged array will be sorted in ascending order. 
	 * 
	 * @param data			The given array. 
	 * @param start			The starting index (left side). 
	 * @param middle		The middle index which splits the array. 
	 * @param end			The ending index (right side).
	 */
	@SuppressWarnings("unchecked")
	private void mergeAscending(Object[] data, int start, int middle, int end) {
		int leftSize = middle - start + 1;
		Object[] left = new Object[leftSize];
		for(int i=0; i<leftSize; i++) {
			left[i] = data[start+i];
		}
		
		int rightSize = end - middle;
		Object[] right = new Object[rightSize];
		for(int i=0; i<rightSize; i++) {
			right[i] = data[middle+1+i]; 
		}
		
		int index = start;
		int lIndex = 0;
		int rIndex = 0;
		
		while(lIndex < left.length && rIndex < right.length) {
			T leftValue = (T) left[lIndex];
			T rightValue = (T) right[rIndex];
			
			if(leftValue.compareTo(rightValue) < 1) {
				data[index] = leftValue;
				lIndex++;
			} else {
				data[index] = rightValue;
				rIndex++;
			}
			
			index++;
		}
		
		while(lIndex < left.length) {
			data[index] = left[lIndex];
			lIndex++;
			index++;
		}
		
		while(rIndex < right.length) {
			data[index] = right[rIndex];
			rIndex++;
			index++;
		}
	}
	
	//====================================================================================================
	
	/**
	 * Sorts the given data in descending order (largest to smallest). 
	 * 
	 * @param data			The given array to sort.
	 */	
	public void descendingOrder(Object[] data) {
		this.descendingOrderRecursive(data, 0, data.length-1);
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Recursively merge sorts the given array from starting index to ending index
	 * in descending order. 
	 * 
	 * @param data			The given array to sort. 
	 * @param start			The starting index to sort from. 
	 * @param end			The ending index to sort till.
	 */
	private void descendingOrderRecursive(Object[] data, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			descendingOrderRecursive(data, start, middle);
			descendingOrderRecursive(data, middle+1, end);
			mergeDescending(data, start, middle, end);
			
		}
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Merges the left range of array values with the right range of array values. 
	 * 
	 * The merged array will be sorted in ascending order.  
	 * 
	 * @param data			The given array. 
	 * @param start			The starting index (left side). 
	 * @param middle		The middle index which splits the array. 
	 * @param end			The ending index (right side).
	 */
	@SuppressWarnings("unchecked")
	private void mergeDescending(Object[] data, int start, int middle, int end) {
		int leftSize = middle - start + 1;
		Object[] left = new Object[leftSize];
		for(int i=0; i<leftSize; i++) {
			left[i] = data[start+i];
		}
		
		int rightSize = end - middle;
		Object[] right = new Object[rightSize];
		for(int i=0; i<rightSize; i++) {
			right[i] = data[middle+1+i]; 
		}
		
		int index = start;
		int lIndex = 0;
		int rIndex = 0;
		
		while(lIndex < left.length && rIndex < right.length) {
			T leftValue = (T) left[lIndex];
			T rightValue = (T) right[rIndex];
			
			if(leftValue.compareTo(rightValue) > -1) {
				data[index] = leftValue;
				lIndex++;
			} else {
				data[index] = rightValue;
				rIndex++;
			}
			
			index++;
		}
		
		while(lIndex < left.length) {
			data[index] = left[lIndex];
			lIndex++;
			index++;
		}
		
		while(rIndex < right.length) {
			data[index] = right[rIndex];
			rIndex++;
			index++;
		}
	}
}
