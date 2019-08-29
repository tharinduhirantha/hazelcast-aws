package com.java.main;

import java.util.Timer;

/**
 * 
 * @author Tharindu Hirantha
 */

//Main class
public class MainRunInsert {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer();
		DataPut st = new DataPut();
		time.schedule(st,0, 5000);

	}
}