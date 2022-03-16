package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")

    val entrada: String = "1,9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null // valor recebe null
    }

    if (valor != null) {
        println("valor recebido: $valor")
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