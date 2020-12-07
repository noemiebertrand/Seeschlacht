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
  
  </nav>
  
  Einleitung 
  ---
Mit diesem Programm wollen wir Seeschlacht spielen können. Wir wollen unsere eigene Version des Spiels programmieren, also mit zusätzlichen Optionen wie zum beispiel die Punktzahl berechnen um einen Leaderboard zu erstellen, oder auch die restliche  Anzahl der Schläge. In unserer Version gibt es nur einen Spieler, nicht 2 wie üblich. Der Spieler soll so schnell wie möglich auf dem User Interface die Schiffe des Computers finden, die zufällig erzeugt werden. Aber die Rundenanzahl ist begrenzt, damit man nicht einfach alle Felder anklicken kann, um schnell fertig zu werden. Alle Informationen werden auf dem User Interface gezeigt.

  Ziel  
  ---
Unsere Ziele während dem Projekt waren, die in den Fächer erlernten Kompetenzen in Java und Javafx anhand des Projekt Seeschlacht umzusetzen. Wir wollen ein Spiel gegen den Computer spielen und raten, wo seine Schiffe sind. Der Computer generiert zufällig, wo die Schiff sich befinden. Der Spieler kann die Karte immer sehen und ein Feld anklicken, um es auszuwählen. Es soll dann nach dem Ergebnis gefärbt werden (“nichts” oder “getroffen”). Der Administrator kann mit einem geheimen Code sehen, wo die Schiffe waren. Um zu gewinnen, hat der Spieler eine beschränkte Zahl von Runden. Auf dem User Interface wird die Zeit, die Punktzahl und die verbleibenden Schiffe gezeigt. Je weniger Runden und Zeit der Spieler gebraucht hat gibt es, desto mehr Punkte. Am Ende des Spiels kann er seinen Namen schreiben, um es in einen Leaderboard zu sehen. Falls er irgendwann den Spiel neu starten will, kann er auf einen Knopf drücken.

  Randbedingungen 
  ---
Nur der Spieler ratet wo die Schiffe des Computers sind, die zufällig gesetzt werden. 

  Build-Anleitung
  ---
  1. Versichern Sie, dass Sie Java Runtime Environment bereit installiert haben.
  2. Laden Sie die Dateien von unserem Repository runter.
  3. Entpacken Sie die Dateien in ihrem gewünschten Ordner.
  4. Viel Spaß !
  
  Bedienungsanleitung
  ---
  * Nach der Offnung des Programms:
  * Sie können die Regeln <sup id="ap1"> <a href="#nt1">1</a></sup> lesen oder verwerfen.
  * Clicken Sie auf "Start".
  * Raten Sie, wo die Schiffe würden zufällig erstellt. Sie haben 35 Schlagen, um allen Schiffe zu raten, sonst haben Sie verloren.
  * Am Ende können Sie ihren Name eingeben, damit ein Leaderboard erstellen kann.
  * Dann können Sie ein neue Spiel mit dem Knopf "Restart" erstellen.
  
  
  User Stories
  ---
| Numero  | Titel | User Story | Story Points | Priorität | Beschreibung |
|:-:| :-: |-|:-:|:-:|-|
| 1 | Ohne Probleme laufen | Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können | 5 | 1 | Angenommen das Programm wurde korrekt kompiliert, wenn das Programm läuft, dann möchte ich das keine Bugs auftreten |
| 2 | Schiff standort | Als Administrator möchte ich den Standort von den Schiffen sehen, um zu wissen ob die Schiffe korrekt vom Programm Platziert wurden | 2 | 3 | Angenommen das programm hat Schiffe generiert und auf die Felder gestellt, wenn ein geheimcode eingeben wird, dann erscheinen die Standorte der Schiffe.  |
| 3 | Spiel beginnen | Als Spieler möchte ich das Programm beginnen können, um das Spiel zu spielen. | 1 | 2 | Angenommen das Programm wurde gestartet, wenn ich auf den startknopf drücke, dann startet sich das Spiel |
| 4 | Karte anzeigen | Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln. | 5 | 1 | Angenommen das Programm hat die Karte generiert,  wenn ich eine Feld anklicke, dann muss er die neue Karte generieren |
| 5 | Namen eingeben | Als Spieler möchte ich meinen Namen eintragen, um mein Score in einen Leaderboard zu speichern | 3 | 3 | Angenommen ein Spieler hat das Programm begonnen, wenn der Spieler wechselt, dann sind verschiedene Infos gespeichert |
| 6 | Meine informationen | Als Spieler möchte ich Informationen wie die Zeit, die Punktzahl, den Leaderboard sehen, um meine Punkte zu verstehen | 5 | 3 | Angenommen der Spieler hat das Spiel begonnen, wenn man auf das Scoreboard schaut, dann sieht man die Punkte, die Zeit und das Leaderboard |
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
| Task 2 | Regel Knopf um die Regeln zu sehen | 1 Stunde |
| Task 3 | Design ( Hintergrundbild + Autoren + Titel ) | 2 Stunden 30 Minuten |
| Task 4 | Testen der Umsetzung | 3 Stunden |

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

