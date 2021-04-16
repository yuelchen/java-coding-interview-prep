package com.yuelchen.sort;

public class QuickSort<T extends Comparable<T>> {
	
	/**
	 * Sorts the given data in ascending order (smallest to largest). 
	 * 
	 * @param data			The given array to sort.
	 */
	public void ascendingOrder(Object[] data) {
		// insert code below this line
		
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
		// insert code below this line
		
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
		// insert code below this line
		
		return -1; // placeholder return 
	}
	
	//====================================================================================================
	
	/**
	 * Sorts the given data in descending order (largest to smallest). 
	 * 
	 * @param data			The given array to sort.
	 */	
	public void descendingOrder(Object[] data) {
		// insert code below this line
		
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
		// insert code below this line
		
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
		// insert code below this line
		
		return -1; // placeholder return 
	}
}