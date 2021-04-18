package com.yuelchen.shape3d;

import com.yuelchen.shape2d.Circle;

public class Cone {
	
	/**
	 * Retrieves and returns the surface area of a cone. 
	 * 
	 * @param radius		The radius of the cone. 
	 * @param height		The height of the cone.
	 * 
	 * @return				The surface area of the cone. 
	 */
	public static double getSurfaceArea(double radius, double height) {
		return (Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2))) + radius) * 
				(Math.PI * radius);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the volume of a cone. 
	 * 
	 * @param radius		The radius of the cone. 
	 * @param height		The height of the cone. 
	 * 
	 * @return				The volume of the cone. 
	 */
	public static double getVolume(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * (height / 3);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the lateral surface area of a cone. 
	 * 
	 * @param radius		The radius of the cone. 
	 * @param height		The height of the cone. 
	 * 
	 * @return				The lateral surface area of the cone. 
	 */
	public static double getLateralSurfaceArea(double radius, double height) {
		return (Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2)))) * 
				(Math.PI * radius);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the slanted height of a cone. 
	 * 
	 * @param radius		The radius of the cone. 
	 * @param height		The height of the cone. 
	 * 
	 * @return				The slanted height of the cone. 
	 */
	public static double getSlantHeight(double radius, double height) {
		return Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2)));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the base area of a cone. 
	 * 
	 * @param radius		The radius of the cone. 
	 * 
	 * @return				The base area of the cone. 
	 */
	public static double getBaseArea(double radius) {
		return Circle.getArea(radius);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the height of a cone. 
	 * 
	 * @param radius		The radius of the cone.
	 * @param volume		The volume of the cone. 
	 * 
	 * @return				The height of the cone. 
	 */
	public static double getHeight(double radius, double volume) {
		return (volume / (Math.PI * Math.pow(radius, 2))) * 3;
	}
}