|User Story 6 | Als Spieler möchte ich Informationen wie die Zeit, die Punktzahl, den Leaderboard sehen, um meine Punkte zu verstehen | Schatzungen |
|-|-|-|
| Task 1 | Label für die Zeit erstellen | 2 Stunden |
| Task 2 | Play/Pause Knopf programmieren | 1 Stunden |
| Task 3 | Label für die Punktzahl erstellen |  15 Minuten |
| Task 4 | Punktzahl in funktion der Zeit rechnen | 2 Stunden |
| Task 5 | Tabelle für den Leaderboard erstellen | 1 Stunden |
| Task 6 | Testen der Umsetzung | 3 Stunden |

| User Story 7 | Als Spieler auf einem Knopf drücken um das Spiel neu zu starten | Schatzungen |
|-|-|-|
| Task 1 | Design des Knopfs | 1 Stunde |
| Task 2 | Controller schreiben | 4 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Farbe der Knopfe, der Score, die Zeit und die getroffene Schiffe werden reinitializiert und eine neue Karte wird erstellt | 2 Stunden |
| Task 5 | Testen der Umsetzung | 3 Stunden |

|User Story 8 | Als Spieler möchte ich das Ergebnis des Spiels sehen und danach es schliessen | Schatzungen |
|-|-|-|
| Task 1 | "GAME OVER"/"WIN" am ende des Spiels anzeigen | 1 Stunde |
| Task 2 | Leaderboard aktualisieren | 3 Stunden |
| Task 3 | Lösung der Karte anzeigen | 3 Stunden |
| Task 4 | Testen der Umsetzung | 3 Stunden |

Total geschätzte minimale Zeit: 101 Stunden


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
		boolean error;
		do {
			cox = firstCase();
			coy = firstCase();
			setSens();
			error = error2(t);
			if (error == false) {
				for ( int i = 0; i < t; i++) {
					map [coy][cox] = k;
					switch(sens){
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
  ```
  
  #### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories**
  (JUnit ?)
  
  Dokumentation Sprint 2
  ---
  
  #### Taskliste Sprint 2
  
  | Nummer | User Story | Schätzung |
  |:-:|:-:|-:|
  | 1 | Ohne Probleme laufen | 14 Stunden |
  | 5 | Namen eingeben | 12 Stunden |
  | 6 | Meine informationen | 9 Stunden |
  
  
  #### UML Package, Klassen- und Sequenzdiagramm
  
  ![image](https://user-images.githubusercontent.com/73692178/101378725-be6c4480-38b3-11eb-8d9b-5d64f59b6efc.png)

  
  #### Code Snippets Sprint 2
  
  #### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories
  (JUnit ?)

 
  
  <p id="nt1">
   <sup><a href="#nt1">1 </a> Seeschlacht Spielregeln:
Um das Spiel zu starten drücken Sie auf dem “Start“ Knopf. Ein leeres Spielgitter wird auf dem Bildschirm angezeigt und die Zeit fängt an zu laufen. Sie können jetzt auf die Felder klicken um die Schiffe* zu finden, aber Achtung Sie haben nur 35 versuche pro Runde. Ihr score, Ihre abgelaufene Zeit und die Anzahl von Schlägen werden unten links ausgeblendet. Falls Sie eine neue Runde anfangen wollen und die aktuelle nicht fertig ist, dann können Sie auf den “Restart“ Knopf, oben links, drücken um eine neue Runde anzufangen. Jedes Feld mit einem Schiff drauf gibt Ihnen 10 Punkte, am Ende der Runde wird noch Ihre Zeit umgerechnet um ihr end score zu erhalten. Die Runde ist zu Ende, wenn Sie ihre 35 Schlage ausgeführt haben oder, wenn Sie alle 5 Schiffe gefunden haben. Danach müssen Sie einen Namen eingeben um ihr score in den “Leaderboard“ zu speichern. Sie können dann wieder eine neue Runde Starten oder das Spiel schlissen. -1x Flugzeugträger (5) -1x Kreuzer (4) -1x U-Boot (3) -1x Torpedo (3) -1x Gegentorpedo (2) </p>
