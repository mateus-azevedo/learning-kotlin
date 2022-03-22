package br.com.alura.list

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
) {
    /**
     * O método .sortBy() - ele altera a própria lista, servindo para com os tipos MutableList
     *
     * O método .sortedBy() - ele retorna uma nova lista, servindo para com os tipos List
     * */
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}