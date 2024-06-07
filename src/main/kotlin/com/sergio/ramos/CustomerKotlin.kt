package com.sergio.ramos

import java.io.IOException
import kotlin.jvm.Throws

data class CustomerKotlin(var id: Int, var name: String, var email: String, val phone: String?) {
    @JvmField val someProperty: String = "Value"

    override fun toString(): String {
        return """
            CustomerKotlin(id=$id, name=$name, email=$email)
        """.trimIndent()
    }

    @JvmOverloads fun changeStatus(status: Status = Status.PENDING) {

    }

    @JvmName("preferential") fun makePreferred() {

    }

    @Throws(IOException::class) fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("Filename cannot be blank")
        }
    }
}

enum class Status {
    PENDING, ACTIVE
}