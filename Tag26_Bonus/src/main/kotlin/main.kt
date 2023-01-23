//todo: Nachdem ihr die Klasse Bruch fertiggestellt habt, wollen wir natürlich testen, ob alles wunderbar klappt.
// Öffnet dafür die main.kt Datei:
// - Erstellt zuallererst eine neue Bruch Instanz
// - Nutze mit Hilfe der Punkt Notation die einlesen Methode um Nenner und Zähler über die Konsole einzulesen.
// - Nutze mit Hilfe der Punkt Notation die ausgeben-Methode um den Bruch auszugeben
// - Nutze mit Hilfe der Punkt Notation die wert-Methode um die Kommazahl des Bruches auszugeben
//   (Hinweis: hierfür muss zusätzlich die println()Funktion genutzt werden)

fun main() {
    //Erstelle einen Bruch-Instanz
    var bruch = Bruch()

    //Nutze die einlesen-Methode, um den Zaehler und Nenner einzugeben
    bruch.einlesen()
    //Nutze die ausgeben-Methode, um den Bruch wieder auszugeben
    bruch.ausgeben()
    //Nutze die wert-Methode, um den Bruch in eine Kommazahl umzuwandeln
    bruch.wert()

    bruch.kehrwert()
}