package com.yuelchen.shape2d;

public class Circle {
	
	/**
	 * Retrieves and returns the circumference of a circle. 
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 * 			 *****
	 *        ****   ****
	 *      ***         ***
	 *     **      radius **
	 *    ***	   ---------*
	 *     **             **
	 *      ***        ***
	 *        ****   ****
	 *           *****
	 *            
	 * @param radius		The radius of the circle. 
	 * 
	 * @return				The circumference of the circle. 
	 */
	public static double getCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the area of a circle. 
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 * 			 *****
	 *        ****   ****
	 *      ***         ***
	 *     **      radius **
	 *    ***	   ---------*
	 *     **             **
	 *      ***        ***
	 *        ****   ****
	 *           *****
	 * 
	 * @param radius		The radius of the circle. 
	 * 
	 * @return				The area of the circle. 
	 */
	public static double getArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the diameter of a circle. 
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 * 			 *****
	 *        ****   ****
	 *      ***         ***
	 *     **      radius **
	 *    ***	   ---------*
	 *     **             **
	 *      ***        ***
	 *        ****   ****
	 *           *****
	 * 
	 * @param radius		The radius of the circle. 
	 * 
	 * @return				The diameter of the circle.
	 */
	public static double getDiameter(double radius) {
		return 2 * radius;
	}
}