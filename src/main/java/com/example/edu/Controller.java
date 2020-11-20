package com.example.edu;

import com.sun.prism.paint.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	private Button b00;
	Schiffe test = new Schiffe();
	
	 @FXML
	 protected void handleSubmitButtonAction(ActionEvent event)
	 { 	 String nom=b00.getId();
		char [] char_variabel = nom.toCharArray();

		for (int i=0;i<nom.length();i++) {
			Character.getNumericValue(char_variabel[i]);}
	 
	 int[] int_variabel = new int[nom.length()];
	 
	 for (int i=0;i<nom.length();i++) {
		 int_variabel[i]=Character.getNumericValue(char_variabel[i]);}

		 if (test.map[int_variabel[1]][int_variabel[2]] == '*') {
	 b00.setStyle("-fx-background-color:#965866;");
		 }
		 else {
			 
		 }
	 }
	 }
