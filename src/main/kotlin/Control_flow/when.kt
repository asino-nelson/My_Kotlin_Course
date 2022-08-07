package Control_flow

fun main() {
    var age = 12

    when (age){
        in 1..12 -> println("Toddler")
        in 13..19 -> println("Teenager")
        in 20..35 -> println("Junior Adult")
        in 36..50 -> println("Senior Adult")
        else -> println("Elder")
    }
}