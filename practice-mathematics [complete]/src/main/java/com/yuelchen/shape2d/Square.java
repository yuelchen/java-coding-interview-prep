package com.yuelchen.shape2d;

public class Square {
	
	/**
	 * Retrieves and returns the perimeter of a square. 
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *       _________
	 *      |        /|    
	 *      |      /  |
	 * side |    /    |
	 *      |  /      |
	 *      |/________|
	 *          side
	 * 
	 * @param side		The side measurement of the square. 
	 * 
	 * @return			The perimeter of the square.
	 */
	public static double getPerimeter(double side) {
		return side * 4;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the area of a square. 
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *       _________
	 *      |        /|    
	 *      |      /  |
	 * side |    /    |
	 *      |  /      |
	 *      |/________|
	 *          side
	 * 
	 * @param side		The side measurement of the square. 
	 * 
	 * @return			The area of the square. 
	 */
	public static double getArea(double side) {
		return side * side;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the diagonal of a square. 
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *       _________
	 *      |        /|    
	 *      |      /  |
	 * side |    /    |
	 *      |  /      |
	 *      |/________|
	 *          side
	 * 
	 * @param side		The side measurement of the square.
	 * 
	 * @return			The diagonal of the square. 
	 */
	public static double getDiagonal(double side) {
		return Math.sqrt(2) * side;
	}
}