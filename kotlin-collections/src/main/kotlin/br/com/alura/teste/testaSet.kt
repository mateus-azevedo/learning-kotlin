package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}