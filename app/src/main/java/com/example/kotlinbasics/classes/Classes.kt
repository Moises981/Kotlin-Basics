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

    val myUser: User = User(0, "Jesus", "Castillo", Group.FAMILY.ordinal)
    val mySister: User = myUser.copy(id = 1, name = "Milagros")
    val myFriend: User = myUser.copy(id = 2, group = Group.FRIEND.ordinal)

    println(myUser.component3())
    println(myUser)
    println(mySister)
    println(myFriend)

    newTopic("Scoped functions")
    with(smartphone) {
        println("Private? $isPrivate")
        call()
    }

//    myFriend.group = Group.WORK.ordinal
//    myFriend.name = "Anderson"
//    myFriend.lastName = "Tito"
    myFriend.apply {
        group = Group.WORK.ordinal
        name = "Anderson"
        lastName = "Tito"
    }
    println(myFriend)
}