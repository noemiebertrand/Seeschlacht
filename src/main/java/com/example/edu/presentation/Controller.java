package com.example.edu.presentation;



import java.io.IOException;


import com.example.edu.domain.Schiffe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.stage.Stage;


public class Controller {
	@FXML
	Label Player1,Player2, Player3;
	@FXML
	Label Score1, Score2, Score3;
	@FXML
	Button Exit;
	@FXML
	TextField EnterName;
	@FXML
	Label coups,GameOver;
	@FXML
	Label lblScore;
	@FXML
	Label WIN;
	@FXML
	Button bouton, restart, Start, Leaderboard;

	@FXML
	private Button b00,b01,b02,b03,b04,b05,b06,b07,b08,b09;
	@FXML
	private Button b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	@FXML
	private Button b20,b21,b22,b23,b24,b25,b26,b27,b28,b29;
	@FXML
	private Button b30,b31,b32,b33,b34,b35,b36,b37,b38,b39;
	@FXML
	private Button b40,b41,b42,b43,b44,b45,b46,b47,b48,b49;
	@FXML
	private Button b50,b51,b52,b53,b54,b55,b56,b57,b58,b59;
	@FXML
	private Button b60,b61,b62,b63,b64,b65,b66,b67,b68,b69;
	@FXML
	private Button b70,b71,b72,b73,b74,b75,b76,b77,b78,b79;
	@FXML
	private Button b80,b81,b82,b83,b84,b85,b86,b87,b88,b89;
	@FXML
	private Button b90,b91,b92,b93,b94,b95,b96,b97,b98,b99;

	Schiffe test = new Schiffe();
	int vie2 = 2, vieA = 3, vieB = 3, vie4 = 4, vie5 = 5;
	@FXML
	Label lblVie2, lblVieA, lblVieB, lblVie4, lblVie5;

	int NbCoups = 0;
	static int score = 0;

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
	public void classement (ActionEvent event) {

		Player[0][0]=Player1;
		Player[1][0]=Player2;
		Player[2][0]=Player3;

		Player[0][1]=Score1;
		Player[1][1]=Score2;
		Player[2][1]=Score3;


		classement[i][0]=EnterName.getText();
		Player[i][0].setText(classement[i][0]);
		System.out.println(i);

		classement[i][1]=lblScore.getText();
		System.out.println(classement[i][1]);
		Player[i][1].setText(classement[i][1]);

		String PlusGrandNom;
		int PlusGrand;
		for (int j=0; j<3; j++) {
			rangement[j][1]= Integer.parseInt(classement[j][1]);}


			if (rangement [2][1]>rangement[1][1]) {
				PlusGrand= rangement [2][1];
				rangement[2][1]=rangement[1][1];
				rangement[1][1]= PlusGrand;
				PlusGrandNom=classement[2][0];
				classement[2][0]=classement[1][0];
				classement[1][0]= PlusGrandNom;}

			if (rangement [1][1]>rangement[0][1]) {
				PlusGrand= rangement [1][1];
				rangement[1][1]=rangement[0][1];
				rangement[0][1]= PlusGrand;
				PlusGrandNom=classement[1][0];
				classement[1][0]=classement[0][0];
				classement[0][0]= PlusGrandNom;}

			if (rangement [2][1]>rangement[1][1]) {
				PlusGrand= rangement [2][1];
				rangement[2][1]=rangement[1][1];
				rangement[1][1]= PlusGrand;
				}

		for (int j=0; j<3; j++) {
			Player[j][0].setText((classement[j][0]));
			Player[j][1].setText(Integer.toString(rangement[j][1]));

		}

		i=i+1;

	}




	@FXML // zur Karte und zum Spiel wechseln
	public void ToKarte (ActionEvent event) throws IOException  {
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
		System.out.println();
	}


