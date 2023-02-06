import kotlin.random.Random

// Enemy.kt
// Klasse für den Gegner
//Vererbung der Klasse Player zu Enemy
class Enemy : Player(){
    override var hp = Random.nextInt(100, 2000)
    override var strength = Random.nextInt(500, 1000)
    override var defense = Random.nextInt(150, 200)


}