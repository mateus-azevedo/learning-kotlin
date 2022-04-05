package br.com.alura

/**
 * (::) = Referencia da funcao
 */
fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao)    // imprime a referencia funcao
    println(minhaFuncao())  // imprime a execucao da funcao (executa a funcao de referencia e imprime o retorno da funcao)
    println()
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses)
    println(minhaFuncaoClasses())
}

fun teste() {
    println("exexuta teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}