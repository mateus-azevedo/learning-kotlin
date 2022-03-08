abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    // apenas classes não abstratas deve implementar bonificação
    // abstract val bonificacao: Double

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }

        return false
    }
}