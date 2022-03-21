package br.com.alura.array

fun main() {
    val idades = IntArray(5)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    idades[4] = 55

    var maiorIdade = 0
    for (idade in idades) {  // para cada idade dentro de arrays idades executamos uma operação
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)
}