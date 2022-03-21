package br.com.alura.array

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55) // insiro os elementos do array e já atualizo o tamanho do array

    var maiorIdade = Int.MIN_VALUE  // Garanto que não terá valor menor que este
    for (idade in idades) {  // para cada idade dentro de arrays idades executamos uma operação
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("Maior idade: $maiorIdade")

    var menorIdade = Int.MAX_VALUE  // Garanto que não terá valor maior que este
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("Menor idade: $menorIdade")
}