abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    open fun autentica(senha: Int): Boolean {
        println("autentica funcionário admin")
        if(this.senha == senha) {
            return true
        }

        return false
    }

}