package com.yuelchen.shape3d;

import com.yuelchen.shape2d.Circle;

public class Sphere {
	
	/**
	 * Retrieves and returns the surface area of a sphere. 
	 * 
	 * @param radius		The radius of the sphere. 
	 * 
	 * @return				The surface area of the sphere. 
	 */
	public static double getSurfaceArea(double radius) {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the volume of a sphere. 
	 * 
	 * @param radius		The radius of the sphere. 
	 * 
	 * @return				The volume of the sphere. 
	 */
	public static double getVolume(double radius) {
		return (4.0 / 3) * Math.PI * (Math.pow(radius, 3));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the diameter of a sphere. 
	 * 
	 * @param radius		The radius of the sphere. 
	 * 
	 * @return				The diameter of the sphere. 
	 */
	public static double getDiameter(double radius) {
		return Circle.getDiameter(radius);
	}
}