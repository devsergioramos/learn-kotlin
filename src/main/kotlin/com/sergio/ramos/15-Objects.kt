package com.sergio.ramos

object Global {
    val PI = 3.14
}

fun main() {

    val localObject = object {
        val PI = 3.1416
    }

    println(localObject.PI)

    println(Global.PI)
}