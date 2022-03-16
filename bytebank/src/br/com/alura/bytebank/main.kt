package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")

    val entrada: String = "1,9"
    try {
        val valor: Double = entrada.toDouble()
        println("valor recebido: $valor")
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
    }

    println("valor recebido: $valor") // Como posso receber este valor?

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