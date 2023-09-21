package sampleDay1

class samplekotlin {

}
val age = 5
val name = "Rover"
fun main() {
        printBorder()
        println("Happy Birthday $name")
        print("Jhansi\n oo \n")
        println("You are $age!")
        printBorder()
        main1()
}
fun main1(){
        println("   ,,,,,   ")
        println("   |||||   ")
        println(" =========")
        println("@@@@@@@@@@@")
        println("{~@~@~@~@~}")
        println("@@@@@@@@@@@")
        println("")
}
fun printBorder() {
        repeat(age*2) {
                print("%")
        }
        println()
}