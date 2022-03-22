package br.com.alura.list

import br.com.alura.list.funcoes.imprimeComMarcadores

fun main() {
    /**
     * Com as devidas alterações no arquivo Prateleira.kt
     *
     * Mesmo livros = listaDeLivros recebendo uma MutableList nossa implementação em Prateleira.kt está para List
     * e seus métodos estão retornando lista <List> e sabemos que <List> são imutáveis, então, cada retorno de método
     * eu recebo um objeto diferente resultando na impressão esperada nas linhas 18 e 19 deste arquivo.
     *
     *                                     18: porAutor.imprimeComMarcadores()
     *                                     19: porAnoPublicacao.imprimeComMarcadores()
     * */
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}