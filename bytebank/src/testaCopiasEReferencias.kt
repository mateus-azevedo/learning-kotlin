fun testaCopiasEReferencias() {
    val numeroX = 10;
    var numeroY = numeroX;
    numeroY++;

    println("numeroX $numeroX\nnumeroY $numeroY");

    val contaJoao = Conta("João", 1002);
    var contaMaria = Conta("Maria", 1003);


    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao);
    println(contaMaria);
}