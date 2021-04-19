package com.yuelchen.observer;

import java.util.Date;
import java.util.TimeZone;

public class ObserverRemote extends Observer {
	
	/**
	 * Class constructor. 
	 * 
	 * @param subject		The subject to observe.
	 */
	public ObserverRemote(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	//====================================================================================================
	
	/**
	 * Update method.
	 */
	@Override
	public void update() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		System.out.println("Remote [UTC] " + new Date() + ": '" + subject.getMessage() + "'");
	}
}