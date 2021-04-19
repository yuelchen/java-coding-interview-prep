package com.yuelchen.factory;

public class ShapeRectangle implements Shape {
	
	/**
	 * The length of a rectangle. 
	 */
	private double length;
	
	//====================================================================================================
	
	/**
	 * The width of a rectangle. 
	 */
	private double width;
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param length		The length of the rectangle. 
	 * @param width			The width of the rectangle.
	 */
	public ShapeRectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the length of the rectangle. 
	 * 
	 * @return				The length of the rectangle.
	 */
	public double getLength() {
		return this.length;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the width of the rectangle. 
	 * 
	 * @return				The width of the rectangle. 
	 */
	public double getWidth() {
		return this.width;
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns the perimeter of the rectangle. 
	 * 
	 * @return				The perimeter of the rectangle. 
	 */
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns the area if the rectangle.
	 * 
	 * @return				The area of the rectangle. 
	 */
	public double getArea() {
		return this.length * this.width;
	}
}
