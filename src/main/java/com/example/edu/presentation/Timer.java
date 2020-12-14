package com.example.edu.presentation;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

class Timer implements Runnable { 

	@FXML
	boolean timerStats;
	@FXML
	String time;
	@FXML
	int timersec, timermin, timerhr, scoretime;

	@FXML
	String seconds, minutes, hours;

	@FXML
	Label lblSeconds, lblMinutes, lblHours;
	private volatile boolean exit = false; 
	Boolean timerFirst = false;
	public void run() { 
		
		while(!exit)
		{ 
			
			
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			timersec++;
			
			if (timersec == 1 && timerFirst == false) {
				timerFirst = true;
				scoretime = 650;
			}
			scoretime = scoretime - 1;

			if (timersec == 60) 
			{ 
				timersec = 0; 
				timermin++; 
			} 
			if (timermin == 60) 
			{ 
				timermin = 0; 
				timerhr++; 
			} 

			seconds = Integer.toString(timersec); 
			minutes = Integer.toString(timermin); 
			hours = Integer.toString(timerhr); 

			if (timersec <= 9) { 
				seconds = "0" + Integer.toString(timersec); 
			} 
			if (timermin <= 9) { 
				minutes = "0" + Integer.toString(timermin); 
			} 
			if (timerhr <= 9) { 
				hours = "0" + Integer.toString(timerhr); 
			} 

			time = (hours + ":" + minutes +":"+ seconds); 
			System.out.println(scoretime);
			//Label lbltime = new Label();
			//lbltime.setText(time);
			//lblSeconds.setText(seconds);
			//lblMinutes.setText(minutes);
			//lblHours.setText(hours);
			System.out.println(time);
		} 
		timersec = 0;
		timermin = 0;
		timerhr = 0;

	} 
	public static void stop(){ 
		boolean exit = true;
	} 
}