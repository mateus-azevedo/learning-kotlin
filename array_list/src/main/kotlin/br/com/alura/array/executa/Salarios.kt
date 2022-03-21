package br.com.alura.array.executa

fun Salarios() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    // iterando em cada indice de salarios
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println("Iterado em cada indice\n${salarios.contentToString()}\n")

    // utilizando o metodo forEachIndexed
    salarios.forEachIndexed { indice, salario ->
        salarios[indice] = salario * aumento
    }

    println("Utilizado forEachIndexed\n${salarios.contentToString()}\n")
}