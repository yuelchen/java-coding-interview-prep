package com.yuelchen.command;

public class Trade {
	
	/**
	 * The ticker symbol of the stock for this trade. 
	 */
	private String tickerSymbol;
	
	//====================================================================================================
	
	/**
	 * The number of shares for this trade. 
	 */
	private double shares;
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param tickerSymbol		The stock ticker symbol.
	 * @param shares			The number of shares. 
	 */
	public Trade(String tickerSymbol, double shares) {
		this.tickerSymbol = tickerSymbol;
		this.shares = shares;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the ticker symbol of the stock for this trade.
	 *  
	 * @return					The stock ticker symbol. 
	 */
	public String getTickerSymbol() {
		return this.tickerSymbol;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of shares for this trade. 
	 * 
	 * @return					The number of shares. 
	 */
	public double getShares() {
		return this.shares;
	}
	
	//====================================================================================================
	
	/**
	 * Executes this trade as a purchase (buy). 
	 */
	public void buy() {
		System.out.println(String.format("Buying %d shares of %s", this.shares, this.tickerSymbol));
	}
	
	//====================================================================================================
	
	/**
	 * Executes this trade as a sale (sell). 
	 */
	public void sell() {
		System.out.println(String.format("Selling %d shares of %s", this.shares, this.tickerSymbol));
	}
}