package com.yuelchen.factory;

public class ShapeTriangle implements Shape {

	/**
	 * One side of a triangle.
	 */
	private double side1;
	
	//====================================================================================================
	
	/**
	 * One side of a triangle.
	 */
	private double side2;
	
	//====================================================================================================
	
	/**
	 * The base side of a triangle.
	 */
	private double base;
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param side1			One side of the triangle. 
	 * @param side2			One side of the triangle.
	 * @param base			The base side of the triangle. 
	 */
	public ShapeTriangle(double side1, double side2, double base) {
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the first side of the triangle. 
	 * 
	 * @return				The first side of the triangle. 
	 */
	public double getSide1() {
		return this.side1;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the second side of the triangle. 
	 * 
	 * @return				The second side of the triangle.
	 */
	public double getSide2() {
		return this.side2;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the base side of the triangle. 
	 * 
	 * @return				The base side of the triangle. 
	 */	
	public double getBase() {
		return this.base;
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns the perimeter of the triangle. 
	 * 
	 * @return				The perimeter of the rectangle. 
	 */
	public double getPerimeter() {
		return this.side1 + this.side2 + this.base;
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns the area of the triangle. 
	 * 
	 * @param height		The height of the triangle from base to point 
	 * 						where side1 and side2 meet. 
	 * 
	 * @return				The area of the triangle. 
	 */
	public double getArea(double height) {
		return (this.base * height) / 2;
	}
}
