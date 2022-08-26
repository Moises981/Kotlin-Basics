package com.example.kotlinbasics.classes

class Phone(public val number: Int) {
    fun call() {
        println("Calling...")
    }

    fun showNumber() {
        println("My phone number is $number")
    }
}