open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open val bonificacao: Double
        get() {
            println("Passando pela bonificacao do Funcionario")
            return salario * 0.1
        }

}