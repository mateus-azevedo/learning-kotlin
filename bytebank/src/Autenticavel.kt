interface Autenticavel {

    val senha: Int

    fun autentica(senha: Int) : Boolean {
        println("autentica interface admin")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}