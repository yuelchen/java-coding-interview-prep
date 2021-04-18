package com.yuelchen.stats;

import java.util.Arrays;

public class Statistics {

	/**
	 * Retrieves and returns the mean (average) of all data values in the given array, 
	 * divided by the size of the array.
	 * 
	 * If the array of data is empty, than will return a value of -1;
	 * 
	 * @param data			The array of data. 
	 * 
	 * @return				The average of all data values. 
	 */
	public static double getMean(int[] data) {
		if(data.length > 0) {
			double sum = 0;
			for(int i=0; i<data.length; i++) {
				sum += data[i];
			}
			
			return sum / data.length;
		} 
		
		return -1;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the median of all data values in the given SORTED array. 
	 * 
	 * If the size of the array is odd and there are two middle numbers, 
	 * the median will be the average of the two numbers. 
	 * 
	 * @param data			The array of data.
	 * 
	 * @return				The median for the array of data. 
	 */
	public static double getMedian(int[] data) {
		if(data.length > 0) {
			
			// sorts the given array of data in event unsorted data is sent
			Arrays.sort(data);
			
			if(data.length % 2 == 0) {
				// will have two middle values
				int middleIndex1 = data.length / 2 - 1;
				int middleIndex2 = middleIndex1 + 1;
				return (((double) data[middleIndex1] + data[middleIndex2]) / 2);
			} else {
				return (data[data.length / 2]);
			}
		}
		
		return -1;
	} 
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the most frequently used value, 
	 * if there are multiple values, will retrieve the lowest valued mode. 
	 * 
	 * @param data			The array of data. 
	 * 		
	 * @return				The mode for the array of data. 
	 */
	public static int getMode(int[] data) {
		if(data.length > 0) {
			// sorts the given array of data in event unsorted data is sent
			Arrays.sort(data);
			
			int highestFrequencyValue = data[0];
			int highestFrequency = 1;
			
			int currentValue = data[0];
			int currentValueFrequency = 1;
			for(int i=1; i<data.length; i++) {
				if(currentValue == data[i]) {
					currentValueFrequency++;
				
				} else {
					currentValue = data[i];
					currentValueFrequency = 1;
				}

				if(currentValueFrequency > highestFrequency) {
					highestFrequency = currentValueFrequency;
					highestFrequencyValue = currentValue;
				}
			}
			
			return highestFrequencyValue;
		}
		
		return -1;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the smallest value in the given array. 
	 * 
	 * @param data			The array of data. 
	 * 
	 * @return				The smallest value in the given array.  
	 */
	public static int getMin(int[] data) {
		if(data.length > 0) {
			// sorts the given array of data in event unsorted data is sent
			Arrays.sort(data);
			
			return data[0];
		}
		
		return -1;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the largest value in the given array. 
	 * 
	 * @param data			The array of data;
	 * 
	 * @return				The largest value in the given array.
	 */
	public static int getMax(int[] data) {
		if(data.length > 0) {
			// sorts the given array of data in event unsorted data is sent
			Arrays.sort(data);
			
			return data[data.length - 1];
		}
		
		return -1;
	}
}
