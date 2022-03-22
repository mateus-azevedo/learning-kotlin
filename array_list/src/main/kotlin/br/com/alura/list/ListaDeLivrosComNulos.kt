package br.com.alura.list

import br.com.alura.list.funcoes.imprimeComMarcadores

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora Desconhecida" } // elvis operator
        .forEach { (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
    // listaLivrosComNulos.imprimeComMarcadores()
}