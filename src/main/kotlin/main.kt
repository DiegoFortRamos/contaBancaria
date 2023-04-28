fun main(){
    val diego = Conta(
        nome = "Diego Ramos",
        endereco = "Rio de Janeiro",
        profissao = "Dev",
        cpf = "177.563.622-89",
        numeroConta = 1,
        titularConta = "Diego"
    )

    val ana = Conta(
        nome = "Ana Carolina",
        endereco = "Rio de Janeiro",
        profissao = "Contadora",
        cpf = "158.563.622-89",
        numeroConta = 2,
        titularConta = "Ana"
    )

    diego.mostraDadosCliente()
    diego.deposita(valor = 1200.0)
    //diego.saca(valor = 200.0)
    diego.transfere(valor = 200.0, destino = ana)
    ana.mostraSaldo()
}