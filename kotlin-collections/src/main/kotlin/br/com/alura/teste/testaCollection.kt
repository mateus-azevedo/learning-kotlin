package br.com.alura.teste

/**
 * Iterable - comportamento mais genéricos e limitados
 * Collection - comportamentos mais específicos em relação ao Iterable
 * List - comportamentos mais específicos em relação ao Collection
 *
 * Veja mais em: https://kotlinlang.org/docs/collections-overview.html
 * */

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes

    banco.salva("Freeza")

    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = Companion.dados.toList() // conversão possivel por List ser compátivel com Collections

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        /**
         * Caso trabalhe com qualquer coleção mutável - evite o máximo possível deixá-la exposta
         * */
        private val dados = mutableListOf<String>()
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
