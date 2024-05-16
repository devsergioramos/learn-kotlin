package com.sergio.ramos

import java.io.Serializable

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair(country, 300000000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple(country, "America", 300000000)
}

// Its only data class
data class Fourth<out A, out B, out C, out D>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth)"
}

fun stateInformation(country: String): Fourth<String, String, Long, String> {
    return Fourth(country, "America", 300000000, "BR")
}

fun main() {
    val resultCapitalAndP = capitalAndPopulation("Brazil")
    println(resultCapitalAndP.first)
    println(resultCapitalAndP.second)

    val resultCountryInf = countryInformation("Brazil")
    println(resultCountryInf.first)
    println(resultCountryInf.second)
    println(resultCountryInf.third)

    val resultStateInf = stateInformation("Brazil")
    println(resultStateInf.first)
    println(resultStateInf.second)
    println(resultStateInf.third)
    println(resultStateInf.fourth)

    val (capital, population) = capitalAndPopulation("Brazil")
    println(capital)
    println(population)

    val (country, continent, population2) = countryInformation("Brazil")
    println(country)
    println(continent)
    println(population2)

    val (id, name, email) = CustomerDt(1, "Sergio", "sergio.b.snp@gmail.com")
    println(id)
    println(name)
    println(email)

    val listCapitalAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capital2, country2) in listCapitalAndCountries) {
        println("$capital2 - $country2")
    }
}