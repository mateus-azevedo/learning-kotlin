package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "casa")
    val logradouroNovo: String? = enderecoNulo?.logradouro

//    enderecoNulo = null // funciona mesmo com o let

    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento nao pode ser vazio") // Elvis Operator - syntax sugar
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int // safecasts
    println(numero)
}