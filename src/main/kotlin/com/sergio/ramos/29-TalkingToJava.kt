package com.sergio.ramos

fun main() {
    val customer = CustomerJava()

    customer.name = "Sergio"
    customer.email = "sergio2024@gmail.com"
    customer.id = 2

    customer.prettyPrint()

    customer.neverNull()
    customer.sometimesNull()

    val runnable = Runnable { println("I'm a Runnable") }

    val kr = KotlinCustomerRep()

    val customerJava = kr.getById(10)

    customerJava.id
}

class RunnableKotlin: Runnable {
    override fun run() {
        println("I'm a Runnable")
    }
}

class PersonInKotlin: PersonJava() {

}

class KotlinCustomerRep: CustomerJavaRepository {
    override fun getById(id: Int): CustomerJava {
        return CustomerJava()
    }

    override fun getAll(): MutableList<CustomerJava> {
        return mutableListOf(CustomerJava())
    }
}