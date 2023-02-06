// Player.kt
// Klasse für den Spieler
//PlayerClass
open class Player {
         private var config=Config()
         var name = ""
    open var hp = config.playerHp
    open var strength = config.playerStrength
    open var defense = config.playerDefense
         var leben =config.anzahlLeben


}
