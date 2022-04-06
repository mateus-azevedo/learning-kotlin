package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua presidente vargas", numero = 1234)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let (::println)

    val enderecoComComplemento = listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco -> endereco?.complemento?.isNotEmpty() == true }.let(::println)

    soma(1, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234) {
        println("realizar pagamento")
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma sendo efetuada")
    resultado(a + b)
}