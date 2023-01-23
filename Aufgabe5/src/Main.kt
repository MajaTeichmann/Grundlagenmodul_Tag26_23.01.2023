fun main(){
    var mitarbeiter1: Mitarbeiter = Mitarbeiter()
    var mitarbeiter2: Mitarbeiter = Mitarbeiter()
    var mitarbeiter3: Mitarbeiter = Mitarbeiter()

    // Mitarbeiter 1
    mitarbeiter1.id = "00001"
    mitarbeiter1.name = "Peter Müller"
    mitarbeiter1.position = "Filialleitung"
    mitarbeiter1.gehalt = 2500
    mitarbeiter1.artDerBeschaeftigung = "Angestellter"
    mitarbeiter1.mutterschaftsUrlaub = false
    mitarbeiter1.gehaltAusgeben()
    mitarbeiter1.istVerfuegbar()

    // Mitarbeiter 2
    mitarbeiter2.id = "00002"
    mitarbeiter2.name = "Hannah Fritz"
    mitarbeiter2.position = "Bankangestellte"
    mitarbeiter2.gehalt = 1900
    mitarbeiter2.artDerBeschaeftigung = "Angestellter"
    mitarbeiter2.mutterschaftsUrlaub = true
    mitarbeiter2.gehaltAusgeben()
    mitarbeiter2.istVerfuegbar()

    // Mitarbeiter 3
    mitarbeiter3.id = "00003"
    mitarbeiter3.name = "Ulrich Schmidt"
    mitarbeiter3.position = "Hausmeister"
    mitarbeiter3.gehalt = 1200
    mitarbeiter3.artDerBeschaeftigung = "Angestellter"
    mitarbeiter3.mutterschaftsUrlaub = false
    mitarbeiter3.gehaltAusgeben()
    mitarbeiter3.befoerdern()
    mitarbeiter3.istVerfuegbar()
}