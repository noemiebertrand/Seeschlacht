package com.example.edu;

import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;



public class Main extends Application {
	boolean start=false;

	@Override
	public void start(Stage primaryStage) {
		try {
			Font myFont = null;
			myFont = Font.loadFont(new FileInputStream(new File("src/main/resources/com/example/edu/Connection-arMJ.otf")), 10);

			Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Seeschlacht");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace() ;
		}
	}

	public static void main(String[] args) {		launch(args);
	}
}
