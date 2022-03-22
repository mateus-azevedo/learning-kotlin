package br.com.alura

/**
 * Iterable - comportamento mais genéricos e limitados
 * Collection - comportamentos mais específicos em relação ao Iterable
 * List - comportamentos mais específicos em relação ao Collection
 *
 * Veja mais em: https://kotlinlang.org/docs/collections-overview.html
 * */

fun main() {
    val banco = BancoDeNomes()
    // banco.nomes.add("Freeza")
    banco.salva("Freeza")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    /**
     * Caso trabalhe com qualquer coleção mutável - evite o máximo possível deixá-la exposta
     * */
    private val dados = mutableListOf<String>()
    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }
}

fun testaColecao() {
    val nomes: Collection<String> =
        mutableListOf("Goku", "Vegeta", "Kuririn", "Trunks", "Piccolo", "Gohan", "Mr.Satan", "Majin Boo", "Deus Yamcha")
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Gohan")}")
    println("Tamanho da coleção ${nomes.size}")
}