package com.sergio.ramos

fun outsideFunction() {
    for (number in 1..30) {
        unaryOperation(20) { x ->
            println(number)
            x * number
        }
    }
}

fun main() {
    outsideFunction()
}