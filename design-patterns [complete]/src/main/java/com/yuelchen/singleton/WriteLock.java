package com.yuelchen.singleton;

import java.util.ArrayList;
import java.util.List;

public class WriteLock {

	/**
	 * Static instance for this singleton class.
	 */
	private static WriteLock writeLock;
	
	//====================================================================================================
	
	/**
	 * A list of Strings which singleton class manages. 
	 */
	private List<String> ledger;
	
	//====================================================================================================
	
	/**
	 * The number of tasks which was performed since initialization. 
	 */
	private int taskCounter;
	
	//====================================================================================================
	
	/**
	 * Private class constructor.
	 */
	private WriteLock() {
		this.ledger = new ArrayList<>();
		this.taskCounter = 0;
	}
	
	//====================================================================================================
	
	/**
	 * Static method for retrieving WriteLock instance. 
	 * 
	 * Will only initialize the first time only. 
	 * 
	 * @return				A WriteLock object. 
	 */
	public static WriteLock getInstance() {
		if(writeLock == null) {
			writeLock = new WriteLock();
		}
		
		return writeLock;
	}
	
	//====================================================================================================
	
	/**
	 * Adds the given value to the ledger. 
	 * 
	 * @param value			The value to be added to the ledger.
	 */
	public void add(String value) {
		this.taskCounter++;
		
		this.ledger.add(value);
	}
	
	//====================================================================================================
	
	/**
	 * Retrieves and returns whether or not the given value exists in the ledger.
	 *  
	 * @param value			The value to be checked for. 
	 * 
	 * @return				True if the value exists in ledger,
	 * 						otherwise returns false. 
	 */
	public boolean containsValue(String value) {
		this.taskCounter++;
		
		return this.ledger.contains(value);
	}
	
	//====================================================================================================
	
	/**
	 * Determines whether or not the given value exists in the ledger, 
	 * and removes the given value from ledger if found. 
	 * 
	 * @param value			The value to be removed. 
	 */
	public void remove(String value) {
		this.taskCounter++;
		
		if(this.ledger.contains(value)) {
			this.ledger.remove(value);
		}
	}
	
	//====================================================================================================
	
	/**
	 * Returns the number of tasks performed since initialization. 
	 * 
	 * @return				The number of tasks performed. 
	 */
	public int getTaskCounter() {
		return this.taskCounter;
	}
}