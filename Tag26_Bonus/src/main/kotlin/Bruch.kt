import kotlin.time.toDuration

class Bruch {
    //Die zwei Klassenvariablen nicht verändern
    var zaehler: Int = 1
    var nenner: Int = 1

    //Hier drunter kannst du weitercoden:

    // Die Funktion ausgeben() soll dafür sorgen, dass ein Bruch als String zurückgegeben wird z.B. “5/8“
    fun ausgeben(){
        println("${zaehler}/${nenner}")
    }


    // Die Funktion setze(z: Int, n: Int) soll den Zähler auf z und den Nenner auf n setzen.
    // Sollte der Parameter n gleich 0 sein (Division durch 0), so sollen die Werte unverändert bleiben
    fun setze(z: Int, n: Int){
        if(n == 0){
            zaehler = 1
            nenner = 1
        }
        else{
            zaehler = z
            nenner = n
        }
    }


    // Die Funktion einlesen() soll von der Tastatur einen Zähler und einen Nenner einlesen und dabei sicherstellen,
    // dass der Wert des Nenners nicht 0 ist. Die Instanzvariablen sollen auf die eingelesenen Werte mit Hilfe der
    // zuvor erstellten setze-Methode gesetzt werden.
    fun einlesen(){
        println("Nenne mir einen Zähler")
        zaehler = readln().toInt()
        println(zaehler)
        println("Nenne mir einen Nenner")
        nenner = readln().toInt()

        if(nenner != 0){
            println(nenner)
        }
        else{
            println("Du kannst alles im Leben teilen, aber nicht durch Null.")
            setze(1,1)
        }
    }

    // Die Funktion wert() soll den Wert des Bruches als Double-Wert zurückliefern
    // (Das Ergebnis vom Bruch bei 5/10 sollte 0.5 sein).
    fun wert(){
        var ergebnis = zaehler.toDouble()/nenner.toDouble()
        println("${zaehler.toDouble()}/${nenner.toDouble()} ergibt: ${ergebnis}")
    }

    // Die Funktion kehrwert() soll den Kehrwert des Bruches erstellen (aus 5/8 wird 8/5)
    fun kehrwert(){
        var ergebnisKehrwert = nenner.toDouble()/zaehler.toDouble()
        println("Aus ${zaehler}/${nenner}, wird ${nenner}/${zaehler}.")
        println("Also ${ergebnisKehrwert.toDouble()}")
    }
}