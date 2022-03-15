import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep = "000"
    )

    println(endereco.equals(enderecoNovo)) // sobrescrita no Endereco

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

//    println(endereco.toString())
//    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any) : Any {
    println(valor)
    return valor
}


