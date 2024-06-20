@file:JvmName("TopLevelFunctions")

package com.sergio.ramos

const val COPYRIGHT = 2024

fun prefix(prefix: String, value: String): String {
    println("$prefix-$value")
    return "$prefix-$value"
}