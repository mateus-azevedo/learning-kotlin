package br.com.alura

fun main() {
    val pedidos =
        mapOf(
            Pair(1, 20.0),
            Pair(2, 43.0),
            3 to 50.0 // método infix
        )
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido ${pedido.value}\n")
    }
}