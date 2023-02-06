// CharacterCreator.kt
// Hauptdatei des Character Creators
// Enthält das Programm und die Hauptfunktionalität

import kotlin.random.Random

class CharacterCreator {
    private val player = Player()
    private val enemy = Enemy()

    fun run() {
        // Willkommensnachricht anzeigen
        println("Willkommen beim Character Creator angelehnt an World of Warcraft!")

        // Interaktives Menü anzeigen
        while (true) {
            showMenu()
            when (readOption()) {
                1 -> createPlayer()
                2 -> createEnemy()
                3 -> showDetails()
                4 -> fight()
                5 -> break
            }
        }
    }

    // Zeigt das interaktive Menü an
    private fun showMenu() {
        println("\nBitte wählen Sie eine Option aus:")
        println("1 =Erstellen eines Characters")
        println("2 =Erstellen eines Gegners")
        println("3 =Zeige Details des Spielers und Gegners")
        println("4 =Starte Kampf")
        println("5 =Beenden")
    }

    // Liest die Option des Benutzers ein
    private fun readOption(): Int {
        print("Ihre Option: ")
        val input = readln()
        //Abfangen von Exceptions
        try {
            input.toInt()
            return input.toInt()
        } catch (e: NumberFormatException) {
            println("Du hast eine Falsche eingabe gemacht,Versuche es Erneut")
            schlaf("Game")
            return 0
        }

        //return input.toInt()
    }

    // Erstellt den Spieler
    private fun createPlayer() {
        //Eingabe des Spieler namen
        player.name = readName()
        //player.hp = Random.nextInt(100, 2000)
        //player.strength = Random.nextInt(200, 250)
        //player.defense = Random.nextInt(10, 200)
    }

    // Erstellt den Gegner
    private fun createEnemy() {
        //Generierter Gegner name
        enemy.name = generateName()
        //enemy.hp = Random.nextInt(100, 2000)
        //enemy.strength = Random.nextInt(500, 1000)
        //enemy.defense = Random.nextInt(150, 200)
    }

    // Zeigt die Details des Spielers und Gegners an
    private fun showDetails() {
        println("\nDetails des Spielers:")
        println("Name: ${player.name}")
        println("Lebensanzeige: ${player.hp}")
        println("Stärke: ${player.strength}")
        println("Verteidigung: ${player.defense}")
        println("Anzahl Leben: ${player.leben}")
        schlaf("Game")
        println("\nDetails des Gegners:")
        println("Name: ${enemy.name}")
        println("Lebensanzeige: ${enemy.hp}")
        println("Stärke: ${enemy.strength}")
        println("Verteidigung: ${enemy.defense}")
        schlaf("Game")
    }

    // Startet den Kampf zwischen Spieler und Gegner
    private fun fight() {
        println("\nRunde ${8-player.leben}")
        println("Der Kampf zwischen ${player.name} und ${enemy.name} beginnt!")

        while (player.hp > 0 && enemy.hp > 0) {
            val damage = calculateDamage(player.strength, enemy.defense)
            enemy.hp -= damage
            schlaf("Game")
            println("${player.name} hat ${enemy.name} $damage Schaden zugefügt!")
            if (enemy.hp > 0) {
                val damage = calculateDamage(enemy.strength, player.defense)
                player.hp -= damage
                schlaf("Game")
                println("${enemy.name} hat ${player.name} $damage Schaden zugefügt!")
            }
        }
        if (player.hp > 0) {
            println("\n${player.name} hat ${enemy.name} besiegt!")
            schlaf("Game")
        } else {
            println("\n${enemy.name} hat ${player.name} besiegt!")
            player.leben --
            if ((player.leben) >0){
                player.hp=(Random.nextInt(100,500))
                println("Du hast noch ${player.leben} Leben Übrig,deswegen hast du noch eine Weitere Chance")
                println("Deine Lebenspunkte haben sich um ${player.hp} Erhöht")
                schlaf("Continue")
                fight()

            }
            else println("Du hast alle Leben Verloren und das Spiel ist nun Vorbei")

            schlaf("Game")
        }
    }

    // Liest den Namen des Spielers ein
    private fun readName(): String {
        print("Bitte geben Sie den Namen des Characters ein: ")
        return readLine() ?: ""
    }

    // Generiert den Namen des Gegners
    private fun generateName(): String {
        val adjectives = listOf("Böser ", "Mutiger ", "Starker ", "Furchtloser ", "Hinterhältiger ")
        val nouns = listOf("Ork", "Elf", "Zwerg", "Mensch", "Untoter")
        val adjective = adjectives.random()
        val noun = nouns.random()
        println("Der Gegner Heißt '${adjective}${noun}'")
        schlaf("Game")
        return "$adjective$noun"
    }

    // Berechnet den Schaden
    private fun calculateDamage(strength: Int, defense: Int): Int {
        return strength - defense
    }

}


/*
// Generiert zufällig Stärke und Verteidigung
private fun generateRandomStrengthAndDefense() {
    strength = Random.nextInt(200, 1000)
    defense = Random.nextInt(10, 200)
}

private fun calculateDamage(strength: Int, defense: Int): Int {
    // Generiert zufällig Stärke und Verteidigung
    generateRandomStrengthAndDefense()
    return strength - defense
}
 */
