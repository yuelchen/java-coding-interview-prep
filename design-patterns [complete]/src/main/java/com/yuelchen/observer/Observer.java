package com.yuelchen.observer;

public abstract class Observer {
	
	/**
	 * The subject. 
	 */
	protected Subject subject;
	
	//====================================================================================================
	
	/**
	 * The update method for when observer get notified. 
	 */
	public abstract void update();
}