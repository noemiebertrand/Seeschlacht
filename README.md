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
  
  7. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#release-plan">Release Plan</a>
  
  8. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#dokumentation-sprint-1">Dokumentation Sprint 1</a>
  
  9. <a href="https://github.com/noemiebertrand/Seeschlacht/blob/main/README.md#dokumentation-sprint-2">Dokumentation Sprint 2</a>
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
  * Sie können die Regeln [^1] lesen oder verwerfen.
  * Clicken Sie auf "Start".
  * Raten Sie, wo die Schiffe würden zufällig erstellt. Sie haben 35 Schlagen, um allen Schiffe zu raten, sonst haben Sie verloren.
  * Am Ende können Sie ihren Name eingeben, damit ein Leaderboard erstellen kann.
  * Dann können Sie ein neue Spiel mit dem Knopf "Restart" erstellen.
  
  
  User Stories
  ---
| Numero  | User Story | Story Points | Priorität | Beschreibung |
|:-:|-|:-:|:-:|-|
| 1 | Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können | 5 | 1 | Angenommen das Programm wurde korrekt kompiliert, wenn das Programm läuft, dann möchte ich das keine Bugs auftreten |
| 2 | Als Administrator möchte ich den Standort von den Schiffen sehen, um zu wissen ob die Schiffe korrekt vom Programm Platziert wurden | 2 | 3 | Angenommen das programm hat Schiffe generiert und auf die Felder gestellt, wenn ein geheimcode eingeben wird, dann erscheinen die Standorte der Schiffe.  |
| 3 | Als Spieler möchte ich das Programm beginnen können, um das Spiel zu spielen. | 1 | 2 | Angenommen das Programm wurde gestartet, wenn ich auf den startknopf drücke, dann startet sich das Spiel |
| 4 | Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln. | 5 | 1 | Angenommen das Programm hat die Karte generiert,  wenn ich eine Feld anklicke, dann muss er die neue Karte generieren |
| 5 | Als Spieler möchte ich meinen Namen eintragen, um mein Score in einen Leaderboard zu speichern | 3 | 3 | Angenommen ein Spieler hat das Programm begonnen, wenn der Spieler wechselt, dann sind verschiedene Infos gespeichert |
| 6 | Als Spieler möchte ich Informationen wie die Zeit, die Punktzahl, den Leaderboard sehen, um meine Punkte zu verstehen | 5 | 3 | Angenommen der Spieler hat das Spiel begonnen, wenn man auf das Scoreboard schaut, dann sieht man die Punkte, die Zeit und das Leaderboard |
| 7 | Als Spieler auf einem Knopf drücken um das  Spiel neu zu starten  | 2 | 2 | Angenommen ein Versuch wurde bereits durchgeführt, wenn man auf einem Taste drückt, dann erscheint die Option eines neuen Versuches |

| User Story 1 | Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können  | Schatzungen |
|-|-|-|
| Task 1 | Spiel starten | 1 Stunde |
| Task 2 | Spiel debuguen | 10 Stunden |
| Task 3 | Testen der Umsetzung | 5 Stunden |

| User Story 4 | Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln. | Schatzungen |
|-|-|-|
| Task 1 | Design der interaktiven Karte |3 Stunden |
| Task 2 | Controller schreiben | 13 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Testen der Umsetzung | 5 Stunden |

| User Story 7 | Als Spieler auf einem Knopf drücken um das Spiel neu zu starten | Schatzungen |
|-|-|-|
| Task 1 | Design des Knopfs | 1 Stunde |
| Task 2 | Controller schreiben | 4 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Testen der Umsetzung | 5 Stunden |

  Release Plan
  ---
| Iteration 1 | Iteration 2 | Iteration 3-5 |
|-|-|-|
| User Story 4 | User Story 7 | User Story 5 |
| User Story 2 | User Story 3 | User Story 1 |
|  | User Story 6 |  |
| Velocity 7 | Velocity 8 | Velocity 8 |

  Dokumentation Sprint 1
  ---
  
  Dokumentation Sprint 2
  ---
  
  
  
   [^1]: Seeschlacht Spielregeln:

Um das Spiel zu starten drücken sie auf dem “Start“ Knopf. Ein leeres Spielgitter wird auf dem Bildschirm angezeigt und die Zeit fangt an zu laufen. Sie können jetzt auf die Felder klicken um die Schiffe* zu finden, aber Achtung Sie haben nur 35 versuche pro Runde. Ihre abgelaufene Zeit und die Anzahl von Schlage werden oben links ausgeblendet, ihr score wird oben rechts ausgeblendet. Falls Sie eine neue Runde anfangen wollen und die aktuelle nicht fertig ist, dann können Sie auf den “Restart“ Knopf, unten links, drücken um eine neue Runde anzufangen. Jedes Feld mit einem Schiff drauf gibt euch 10 Punkte, am Ende der Runde wird noch eure Zeit umgerechnet um ihr end score zu erhalten. Die Runde ist zu Ende, wenn Sie ihre 35 Schlage ausgeführt haben oder, wenn Sie alle 5 Schiffe gefunden haben. Danach müssen Sie einen Namen eingeben um ihr score in den “Leaderboard“ zu speichern. Sie können dann wieder eine neue Runde Starten oder das Spiel schlissen.

          	 * 	-1x Flugzeugträger (5)
-1x Kreuzer (4)
-1x U-Boot (3)
-1x Torpedo (3)
-1x Gegentorpedo (2)

