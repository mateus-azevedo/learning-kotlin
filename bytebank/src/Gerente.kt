class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin (
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return salario;
        }

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }
}