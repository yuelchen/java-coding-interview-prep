package com.yuelchen.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	/**
	 * A list of observers. 
	 */
	private List<Observer> observers;
	
	//====================================================================================================
	
	/**
	 * The message which all observers will be notified with. 
	 */
	private String message;
	
	//====================================================================================================
	
	/**
	 * Class constructor (default).
	 */
	public Subject() {
		this.observers = new ArrayList<>();
		this.message = "Hello!";
	}
	
	//====================================================================================================
	
	/**
	 * Class constructor. 
	 * 
	 * @param message		The message which all observers will be notified with. 
	 */
	public Subject(String message) {
		this.observers = new ArrayList<>();
		this.message = message;
	}
	
	//====================================================================================================
	
	/**
	 * Returns the message which all observers will be notified with. 
	 * 
	 * @return				The message. 
	 */
	public String getMessage() {
		return this.message;
	}
	
	//====================================================================================================
	
	/**
	 * Sets the message which all observers will be notified with. 
	 * 
	 * @param message		The message. 
	 */
	public void setMessage(String message) {
		this.message = message;
		this.notifyAllObservers();
	}
	
	//====================================================================================================
	
	/**
	 * Attach an observer to subject (adds the given observer to the list of observers). 
	 * 
	 * @param observer		The observer to be added. 
	 */
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	//====================================================================================================
	
	/**
	 * Detach an observer from subject (removes the given observer from the list of observers). 
	 * 
	 * @param observer		The observer to be removed. 
	 */
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	//====================================================================================================
	
	/**
	 * Notifies all observers by invoking their update method. 
	 */
	public void notifyAllObservers() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}
}