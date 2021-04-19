package com.yuelchen.command;

public class OrderBuy implements Order {

	/**
	 * The trade object for this buy order. 
	 */
	private Trade trade;
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param trade			The trade object. 
	 */
	public OrderBuy(Trade trade) {
		this.trade = trade;
	}
	
	//====================================================================================================

	/**
	 * Executes the buy option for trade order. 
	 */
	public void execute() {
		this.trade.buy();
	}
}
