package br.com.alura.array.executa

fun OperacoesAgregadorasComIdades() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior Idade = $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaDasIdades = idades.average()
    println("Média das Idades: $mediaDasIdades")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos Maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val apenasDeMaiores = idades.filter { it >= 18 }
    println("Maiores de Idade: $apenasDeMaiores")

    val busca18 = idades.find { it == 18 }
    println("Busca: $busca18")
}