package br.com.alura

fun main() {
    val assistiramCursoAndroid: List<String> = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbos)
}