package br.com.alura.array

fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    var indice_array = 0
    // iterando em cada elemento de salarios
    for (salario in salarios) {
        salarios[indice_array] = salario * aumento
        indice_array++
    }

    println("Iterado em cada elemento\n${salarios.contentToString()}\n")
    // resetando valores de salarios p/ o exemplo abaixo
    salarios[0] = 1500.50; salarios[1] = 2300.0; salarios[2] = 5000.0; salarios[3] = 8000.0; salarios[4] = 10000.0

    // iterando em cada indice de salarios
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println("Iterado em cada indice\n${salarios.contentToString()}\n")
}