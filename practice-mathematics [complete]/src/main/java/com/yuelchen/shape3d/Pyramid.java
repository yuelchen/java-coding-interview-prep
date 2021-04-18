package com.yuelchen.shape3d;

import com.yuelchen.shape2d.Rectangle;

public class Pyramid {
	
	/**
	 * Retrieves and returns the surface area of a pyramid. 
	 * 
	 * @param length		The length (base) of the pyramid. 
	 * @param width			The width (base) of the pyramid. 
	 * @param height		The height of the pyramid.
	 * 
	 * @return				The surface area of a pyramid. 
	 */
	public static double getSurfaceArea(double length, double width, double height) {
		return 	(length * width) +
				(length * Math.sqrt(Math.pow((width/2), 2) + Math.pow(height, 2))) +
				(width * Math.sqrt(Math.pow((length/2), 2) + Math.pow(height, 2)));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the volume of a pyramid. 
	 * 
	 * @param length		The length (base) of the pyramid. 
	 * @param width			The width (base) of the pyramid. 
	 * @param height		The height of the pyramid.
	 * 
	 * @return				The volume of the pyramid. 
	 */
	public static double getVolume(double length, double width, double height) {
		return (length * width * height) / 3;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the lateral surface area of a pyramid. 
	 * 
	 * @param length		The length (base) of the pyramid. 
	 * @param width			The width (base) of the pyramid. 
	 * @param height		The height of the pyramid. 
	 * 
	 * @return				The lateral surface area of the pyramid. 
	 */
	public static double getLateralSurfaceArea(double length, double width, double height) {
		return (length * Math.sqrt(Math.pow((width/2), 2) + Math.pow(height, 2))) +
				(width * Math.sqrt(Math.pow((length/2), 2) + Math.pow(height, 2)));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the base area of a pyramid. 
	 * 
	 * @param length		The length (base) of the pyramid. 
	 * @param width			The width (base) of the pyramid. 
	 * 
	 * @return				The base area of the pyramid. 
	 */
	public static double getBaseArea(double length, double width) {
		return Rectangle.getArea(length, width);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the base width of a pyramid. 
	 * 
	 * @param length		The length (base) of the pyramid. 
	 * @param baseArea		The base area of the pyramid. 
	 * 
	 * @return				The base width of the pyramid. 
	 */
	public static double getBaseWidth(double length, double baseArea) {
		return baseArea / length;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the base length of a pyramid. 
	 * 
	 * @param width			The width (base) of the pyramid. 
	 * @param baseArea		The base area of the pyramid. 
	 * 
	 * @return				The base length of the pyramid. 
	 */
	public static double getBaseLength(double width, double baseArea) {
		return baseArea / width;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the height of a pyramid. 
	 * 
	 * @param length		The length (base) of the pyramid.
	 * @param width			The width (base) of the pyramid. 
	 * @param volume		The volume of the pyramid.
	 * 
	 * @return				The height of the pyramid. 
	 */
	public static double getHeight(double length, double width, double volume) {
		return 3 * (volume / (length * width));
	}
}