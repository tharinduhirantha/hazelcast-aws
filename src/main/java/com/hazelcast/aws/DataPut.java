package com.hazelcast.aws;

import java.util.TimerTask;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Date;
/**
 * 
 * @author Tharindu Hirantha
 */
public class DataPut extends TimerTask {

	Date now; 
	HazelcastInstance hz = Hazelcast.newHazelcastInstance();
	public void run() {
		now = new Date();
    	IMap<String, String> data = hz.getMap("data");
	    data.put(now.toString(), "Data");
	    System.out.println("READ: No of records: " + data.size());
	}
}