package com.sergio.ramos

fun operationLb(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {
        println("Committing the transaction")
    }
}

fun main(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(operationLb(x=1, y=2, op=sumLambda))

    unaryOperation(x=2, op={ x -> x * x })
    unaryOperation(x=3, op={ it * it })
    unaryOperation(x=4) { it * it }

    val db = Database()

    transaction(db) {
        // code() HighOrderFunction brackets here
        println("Transaction executed")
    }

    // expressive function
    unaryOperation(x=5, fun(x: Int): Int {
        return if (x > 10) {
            x
        } else {
            x * x
        }
    })
}