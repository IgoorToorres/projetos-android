package com.example.testetoast

fun main(){
    val lista = mapOf(1500 to "iphone xr", 2000 to "iphone 11", 5000 to "macbook air m1", 7000 to "macbook air m2")

    lista.forEach {produto ->

        println(

            "Produto: " + produto.value + "\n" +
            "Valor: " + produto.key + "\n"

        )

    }
}