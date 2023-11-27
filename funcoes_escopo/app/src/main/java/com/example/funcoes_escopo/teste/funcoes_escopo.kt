package com.example.funcoes_escopo.teste

data class Produto(
    var nome: String,
    var preco: Double
)

class AlertaMensagem(){
    fun configurarTitulo(titulo: String){
        println(titulo)
    }

    fun configurarDescricao(descricao: String){
        println(descricao)
    }
}

fun main(){

    val listaNomes = listOf("igor", "julia", "gabriela")

    listaNomes
        .map { it.uppercase() }
        .also { println(it) }


/*    val alertaMensagem = AlertaMensagem()

    alertaMensagem.apply {
        configurarTitulo("Título")
        configurarDescricao("Descrição")
    }*/



/*    var produto: Produto? = null

    produto = Produto("iphone 14", 4800.00)

    produto?.let {
        it.preco = 4500.00
        salvarProduto(produto)
    }

    println(produto?.nome)
    println(produto?.preco)*/
}