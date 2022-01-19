package com.example.a4

fun main() {
    Fractions(1.5, 2.5).sum()
}
class Fractions(val number1: Double, val number2: Double) {
    fun sum() {
        println(number1 + number2)
        println(number1 - number2)
        println(number1 * number2)
        println(number1 / number2)
    }
}