package com.java.main;

import java.util.Timer;

/**
 * 
 * @author Tharindu Hirantha
 */

//Main class
public class MainRunRead {
	public static void main(String args[]) throws InterruptedException {

		Timer time = new Timer();
		DataGet st = new DataGet();
		time.schedule(st,0, 1000);
	}
}