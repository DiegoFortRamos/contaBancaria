open class Cliente(
    val nome : String,
    val endereco : String,
    val profissao : String,
    var cpf : String
) {
     open fun mostraDadosCliente(){
         println("===============Dados Clientes===============")
         println("Nome : ${nome} \nEndereço : $endereco \nCpf : ${cpf} \nProfissão : ${profissao}  \n" )
    }


}
