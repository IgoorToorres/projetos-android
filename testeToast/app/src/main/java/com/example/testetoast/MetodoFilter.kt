package com.example.testetoast

fun main(){
    val listaValores = mapOf(1200 to "produto1", 500 to "produto2", 200 to "produto3", 2000 to "produto4")

    val novaListaValores = listaValores.filter { valor ->
        valor.key >= 600
    }

    novaListaValores.forEach{produto ->
        println(produto.key)
        println(produto.value)
    }
}