class Conta(
    nome : String,
    endereco : String,
    profissao : String,
    cpf : String,
    var numeroConta : Int,
    var titularConta : String


) : Cliente(
     nome = nome,
     endereco = endereco,
     profissao = profissao,
     cpf = cpf,

) {


    var saldo = 0.0
        private set

    override fun mostraDadosCliente() {
        super.mostraDadosCliente()
        println("===============Dados Banco===============")
        println("Número da Conta : ${numeroConta} \nTitular da Conta : ${titularConta} \nSaldo : ${this.saldo}")
    }

    fun mostraSaldo() {
       println("Seu saldo atual é de ${this.saldo}")
    }
    fun deposita(valor : Double){
        this.saldo += valor
        println("Sr(a) ${this.nome} você recebeu uma transferência de ${saldo}" )
        mostraSaldo()
    }

    fun saca (valor : Double){
        if (valor <= this.saldo){
            this.saldo -= valor
            println("Sr(a) ${this.nome} você sacou  ${saldo}" )
            mostraSaldo()
        }else if (valor > this.saldo){
            println("Valor insuficiente para saque!!")
        }
    }


    fun transfere(valor : Double, destino : Conta){
        if (valor <= this.saldo){
            this.saldo -= valor
            destino.deposita(valor)
            println("Sr(a) ${nome} você fez uma transferência de ${valor}")
            mostraSaldo()
        }else{
            println("Saldo insuficiente")
        }

    }
}

