//todo: Wir brauchen eine Klasse für einen Mitarbeiter.
// Lege die Dateien, die du brauchst, selbstständig an.
// a) Erstelle eine Klasse und nenne sie "Mitarbeiter".
// Folgende Eigenschaften soll ein Mitarbeiter besitzen:
// - id
// - name
// - position
// - gehalt
// - artDerBeschäftigung
// - mutterschaftsUrlaub

//todo: b) Füge nun folgende Methoden unserer Klasse hinzu:
// - gehaltAusgeben(), welche den name des Mitarbeiters und sein Gehalt in der Konsole ausgibt.
// - befoerdern(), welche die Position und das Gehalt einer Person um einen gewünschten Betrag verändert.
// - istVerfuegbar(), welche prüft, ob ein Mitarbeiter im Mutterschaftsurlaub ist und eine Nachricht in der Konsole
//   ausgibt, ob der Mitarbeiter zurzeit arbeiten kann oder nicht.

//todo: c) Teste deine Klasse, indem du:
// - in einer weiteren Datei, in der main()-Funktion mindestens drei Mitarbeiter erzeugst,
// - ihnen (selbst ausgedachte) Werte für die Eigenschaften zuweist
// - und ihre Methoden aufrufst.

class Mitarbeiter {
    var id: String? = null
    var name: String? = null
    var position: String = "Hausmeister"
    var gehalt: Int = 0
    var artDerBeschaeftigung: String = "Angestellter"
    var mutterschaftsUrlaub: Boolean = false



    fun gehaltAusgeben(){
        println("Unser Mitarbeiter ${name} hat ${gehalt}€ Gehalt.")
    }

    fun befoerdern(){
        position = "Filialleiter"
        gehalt += 500
        println("${name} bekommt mehr Gehalt! (${gehalt})")
    }

    fun istVerfuegbar(){
        if(mutterschaftsUrlaub){
            println("Unser Mitarbeiter ${name} macht aktuell Mutterschaftsurlaub.")
        }
        else{
            println("Unser Mitarbeiter ${name} macht aktuell keinen Mutterschaftsurlaub und ist verfügbar.")
        }
    }
}