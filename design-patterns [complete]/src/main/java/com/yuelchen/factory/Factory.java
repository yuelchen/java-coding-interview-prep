package com.yuelchen.factory;

public class Factory {
	
	/**
	 * Returns a Shape if the given array of values meets a shape criteria. 
	 * 
	 * Array Length to Shape Name Relations:
	 * - 1 equals Square
	 * - 2 equals Rectangle
	 * - 3 equals Triangle
	 * 
	 * Otherwise returns null. 
	 * 
	 * @param values			The array of values to be assigned to a known Shape.
	 * 
	 * @return					A Shape object if criteria is met, or otherwise returns null. 
	 */
	public static Shape getShape(double[] values) {
		if(values.length == 1) {
			return new ShapeSquare(values[0]);
		} else if(values.length == 2) {
			return new ShapeRectangle(values[0], values[1]);
		} else if(values.length == 3) {
			return new ShapeTriangle(values[0], values[1], values[3]);
		}
		
		return null;
	}
}