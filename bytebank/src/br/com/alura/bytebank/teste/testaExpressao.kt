package br.com.alura.bytebank.teste

fun testaExpressao() {
    val entrada: String = "1.9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null // valor recebe null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorRecebido != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }
}