fun hello(): Unit {
    println("hello")
}

fun throwException(): Nothing {
    throw Exception("This Function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String) {
    extracted(*strings)
}

private fun extracted(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(Args: Array<String>) {
    hello()

    val value = returnsAFour()

    takingString("Some text")

    sum(1,2,3)

    printDetails("John", phone = "1234567890")

    printStrings("1", "2", "3")
    printStrings("text1", "text2", "text3")
}