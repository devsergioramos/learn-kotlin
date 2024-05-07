package com.sergio.ramos

fun main() {
    var opcao = 6

    when(opcao) {
        1 -> println("Suco de laranja")
        2 -> println("Suco de morango")
        3 -> println("Suco de caju")
        else -> println("Suco de fruta")
    }

    opcao = 1

    var escolha = when(opcao) {
        1 -> "Suco de laranja"
        2 -> "Suco de morango"
        3 -> "Suco de caju"
        else -> "Suco de fruta"
    }

    println(escolha)
}