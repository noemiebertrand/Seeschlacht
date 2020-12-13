package com.example.edu.domain;

public class Schiffe {

	int cox, coy;	//Koordinaten in den Matrix-Karte
	String sens;	//Richtung von Schiffen 
	

	public static char [][] map = new char [10][10]; //Matrix-Karte 
	
	//manuelle Schifferzeugung
	public Schiffe(int x, int y, String s, int t) {

		char k = Character.forDigit(t, 10);	//Zeichnen, um das Schiffstandort in dem Matrix-Karte zu speichern
		
		if (t <= 0) 
			throw new IllegalArgumentException();	//Wenn Schiffe kleiner als 1, dann schickt IllegalArgumentException
		if (t > 10) 
			throw new IllegalArgumentException();	//Wenn Schiffe größer als 10, dann schickt IllegalArgumentException

		for ( int i = 0; i < t; i++) {	

			map [y][x] = k;		//Einspeicherung des Schiffstandorts

			switch(s)			
			{
			case "bottom":		
				y++;
				break;
			case "high":
				y--;
				break; 
			case "left":
				x--;
				break;
			case "right":
				x++;
				break;
			}
		}
		
		if (error2(t) == true){	//Wenn Kollision gibt oder das Schiffe außerhalb des Matrix-Karte ist, dann schickt IllegalArgumentException
								//hire würde die Kollision getestet
			System.out.println("crash");
			printMap();
			throw new IllegalArgumentException();
		}

	}

	
	//zufällige Schifferzeugung
	public Schiffe (int t, char k) {	

		if (t <= 0 || t > 10) 
			throw new IllegalArgumentException();	//Wenn Schiffe kleiner als 1 oder größer als 10, dann schickt IllegalArgumentException
					
		boolean error;	

		do {

			cox = getFirstSquare();		//set cox Betrag zwischen 0 und 9
			coy = getFirstSquare();		//set coy Betrag zwischen 0 und 9
										//cox und coy sind die Koordinaten von dem ersten Feld 
			setSens();					//set eine zufällige Richtung 

			error = error2(t);		//error2() prüft, ob kein Kollision gibt oder das Schiffe außerhalb des Matrix-Karte ist
									//true heißt "es gibt mindestens ein Problem", false heißt "ist gut"
			if (error == false) {	//Die Speicherung soll laufen, nur wenn kein Problem gibt
									//sonst wird die nicht gewünschten Schiffe speichern

				for ( int i = 0; i < t; i++) {

					map [coy][cox] = k;	//Einspeicherung des Schiffstandorts

					switch(sens)
					{
					case "bottom":
						coy++;
						break;
					case "high":
						coy--;
						break;
					case "left":
						cox--;
						break;
					case "right":
						cox++;
						break;
					}
				}
			}

		}while(error == true);	//Wenn error ist true, dann ist diese Schiffe nicht gespeichert und erzeugt ein neue
								//Wenn error ist false, dann ist das Schiffe erzeugt 

	}

	public int getFirstSquare () { //gibt eine zufällige Betrag von 0 bis 9 

		int coordinate = (int) (Math.random() * 10 );
		return coordinate;
	}

	public void setSens () {	//gibt eine zufällige Richtung

		int sens = (int) (Math.random()*3);

		switch(sens) {
		case 0:
			this.sens = "left";
			break;
		case 1:
			this.sens = "right";
			break;
		case 2:
			this.sens = "high";
			break;
		case 3:
			this.sens = "bottom";
			break;
		}

	}

	public boolean error2 (int t) {
		
		if ( sens == "bottom" && (coy + t) < 10) {
			for (int i = 0; i < t; i++) {
				if (map[coy + i][cox] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist, also Kollision
				}}
			return false;	//Wenn kein Problem
		}
		if ( sens == "high" && (coy - t) >= 0) {
			for (int i = 0; i < t; i++) {
				if (map[coy - i][cox] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist, also Kollision
				}}
			return false;	//Wenn kein Problem
		}
		if ( sens == "right" && (cox + t) < 10) {
			for (int i = 0; i < t; i++) {
				if (map[coy][cox + i] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist, also Kollision
				}}
			return false;	//Wenn kein Problem
		}
		if ( sens == "left" && (cox - t) >= 0) {
			for (int i = 0; i < t; i++) {
				if (map[coy][cox - i] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist, also Kollision
				}}
			return false;	//Wenn kein Problem
		}

		return true; 	//Wenn Problem, also das Schiffe ist außerhalb von der Karte
	}

	public static void initializeMap () {	 //diese Methode füllt das Matrix-Karte mit * Zeichnen

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				map [i][j] = '*';
		}

	}

	public static void printMap () { 	//diese Methode gibt das Matrix-Karte auf dem Konsole aus
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" " + map [i][j]);
			}
			System.out.println();
		}
	}


	public static char[][] getMap() {
		return map;
	}
	
	
	
}
