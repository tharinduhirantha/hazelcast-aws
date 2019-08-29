package com.java.main;

import java.util.TimerTask;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Date;
/**
 * 
 * @author Tharindu Hirantha
 */
public class DataGet extends TimerTask {

	Date now; 
	HazelcastInstance hz = Hazelcast.newHazelcastInstance();
	public void run() {
		now = new Date(); // initialize date
    	IMap<String, String> data = hz.getMap("data");
	    System.out.println("No of records: " + data.size());
	}
}