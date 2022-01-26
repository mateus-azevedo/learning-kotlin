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