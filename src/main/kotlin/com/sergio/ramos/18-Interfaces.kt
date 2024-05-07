package com.sergio.ramos

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer) {
        // implement code to store
    }

    fun getById(id: Int): Customer
}

class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer(1, "Sergio")
    }

    override fun store(obj: Customer) {

    }

    override val isEmpty: Boolean
        get() = false

}

interface Interface1 {
    fun funA() {
        println("Fun A from Interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from Interface 2")
    }
}

class Class1And2: Interface1, Interface2 {
    override fun funA() {
        super<Interface2>.funA()
    }
}

fun main() {
    val class1And2 = Class1And2()
    class1And2.funA()
}