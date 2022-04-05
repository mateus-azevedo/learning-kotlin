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
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b -> // quando não usar o parâmetro podemos por _, b
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoAnonima: (Int, Int) -> Int = fun (a, b): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{
        if (it > 1000.0) {
            return@lambda it + 50
        }
        return@lambda it + 100.0
    }
    println(calculaBonificacao(1100.0))
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