	@FXML //
	protected void handleSubmitButtonAction(ActionEvent event) {
		bouton = (Button)event.getSource(); //Ruf nur für das Feld, auf dem man klickt
		if (bouton.getText()!=" " ) { //um zwei Mal auf demselben Feld klicken zu vermeiden
			String nom = bouton.getId(); //bekommt der ID des Felds
			char [] char_variabel = nom.toCharArray(); //der ID (String) wird int

			for (int i = 0; i < nom.length(); i++) {
				Character.getNumericValue(char_variabel[i]);
			}

			int[] int_variabel = new int[nom.length()];

			for (int i = 0; i < nom.length();i++) {
				int_variabel[i] = Character.getNumericValue(char_variabel[i]);
			}


			if (test.map[int_variabel[1]][int_variabel[2]] == '*') {
				bouton.setStyle("-fx-border-color:BLUE; -fx-opacity: 1;");
				bouton.setText(" ");
			}
			else {
				bouton.setStyle("-fx-border-color:RED; -fx-opacity: 1;");
				String empty = bouton.getText();
				Score(); // Ruf für die Punktzahl
				bouton.setText(" "); //das Feld wird markiert, damit man es nicht 2 Mal rufft
				toucher(int_variabel[1],int_variabel[2]);
			}
			CompteCoups(); // Ruf für Rundenzaehler

		}
	}


	public void CompteCoups () {
		WIN.setVisible(false);
		Effect glow = new Glow(1.0);
		NbCoups=NbCoups+1;
		String CoupsJoues = Integer.toString(NbCoups);
		coups.setText(CoupsJoues);

		if (NbCoups >= 35) {
			gameOver();
		}
		if (score == 170) {
			WIN.setEffect(glow);
			WIN.setVisible(true);
			final int a = NbCoups;
			System.out.println(a);
		}

	}

	public void gameOver() {

		Effect glow = new Glow(1.0);
		GameOver.setEffect(glow);
		GameOver.setVisible(true);

		Button [] [] arrayButton = new Button [10] [10];

		Button[] listButton = {
				b00,b01,b02,b03,b04,b05,b06,b07,b08,b09,
				b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,
				b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,
				b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,
				b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,
				b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,
				b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,
				b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,
				b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,
				b90,b91,b92,b93,b94,b95,b96,b97,b98,b99};

		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arrayButton [i][j] = listButton [k];
				k++;
			}

		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				if (test.map[i][j] != '*')	arrayButton[i][j].setStyle("-fx-background-color:ORANGE;");
			}
		}
		Leaderboard.setVisible(true);

	}

	public void Score () {
		score = score + 10;
		String sco = Integer.toString(score);
		lblScore.setText(sco);
	}

	public void toucher(int y, int x) {

		switch(test.map[y][x]) {
		case '2':
			vie2=vie2-1;
			break;
		case 'A':
			vieA=vieA-1;
			break;
		case 'B':
			vieB=vieB-1;
			break;
		case '4':
			vie4=vie4-1;
			break;
		case '5':
			vie5=vie5-1;
			break;
		}

		String vieTorpilleur = Integer.toString(vie2);
		lblVie2.setText(vieTorpilleur);
		String vieContreTorpilleur = Integer.toString(vieA);
		lblVieA.setText(vieContreTorpilleur);
		String vieSousMarin = Integer.toString(vieB);
		lblVieB.setText(vieSousMarin);
		String vieCroiseur = Integer.toString(vie4);
		lblVie4.setText(vieCroiseur);
		String viePorteAvion = Integer.toString(vie5);
		lblVie5.setText(viePorteAvion);
	}

	public void restart (ActionEvent event) throws IOException { // um eine neue Runde zu spielen

		GameOver.setVisible(false); //setzt alle Variabeln um 0 ein
		lblScore.setText("0");
		score=0;
		coups.setText("0");
		NbCoups=0;

		//ladert eine neue Karte

		Button [] [] arrayButton = new Button [10] [10];

		Button[] listButton = {
				b00,b01,b02,b03,b04,b05,b06,b07,b08,b09,
				b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,
				b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,
				b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,
				b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,
				b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,
				b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,
				b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,
				b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,
				b90,b91,b92,b93,b94,b95,b96,b97,b98,b99};

		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				arrayButton [i][j] = listButton [k];
				arrayButton[i][j] .setStyle("-fx-background-color:BLACK;");
				arrayButton[i][j].setText(null);
				k++;
			}
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


	}



}
