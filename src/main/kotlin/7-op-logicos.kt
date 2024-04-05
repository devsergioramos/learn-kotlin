fun main(args: Array<String>) {
    var ceu = "Azul"
    var car = "Branco"

    // true
    var afirmativa1 = ceu == "Azul" && car == "Branco"
    println(afirmativa1)

    // false
    var afirmativa2 = ceu == "Azul" && car == "Preto"
    println(afirmativa2)

    // true
    var afirmativa3 = ceu == "Azul" || car == "Preto"
    println(afirmativa3)

    // true
    var afirmativa4 = ceu == "Preto" || car == "Branco"
    println(afirmativa3)

    // false
    var afirmativa5 = ceu == "Branco" || car == "Preto"
    println(afirmativa5)
}