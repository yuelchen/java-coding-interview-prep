package com.yuelchen.shape3d;

public class RectangularPrism {

	/**
	 * Retrieves and returns the surface area of a rectangular prism. 
	 * 
	 * @param length			The length of the rectangular prism. 
	 * @param width				The width of the rectangular prism
	 * @param height			The height of the rectangular prism.
	 * 
	 * @return					The surface area of the rectangular prism. 
	 */
	public static double getSurfaceArea(double length, double width, double height) {
		return 2 * ((length * width) + (length * height) + (width * height));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the volume of a rectangular prism. 
	 * 
	 * @param length			The length of the rectangular prism. 
	 * @param width				The width of the rectangular prism
	 * @param height			The height of the rectangular prism. 
	 * 
	 * @return					The volume of the rectangular prism. 
	 */
	public static double getVolume(double length, double width, double height) {
		return length * width * height;
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the space diagonal of a rectangular prism. 
	 * 
	 * @param length			The length of the rectangular prism. 
	 * @param width				The width of the rectangular prism
	 * @param height			The height of the rectangular prism. 
	 * 
	 * @return					The space diagonal of the rectangular prism. 
	 */
	public static double getSpaceDiagonal(double length, double width, double height) {
		 return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the length of a rectangular prism. 
	 * 
	 * @param width				The width of the rectangular prism
	 * @param height			The height of the rectangular prism. 
	 * @param spaceDiagonal		The space diagonal of the rectangular prism. 
	 * 
	 * @return					The length of the rectangular prism. 
	 */
	public static double getLength(double width, double height, double spaceDiagonal) {
		return getMissingSide(width, height, spaceDiagonal);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the width of a rectangular prism. 
	 * 
	 * @param length			The length of the rectangular prism. 
	 * @param height			The height of the rectangular prism. 
	 * @param spaceDiagonal		The space diagonal of the rectangular prism. 
	 * 
	 * @return					The width of the rectangular prism. 
	 */
	public static double getWidth(double length, double height, double spaceDiagonal) {
		return getMissingSide(length, height, spaceDiagonal);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the height of a rectangular prism. 
	 * 
	 * @param length			The length of the rectangular prism. 
	 * @param width				The width of the rectangular prism. 
	 * @param spaceDiagonal		The space diagonal of the rectangular prism. 
	 * 
	 * @return					The height of the rectangular prism. 
	 */
	public static double getHeight(double length, double width, double spaceDiagonal) {
		return getMissingSide(length, width, spaceDiagonal);
	}
	
	//====================================================================================================
	
	/**
	 * Private method which retrieves the missing side measurement given the space diagonal.
	 * 
	 * @param side1				One of the sides of the rectangular prism. 
	 * @param side2				One of the sides of the rectangular prism. 
	 * @param spaceDiagonal		The space diagonal measurement. 
	 * 
	 * @return					The missing side of the rectangular prism. 
	 */
	private static double getMissingSide(double side1, double side2, double spaceDiagonal) {
		 return Math.sqrt(Math.pow(spaceDiagonal, 2) - Math.pow(side1, 2) - Math.pow(side2, 2));
	}
}