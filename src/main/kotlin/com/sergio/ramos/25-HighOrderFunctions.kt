package com.sergio.ramos

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))
}