# Seeschlacht

  Inhaltsverzeichnis
  ---
  <nav>
  
  1. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#einleitung">Einleitung</a>
  
  2. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#ziel">Ziel</a>
  
  3. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#randbedingungen">Randbedingungen</a>
  
  4. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#build-anleitung">Build-Anleitung</a>
  
  5. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#bedienungsanleitung">Bedienungsanleitung</a>
  
  6. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#user-stories">User Stories</a>
  
        * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#task">Task</a>
   
  7. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#release-plan">Release Plan</a>
  
  8. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#dokumentation-sprint-1">Dokumentation Sprint 1</a>
  
        *  <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#taskliste-sprint-1">Taskliste</a>
	 * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#code-snippets-sprint-1">Code Snippets</a>
	 
  9. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#dokumentation-sprint-2">Dokumentation Sprint 2</a>
  
  	 * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#taskliste-sprint-2">Taskliste</a>
	 * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#code-snippets-sprint-2">Code Snippets</a>
   	 * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#uml-package-klassen--und-sequenzdiagramm">UML Package, Klassen- und Sequenzdiagramm</a>
  	 * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#herleitung-der-testf%C3%A4lle-aus-den-akzeptanzkriterien-der-user-stories">Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories</a>
	 * <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#kumulierter-flux-diagramm">kumulierter Flux-diagramm</a>
	 
  </nav>
  
  Einleitung 
  ---
Mit diesem Programm wollen wir Seeschlacht spielen können. Wir wollen unsere eigene Version des Spiels programmieren, also mit zusätzlichen Optionen wie zum beispiel die Punktzahl berechnen um einen Leaderboard zu erstellen, oder auch die restliche  Anzahl der Schläge. In unserer Version gibt es nur einen Spieler, nicht 2 wie üblich. Der Spieler soll so schnell wie möglich auf dem User Interface die Schiffe des Computers finden, die zufällig erzeugt werden. Aber die Rundenanzahl ist begrenzt, damit man nicht einfach alle Felder anklicken kann, um schnell fertig zu werden. Alle Informationen werden auf dem User Interface gezeigt.

  Ziel  
  ---
Unsere Ziele während dem Projekt waren, die in den Fächer erlernten Kompetenzen in Java und Javafx anhand des Projekt Seeschlacht umzusetzen. Wir wollen ein Spiel gegen den Computer spielen und raten, wo seine Schiffe sind. Der Computer generiert zufällig, wo die Schiff sich befinden. Der Spieler kann die Karte immer sehen und ein Feld anklicken, um es auszuwählen. Es soll dann nach dem Ergebnis gefärbt werden (“nichts” oder “getroffen”). Der Administrator kann mit einem geheimen Code sehen, wo die Schiffe waren. Um zu gewinnen, hat der Spieler eine beschränkte Zahl von Runden. Auf dem User Interface wird die Punktzahl und die verbleibenden Schiffe gezeigt. Je weniger Runden der Spieler gebraucht hat ,desto mehr Punkte gibt es. Am Ende des Spiels kann er seinen Namen schreiben, um es in einen Leaderboard zu sehen. Falls er irgendwann den Spiel neu starten will, kann er auf einen Knopf drücken.

  Randbedingungen 
  ---
