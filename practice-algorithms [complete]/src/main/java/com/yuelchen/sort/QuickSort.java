package com.yuelchen.sort;

public class QuickSort<T extends Comparable<T>> {
	
	/**
	 * Sorts the given data in ascending order (smallest to largest). 
	 * 
	 * @param data			The given array to sort.
	 */
	public void ascendingOrder(Object[] data) {
		if(data.length > 0) {
			this.ascendingOrderRecursive(data, 0, data.length-1);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Recursively quick sorts the given array from starting index to ending index
	 * in ascending order. 
	 * 
	 * @param data			The given array to sort. 
	 * @param start			The starting index to sort from. 
	 * @param end			The ending index to sort till. 
	 */
	private void ascendingOrderRecursive(Object[] data, int start, int end) {
		if(start < end) {
			int pivot = partitionAscending(data, start, end);
			ascendingOrderRecursive(data, 0, pivot-1);
			ascendingOrderRecursive(data, pivot+1, end);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Determines and returns the partitioned index for given array. 
	 * 
	 * The index returned will ensure all values are less than 
	 * or equal to the pivot (end index value). 
	 * 
	 * @param data			The given array. 
	 * @param start			The starting index. 
	 * @param end			The ending index. 
	 * 
	 * @return				The partitioned index. 
	 */
	@SuppressWarnings("unchecked")
	private int partitionAscending(Object[] data, int start, int end) {
		int replacementIndex = start - 1;
		for(int i=start; i<=end; i++) {
			T iValue = (T) data[i];
			T endValue = (T) data[end];
			
			if(iValue.compareTo(endValue) < 1) {
				T replacementValue = (T) data[++replacementIndex];
				data[replacementIndex] = iValue;
				data[i] = replacementValue;
			}
		}
		
		return replacementIndex;
	}
	
	//====================================================================================================
	
	/**
	 * Sorts the given data in descending order (largest to smallest). 
	 * 
	 * @param data			The given array to sort.
	 */	
	public void descendingOrder(Object[] data) {
		if(data.length > 0) {
			this.descendingOrderRecursive(data, 0, data.length-1);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Recursively quick sorts the given array from starting index to ending index
	 * in descending order. 
	 * 
	 * @param data			The given array to sort. 
	 * @param start			The starting index to sort from. 
	 * @param end			The ending index to sort till.
	 */
	private void descendingOrderRecursive(Object[] data, int start, int end) {
		if(start < end) {
			int pivot = partitionDescending(data, start, end);
			descendingOrderRecursive(data, 0, pivot-1);
			descendingOrderRecursive(data, pivot+1, end);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Private Class Method. 
	 * 
	 * Determines and returns the partitioned index for given array.  
	 * 
	 * The index returned will ensure all values are less than 
	 * or equal to the pivot (end index value). 
	 * 
	 * @param data			The given array. 
	 * @param start			The starting index. 
	 * @param end			The ending index.
	 * 
	 * @return				The partitioned index.
	 */
	@SuppressWarnings("unchecked")
	private int partitionDescending(Object[] data, int start, int end) {
		int replacementIndex = start - 1;
		for(int i=start; i<=end; i++) {
			T iValue = (T) data[i];
			T endValue = (T) data[end];
			
			if(iValue.compareTo(endValue) > -1) {
				T replacementValue = (T) data[++replacementIndex];
				data[replacementIndex] = iValue;
				data[i] = replacementValue;
			}
		}
		
		return replacementIndex;
	}
}