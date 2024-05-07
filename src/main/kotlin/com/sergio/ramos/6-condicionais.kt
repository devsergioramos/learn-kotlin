package com.sergio.ramos

fun main() {
    var idade = 28
    var maturidade: Byte

    if (idade >= 28) {
        maturidade = 70
    } else if (idade >= 20 && idade < 28 ) {
        maturidade = 40
    } else if (idade >= 18 && idade < 20) {
        maturidade = 20
    } else {
        maturidade = 0
    }

    println(maturidade)
}