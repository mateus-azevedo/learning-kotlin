package br.com.alura.list.funcoes

import br.com.alura.list.Livro

fun List<Livro?>.imprimeComMarcadores() {
    val tituloFormatado = this
        .filter { it != null } // faz com que não seja impresso o null
        .joinToString(separator = "\n") {
            " - ${it?.titulo} de ${it?.autor}"
        }
    println("#### Lista de Livros ####\n$tituloFormatado")
    println()
}