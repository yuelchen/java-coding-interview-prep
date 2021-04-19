package com.yuelchen.observer;

import java.util.Date;
import java.util.TimeZone;

public class ObserverLocal extends Observer {

	/**
	 * Class constructor. 
	 * 
	 * @param subject		The subject to observe.
	 */
	public ObserverLocal(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	//====================================================================================================
	
	/**
	 * Update method. 
	 */
	@Override
	public void update() {
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		System.out.println("Local [UTC] " + new Date() + ": '" + subject.getMessage() + "'");
	}
}