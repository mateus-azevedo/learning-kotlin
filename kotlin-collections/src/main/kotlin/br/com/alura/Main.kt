package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double?> =
        mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 43.0),
            3 to 50.0, // método infix
            4 to null
        )

    /**
     * Quando trabalhar nulo preferencialmente utilize o método .getValue() porque se a key não existir retornará
     * uma exception. Ao passo que utilizando o método .get() é retornado null mesmo quando a key não existe - podendo
     * ocasionar inconsistência na aplicação.
     * Exemplo:
     * val valorPedido = pedidos.getValue(5)
     * */
    val valorPedido = pedidos.getValue(4)
    println(valorPedido)

    println(pedidos.getOrElse(0, {
        "Não funcionou"
    }))

    val mensagem: Double? = pedidos.getOrElse(0, {
        0.0
    })

    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }
}