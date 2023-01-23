<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Objektorientierte Programmierung</h3>

#### Beschreibung:

- Willkommen zurück! Heute beginnen wir mit objektorientierter Programmierung.

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
  - [Handbuch: Objektorientierte Programmierung (OOP) → Verstehen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.l9ph3575jopl)
  - [Handbuch: Objektorientierte Programmierung (OOP) → Implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.m9oyowky0g7e)

---


<details>
<summary><b>Aufgabe 1 - Ein Bus </b></summary>

In dieser Aufgabe sollst du unseren Bus verstehen und erweitern.    
Schau dir dazu die Klasse namens Bus in der Datei Bus an.  
Die Klasse Bus besitzt eine Eigenschaft namens horsePower, die angibt, wieviele Pferdestärken
unser Bus besitzt.  
Die Klasse Bus besitzt zusätzlich eine Methode namens honk, womit Busse
hupen können.

a)

Erweitere die Klasse Bus um die Methode mit dem Namen durchsage.   
Die Methode gibt in der Konsole "Bitte aussteigen." aus. 

Gehe dann in die Datei Main.kt.   
Hier siehst du wie drei Büsse erstellt wird.

Nun soll der erste Bus eine Durchsage durchführen.   
Erstelle hierfür den Methodenaufruf wie beim Hupen. 

b)

Erweitere die Klasse Bus um die Eigenschaft seats mit dem Wert 42.  
Die Eigenschaft seats gibt an, wieviele Sitze unser Bus hat.

Gib jetzt in der Main.kt die Anzahl Sitze von einem Bus in der Konsole aus.

**Modul für die Aufgabe:** Aufgabe1  
**1. Datei für die Aufgabe:** Bus.kt  
**2. Datei für die Aufgabe:** Main.kt  
</details>

---
<details>
<summary><b>Aufgabe 2 - Eine Maus </b></summary>

In dieser Aufgabe sollst du nach Vorgaben eine Klasse erstellen und bestimmte Methoden (Funktionen) anlegen.

Öffne die Datei Maus und erstelle eine Klasse namens Maus.

Nun erstelle folgende Methoden:
Die Methoden geben jeweils einen Text in der Konsole aus.

1. kaeseEssen(), welche "Yummy, Käse!" ausgibt
2. vorMenschenWegRennen(), welche "Rennen, rennen, rennen!" ausgibt
3. tunnelGraben(), welche "Grab, grab!" ausgibt
4. verstecken(), welche "Versteckt!" ausgibt

Nachdem du alle Methoden erstellt hast, öffne die Main.kt Datei.

Erstelle (instanziiere) eine Maus.  
(Hinweis: Falls es zu schwer sein sollte, schau in die Main.kt aus
Aufgabe 1 im ModulA nach und orientiere dich danach)

Nachdem die Maus erstellt wurde, soll sie in dieser Reihenfolge folgende Aktionen durchführen:

1. vor Menschen wegrennen
2. Käse essen
3. Tunnel graben
4. sich verstecken

Wenn du nun dein Programm laufen lässt, sollte folgendes in der Konsole zu sehen sein.

Rennen, Rennen, Rennen!  
Yummy, Käse!  
grab, grab!  
versteckt!  

**Modul für die Aufgabe:** Aufgabe2  
**1. Datei für die Aufgabe:** Maus.kt  
**2. Datei für die Aufgabe:** Main.kt
</details>

---


<details>
<summary><b>Aufgabe 3 - Fachbegriffe und deren Zusammenhänge </b></summary>

Du hast heute verschiedene Fachbegriffe kennengelernt. Sieh dir zur Wiederholung die folgenden Aussagen an und überlege,
welche wahr sind und welche nicht. Bei jeder Aufgabe gibt es mindestens eine wahre Aussage, es sind aber auch mehrere
wahre Aussagen möglich.
Gib die Antworten in der unten genannten Datei an.

Frage 1 (Klasse/Instanz) :

1. Eine Klasse ist wie ein Bauplan.
2. Von einer Klasse kann ich beliebig viele Objekt-Instanzen erstellen.
3. Von einer Klasse kann ich genau eine Objekt-Instanz erstellen.

Frage 2 (Punktnotation):

1. Punktnotation wird bei der Benennung von Objekt-Instanzen benutzt.
2. Mit Punktnotation kann man auf die Methoden eines Objekts zugreifen.
3. Punktnotation ist ein Datentyp, der für das Anlegen von Klassen verwendet wird.

Frage 3 (Eigenschaften):

1. Eigenschaften werden als Funktionen in einer Klasse geschrieben.
2. Eigenschaften sind immer Konstanten in einer Klasse.
3. Eigenschaften werden als Variablen/Konstanten in einer Klasse geschrieben.

Frage 4 (Methoden):

1. Methoden von einer Objekt-Instanz haben Zugriff auf seine Eigenschaften.
2. Methoden sind unabhängig von Klassen.
3. Methoden werden als Funktionen innerhalb einer Klasse geschrieben.

**Modul für die Aufgabe:** Aufgabe3  
**Datei für die Aufgabe:** Textabgabe.kt
</details>

---

<details>
<summary><b>Aufgabe 4 - Fehler beheben </b></summary>
 
In der Datei Main.kt sind Fehler aufgetreten.  
Behebe die Fehler, sodass die Person wieder sprechen kann
und ihr Alter von 18 auf 19 angehoben werden kann.

**Modul für die Aufgabe:** Aufgabe4  
**1. Datei für die Aufgabe:** Person.kt  
**2. Datei für die Aufgabe:** Main.kt
</details>

---

<details>
<summary><b>Aufgabe 5 - Mitarbeiter </b></summary>

Wir brauchen eine Klasse für einen Mitarbeiter.  
Lege die Dateien, die du brauchst, selbstständig an.

a)

Erstelle eine Klasse und nenne sie "Mitarbeiter".  
Folgende Eigenschaften soll ein Mitarbeiter besitzen:
- id
- name
- position
- gehalt
- artDerBeschäftigung
- mutterschaftsUrlaub

b)

Füge nun folgende Methoden unserer Klasse hinzu:
- gehaltAusgeben(), welche den name des Mitarbeiters und sein Gehalt in der Konsole ausgibt.  
- befoerdern(), welche die Position und das Gehalt einer Person um einen gewünschten Betrag verändert.  
- istVerfuegbar(), welche prüft, ob ein Mitarbeiter im Mutterschaftsurlaub ist und eine Nachricht 
in der Konsole ausgibt, ob der Mitarbeiter zurzeit arbeiten kann oder nicht.

c)

Teste deine Klasse, indem du:
- in einer weiteren Datei, in der main()-Funktion mindestens drei Mitarbeiter erzeugst, 
- ihnen (selbst ausgedachte) Werte für die Eigenschaften zuweist 
- und ihre Methoden aufrufst.

**Modul für die Aufgabe:** Aufgabe5
</details>


