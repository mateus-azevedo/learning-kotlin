package br.com.alura

fun testaPedidos() {
    val pedidos: List<Pedido> = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    /**
     * associateWith tem a ideia contraria ao associate.
     * */
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println("\nPedidos Fretes Gratis maiores que 50.0\nTrue: ${pedidosFreteGratisAgrupados[true]}")
    println("False: ${pedidosFreteGratisAgrupados[false]}")

    val nomes: List<String> = listOf("Mateus", "Lucas", "Raquel", "Mario", "Maria Chiquinha", "Chaves", "Ana")
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome -> nome.first() }

    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)