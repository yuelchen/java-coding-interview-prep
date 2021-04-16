package com.yuelchen.util;

public class Hash {
	
	/**
	 * Default Step (must be prime)
	 */
	public static final int DEFAULT_STEP = 2;
	
	//====================================================================================================

	/**
	 * Custom hash index function to determine and return the hash index for given object value.  
	 * 
	 * @param <T>		The object type.
	 * @param t			The object value. 
	 * @param prime		The prime number to hash with (assumed to be prime). 
	 * 
	 * @return			An index less than or equal to prime number. 
	 */
	public static <T> int getHash(T t, int prime) {
		int hash = t.hashCode() % prime;
		
		if(hash < 0) {
			hash += prime;
		}
		
		return hash;
	}
	
	//====================================================================================================
	
	/**
	 * Custom step index function to determine and return the step index for given hash index.
	 * 
	 * Uses class static DEFAULT_STEP value (i.e. 2).
	 * 
	 * @param <T>		The object type. 
	 * @param hash		The hash index value to step from. 
	 * 
	 * @return			The new index from hash index. 
	 */
	public static <T> int getStep(int hash) {
		return Hash.DEFAULT_STEP - hash % Hash.DEFAULT_STEP;
	}
	
	//====================================================================================================
	
	/**
	 * Custom step index function to determine and return the step index for given hash index.
	 * 
	 * @param <T>		The object type.
	 * @param hash		The hash index value to step from.
	 * @param step		The step value to be used;
	 * 					recommended to be prime and less than max array size.
	 * 
	 * @return			The new index from hash index and custom step size. 
	 */
	public static <T> int getStep(int hash, int step) {		
		return step - hash % step;
	}
	
	//====================================================================================================
	
	/**
	 * Custom step index function to determine and return the step index for given hash index. 
	 * 
	 * @param <T>		The object type.
	 * @param t			The object value.
	 * @param prime		The prime number to hash with (assumed to be prime). 
	 * @param step		The step value to be used; 
	 * 					recommended to be prime and less than max array size. 
	 * 
	 * @return			The new index from hash index and custom step size.
	 */
	public static <T> int getStep(T t, int prime, int step) {
		int hash = t.hashCode() % prime;
		
		if(hash < 0) {
			hash += prime;
		}
		
		return step - hash % 2;
	}
}
