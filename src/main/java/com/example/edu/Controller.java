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
	 {
		 if (test.map[0][0] == '0') {
	 b00.setStyle("-fx-background-color:#965866;");
		 }
		 else {
			 
		 }
	 }
	}
