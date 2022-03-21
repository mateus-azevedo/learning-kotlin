package br.com.alura.array.executa

fun Ranges() {
    val serie: IntRange = 1.rangeTo(10)
    println("IntRange")
    for (s in serie) {
        print("$s ")
    }

    println("\n")

    val numerosPares = 2..100 step 2
    println("2..100 step 2")
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println("\n")

    val numerosParesReverso = 100 downTo 0 step 2
    println("variable.forEach {print(\"\$it \")}")
    numerosParesReverso.forEach { print("$it ") }

    println("\n")

    val numPares = 2.until(100) step 2
    println("2.until(100) step 2")
    for (numeroPar in numPares) {
        print("$numeroPar ")
    }

    println("\n")

    val intervalo = 1500.0..5000.0
    var salario = 5000.0
    println("intervalo = 1500.0..5000.0\nsalario = 5000.0")
    if (salario in intervalo)
        println("O salário está dentro do intervalo")
    else
        println("O salário não está dentro do intervalo")

    salario = 5001.0
    println("\nintervalo = 1500.0..5000.0\nsalario = 5001.0")
    if (salario in intervalo)
        println("O salário está dentro do intervalo")
    else
        println("O salário não está dentro do intervalo")
}