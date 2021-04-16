package com.yuelchen.sort;

public class InsertionSort<T extends Comparable<T>> {

	/**
	 * Sorts the given data in ascending order (smallest to largest). 
	 * 
	 * @param data			The given array to sort.
	 */
	@SuppressWarnings("unchecked")
	public void ascendingOrder(Object[] data) {
		for(int i=0; i<data.length; i++) {
			int currentIndex = i;
			for(int j=i-1; j>=0; j--) {
				T iValue = (T) data[currentIndex];
				T jValue = (T) data[j];
				
				if(iValue.compareTo(jValue) == -1) {
					data[j] = iValue;
					data[currentIndex] = jValue;
					currentIndex--;
				} else {
					j = -1;
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
		for(int i=0; i<data.length; i++) {
			int currentIndex = i;
			for(int j=i-1; j>=0; j--) {
				T iValue = (T) data[currentIndex];
				T jValue = (T) data[j];
				
				if(iValue.compareTo(jValue) == 1) {
					data[j] = iValue;
					data[currentIndex] = jValue;
					currentIndex--;
				} else {
					j = -1;
				}
			}
		}
	}
}