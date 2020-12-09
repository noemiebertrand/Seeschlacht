package com.example.edu.domain;

public class Schiffe {

	int cox, coy;
	String sens;
	int taille;

	public static char [][] map = new char [10][10];

	// default
	public Schiffe() {

	}

	
	//génération manuelle
	public Schiffe(int x, int y, String s, int t) {

		char k = Character.forDigit(t, 10);

		cox = x;
		coy = y;
		
		if (t <= 0) 
			throw new IllegalArgumentException();	
		if (t > 10) 
			throw new IllegalArgumentException();	
		
		if (error2(t) == true){
			System.out.println("crash");
			throw new IllegalArgumentException();
		}
		
		/*if (collision(x, y, s, t) == true) {
			System.out.println("crash");
			throw new IllegalArgumentException();
		}*/

		for ( int i = 0; i < t; i++) {

			map [y][x] = k;

			switch(s)
			{
			case "bas":
				y++;
				break;
			case "haut":
				y--;
				break;
			case "gauche":
				x--;
				break;
			case "droite":
				x++;
				break;
			}
		}


	}

	
	//génération aléatoire
	public Schiffe (int t, char k) {

		if (t <= 0) 
			throw new IllegalArgumentException();	
		if (t > 10) 
			throw new IllegalArgumentException();	
					
		
		boolean error;

		do {

			cox = getFirstSquare();
			coy = getFirstSquare();

			setSens();

			error = error2(t);
			if (error == false) {

				for ( int i = 0; i < t; i++) {

					map [coy][cox] = k;

					switch(sens)
					{
					case "bas":
						coy++;
						break;
					case "haut":
						coy--;
						break;
					case "gauche":
						cox--;
						break;
					case "droite":
						cox++;
						break;
					}
				}
			}

		}while(error == true);

	}

	public int getFirstSquare () {

		int coordinate = (int) (Math.random() * 10 );
		return coordinate;
	}

	public void setSens () {

		int sens = (int) (Math.random()*3);

		switch(sens) {
		case 0:
			this.sens = "gauche";
			break;
		case 1:
			this.sens = "droite";
			break;
		case 2:
			this.sens = "haut";
			break;
		case 3:
			this.sens = "bas";
			break;
		}

	}

	public boolean error2 (int t) {
		
		if ( sens == "bas" && (coy + t) < 10) {
			for (int i = 0; i < t; i++) {
				if (map[coy + i][cox] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist
				}}
			return false;	//Wenn kein Problem
		}
		if ( sens == "haut" && (coy - t) >= 0) {
			for (int i = 0; i < t; i++) {
				if (map[coy - i][cox] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist
				}}
			return false;	//Wenn kein Problem
		}
		if ( sens == "droite" && (cox + t) < 10) {
			for (int i = 0; i < t; i++) {
				if (map[coy][cox + i] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist
				}}
			return false;	//Wenn kein Problem
		}
		if ( sens == "gauche" && (cox - t) >= 0) {
			for (int i = 0; i < t; i++) {
				if (map[coy][cox - i] != '*') {
					return true;	//Wenn das Standort nicht mehr frei ist
				}}
			return false;	//Wenn kein Problem
		}

		return true; 	//Wenn Problem
	}

	public boolean collision (int x, int y, String s, int t) { // diese Methode dient für die manuelle Initialisierung

		for (int i = 1; i < t; i++) {
			if ( s == "bas" && map[y + i][x] != '*') {
				return true;
			}
			if ( s == "haut" && map[y - i][x] != '*') {
				return true;
			}
			if ( s == "droite" && map[y][x + i] != '*') {
				return true;
			}
			if ( s == "gauche" && map[y][x - i] != '*') {
				return true;
			}
		}

		return false;
	}

	public static void initializeMap () {	 //diese Methode füllt das map mit * Zeichnen

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				map [i][j] = '*';
		}

	}

	public static void printMap () { 	//diese Methode gibt das map auf dem Konsole aus
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" " + map [i][j]);
			}
			System.out.println();
		}
	}

}
