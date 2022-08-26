package com.example.kotlinbasics.classes

import com.example.kotlinbasics.newTopic

fun main() {
    newTopic("Collections")
    newTopic("Readonly")

    val fruitList = listOf<String>("Apple", "Banana", "Grape", "Lima")
    println(fruitList[fruitList.indices.random()])
    println("Index of grape is ${fruitList.indexOf("Grape")}")


}