package com.example.hw1

fun main() {
    var sergazy = Worker("Сергазы", 25, 1000)
    var elaman = Worker("Еламан", 26, 2000)
    var sumSal = sergazy.salary + elaman.salary
    var sumAge = sergazy.age + elaman.age
    println("сумма зарплат Сергазы и Еламан $sumSal")
    println("сумма возрастов Сергазы и Еламан $sumAge")
}
class Worker(val name: String, val age: Int, val salary: Int){

}