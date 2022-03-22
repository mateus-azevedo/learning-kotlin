package br.com.alura.list

import br.com.alura.list.funcoes.imprimeComMarcadores

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
}