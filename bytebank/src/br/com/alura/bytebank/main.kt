package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    /**
     * Higher Order Function
     * Quando uma função recebe uma outra função ou retorna uma função
     */
    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }
    teste(1, {})
}

fun testeRecebeString(valor: String) {

}

fun teste(teste: Int, bloco: () -> Unit): () -> Unit {
    return {}
}