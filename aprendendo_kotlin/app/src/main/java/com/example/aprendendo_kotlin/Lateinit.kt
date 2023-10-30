package com.example.aprendendo_kotlin

class Produto{
    lateinit var descricao:String
}

fun main(){
    var produto = Produto()

    produto.descricao = "macbook"
    println(produto.descricao)
}

class Lateinit {
}