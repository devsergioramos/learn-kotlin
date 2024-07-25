package com.sergio.ramos

class ControleRemoto : Controlador {
    private var aberto: Boolean = false
    private var fechado: Boolean = false

    override fun abrir() {
        if (!this.aberto) {
            this.setAberto(true)
            this.setFechado(false)

            println("Portão está agora aberto.")
        } else {
            println("Ooops! Portão já está aberto.")
        }
    }

    override fun fechar() {
        if (!this.fechado) {
            this.setFechado(true)
            this.setAberto(false)

            println("Portão está agora fechado.")
        } else {
            println("Ooops! Portão já está fechado.")
        }
    }

    override fun sincronizar() {
        TODO("Not yet implemented")
    }

    private fun setAberto(valor: Boolean) {
        this.aberto = valor
    }

    private fun setFechado(valor: Boolean) {
        this.fechado = valor
    }
}