package com.example.kotlinbasics.classes


open class Phone(protected val number: Int) {
    fun call() {
        println("Calling...")
    }

    open fun showNumber() {
        println("My phone number is $number")
    }
}