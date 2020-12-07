package com.example.edu.presentation;

import java.io.IOException;

import com.example.edu.domain.Schiffe;
import com.example.edu.presentation.Controller;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LeaderboardController {
	@FXML
	Label Player1,Player2, Player3, Player4, Player5, Player6, Player7, Player8, Player9, Player10;
	@FXML
	Label Score1, Score2, Score3, Score4, Score5, Score6, Score7, Score8, Score9, Score10;
	@FXML
	Button Exit, Restart;
	@FXML
	TextField EnterName;
	@FXML
	Label Score;
	static String classement [][] = new String [10][2];
	Label Player [][] = new Label [10][2];
	static int rangement [][] = new int [10][2];
	int i=0;
	static int points;

	public static String[][] declarationClassement () {
		for (int j=0; j<10; j++) {
			classement[j][0]=" ";
			classement[j][1]="0";}
		return classement;
	}
	public static int[][] declarationRangement () {
		for (int j=0; j<10; j++) {
			for (int k=0; k<2; k++) {
				rangement[j][k]=0;}}
		return rangement;
	}

	@FXML
	public int classement (ActionEvent event) {
		Score.setText(Integer.toString(points));
		System.out.println(points);
		Player[0][0]=Player1;
		Player[1][0]=Player2;
		Player[2][0]=Player3;
		Player[3][0]=Player4;
		Player[4][0]=Player5;
		Player[5][0]=Player6;
		Player[6][0]=Player7;
		Player[7][0]=Player8;
		Player[8][0]=Player9;
		Player[9][0]=Player10;

		Player[0][1]=Score1;
		Player[1][1]=Score2;
		Player[2][1]=Score3;
		Player[3][1]=Score4;
		Player[4][1]=Score5;
		Player[5][1]=Score6;
		Player[6][1]=Score7;
		Player[7][1]=Score8;
		Player[8][1]=Score9;
		Player[9][1]=Score10;


		classement[i][0]=EnterName.getText();
		Player[i][0].setText(classement[i][0]);
		System.out.println(i);

		classement[i][1]=Score.getText();
		System.out.println(classement[i][1]);
		Player[i][1].setText(classement[i][1]);

		int PlusGrand;
		for (int j=0; j<10; j++) {
			rangement[j][1]= Integer.parseInt(classement[j][1]);}
		for (int k=0; k<i; k++) {
			for (int j=1; j<10; j++) {
				if (rangement [j][1]>rangement[j-1][1]) {
					PlusGrand= rangement [j][1];
					rangement[j][1]=rangement[j-1][1];
					rangement[j-1][1]= PlusGrand;
				}
			}
		}


		for (int j=0; j<10; j++) {
			Player[j][1].setText(Integer.toString(rangement[j][1]));
		}

		i=i+1;

		return i;
	}

	public void ToKarte (ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Karte.fxml"));
		Scene scene = new Scene(root);
		Stage primaryStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
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
	}

	public void Exit () {
			Platform.exit();
	}


	public static  int getScore(int score) {
		points= Controller.score;

		return points;

	}
}
