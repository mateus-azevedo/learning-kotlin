package br.com.alura.list.funcoes

import br.com.alura.list.Livro

fun List<Livro?>.imprimeComMarcadores() {
    val tituloFormatado = this
        .filterNotNull() // método mais recomendado - faz com que não seja impresso o null
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"  // como o .filterNotNull() é um método reconhecido pelo compilador
        }                                     // não é necessário safe null porque Kotlin entende que não virá null
    println("#### Lista de Livros ####\n$tituloFormatado")
    println()
}