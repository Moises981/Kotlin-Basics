package com.example.kotlinbasics

fun main() {
    newTopic("Loops")
    showPerson("Angel", "Mary", "Fanny")
    showPerson("Angel","Mary","Sergio","Alex")
}

fun showPerson(p1: String, p2: String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}

fun showPerson(vararg persons: String) {
//    println(persons[0])
//    println(persons[1])

}