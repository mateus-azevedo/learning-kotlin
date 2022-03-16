package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("inicio main")
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
    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println("ClassCastException catched")
    }

    println("fim funcao2")
}