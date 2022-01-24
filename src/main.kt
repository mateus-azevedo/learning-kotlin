fun main() {
    println("Bem vindo ao Bytebank");
    val titular = "Alex";
    val numeroConta = 1000;
    var saldo = 0.0;

    saldo = 100 + 2.0;
    saldo += 200;
    saldo = -1.0;

    println("titular: $titular");
    println("numero da conta $numeroConta");
    println("saldo da conta $saldo");

    if(saldo > 0.0){
        println("conta é positiva")
    } else if (saldo == 0.0){
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