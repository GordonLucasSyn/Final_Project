import kotlin.random.Random

// Player.kt
// Klasse für den Spieler
//PlayerClass
open class Player {
         var name = ""
    open var hp = Random.nextInt(100, 2000)
    open var strength = Random.nextInt(200, 250)
    open var defense = Random.nextInt(10, 200)
         var leben =7


}
