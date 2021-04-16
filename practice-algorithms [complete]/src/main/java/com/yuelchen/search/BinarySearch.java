package com.yuelchen.search;

import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> {

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
		if(data.length == 0) {
			return false;
		} else if(data.length == 1) {
			T dataValue = (T) data[0];
			return value.compareTo(dataValue) == 0;
		} else {
			int start = 0;
			int end = data.length;
			int middle = (start + end) / 2;

			T middleValue = (T) data[middle];
			if(value.compareTo(middleValue) == 0) {
				return true;
			} else if(value.compareTo(middleValue) == -1) {
				// value is less than middle (look start to middle)
				return this.containsValue(Arrays.copyOfRange(data, start, middle), value);
			} else {
				// value is greater than middle (look middle to end)
				return this.containsValue(Arrays.copyOfRange(data, middle+1, end), value);
			}
		}
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
		if(data.length == 0) {
			return -1;
		} else if(data.length == 1) {
			T dataValue = (T) data[0];
			return value.compareTo(dataValue) == 0 ? 0 : -1;
		} else {
			int start = 0;
			int end = data.length;
			int middle = (start + end) / 2;

			T middleValue = (T) data[middle];
			if(value.compareTo(middleValue) == 0) {
				return middle;
			} else if(value.compareTo(middleValue) == -1) {
				// value is less than middle (look start to middle)
				int result = this.getIndex(Arrays.copyOfRange(data, start, middle), value);
				return result;
				
			} else {
				// value is greater than middle (look middle to end)
				int result = this.getIndex(Arrays.copyOfRange(data, middle+1, end), value);
				return result == -1 ? result : middle + 1 + result;
			}
		}
	}
}