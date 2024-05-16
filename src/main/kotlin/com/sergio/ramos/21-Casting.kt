package com.sergio.ramos

open class Person {

}

class Employee2: Person() {
    fun vacationDay(days: Int) {
        if (days < 10) {
            println("You need more vacations")
        }
    }
}

class Contractor: Person() {
}

var input: Any = 10

fun hasVacations(obj: Person) {
    if (obj is Employee2) {
        obj.vacationDay(20)
    } else {
        println("No vacations for you")
    }
}

fun main() {
    val employee = Employee2()
    val contractor = Contractor()

    hasVacations(employee)
    hasVacations(contractor)

    val str = input as?  String

    if (input is String) {
        println(str?.length)
    } else {
        println("Not a string")
    }
}