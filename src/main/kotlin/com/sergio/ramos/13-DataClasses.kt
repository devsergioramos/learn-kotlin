package com.sergio.ramos

data class CustomerDt(val id: Int, var name: String, val email: String) {
    override fun toString(): String {
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}

fun main() {
    val customer = CustomerDt(1, "Sergio", "sergio.b.snp@gmail.com")
    println("Customer id: ${customer.id}, name: ${customer.name}")

    val customer1 = CustomerDt(1, "Sergio", "sergio.b.snp@gmail.com")
    val customer2 = CustomerDt(2, "Sergio", "sergio.b.snp@gmail.com")

    val customer3 = customer1

    if (customer1 == customer2) {
        println("They are the same")
    }

    val customer4 = customer1.copy(email = "sergio.ramos@unemat.br")
    println(customer4.id)
    println(customer.name)
    println(customer4.email)

    println(customer1.toString())
}