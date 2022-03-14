import modelo.Cliente
import novoModelo.Cliente as NovoCliente
// Exemplo de caso de ambiguidade

fun main() {
    val cliente = Cliente(nome = "Alex", cpf = "", senha = 1)
    val clienteNovo = NovoCliente()
}

