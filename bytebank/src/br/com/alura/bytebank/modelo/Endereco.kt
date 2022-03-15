package br.com.alura.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""
) {
    override fun toString(): String {
        return """
            Endereco(logradouro='$logradouro', 
            numero=$numero, 
            bairro='$bairro', 
            cidade='$cidade', 
            estado='$estado', 
            cep='$cep', 
            complemento='$complemento')
        """.trimIndent() // raw string
    }

    override fun equals(other: Any?): Boolean {
        if (other != null && other is Endereco) {
            return this.cep == other.cep
        }
        return false
    }
}