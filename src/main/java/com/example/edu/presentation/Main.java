package com.example.edu.presentation;

import java.io.File;
import java.io.FileInputStream;

import com.example.edu.domain.Schiffe;
import com.example.edu.presentation.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;



public class Main extends Application {
	boolean start=false;

	@Override
	public void start(Stage primaryStage) {
		try {
			Font myFont = null;

			myFont = Font.loadFont(new FileInputStream(new File("src/main/resources/com/example/edu/presentation/Connection-arMJ.otf")), 10);
			Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
			//Parent root = FXMLLoader.load(getClass().getResource("Karte.fxml"));

			Controller.declarationClassement ();
			Controller.declarationRangement ();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Seeschlacht");
			primaryStage.setScene(scene);
			primaryStage.show();

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
