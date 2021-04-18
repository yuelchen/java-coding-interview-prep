package com.yuelchen.billing;

public class Sale {

	/**
	 * Retrieves and returns the discount amount to be deducted from sale price. 
	 * 
	 * @param originalPrice		The original price. 
	 * @param discountRate		The discount rate. 
	 * 
	 * @return					The discount amount. 
	 */
	public static double getDiscountAmount(double originalPrice, int discountRate) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the sale price after discount is applied. 
	 * 
	 * @param originalPrice		The original price. 
	 * @param discountRate		The discount rate. 
	 * 
	 * @return					The price after discount. 
	 */
	public static double getSalePriceAfterDiscount(double originalPrice, int discountRate) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the discount rate based off the original price and 
	 * the final price after discount is applied. 
	 * 
	 * @param originalPrice		The original price. 
	 * @param discountPrice		The price after discount. 
	 * 
	 * @return					The discount rate. 
	 */
	public static int getDiscountRate(double originalPrice, double discountPrice) {
		// insert code below this line
		
		return -1;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the commission amount (cost) for making the sale. 
	 * 
	 * @param price				The original sale price. 
	 * @param commissionRate	The commission rate for sale. 
	 * 
	 * @return					The commission amount (cost) for making the sale. 
	 */
	public static double getCommissionAmount(double price, int commissionRate) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the amount gained after deduction of commission. 
	 * 
	 * @param price				The original sale price. 
	 * @param commissionRate	The commission rate for sale. 
	 * 
	 * @return					The amount gained after deduction of commission. 
	 */
	public static double getRevenueAfterCommission(double price, int commissionRate) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the commission rate based off the original sale price and 
	 * the final revenue gained after commission is deducted. 
	 * 	
	 * @param originalPrice		The original sale price. 
	 * @param revenue			The amount gained after deduction of commission. 
	 * 
	 * @return					The commission rate. 
	 */
	public static int getCommissionRate(double originalPrice, double revenue) {
		// insert code below this line
		
		return -1;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the tip amount. 
	 * 
	 * @param total				The total bill (without tip). 
	 * @param tipRate			The tip rate. 
	 * 
	 * @return					The tip amount.
	 */
	public static double getTipAmount(double total, int tipRate) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns the total bill including tip.
	 * 
	 * @param total				The total bill (without tip). 
	 * @param tipRate			The tip rate. 
	 * 
	 * @return					The total bill (with tip).
	 */
	public static double getTotalAfterTip(double total, int tipRate) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the tip rate based off original total and final total. 
	 * 
	 * @param originalTotal		The total bill (without tip). 
	 * @param totalAfterTip		The total bill (with tip).
	 * 
	 * @return					The tip rate. 
	 */
	public static int getTipRate(double originalTotal, double totalAfterTip) {
		// insert code below this line
		
		return -1;	// placeholder return
	}
	
	//====================================================================================================

	/**
	 * Retrieves and returns the total bill for each person by splitting the total (including tip) evenly.
	 * 
	 * @param total				The total bill (without tip).
	 * @param tipRate			The tip rate to be applied before split. 
	 * @param split				The number of people splitting the total bill. 
	 * 
	 * @return					The total bill for each person. 
	 */
	public static double getSplitAfterTip(double total, int tipRate, int split) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
	
	//====================================================================================================
	
	/**
	 * Private method to round the given amount to the hundredths decimal place.
	 * 
	 * @param amount			The amount to round.
	 * 
	 * @return					The rounded amount to the hundredths decimal place.
	 */
	private static double rounded(double amount) {
		// insert code below this line
		
		return 0.0;	// placeholder return
	}
}