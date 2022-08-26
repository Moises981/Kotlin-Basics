package com.example.kotlinbasics.classes

import com.example.kotlinbasics.newTopic

fun main(){
    newTopic("Classes")
    val phone :Phone = Phone(241014124)
    phone.call()
    phone.showNumber()
    println(phone.number)
}