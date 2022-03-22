package br.com.alura.list

import br.com.alura.list.funcoes.imprimeComMarcadores

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()             // o resultado da impressão é o mesmo porque ambas variáveis apontam
    porAnoPublicacao.imprimeComMarcadores()     // para o mesmo objeto. fazendo com que a saida seja a mesma
}