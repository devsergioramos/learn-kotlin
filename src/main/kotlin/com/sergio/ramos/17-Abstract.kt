package com.sergio.ramos

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {
        println("Employee stored")
    }
}

fun main() {
    val employee = Employee()
    employee.store()
    println(employee.status())
}