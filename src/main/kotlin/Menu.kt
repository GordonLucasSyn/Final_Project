class Menu {
    var cc =CharacterCreator()
    fun run() {
        // Willkommensnachricht anzeigen
        println("Willkommen beim Character Creator angelehnt an World of Warcraft!")

        // Interaktives Menü anzeigen
        while (true) {
            showMenu()
            when (cc.readOption()) {
                1 -> cc.createPlayer()
                2 -> cc.createEnemy()
                3 -> cc.showDetails()
                4 -> cc.fight()
                5 -> break
            }
        }
    }

    // Zeigt das interaktive Menü an
    private fun showMenu() {
        println("\nBitte wählen Sie eine Option aus:")
        println("1 = Erstellen eines Characters")
        println("2 = Erstellen eines Gegners")
        println("3 = Zeige Details des Spielers und Gegners")
        println("4 = Starte Kampf")
        println("5 = Beenden")
    }
}