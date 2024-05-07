package com.sergio.ramos

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
}

class MyRepo: Repo {
    override fun <EntityType> getById(id: Int): EntityType {
        TODO("Not yet implemented")
    }

    override fun <R> getAll(): List<R> {
        TODO("Not yet implemented")
    }
}

class CustomerGenericRepository<T>: Repository<T> {
    override fun getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}


fun main() {
    val customerRepository = CustomerGenericRepository<Customer>()
    val customer = customerRepository.getById(10)
    val customers = customerRepository.getAll()
}