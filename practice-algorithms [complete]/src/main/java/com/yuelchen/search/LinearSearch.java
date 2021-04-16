package com.yuelchen.search;

public class LinearSearch<T extends Comparable<T>> {
	
	/**
	 * Searches the given array of objects and 
	 * returns whether or not the given value exists. 
	 * 
	 * @param data			The given array to search. 
	 * @param value			The given value to search for. 
	 * 
	 * @return				True if the given value exists in the given array;
	 * 						otherwise returns false. 
	 */
	@SuppressWarnings("unchecked")
	public boolean containsValue(Object[] data, T value) {
		for(int i=0; i<data.length; i++) {
			T dataValue = (T) data[i];
			if(value.compareTo(dataValue) == 0) {
				return true;
			}
		}
		
		return false;
	}
	
	//====================================================================================================
	
	/**
	 * Searches the given array of objects and 
	 * returns the index where the value exists. 
	 * 
	 * If the value does not exist, the default return value will be -1. 
	 * 
	 * @param data			The given array to search. 
	 * @param value			The given value to search for. 
	 * 
	 * @return				The index of the given value in the given array, 
	 * 						or -1 if the value does not exist. 
	 */
	@SuppressWarnings("unchecked")
	public int getIndex(Object[] data, T value) {
		for(int i=0; i<data.length; i++) {
			T dataValue = (T) data[i];
			if(value.compareTo(dataValue) == 0) {
				return i;
			}
		}
		
		return -1;
	}
}