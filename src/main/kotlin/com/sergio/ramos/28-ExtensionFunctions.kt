package com.sergio.ramos

fun String.hello() {
    println("It's me!")
}

fun String.toTitleCase(prefix: String): String {
    val phrase = this.split(" ").joinToString(" ") { it.replaceFirstChar { char -> char.uppercase() } }
    return "$prefix $phrase"
}

fun main() {
    val myString = "jude, don't make it bad!"
    println(myString.toTitleCase("Hey"))
    "hello".hello()

    val customer = CustomerL3()
    customer.makePreferred("New message")

    val instance: BaseClass = InheritedClass()

    instance.extension()
}

class CustomerL3 {
    fun makePreferred() {
        println("Customer version")
    }
}

fun CustomerL3.makePreferred(message: String) {
    println(message)
}

open class BaseClass {
    open fun validate() {
        println("Base class validate")
    }
}

class InheritedClass: BaseClass() {
    override fun validate() {
        super.validate()
        println("Inherited class validate")
    }
}

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}