package com.hazelcast.aws;

import java.util.Timer;

/**
 * 
 * @author Tharindu Hirantha
 */

//Main class
public class MainRun {
	public static void main(String args[]) throws InterruptedException {
		
		String mode = args[0];
		Timer time = new Timer();
		
		if(mode.equals("insert")) {
			System.out.println("Running on INSERT mode");
			DataPut st = new DataPut();
			time.schedule(st,0, 5000);

		} else {
			System.out.println("Running on READ mode");
			DataGet st = new DataGet();
			time.schedule(st,0, 1000);
		}
		

		
		

	}
}