package br.com.alura

/**
 * (::) = Referencia da funcao
 */
fun main() {
    testaTipoFuncaoReferencia()
    println()
    testaTipoFuncaoClasse()
    /**
     * Estas duas implementações não são reutilizáveis!!
     * Lambda e Função anônima
     */
//    val minhaFuncaoLambda: () -> Unit = {
//        println("Executa como lambda")
//    }
//    println(minhaFuncaoLambda())
//    val minhaFuncaoAnonima: () -> Unit = fun () {
//        println("Executa funcao anonima")
//    }
//    println(minhaFuncaoAnonima())
}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao)    // imprime a referencia funcao
    println(minhaFuncao(5, 10))  // imprime a execucao da funcao (executa a funcao de referencia e imprime o retorno da funcao)
}

fun soma(a: Int, b:Int): Int {
    return a + b
}

class Soma: (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2

}