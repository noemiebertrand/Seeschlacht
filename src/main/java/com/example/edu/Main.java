package com.example.edu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Karte.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Seeschlacht");
			primaryStage.setScene(scene);
			primaryStage.show();

			Schiffe test = new Schiffe ();
			test.initializeMap();
			
			//Schiffe point = new Schiffe (0, 0, "bas", 1); 
			
			Schiffe porteAvion = new Schiffe(5, '5');
			Schiffe croiseur = new Schiffe(4, '4');
			Schiffe contreTorpilleur = new Schiffe (3, 'A');
			Schiffe sousMarin = new Schiffe (3, 'B');
			Schiffe torpilleur = new Schiffe (2, '2');

			test.printMap();
			
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
