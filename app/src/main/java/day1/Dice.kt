package day1

class Dice(num: Int) {
    var sides=6
    val diceRange = 1..6
    fun roll(num: Int): Int {
        val randomNumber = (1..num).random()
        return randomNumber
    }
}
fun main(){

    val dice=Dice(6)
    println("Out of ${dice.sides} number on dice is ${dice.roll(6)}")

}