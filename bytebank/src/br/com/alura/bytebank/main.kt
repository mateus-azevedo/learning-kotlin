package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    // ? - para informar que pode ser nulo
    var enderecoNulo: Endereco? = null
    // !! - para informar que não é nulo
    val enderecoNaoNulo: Endereco = enderecoNulo!!
    enderecoNaoNulo.logradouro
}