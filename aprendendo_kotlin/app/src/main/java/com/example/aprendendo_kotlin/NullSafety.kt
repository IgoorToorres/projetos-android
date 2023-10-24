package com.example.aprendendo_kotlin

class NullSafety {

}

class Carro(){
    var cor = "vermelho"

    fun acelerar(){
        println("carro acelerou")
    }
}

fun somar(numero1: Int, numero2: Int): Int{
    return numero1 + numero2
}

fun main(){
    /*
    var carro: Carro? = null
    carro = Carro()
    val cor = carro?.cor ?: "azul";
    println(cor)
    */
    /*
    val nomes = arrayOf(
        "igor",
        "pedro",
        "julia"
    )

    val sobrenomes = arrayListOf<String>(
        "torres",
        "rizza",
        "evangelista"
    )

    sobrenomes.add("teste")

    for (i in sobrenomes){
        println(i)
    }



    for(i in nomes){
        println("nomes: $i")
    }
    */

    val n1 = 10
    val n2 = 5
    println(somar(n1, n2))
}

