package br.com.alura.array

import java.math.BigDecimal

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00")

    println(salarios.contentToString())
}

// vararg - é um tipo especial do Kotlin que possibilita passagem de argumentos variáveis para uma função
// Pode passar 1 valor, 5 valores, 100 valores e etc
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { index ->
        valores[index].toBigDecimal()
    }
}