package com.example.kotlinbasics

import kotlin.math.abs

fun main() {
    sayHello()
    newTopic("Arguments")
//    println(sum(2,3))
    val a = 2;
    val b = 3;
    println("$a + $b = ${sum(a, b)}")
    println("$a - $b = ${sub(a, b)}")

    newTopic("Infix")
    val c = -3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a, c)}")
    println("$a + $c = ${sum(a, c.enableAbs(true))}")

    newTopic("Overloading")
    showProduct("Soda", "10%")
    showProduct("Bread")
    showProduct("Candy","15%")
    showProduct("Juice", validity = "15th March")
}

private fun sayHello(): Unit {  // Unit = void
    println("Hello Kotlin")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int) = a - b

infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

fun showProduct(name: String, promo: String = "Without promotion", validity: String = "out of stock") {
    println("$name = $promo until $validity")
}