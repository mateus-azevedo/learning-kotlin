import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("\nsaldo apos saque corrente: ${contaCorrente.saldo}")
    println("saldo apos saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("\nsaldo corrente após transferir para poupanca: ${contaCorrente.saldo}")
    println("saldo poupanca após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("\nsaldo poupanca após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}