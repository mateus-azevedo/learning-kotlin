package br.com.alura.array

import java.math.BigDecimal

fun main() {
    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO } // Usando o artificio generic's
    salarios[0] = "1500.55".toBigDecimal()  // Aqui o valor é convertido de String para BigDecimal. Utilizamos String
    salarios[1] = "2000.00".toBigDecimal()  // para garantir o valor. Já que Double pode ter problema de arredondamento
    println(salarios.contentToString())
}