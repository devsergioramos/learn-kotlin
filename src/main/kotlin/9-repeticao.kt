import java.util.*

fun main(args: Array<String>) {
    var listaCompras = arrayOf("Arroz", "Feijão", "Frango", "Macarrão")

    var indice = 0

    println("Init while")
    while (indice < listaCompras.size) {
        println(listaCompras[indice])
        indice++
    }
    println("End while")

    println("Init for")
    for (i in 0..3) {
        println(listaCompras[i])
    }
    println("End for")

    println("Init for")
    for (i in listaCompras) {
        println(i)
    }
    println("End for")
}