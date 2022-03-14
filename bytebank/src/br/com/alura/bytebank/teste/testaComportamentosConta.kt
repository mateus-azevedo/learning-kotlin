import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000);
    contaAlex.deposita(200.0);

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001);
    contaFran.deposita(300.0);

    println(contaFran.titular);
    println(contaFran.numero);
    println(contaFran.saldo);
    println("======================");
    println(contaAlex.titular);
    println(contaAlex.numero);
    println(contaAlex.saldo);

    println("depositando na conta do Alex");
    contaAlex.deposita(50.0);
    println(contaAlex.saldo);

    println("depositando na conta da Fran");
    contaFran.deposita(70.0);
    println(contaFran.saldo);

    println("sacando na conta do Alex");
    contaAlex.saca(250.0);
    println(contaAlex.saldo);

    println("sacando na conta da Fran");
    contaFran.saca(100.0);
    println(contaFran.saldo);

    println("saque em excesso na conta do Alex");
    contaAlex.saca(100.0);
    println(contaAlex.saldo);

    println("saque em excesso na conta da Fran");
    contaFran.saca(500.0);
    println(contaFran.saldo);

    println("transferencia da conta da Fran para o Alex");

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferido com sucesso")
    } else {
        println("Falha na tranferencia")
    }

    println("Saldo Alex: R$${contaAlex.saldo}");
    println("Saldo Fran: R$${contaFran.saldo}");
}