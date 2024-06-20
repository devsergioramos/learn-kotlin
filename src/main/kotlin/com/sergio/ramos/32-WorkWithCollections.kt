package com.sergio.ramos

import java.util.*

fun main(args: Array<String>) {
    var emptyList = emptyList<Int>()
    var list = listOf(1, 2, 3, 4, 5)

    var numbers = 1..100

    val cities = listOf("Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza")

    val empty = emptyList<String>()

    println(cities.javaClass)
    println(empty.javaClass)

    val arrayList = Arrays.asList("Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza")
    println(arrayList.javaClass)

    val mutableCities = mutableListOf("Madrid", "Barcelona", "Valencia", "Sevilla", "Zaragoza")
    mutableCities.add("Bilbao")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("Barcelona", "Spain"), Pair("Valencia", "Spain"))
    hashMapOf("Madrid" to "Spain", "Barcelona" to "Spain", "Valencia" to "Spain")

    val booleans = booleanArrayOf(true, false, true, false)
    val characters = charArrayOf('a', 'b', 'c', 'd')
}