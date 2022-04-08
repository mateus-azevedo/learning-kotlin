package br.com.alura.bytbank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    /**
     * Scope functions
     * https://kotlinlang.org/docs/scope-functions.html
     * --> run() sem extensão para executar qualquer instrução retornando ou não uma computação.
     * --> also() para imprimir o que está acontecendo no código e devolver o objeto de contexto.
     * --> apply() para inicializar o objeto de contexto e devolvê-lo.
     * --> with() para computar e devolver algo utilizando os membros do objeto de contexto.
     *
     * - Chama um ou mais membros do objeto de contexto -> Utilize o objeto de contexto receiver.
     * - Não chama membros do objeto do contexto -> Utilize o objeto de contexto como argumento.
     * - Não faz a configuração do objeto, inicializações ou chamadas de membros -> Utilize ou let() ou also().
     */

    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
        logradouro = "rua vergueiro"
        numero = 3185
    }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    /** * * * * **/

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