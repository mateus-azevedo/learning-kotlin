package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")

    val entrada: String = "1.9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null // valor recebe null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorRecebido != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")

    try {
        funcao2()
    } catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException catched")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }

    println("fim funcao2")
}