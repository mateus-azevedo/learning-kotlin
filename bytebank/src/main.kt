fun main() {
    println("Bem vindo ao Bytebank");
    val contaAlex = Conta();
    contaAlex.titular = "Alex";
    contaAlex.numero = 1000;
    contaAlex.setSaldo(200.0);

    val contaFran = Conta();
    contaFran.titular = "Fran";
    contaFran.numero = 1001;
    contaFran.setSaldo(300.0);

    println(contaFran.titular);
    println(contaFran.numero);
    println(contaFran.getSaldo());
    println("======================");
    println(contaAlex.titular);
    println(contaAlex.numero);
    println(contaAlex.getSaldo());

//    println("depositando na conta do Alex");
//    contaAlex.deposita(50.0);
//    println(contaAlex.saldo);
//
//    println("depositando na conta da Fran");
//    contaFran.deposita(70.0);
//    println(contaFran.saldo);
//
//    println("sacando na conta do Alex");
//    contaAlex.saca(250.0);
//    println(contaAlex.saldo);
//
//    println("sacando na conta da Fran");
//    contaFran.saca(100.0);
//    println(contaFran.saldo);
//
//    println("saque em excesso na conta do Alex");
//    contaAlex.saca(100.0);
//    println(contaAlex.saldo);
//
//    println("saque em excesso na conta da Fran");
//    contaFran.saca(500.0);
//    println(contaFran.saldo);
//
//    println("transferencia da conta da Fran para o Alex");
//
//    if (contaFran.transfere(100.0, contaAlex))
//        println("Transferido com sucesso");
//    else
//        println("Falha na tranferencia");
//
//    println("Saldo Alex: R$${contaAlex.saldo}");
//    println("Saldo Fran: R$${contaFran.saldo}");
}

class Conta {
    var titular = "";
    var numero = 0;
    private var saldo = 0.0;

    fun deposita(valor: Double) {
        this.saldo += valor;
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor;
            destino.deposita(valor);
            return true;
        }

        return false;

    }

    fun getSaldo(): Double {
        return saldo;
    }

    fun setSaldo(valor: Double) {
        if (valor > 0)
            saldo = valor;
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10;
    var numeroY = numeroX;
    numeroY++;

    println("numeroX $numeroX\nnumeroY $numeroY");

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao);
    println(contaMaria);
}

fun testaLacos() {
    // conta de 1 até 5
    var i = 0;
    for (i in 1..5) {
        val titular = "Alex $i";
        val numeroConta = 1000 + i;
        var saldo = i + 10.0;

        println("titular: $titular");
        println("numero da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
    }

    // conta de 5 até 1 saltando de 2 em 2
    for (i in 5 downTo 1 step 2) {
        val titular = "Mateus $i";
        val numeroConta = 2000 + i;
        var saldo = i + 20.0;

        println("titular: $titular");
        println("numero da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
    }

    // conta de 1 até 4 (exclui o ultimo valor da itereacao)
    for (i in 1 until 5) {
        val titular = "Marquinhos $i";
        val numeroConta = 3000 + i;
        var saldo = i + 30.0;

        println("titular: $titular");
        println("numero da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva");
        saldo == 0.0 -> println("conta é neutra");
        else -> println("conta é negativa");
    }
}