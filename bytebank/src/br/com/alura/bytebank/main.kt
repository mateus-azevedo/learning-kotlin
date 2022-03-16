package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")
    try {
        10/0
    } catch (e: ArithmeticException) {
        println("ArithmeticException catched")
    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        try {
            endereco as Endereco
        } catch (e: ClassCastException) {
            println("ClassCastException catched")
        }

    }
    println("fim funcao2")
}