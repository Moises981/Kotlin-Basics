package com.example.kotlinbasics

fun main() {
    newTopic("Hello Kotlin")

    newTopic("Variables and Constants")
    // val a =2
    // val a = "Hello"
    val a = true
    println("a = $a")
    var b: Int = 2
    b = 5
    println("b = $b")

    newTopic("Null objects")
    var objNull: Any?
    objNull = null;
    objNull = "Hi there!!"
    println(objNull);

}

fun newTopic(topic: String) {
    print("\n==================== $topic ====================\n")
}