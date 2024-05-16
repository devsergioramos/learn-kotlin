package com.sergio.ramos


class Service {
    fun evaluate() {
        println("Service evaluated")
    }
}

class ServiceProvider {
    fun createService(): Service? {
        return Service()
    }
}

fun main() {
    val message: String = "This is a non-null message"

    val nullMessage: String? = null
    val inferredNull = null

    println(message.length)

    println(nullMessage?.length)

    val serviceProvider = ServiceProvider()

    serviceProvider?.createService()?.evaluate()
}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()