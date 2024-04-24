import java.util.*


class Customer1(initId: Int, initName: String) {
    var id = initId
    var name: String = initName
    val surname: String = ""
}

class Customer(val id: Int, var name: String = "") {
    init {
        name = name.uppercase()
    }

    constructor(email: String): this(20, "Sergiao") {
        println("Secondary constructor")
    }

    init {
        println("Other block")
    }
}

class Customer2(val id: Int, var name: String, val yaarOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yaarOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            field = value
        }


    fun customerAsString(): String {
        return "Customer2 id: $id, name: $name, age: $age"
    }
}



fun main(args: Array<String>) {
    val customer = Customer(10, "Sergio")
    println("Customer id: ${customer.id}, name: ${customer.name}")

    val customer2 = Customer2(10, "Sergio", 1996)
    customer2.socialSecurityNumber = "SN1234"

    customer2.customerAsString()

    println("Customer2 id: ${customer2.id}, name: ${customer2.name}, age: ${customer2.age}")
    println("Customer2 socialSecurityNumber: ${customer2.socialSecurityNumber}")

}