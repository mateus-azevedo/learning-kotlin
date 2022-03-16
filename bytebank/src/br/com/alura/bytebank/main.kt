package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaExpressao

fun main() {
    println("inicio main")
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

        throw ClassCastException() // Lançando throw-exception
//        throw ArithmeticException()
//        throw NumberFormatException()
    }

    println("fim funcao2")
}