package com.example.kotlinbasics.classes

import com.example.kotlinbasics.newTopic

fun main() {
    newTopic("Classes")
    val phone: Phone = Phone(241014124)
    phone.call()
    phone.showNumber()
//    println(phone.number)

    newTopic("Inheritance")
    val smartphone: Smartphone = Smartphone(214150123, true);
    smartphone.call()

    newTopic("Overloading")
    smartphone.showNumber()
    println("Private? ${smartphone.isPrivate}")

    val myUser: User = User(0, "Jesus", "Castillo", 0)
    println(myUser.component3())
    println(myUser)
}