package com.yuelchen.command;

public class OrderSell implements Order {

	/**
	 * The trade object for this sell order. 
	 */
	private Trade trade;
	
	//====================================================================================================
	
	/**
	 * Class constructor.
	 * 
	 * @param trade			The trade object. 
	 */
	public OrderSell(Trade trade) {
		this.trade = trade;
	}
	
	//====================================================================================================

	/**
	 * Executes the sell option for trade order. 
	 */
	public void execute() {
		this.trade.sell();
	}
}
