package com.sergio.ramos

fun main() {
    // var Mutável
    var nome =  "Sergio Ramos"

    println(nome)

    nome = "Sergio Barbosa Ramos"

    println(nome)

    // val Imutável
    val nome2 = "Coke"

    // nome2 = "Pepsi" -> Error

    println(nome2)

    val controleRemoto = ControleRemoto()
}