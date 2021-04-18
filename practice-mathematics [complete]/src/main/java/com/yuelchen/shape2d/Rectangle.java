package com.yuelchen.shape2d;

public class Rectangle {

	/**
	 * Retrieves and returns the perimeter of a rectangle.
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *         _____
	 *        |    /|    
	 *        |   / |
	 * length |  /  |
	 *        | /   |
	 *        |/____|
	 *         width
	 * 
	 * @param length		The length of the rectangle. 
	 * @param width			The width of the rectangle.
	 * 
	 * @return				The perimeter of the rectangle.
	 */
	public static double getPerimeter(double length, double width) {
		return 2 * (length + width);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the area of a rectangle.
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *         _____
	 *        |    /|    
	 *        |   / |
	 * length |  /  |
	 *        | /   |
	 *        |/____|
	 *         width
	 * 
	 * @param length		The length of the rectangle. 
	 * @param width			The width of the rectangle.
	 * 
	 * @return				The area of the rectangle.
	 */
	public static double getArea(double length, double width) {
		return length * width;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the diagonal of a rectangle.
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *         _____
	 *        |    /|    
	 *        |   / |
	 * length |  /  |
	 *        | /   |
	 *        |/____|
	 *         width
	 * 
	 * @param length		The length of the rectangle. 
	 * @param width			The width of the rectangle.
	 * 
	 * @return				The diagonal of the rectangle. 
	 */
	public static double getDiagonal(double length, double width) {
		return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the length using the diagonal and width of a rectangle.
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *         _____
	 *        |    /|    
	 *        |   / |
	 * length |  /  |
	 *        | /   |
	 *        |/____|
	 *         width
	 * 
	 * @param diagonal		The diagonal of the rectangle. 
	 * @param width			The width of the rectangle.
	 * 
	 * @return				The length of the rectangle. 
	 */
	public static double getLength(double diagonal, double width) {
		return Math.sqrt(Math.pow(diagonal, 2) - Math.pow(width, 2));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the width using the diagonal and length of a rectangle.
	 * 
	 * Shape to method parameter reference (not scaled): 
	 * 
	 *         _____
	 *        |    /|    
	 *        |   / |
	 * length |  /  |
	 *        | /   |
	 *        |/____|
	 *         width
	 * 
	 * @param diagonal		The diagonal of the rectangle. 
	 * @param length		The length of the rectangle. 
	 * 
	 * @return				The width of the rectangle.
	 */
	public static double getWidth(double diagonal, double length) {
		return Math.sqrt(Math.pow(diagonal, 2) - Math.pow(length, 2));
	}
}