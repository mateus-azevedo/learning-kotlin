package br.com.alura.list

fun ListaDeLivros() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha Vida de Menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()
    livros.remove(livro1)
    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    println("\t-- Ordenado por Ano de Publicação --")
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordernadoPorTitulo = livros.sortedBy { it.titulo }
    println("\t-- Ordenado por Titulo do Livro --")
    ordernadoPorTitulo.imprimeComMarcadores()

    println("\t-- Ordenado por Nome do Autor --")
    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val tituloFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("#### Lista de Livros ####\n$tituloFormatado")
    println()
}