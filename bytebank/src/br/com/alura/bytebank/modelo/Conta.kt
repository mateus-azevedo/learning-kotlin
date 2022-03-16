package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException


abstract class Conta(
    val titular: Cliente, val numero: Int
) {
    var saldo = 0.0
        protected set // os membros conseguem utilizar

    // companion object Contador { // Continua sendo object declarations, mas nao precisa colocar o nome quando utilizamos o Companion
    companion object {
        var total = 0
            private set
    }

    init { // comportamento similar ao constructor secundario
        println("Criando Conta")
        // Contador.total++ // com o uso do companion object esta declaracao fica redundante, porque ele entende que total pertence a classe agora
        total++ // Usando da forma nao redundante
    }

    fun deposita(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraido: $valor"
            )
        }

        saldo -= valor
        destino.deposita(valor)

    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1

        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}