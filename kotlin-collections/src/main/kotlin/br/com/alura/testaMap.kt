package br.com.alura

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> =
        mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 64.0),
            3 to 50.0, // método infix
            4 to 100.0,
            5 to 150.0,
            6 to 80.0
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

    pedidos.filter { (numero, valor) ->
        true
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados);

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosPares)

    // plus and minus operator
    println("\n* plus and minus operator *")
    println("plus")
    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println("\nminus")
    println(pedidos - 6)
    println(pedidos - listOf(6, 5))
    println(pedidos)

    // adding and updating entries
    println("\n* adding and updating entries *")
    println("adding")
    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0))
    // comportamente de sobrescrita
    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos)
    // plus assing
    pedidos += listOf(9 to 90.0, 10 to 20.0, 11 to 30.0)
    println(pedidos)

    println("\nremove entries")
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    // minus assing
    pedidos -= 6
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido ${pedido.value}\n")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}