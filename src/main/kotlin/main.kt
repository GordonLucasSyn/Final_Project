// Main.kt
// Hauptdatei

fun main() {
    CharacterCreator().run()
}
//Funktion Schlaf zum Delay Setzen
fun schlaf(typ:String){
    when (typ){
        "Menu"-> Thread.sleep(1800)
        "Game" -> Thread.sleep(1000)
        "Continue" -> Thread.sleep(2400)


    }
}