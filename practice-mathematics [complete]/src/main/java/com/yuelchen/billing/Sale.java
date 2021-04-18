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
		return rounded(originalPrice * ((double) discountRate / 100));
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
		return rounded(originalPrice - getDiscountAmount(originalPrice, discountRate));
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
		return (int) rounded(((originalPrice - discountPrice) / originalPrice) * 100);
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
		return rounded(getDiscountAmount(price, commissionRate));
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
		return rounded(price - getCommissionAmount(price, commissionRate));
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
		return (int) rounded(((originalPrice - revenue) / originalPrice) * 100);
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
		return rounded(getDiscountAmount(total, tipRate));
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
		return rounded(total + getTipAmount(total, tipRate));
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
		return (int) rounded(((totalAfterTip - originalTotal) / originalTotal) * 100);
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
		if(split > 0) {
			return rounded(getTotalAfterTip(total, tipRate) / split);
		}
		
		return getTotalAfterTip(total, tipRate);
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
		return Math.round(amount * 100.00) / 100.00;
	}
}