package br.com.alura

/**
 * (::) = Referencia da funcao
 */
fun main() {
//    testaTipoFuncaoReferencia()
//    println()
//    testaTipoFuncaoClasse()
    /**
     * Estas duas implementações não são reutilizáveis!!
     * Lambda e Função anônima
     */
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("Executa funcao anonima")
    }
    println(minhaFuncaoAnonima())
}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao)    // imprime a referencia funcao
    println(minhaFuncao())  // imprime a execucao da funcao (executa a funcao de referencia e imprime o retorno da funcao)
}

fun teste() {
    println("exexuta teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}