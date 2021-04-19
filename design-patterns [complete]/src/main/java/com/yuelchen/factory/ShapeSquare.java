package com.yuelchen.factory;

public class ShapeSquare implements Shape {

	/**
	 * The side measurement of a square. 
	 */
	private double side;
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param side			The side measurement of the square. 
	 */
	public ShapeSquare(double side) {
		this.side = side;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the side measurement of the square. 
	 * 
	 * @return				The side measurement of the square. 
	 */
	public double getSide() {
		return this.side;
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns the perimeter of the square.
	 * 
	 * @return				The perimeter of the square. 
	 */
	public double getPerimeter() {
		return 4 * this.side;
	}
	
	//====================================================================================================
	
	/**
	 * Determines and returns the area of the square. 
	 * 
	 * @return				The area of the square. 
	 */
	public double getArea() {
		return this.side * this.side;
	}
}
