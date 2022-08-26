package com.example.kotlinbasics

fun main() {
    newTopic("Loops")
    showPerson("Angel", "Mary", "Fanny")
    showPerson("Angel", "Mary", "Sergio", "Alex")
}

fun showPerson(p1: String, p2: String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}

fun showPerson(vararg persons: String) {
//    println(persons[0])
//    println(persons[1])
    newTopic("For")
    for (person in persons) println(person)
    newTopic("While")
    var i = 0
    while (i < persons.size) {
        if (persons[i] == "Mary") println("It's mary!")
        println(persons[i])
        i++;
    }

    newTopic("When")
    i = (persons.indices).random()
    println(i)
    when (persons[i]) {
        "Angel" -> println("It's Angel!")
        "Mary" -> {
            println("Go to next")
            println(2 + 4)
        }
        else -> println(persons[i])
    }
}