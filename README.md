# Bibliotek_PP_Aufgabe_1

Aufgabe 1. Bibliothek

Eine Bibliothek wurde gerade digitalisiert. In der Datei bibliothek.txt erscheinen alle Bücher, die die Bibliothek besitzt. Die Daten sind mit Et-Zeichen/Ampersand (&) abgetrennt und stellen die folgenden Informationen dar:

Name des Buches (String)

Autor (String) 

Erscheinungsjahr (LocalDate "dd.mm.yyyy")

Anzahl der Kopien (int)

Anzahl der verfügbaren Exemplare (int)

---------------------------------------------------------------------------------------------------------------------------
Beispiel:

bibliothek.txt

Pride and Prejudice&Jane Austen&28.01.1813&5&4

Father Goriot&Honore de Balzac&06.03.1835&2&1

The Trial&Franz Kafka&26.04.1925&3&2

A Game of Thrones&George R. R. Martin&01.08.1996&6&2

The Hunger Games&Suzanne Collins&14.09.2008&4&3

...
---------------------------------------------------------------------------------------------------------------------------

Entwickeln Sie eine Anwendung, die folgende Anforderungen löst. 

Liest die Informationen aus der Datei bibliothek.txt;

Sortiert die Bücher aus der Bibliothek in absteigender Reihenfolge nach dem Namen des Buches und speichert diese in name.txt;

Filtert die Bücher, deren Autor mit dem Buchstaben S beginnt, in aufsteigender Reihenfolge und speichert diese in autor.txt;

Filtert die Bücher, für die mehr als 3 Exemplare verfügbar sind, und sortiert diese in absteigender Reihenfolge nach dem Erscheinungsjahr. Die Ergebnisse werden in exemplare.txt gespeichert;

Zeigt die Gesamtzahl der Bücher in der Bibliothek auf dem Bildschirm an. 

Die Daten werden durch Hashtag-Zeichen (#) abgetrennt.

! Bewertung Aufgabe 1

Lesen aus der Datei (1 Punkt)
Speichern in die Datei (1.5 Punkte)
Gesamtzahl der Bücher (0.5 Punkte)
Java Streams (0.5 Punkte)
Qualität der Kode (0.5 Punkte)