Nur der Spieler ratet wo die Schiffe des Computers sind, die zufällig gesetzt werden. 

  Build-Anleitung
  ---

  1. Versichern Sie, dass Sie Eclipse oder IntelliJ bereits installiert haben.
  2. Laden Sie die Dateien (.zip) von unserem Repository runter.
  3. Entpacken Sie die Dateien in Ihrem gewünschten Ordner.
  4. Öffnen Sie Ihren Terminal. 
  5. Schreiben "java -jar shade/Seeschlacht.jar".
  6. Viel Spaß !
  
  Bedienungsanleitung
  ---

  * Sie können die Regeln <sup id="ap1"> <a href="#nt1">1</a></sup> lesen oder verwerfen.
  * Nach der Offnung des Programms:
  * Clicken Sie auf "Start".
  
  ![Start](https://user-images.githubusercontent.com/73901029/102114373-65178e80-3e3a-11eb-84d2-02ab49d19dfa.png)
  ![Pas modif](https://user-images.githubusercontent.com/73901029/102114501-909a7900-3e3a-11eb-970c-3c5daea81fa8.png)
  
  * Raten Sie, wo die Schiffe zufällig erstellt würden. Sie haben 35 Runden, um alle Schiffe zu versenken, sonst haben Sie verloren.
  
  ![1Partie GO](https://user-images.githubusercontent.com/73901029/102114401-6e086000-3e3a-11eb-9184-ab2316abea9f.png)
  ![Win MaxPts](https://user-images.githubusercontent.com/73901029/102114602-ad36b100-3e3a-11eb-8b7e-086d13ffa775.png)
  
  * Am Ende können Sie ihren Name eingeben, damit ein Leaderboard erstellt werden kann.
  
  ![3Partie GO](https://user-images.githubusercontent.com/73901029/102114437-7c567c00-3e3a-11eb-8915-408300cfdbaa.png)
  
  * Dann können Sie ein neues Spiel mit dem Knopf "Restart" erstellen.
  
  ![restart 2Partie](https://user-images.githubusercontent.com/73901029/102114526-998b4a80-3e3a-11eb-894d-4adeca63a60f.png)
  
  User Stories
  ---
| Numero  | Titel | User Story | Story Points | Priorität | Beschreibung |
|:-:| :-: |-|:-:|:-:|-|
| 1 | Ohne Probleme laufen | Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können | 5 | 1 | Angenommen das Programm wurde korrekt kompiliert, wenn das Programm läuft, dann möchte ich das keine Bugs auftreten |
| 2 | Schiff standort | Als Administrator möchte ich den Standort von den Schiffen sehen, um zu wissen ob die Schiffe korrekt vom Programm Platziert wurden | 2 | 3 | Angenommen das programm hat Schiffe generiert und auf die Felder gestellt, wenn ein geheimcode eingeben wird, dann erscheinen die Standorte der Schiffe.  |
| 3 | Spiel beginnen | Als Spieler möchte ich das Programm beginnen können, um das Spiel zu spielen. | 1 | 2 | Angenommen das Programm wurde gestartet, wenn ich auf den startknopf drücke, dann startet sich das Spiel |
| 4 | Karte anzeigen | Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln. | 5 | 1 | Angenommen das Programm hat die Karte generiert,  wenn ich eine Feld anklicke, dann muss er die neue Karte generieren |
| 5 | Namen eingeben | Als Spieler möchte ich meinen Namen eintragen, um mein Score in einen Leaderboard zu speichern | 3 | 3 | Angenommen ein Spieler hat das Programm begonnen, wenn der Spieler wechselt, dann sind verschiedene Infos gespeichert |
| 6 | Meine informationen | Als Spieler möchte ich Informationen wie die Punktzahl und den Leaderboard sehen, um meine Punkte zu verstehen | 5 | 3 | Angenommen der Spieler hat das Spiel begonnen, wenn man auf das Scoreboard schaut, dann sieht man die Punkte und das Leaderboard |
| 7 | Neue Spiel starten | Als Spieler auf einem Knopf drücken um das  Spiel neu zu starten  | 2 | 2 | Angenommen ein Versuch wurde bereits durchgeführt, wenn man auf einem Taste drückt, dann erscheint die Option eines neuen Versuches |
| 8 | Spiel beenden | Als Spieler möchte ich das Ergebnis des Spiels sehen und danach es schliessen. | 3 | 2 | Angenommen des Spiels wurde beendet, entsprechend des Ergebnisses soll das Programm “Game Over” oder “Win” generieren. |

  Task
  ---

| User Story 1 | Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können  | Schatzungen |
|-|-|-|
| Task 1 | Spiel starten | 1 Stunde |
| Task 2 | Spiel debuguen | 10 Stunden |
| Task 3 | Testen der Umsetzung | 3 Stunden |

|User Story 2 | Als Administrator möchte ich den Standort von den Schiffen sehen, um zu wissen ob die Schiffe korrekt vom Programm Platziert wurden | Schatzungen |
|-|-|-|
| Task 1 | Schiffe generieren | 5 Stunden |
| Task 2 | Schiffstandort ausgeben| 1 Stunde |
| Task 3 | Code eingabe um die Lösung der Karte auf der Konsole zu sehen | 1 Stunde |
| Task 4 | Testen der Umsetzung | 3 Stunden |

|User Story 3 | Als Spieler möchte ich das Programm beginnen können, um das Spiel zu spielen | Schatzungen |
|-|-|-|
| Task 1 | Start Knopf um das Spiel zu Spielen | 1 Stunde |
| Task 2 | Design ( Hintergrundbild + Autoren + Titel ) | 2 Stunden 30 Minuten |
| Task 3 | Testen der Umsetzung | 3 Stunden |

| User Story 4 | Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln | Schatzungen |
|-|-|-|
| Task 1 | Design der interaktiven Karte | 6 Stunden |
| Task 2 | Controller schreiben | 13 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Testen der Umsetzung | 3 Stunden |

|User Story 5 | Als Spieler möchte ich meinen Namen eintragen, um mein Score in einen Leaderboard zu speichern | Schatzungen |
|-|-|-|
| Task 1 | Text Field erstellen um den namen einzugeben | 2 Stunden |
| Task 2 | Die eingaben nach dem Score sortieren ( abnehmend ) | 5 Stunden |
| Task 3 | Design des Leaderboards | 2 Stunden |
| Task 4 | Testen der Umsetzung | 3 Stunden |

|User Story 6 | Als Spieler möchte ich Informationen wie die Punktzahl und den Leaderboard sehen, um meine Punkte zu verstehen | Schatzungen |
|-|-|-|
| Task 1 | Label für die Punktzahl erstellen |  15 Minuten |
| Task 2 | Punktzahl rechnen | 2 Stunden |
| Task 3 | Tabelle für den Leaderboard erstellen | 1 Stunden |
| Task 4 | Testen der Umsetzung | 3 Stunden |

| User Story 7 | Als Spieler auf einem Knopf drücken um das Spiel neu zu starten | Schatzungen |
|-|-|-|
| Task 1 | Design des Knopfs | 1 Stunde |
| Task 2 | Controller schreiben | 4 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Farbe der Knopfe, der Score und die getroffene Schiffe werden reinitializiert und eine neue Karte wird erstellt | 2 Stunden |
| Task 5 | Testen der Umsetzung | 3 Stunden |

|User Story 8 | Als Spieler möchte ich das Ergebnis des Spiels sehen und danach es schliessen | Schatzungen |
|-|-|-|
| Task 1 | "GAME OVER"/"WIN" am ende des Spiels anzeigen | 1 Stunde |
| Task 2 | Leaderboard aktualisieren | 3 Stunden |
| Task 3 | Lösung der Karte anzeigen | 3 Stunden |
| Task 4 | Testen der Umsetzung | 3 Stunden |

  Release Plan
  ---
| Iteration 1 | Iteration 2 |
|-|-|
| User Story 2 | User Story 1 |
| User Story 3 | User Story 5 |
| User Story 4 | User Story 6 | 
| User Story 7 | |
| User Story 8 | |
| Velocity 13 | Velocity 13 | 

  Dokumentation Sprint 1
  ---
  
  #### Taskliste Sprint 1
    
  | Nummer | User Story | Schätzung |
  |:-:|:-:|-:|
  | 2 | Schiff Standort | 6 Stunden |
  | 3 | Spiel beginnen | 5 Stunden |
  | 4 | Karte anzeigen | 20 Stunden |
  | 7 | Neue Spiel starten | 9 Stunden |
  | 8 | Spiel beenden und Score anzeigen | 10 Stunden |

  **UML Package, Klassen- und Sequenzdiagramm**
  
  (steht vollständig in dem 2. Sprint)
  
  #### Code Snippets Sprint 1
  
  Wir haben ein Konstruktor gemacht, um die zufällige Schiffe zu schaffen.
  
  ```Javascript
  public Schiffe (int t, char k) {
 	if (t <= 0 || t > 10) throw new IllegalArgumentException();	
						//Wenn Schiffe kleiner als 1 oder größer als 10, dann schickt IllegalArgumentException
	boolean error;
	do {
		cox = getFirstSquare();		//set cox Betrag zwischen 0 und 9
		coy = getFirstSquare();		//set coy Betrag zwischen 0 und 9
						//cox und coy sind die Koordinaten von dem ersten Feld 
		setSens();			//set eine zufällige Richtung 
		error = error2(t);		//error2() prüft, ob kein Kollision gibt oder das Schiffe außerhalb des Matrix-Karte ist
						//true heißt "es gibt mindestens ein Problem", false heißt "ist gut"
		if (error == false) {		//Die Speicherung soll laufen, nur wenn kein Problem gibt
						//sonst wird die nicht gewünschten Schiffe speichern
		for ( int i = 0; i < t; i++) {
			map [coy][cox] = k;	//Einspeicherung des Schiffstandorts
			switch(sens){
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
		}while(error == true);		//Wenn error ist true, dann ist diese Schiffe nicht gespeichert und erzeugt ein neue
						//Wenn error ist false, dann ist das Schiffe erzeugt 
	}
  ```

  Dokumentation Sprint 2
  ---
  
  #### Taskliste Sprint 2
  
  | Nummer | User Story | Schätzung |
  |:-:|:-:|-:|
  | 1 | Ohne Probleme laufen | 14 Stunden |
  | 5 | Namen eingeben | 12 Stunden |
  | 6 | Meine informationen | 9 Stunden |
  
  
  #### UML Package, Klassen- und Sequenzdiagramm
  
   * Package diagramm:
  
  
  ![image](https://user-images.githubusercontent.com/73692178/101378725-be6c4480-38b3-11eb-8d9b-5d64f59b6efc.png)

   * Klassendiagramm:
  
  ![Klassendiagramm](https://user-images.githubusercontent.com/73692178/102008291-aec78280-3d2f-11eb-9aec-dd639838786f.png)
  
   * Sequenz diagramm:
  
  ![Sequenzdiagramm](https://user-images.githubusercontent.com/73692178/101989287-a58ed500-3c9f-11eb-97c5-05c02676f485.png)
  
  #### Code Snippets Sprint 2
  
  ```Javascript
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
			rangement[j][1]= Integer.parseInt(classement[j][1]);
			}
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
  ```
  
  #### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories
  
  **JUnit:**
  
   * Klasse SchiffeTest: 
  
  ```Javascript
  	
public class SchiffeTest {
	Schiffe op;
	int counter = 0;
	int t = (int)(Math.random() * 10 + 1);

	@Before
	public void setUp() throws Exception {
		
		op.initializeMap();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				assertSame('*', op.map [i][j]);
			}
		}
		op = new Schiffe(t, 'X');
		
	}
	
	@Test
	public void testShipSize() throws Exception{
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (op.map [i][j] == 'X') counter++;	
			}
		}
		assertEquals(t, counter);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCrash() throws Exception{
		Schiffe crash1 = new Schiffe (1, 1, "right", 2);
		Schiffe crash2 = new Schiffe (1, 1, "bottom", 2);	
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInvalid () throws Exception{	
		Schiffe shipSizePlus = new Schiffe ( 11, 'Y');
		Schiffe shipSizeMinus = new Schiffe ( -1, 'Y');	
	}
}
  ```
  
  **Black Box Testing:**
  
   * State Transition Testing:
 
  ![graph](https://user-images.githubusercontent.com/73692178/101982040-8a0cd580-3c71-11eb-88bb-7a0b90a1bfc6.png)

   * Decision Table Testing:
  
   || Fall 1 | Fall 2 | Fall 3 | Fall 4 |
   |-|-|-|-|-|
   | Bedingungen |||||
   | Button geklickt | ja | ja | nein | nein |
   | Schiff drin | ja | nein | ja | nein |
   | Folgen |||||
   | Auf rot gefärbt | ja | nein | nein | nein |
   | Auf blau gefärbt | nein | ja | nein | nein |
   | Punktzahl + 10 | ja | nein | nein | nein |
   
   || Fall 1 | Fall 2 | Fall 3 | Fall 4 |
   |-|-|-|-|-|
   | Bedingungen |||||
   | alle Runden gespielt | ja | ja | nein | nein |
   | alle Schiffe versenken | ja | nein | ja | nein |
   | Folgen |||||
   | Game over gedrückt | nein | ja | nein | nein |
   | Win gedrückt | ja | nein | ja | nein |
   | Bleibende Schiffe werden orange | nein | ja | nein | nein |
   
   * Graph-Based Testing:

  ![flou](https://user-images.githubusercontent.com/73692178/101982117-06071d80-3c72-11eb-9f9a-47681c526a55.png)

  ![Graph-Based Testing 2](https://user-images.githubusercontent.com/73692178/101980859-c5ef6d00-3c68-11eb-9404-fef2519089ac.png)
  
  #### kumulierter Flux-diagramm
  
  ![image](https://user-images.githubusercontent.com/73692178/102117856-23d5ad80-3e3f-11eb-8a41-f034b83b9039.png)

  
  <p id="nt1">
   <sup><a href="#nt1">1 </a> Seeschlacht Spielregeln:
Um das Spiel zu starten drücken Sie auf dem “Start“ Knopf. Ein leeres Spielgitter wird auf dem Bildschirm angezeigt. Sie können jetzt auf die Felder klicken um die Schiffe* zu finden, aber Achtung Sie haben nur 35 versuche pro Runde. Ihr score, Ihre Anzahl von Schlägen werden unten links ausgeblendet. Falls Sie eine neue Runde anfangen wollen und die aktuelle nicht fertig ist, dann können Sie auf den “Restart“ Knopf, oben links, drücken um eine neue Runde anzufangen. Jedes Feld mit einem Schiff drauf gibt Ihnen 10 Punkte, am Ende der Runde wirden noch die restliche schlage umgerechnet um ihr end score zu erhalten. Die Runde ist zu Ende, wenn Sie ihre 35 Schlage ausgeführt haben oder, wenn Sie alle 5 Schiffe gefunden haben. Danach müssen Sie einen Namen eingeben um ihr score in den “Leaderboard“ zu speichern. Sie können dann wieder eine neue Runde Starten oder das Spiel schlissen. (-1x Flugzeugträger (5) -1x Kreuzer (4) -1x U-Boot (3) -1x Torpedo (3) -1x Gegentorpedo (2))

</p>
