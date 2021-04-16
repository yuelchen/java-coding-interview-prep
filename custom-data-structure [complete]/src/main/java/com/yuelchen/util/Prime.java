package com.yuelchen.util;

public class Prime {

	/**
	 * Determines and returns if the given number is a prime number. 
	 * 
	 * @param number		The number to determine whether it's prime or not. 
	 * 
	 * @return				True if the given number is a prime number, 
	 * 						otherwise returns false.
	 */
	public static boolean isPrime(int number) {
		/* For each number, starting with i at 2 (first prime number), 
		 * divide the given number against the power of i and itself. 
		 * 
		 * If the number is divisible (with a remainder equal to 0),
		 * then the number is not a prime; as a prime is not divisible by any number
		 * other than 1 and itself. 
		 */
		for(int i=2; i*i <= number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the next valid prime number, starting from given number. 
	 * 
	 * @param number		The starting number to determine next prime number. 
	 * 
	 * @return				A prime number greater than the given number. 
	 */
	public static int nextPrime(int number) {
		// Just keep iterating until a prime number is found. 
		for(int i=number; true; i++) {
			if(Prime.isPrime(i)) {
				return i;
			}
		}
	}
}
