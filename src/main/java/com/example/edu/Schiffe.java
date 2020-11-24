package com.example.edu;

public class Schiffe {
	
	int cox, coy;
	String sens;
	int taille;

	static char [][] map = new char [10][10];

	public static void main (String[] args) {

		initializeMap();

		//exemple génération manuelle
		//Schiffe porteAvion = new Schiffe(3, 2, "droite", 5);
		//Schiffe croiseur = new Schiffe( 5, 6, "haut", 4);
		//Schiffe contreTorpilleur = new Schiffe (2, 5, "haut", 3);
		//Schiffe sousMarin = new Schiffe (3, 9, "gauche", 3);
		//Schiffe torpilleur = new Schiffe (0, 0, "bas", 2);

		//Schiffe point = new Schiffe (0, 0, "bas", 1); // sert à tester
		
		//exemple génération auto
		Schiffe porteAvion = new Schiffe(5, '5');
		Schiffe croiseur = new Schiffe(4, '4');
		Schiffe contreTorpilleur = new Schiffe (3, 'A');
		Schiffe sousMarin = new Schiffe (3, 'B');
		Schiffe torpilleur = new Schiffe (2, '2');

		printMap();
	}

	// default
	public Schiffe() {
		
	}
	
	//génération manuelle
	public Schiffe(int x, int y, String s, int t) {
		
		char k = Character.forDigit(t, 10);
		
		if (collision(x, y, s, t) == true) System.out.println("collision");

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

		boolean error;
		
		do {

			cox = firstCase();
			coy = firstCase();

			setSens();

			System.out.println((cox + 1) + ", " + (coy +1) + ", " + this.sens + ", " + t);

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

	public int firstCase () {

		int coordonné = (int) (Math.random() * 10 );
		return coordonné;
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
					System.out.println("collision");
					return true;
				}}
			return false;
		}
		if ( sens == "haut" && (coy - t) >= 0) {
			for (int i = 0; i < t; i++) {
				if (map[coy - i][cox] != '*') {
					System.out.println("collision");
					return true;
				}}
			return false;
		}
		if ( sens == "droite" && (cox + t) < 10) {
			for (int i = 0; i < t; i++) {
				if (map[coy][cox + i] != '*') {
					System.out.println("collision");
					return true;
				}}
			return false;
		}
		if ( sens == "gauche" && (cox - t) >= 0) {
			for (int i = 0; i < t; i++) {
				if (map[coy][cox - i] != '*') {
					System.out.println("collision");
					return true;
				}}
			return false;
		}

		System.out.println("problème");
		return true;
	}

	public boolean collision (int x, int y, String s, int t) {

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

	public static void initializeMap () {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				map [i][j] = '*';
		}

	}

	public static void printMap () {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" " + map [i][j]);
			}
			System.out.println();
		}
	}

}
