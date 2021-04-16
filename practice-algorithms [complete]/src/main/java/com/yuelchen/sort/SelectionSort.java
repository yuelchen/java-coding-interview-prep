package com.yuelchen.sort;

public class SelectionSort<T extends Comparable<T>> {
	
	/**
	 * Sorts the given data in ascending order (smallest to largest). 
	 * 
	 * @param data			The given array to sort.
	 */
	@SuppressWarnings("unchecked")
	public void ascendingOrder(Object[] data) {
		for(int i=0; i<data.length-1; i++) {
			for(int j=i+1; j<data.length; j++) {
				T iValue = (T) data[i];
				T jValue = (T) data[j];
				
				if(iValue.compareTo(jValue) == 1) {
					data[i] = jValue;
					data[j] = iValue;
				}
			}
		}
	}
	
	//====================================================================================================
	
	/**
	 * Sorts the given data in descending order (largest to smallest). 
	 * 
	 * @param data			The given array to sort.
	 */
	@SuppressWarnings("unchecked")
	public void descendingOrder(Object[] data) {
		for(int i=0; i<data.length-1; i++) {
			for(int j=i+1; j<data.length; j++) {
				T iValue = (T) data[i];
				T jValue = (T) data[j];
				
				if(iValue.compareTo(jValue) == -1) {
					data[i] = jValue;
					data[j] = iValue;
				}
			}
		}
	}
}