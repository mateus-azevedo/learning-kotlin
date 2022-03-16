package br.com.alura.bytbank

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
    for (i in 1..5) {
        println(i)
    }
    println("fim funcao2")
}