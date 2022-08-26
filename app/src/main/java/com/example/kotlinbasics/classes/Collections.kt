package com.example.kotlinbasics.classes

import com.example.kotlinbasics.newTopic

fun main() {
    newTopic("Collections")
    newTopic("Readonly")

    val fruitList = listOf<String>("Apple", "Banana", "Grape", "Lima")
    println(fruitList[fruitList.indices.random()])
    println("Index of grape is ${fruitList.indexOf("Grape")}")

    newTopic("Mutable List")

    val myUser: User = User(0, "Jesus", "Castillo", Group.FAMILY.ordinal)
    val mySister: User = myUser.copy(id = 1, name = "Milagros")
    val myFriend: User = myUser.copy(id = 2, group = Group.FRIEND.ordinal)

    val usersList = mutableListOf<User>(myUser, mySister)
    println(usersList)
    usersList.add(myFriend)
    println(usersList)
//    usersList.removeAt(1)
    usersList.remove(mySister);
    println(usersList)

    val usersSelectedList = mutableListOf<User>()
    println(usersSelectedList)
//    usersSelectedList.addAll(usersList);
    usersSelectedList.add(myUser)
    println(usersSelectedList)
    usersSelectedList[0] = mySister
    println(usersSelectedList)
    usersSelectedList.add(myUser)
    usersSelectedList.add(myUser)
    println(usersSelectedList)
}