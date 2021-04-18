package com.yuelchen.shape3d;

import com.yuelchen.shape2d.Circle;

public class Cylinder {

	/**
	 * Retrieves and returns the volume of a cylinder. 
	 * 
	 * @param radius		The radius of the cylinder. 
	 * @param height		The height of the cylinder. 
	 * 
	 * @return				The surface are of the cylinder.
	 */
	public static double getSurfaceArea(double radius, double height) {
		return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the volume of a cylinder. 
	 * 
	 * @param radius		The radius of the cylinder. 
	 * @param height		The height of the cylinder. 
	 * 
	 * @return				The volume of the cylinder. 
	 */
	public static double getVolume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieve and returns the lateral surface area of a cylinder. 
	 * 
	 * @param radius		The radius of the cylinder. 
	 * @param height		The height of the cylinder. 
	 * 
	 * @return				The lateral surface area of the cylinder. 
	 */
	public static double getLateralSurfaceArea(double radius, double height) {
		return 2 * Math.PI * radius * height;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieve and returns the base area of a cylinder. 
	 * 
	 * @param radius		The radius of the cylinder.
	 * 
	 * @return				The base area of the cylinder.
	 */
	public static double getBaseArea(double radius) {
		return Circle.getArea(radius);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the diameter of a cylinder.
	 * 
	 * @param height		The diameter of the cylinder. 
	 * @param volume		The volume of the cylinder. 
	 * 
	 * @return				The diameter of the cylinder.
	 */
	public static double getDiameter(double height, double volume) {
		return 2 * Math.sqrt((volume / (Math.PI * height)));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the height of a cylinder. 
	 * 
	 * @param diameter		The diameter of the cylinder.
	 * @param volume		The volume of the cylinder. 
	 * 
	 * @return				The height of the cylinder.
	 */
	public static double getHeight(double diameter, double volume) {
		return volume / (Math.PI * Math.pow((diameter / 2), 2));
	}
}