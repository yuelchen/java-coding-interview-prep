package com.yuelchen.shape3d;

public class Cube {

	/**
	 * Retrieves and returns the surface area of a cube. 
	 * 
	 * @param side		The side measurement of the cube. 
	 * 
	 * @return			The surface area the cube.
	 */
	public static double getSurfaceArea(double side) {
		return 6 * Math.pow(side, 2);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the volume of a cube. 
	 * 
	 * @param side		The side measurement of the cube. 
	 * 
	 * @return			The volume of the cube. 
	 */
	public static double getVolume(double side) {
		return Math.pow(side, 3);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the space diagonal of a cube. 
	 * 
	 * @param side		The side measurement of the cube. 
	 * 
	 * @return			The space diagonal of the cube. 
	 */	
	public static double getSpaceDiagonal(double side) {
		return Math.sqrt(3) * side;
	}
}