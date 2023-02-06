import kotlin.random.Random

open class Config {
    var anzahlLeben=7
    var playerHp = Random.nextInt(100, 2000)
    var playerStrength = Random.nextInt(200, 250)
    var playerDefense = Random.nextInt(10, 200)

    var enemyHp = Random.nextInt(100, 2000)
    var enemyStrength = Random.nextInt(500, 1000)
    var enemyDefense = Random.nextInt(150, 200)
}