<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">[Objektorientierte Programmierung]</h3>

#### Beschreibung:

- Willkommen bei den Bonusaufgaben des heutigen Tages!

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
    - [Handbuch: Objektorientierte Programmierung (OOP) → Implementieren → Klasse + Methoden implementieren, instanziieren und nutzen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.m9oyowky0g7e)

---


<details>
<summary><b>Aufgabe 1 - Klasse Bruch</b></summary>

Brüche sind bekanntlich mathematische Ausdrücke der Form zaehler/nenner, wobei der Zähler und der Nenner ganze Zahlen (Int) sind.

Erweitere die Kotlin-Klasse Bruch um die unten angegebenen Methoden.

- Die Funktion <i>ausgeben()</i> soll dafür sorgen, dass ein Bruch als String zurückgegeben wird z.B. “5/8“
- Die Funktion <i>setze(z: Int, n: Int)</i> soll den Zähler auf z und den Nenner auf n setzen. Sollte der Parameter n
  gleich 0 sein (Division durch 0), so sollen die Werte unverändert bleiben
- Die Funktion <i>einlesen()</i> soll von der Tastatur einen Zähler und einen Nenner einlesen und dabei sicherstellen,
  dass der Wert des Nenners nicht 0 ist. Die Instanzvariablen sollen auf die eingelesenen Werte mit Hilfe der zuvor erstellten setze-Methode gesetzt werden.
- Die Funktion <i>wert()</i> soll den Wert des Bruches als Double-Wert zurückliefern (Das Ergebnis vom Bruch bei 5/10 sollte 0.5 sein.
- Die Funktion <i>kehrwert()</i> soll den Kehrwert des Bruches erstellen (aus 5/8 wird
  8/5)

Nachdem ihr die Klasse Bruch fertiggestellt habt, wollen wir natürlich testen, ob alles wunderbar klappt.

Öffnet dafür die main.kt Datei:


1. Erstellt zuallererst eine neue Bruch Instanz
2. Nutze mit Hilfe der Punkt Notation die einlesen Methode um Nenner und Zähler über die Konsole einzulesen.
3. Nutze  mit Hilfe der Punkt Notation die ausgeben-Methode um den Bruch auszugeben
4. Nutze mit Hilfe der Punkt Notation die wert-Methode um die Kommazahl des Bruches auszugeben (Hinweis: hierfür muss zusätzlich die println()Funktion genutzt werden)



**Datei für die Aufgabe:** *Bruch* und *main.kt*

</details>

---


