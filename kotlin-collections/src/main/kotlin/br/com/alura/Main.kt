package br.com.alura

/**
 * Iterable - comportamento mais genéricos e limitados
 * Collection - comportamentos mais específicos em relação ao Iterable
 * List - comportamentos mais específicos em relação ao Collection
 *
 * Veja mais em: https://kotlinlang.org/docs/collections-overview.html
 * */

fun main() {
    val nomes: List<String> =
        listOf("Goku", "Vegeta", "Kuririn", "Trunks", "Piccolo", "Gohan", "Mr.Satan", "Majin Boo", "Deus Yamcha")
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Gohan")}")
    println("Tamanho da coleção ${nomes.size}")
}