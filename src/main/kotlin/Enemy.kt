// Enemy.kt
// Klasse für den Gegner
//Vererbung der Klasse Player zu Enemy
class Enemy : Player(){
    private var config=Config()
    override var hp = config.enemyHp
    override var strength = config.enemyStrength
    override var defense = config.enemyDefense


}