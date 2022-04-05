package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Endereco

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
}