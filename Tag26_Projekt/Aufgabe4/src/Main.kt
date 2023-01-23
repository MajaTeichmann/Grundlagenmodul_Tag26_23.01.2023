//todo: In der Datei Main.kt sind Fehler aufgetreten.
// Behebe die Fehler, sodass die Person wieder sprechen kann und ihr Alter von 18 auf 19 angehoben werden kann.

//fun main(){
//
//    var person: person = person
//    person..speak()
//    person..age = 19
//
//}

fun main(){
    var person: Person = Person()        // "person: person = person "  in "person: Person = Person()" umgeschrieben
    person.speak()                      // jeweils die zweite Punktnotation entfernt
    person.age = 19
}