package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    val endereco = Endereco(logradouro = "rua presidente vargas", numero = 1234)
    /**
     * Scope functions
     * https://kotlinlang.org/docs/scope-functions.html
     */
    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    val enderecoComComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter(predicate = { endereco -> endereco?.complemento?.isNotEmpty() == true }).let(block = (::println))

    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma sendo efetuada")
    resultado(a + b)
}