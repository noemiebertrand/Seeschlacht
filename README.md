**Seeschlacht**

  1. Einleitung: 

Mit diesem Programm wollen wir Seeschlacht spielen können. Wir wollen unsere eigene Version des Spiels programmieren, also mit zusätzlichen Optionen wie zum beispiel die Punktzahl berechnen um einen Leaderboard zu erstellen, oder auch die restliche  Anzahl der Schläge. In unserer Version gibt es nur einen Spieler, nicht 2 wie üblich. Der Spieler soll so schnell wie möglich auf dem User Interface die Schiffe des Computers finden, die zufällig erzeugt werden. Aber die Rundenanzahl ist begrenzt, damit man nicht einfach alle Felder anklicken kann, um schnell fertig zu werden. Alle Informationen werden auf dem User Interface gezeigt.

  2. Ziel : 

Unsere Ziele während dem Projekt waren, die in den Fächer erlernten Kompetenzen in Java und Javafx anhand des Projekt Seeschlacht umzusetzen. Wir wollen ein Spiel gegen den Computer spielen und raten, wo seine Schiffe sind. Der Computer generiert zufällig, wo die Schiff sich befinden. Der Spieler kann die Karte immer sehen und ein Feld anklicken, um es auszuwählen. Es soll dann nach dem Ergebnis gefärbt werden (“nichts” oder “getroffen”). Der Administrator kann mit einem geheimen Code sehen, wo die Schiffe waren. Um zu gewinnen, hat der Spieler eine beschränkte Zahl von Runden. Auf dem User Interface wird die Zeit, die Punktzahl und die verbleibenden Schiffe gezeigt. Je weniger Runden und Zeit der Spieler gebraucht hat gibt es, desto mehr Punkte. Am Ende des Spiels kann er seinen Namen schreiben, um es in einen Leaderboard zu sehen. Falls er irgendwann den Spiel neu starten will, kann er auf einen Knopf drücken.

  3. Randbedingungen :

Nur der Spieler ratet wo die Schiffe des Computers sind, die zufällig gesetzt werden. 


| Numero  | User Story | Story Points | Priorität | Beschreibung |
|-|-|-|-|-|
| 1 | Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können | 5 | 1 | Angenommen das Programm wurde korrekt kompiliert, wenn das Programm läuft, dann möchte ich das keine Bugs auftreten |
| 2 | Als Administrator möchte ich den Standort von den Schiffen sehen, um zu wissen ob die Schiffe korrekt vom Programm Platziert wurden | 2 | 3 | Angenommen das programm hat Schiffe generiert und auf die Felder gestellt, wenn ein geheimcode eingeben wird, dann erscheinen die Standorte der Schiffe.  |
| 3 | Als Spieler möchte ich das Programm beginnen können, um das Spiel zu spielen. | 1 | 2 | Angenommen das Programm wurde gestartet, wenn ich auf den startknopf drücke, dann startet sich das Spiel |
| 4 | Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln. | 5 | 1 | Angenommen das Programm hat die Karte generiert,  wenn ich eine Feld anklicke, dann muss er die neue Karte generieren |
| 5 | Als Spieler möchte ich meinen Namen eintragen, um mein Score in einen Leaderboard zu speichern | 3 | 3 | Angenommen ein Spieler hat das Programm begonnen, wenn der Spieler wechselt, dann sind verschiedene Infos gespeichert |
| 6 | Als Spieler möchte ich Informationen wie die Zeit, die Punktzahl, den Leaderboard sehen, um meine Punkte zu verstehen | 5 | 3 | Angenommen der Spieler hat das Spiel begonnen, wenn man auf das Scoreboard schaut, dann sieht man die Punkte, die Zeit und das Leaderboard |
| 7 | Als Spieler auf einem Knopf drücken um das  Spiel neu zu starten  | 2 | 2 | Angenommen ein Versuch wurde bereits durchgeführt, wenn man auf einem Taste drückt, dann erscheint die Option eines neuen Versuches |

| User Story 1 |  Als Administrator möchte ich das mein Programm ohne Probleme läuft damit die User es spielen können   | Schatzungen |
|-|-|-|
| Task 1 | Spiel starten | 1 Stunde |
| Task 2 | Spiel debuguen | 10 Stunden |
| Task 3 | Testen der Umsetzung | 5 Stunden |

| User Story 4 |       Als Spieler möchte ich die interaktive Karte immer sehen, um meine Strategie zu entwickeln.      | Schatzungen |
|-|-|-|
| Task 1 | Design der interaktiven Karte |3 Stunde |
| Task 2 | Controller schreiben | 13 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Testen der Umsetzung | 5 Stunden |

| User Story 7 |                         Als Spieler auf einem Knopf drücken um das Spiel neu zu starten                | Schatzungen |
|-|-|-|
| Task 1 | Design des Knopfs | 1 Stunde |
| Task 2 | Controller schreiben | 4 Stunden |
| Task 3 | Implementierung des User Interface | 3 Stunden |
| Task 4 | Testen der Umsetzung | 5 Stunden |

| Iteration 1 | Iteration 2 | Iteration 3-5 |
|-|-|-|
| User Story 4 | User Story 7 | User Story 5 |
| User Story 2 | User Story 3 | User Story 1 |
|  | User Story 6 |  |
| Velocity 7 | Velocity 8 | Velocity 8 |
