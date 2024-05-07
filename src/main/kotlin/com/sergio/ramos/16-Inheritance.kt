package com.sergio.ramos

import java.time.Year

enum class TypeOfCar {
    SEDAN, HATCHBACK, SUV
}

open class Car(val typeOfCar: TypeOfCar) {
    open fun validate() {
        println("Validating car")
    }
}

open class Renault(val brand: String, val model: String, typeOfCar: TypeOfCar): Car(typeOfCar) {
    final override fun validate() {
        if (brand == "Renault") {
            println("Validating Renault")
        }
    }
}

data class CarSedanEntity(
    val brand: String,
    val model: String,
    val year: String
): Car(TypeOfCar.SEDAN)

class KwidCar: Renault("Renault", "Kwid", TypeOfCar.HATCHBACK)

fun main() {
    val sandero = Renault("Renault", "Sandero", TypeOfCar.HATCHBACK)
    sandero.validate()

    val kwid = KwidCar()
    println(kwid.model)
    kwid.validate()

    val sedan = CarSedanEntity("Chevrolet", "Prisma", Year.now().toString())
    println("${sedan.brand} ${sedan.model} ${sedan.year} ${sedan.typeOfCar}")
    sedan.validate()


}