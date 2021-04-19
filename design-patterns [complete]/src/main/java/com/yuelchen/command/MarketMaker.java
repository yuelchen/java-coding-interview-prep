package com.yuelchen.command;

import java.util.LinkedList;
import java.util.Queue;

public class MarketMaker {
	
	/**
	 * The Singleton object for MarketMaker. 
	 */
	public static MarketMaker marketMaker;
	
	//====================================================================================================
	
	/**
	 * A queue of order objects. 
	 */
	private Queue<Order> orders;
	
	//====================================================================================================
	
	/**
	 * Private class constructor.
	 */
	private MarketMaker() {
		this.orders = new LinkedList<>();
	}
	
	//====================================================================================================
	
	/**
	 * Singleton method, returns the MarketMaker object. 
	 * 
	 * @return				A MarketMaker object. 	
	 */
	public static MarketMaker getInstance() {
		if(marketMaker == null) {
			marketMaker = new MarketMaker();
		}
		
		return marketMaker;
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given order to the queue of orders. 
	 * 
	 * @param order			The order to be added. 
	 */
	public void place(Order order) {
		this.orders.add(order);
	}
	
	//====================================================================================================
	
	/**
	 * Removes the given order from the queue of orders if it exists and returns true, 
	 * otherwise returns false. 
	 * 
	 * @param order			The order to be removed. 
	 * 
	 * @return				True if the order was removed, otherwise returns false. 
	 */
	public boolean remove(Order order) {
		if(this.orders.contains(order)) {
			this.orders.remove(order);
			return true;
		}
		
		return false;
	}
	
	//====================================================================================================
	
	/**
	 * Executes all orders in queue and clears it. 
	 */
	public void execute() {
		for(Order order : this.orders) {
			order.execute();
		}
		
		this.orders.clear();
	}
}
